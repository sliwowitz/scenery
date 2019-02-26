package graphics.scenery.backends.vulkan

import graphics.scenery.utils.LazyLogger
import kool.cap
import org.lwjgl.PointerBuffer
import org.lwjgl.system.MemoryStack
import org.lwjgl.system.MemoryUtil
import org.lwjgl.system.MemoryUtil.*
import org.lwjgl.vulkan.VK10.*
import org.lwjgl.vulkan.VkMemoryAllocateInfo
import org.lwjgl.vulkan.VkMemoryRequirements
import vkk.*
import vkk.entities.VkBuffer
import vkk.entities.VkDeviceMemory
import vkk.entities.VkDeviceSize
import java.nio.ByteBuffer
import kotlin.math.roundToInt

/**
 * Vulkan buffer class, creates a buffer residing on [device], with a [size] and a defined [usage].
 * The buffer may have [requestedMemoryProperties]. The buffer can be created with a [suballocation]
 * from a [VulkanBufferPool] -- if created in this way it'll not manage its own memory, but leave that
 * to the pool.
 *
 * @param[wantAligned] - whether the buffer should be aligned
 */
open class VulkanBuffer(val device: VulkanDevice, var size: VkDeviceSize,
                        val usage: VkBufferUsageFlags, val requestedMemoryProperties: VkMemoryPropertyFlags = VkMemoryProperty.DEVICE_LOCAL_BIT.i,
                        val wantAligned: Boolean = true, var suballocation: VulkanSuballocation? = null) : AutoCloseable {

    private val logger by LazyLogger()
    private var currentPosition = 0L
    private var currentPointer: PointerBuffer? = null

    /** Buffer alignment, 256 bytes by default (Vulkan standard) */
    var alignment: Long = 256 // TODO vk
        private set
    /** Memory pointer */
    var memory = VkDeviceMemory.NULL
        private set
    /** Buffer to the Vulkan pointer struct */
    var vulkanBuffer = VkBuffer.NULL
        private set
    /** Final allocated size of the buffer, might be different from the requested size, due to alignment. */
    var allocatedSize: Long = 0
        private set
    /** Buffer offset. */
    var bufferOffset: Long = 0
        private set

    private var mapped = false
    private var bufferReallocNeeded: Boolean = false

    /** Staging buffer, providing host memory */
    var stagingBuffer: ByteBuffer = memAlloc(size.i)
        private set

    init {
        if (suballocation == null) {
            val b = allocateVulkanBuffer(size, wantAligned)

            this.memory = b.memory
            this.vulkanBuffer = b.buffer
            this.allocatedSize = b.size
            this.alignment = b.alignment
        } else {
            suballocation?.let { sa ->
                this.memory = sa.buffer.memory
                this.vulkanBuffer = sa.buffer.vulkanBuffer
                this.allocatedSize = sa.size.L
                this.alignment = sa.buffer.alignment

                this.bufferOffset = sa.offset.toLong()
            }
        }
    }

    private data class RawBuffer(val buffer: VkBuffer, val memory: VkDeviceMemory, val size: Long, val alignment: Long)

    private fun allocateVulkanBuffer(size: VkDeviceSize, wantAligned: Boolean): RawBuffer {
        val memory = MemoryUtil.memAllocLong(1)
        val memTypeIndex = MemoryUtil.memAllocInt(1)

        val reqs = VkMemoryRequirements.calloc()
        val bufferInfo = vk.BufferCreateInfo {
            usage = this@VulkanBuffer.usage
            this.size = size
        }
        val buffer = VkBuffer(VU.getLong("Creating buffer",
            { vkCreateBuffer(device.vulkanDevice, bufferInfo, null, this) }, {}))
        vkGetBufferMemoryRequirements(device.vulkanDevice, buffer.L, reqs)

        val actualSize = if (wantAligned) {
            if (reqs.size().rem(reqs.alignment()) == 0L) {
                reqs.size()
            } else {
                reqs.size() + reqs.alignment() - (reqs.size().rem(reqs.alignment()))
            }
        } else {
            reqs.size()
        }

        val allocInfo = VkMemoryAllocateInfo.calloc()
            .sType(VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO)
            .pNext(NULL)
            .allocationSize(actualSize)
            .memoryTypeIndex(device.getMemoryType(reqs.memoryTypeBits(), requestedMemoryProperties).first())


        VU.run("Allocating memory (size=$actualSize)", { vkAllocateMemory(device.vulkanDevice, allocInfo, null, memory) })
        VU.run("Binding buffer memory", { vkBindBufferMemory(device.vulkanDevice, buffer.L, memory.get(0), 0) })

        val r = RawBuffer(buffer, VkDeviceMemory(memory.get(0)), actualSize, reqs.alignment())

        reqs.free()
        allocInfo.free()
        MemoryUtil.memFree(memTypeIndex)
        MemoryUtil.memFree(memory)

        return r
    }

    /**
     * Resizes the backing buffer to [newSize], which is 1.5x the original size by default,
     * and returns the staging buffer.
     */
    @Synchronized
    fun resize(newSize: Int = (size.L * 1.5f).roundToInt()): ByteBuffer {
        if (mapped) {
            unmap()
        }

        logger.debug("Before resize: ${stagingBuffer.remaining()} ${stagingBuffer.capacity()}")
        stagingBuffer = MemoryUtil.memRealloc(stagingBuffer, newSize)
            ?: throw IllegalStateException("Could not resize buffer")
        size = VkDeviceSize(newSize)
        bufferReallocNeeded = true

        return stagingBuffer
    }

    /**
     * Resizes the actual Vulkan buffer. Called upon copying the staging buffer to the Vulkan buffer.
     */
    @Synchronized
    protected fun resizeLazy() {
        if (!bufferReallocNeeded) {
            return
        }
        unmap()

        destroyVulkanBuffer()
        val b = allocateVulkanBuffer(VkDeviceSize(stagingBuffer.cap), wantAligned)

        this.memory = b.memory
        this.vulkanBuffer = b.buffer
        this.allocatedSize = b.size
        this.alignment = b.alignment

        bufferReallocNeeded = false
    }

    /**
     * Advances this buffer to the next possible aligned position,
     * override the buffer's default alignment by setting [align] to
     * the desired value. Returns the new position.
     */
    fun advance(align: Long = this.alignment): Int {
        val pos = stagingBuffer.position()
        val rem = pos.rem(align)

        if (rem != 0L) {
            val newpos = pos + align.toInt() - rem.toInt()
            stagingBuffer.position(newpos)
        }

        return stagingBuffer.position()
    }

    /**
     * Resets the staging buffer such that it can be again filled
     * from the beginning.
     */
    fun reset() {
        stagingBuffer.position(0)
        stagingBuffer.limit(size.i)
        currentPosition = 0L
    }

    /**
     * Copies data from the [ByteBuffer] [data] directly to the device memory.
     */
    fun copyFrom(data: ByteBuffer, dstOffset: Long = 0) {
        resizeLazy()

        val dest = memAllocPointer(1)

        val dstSize = if (dstOffset > 0) {
            size - VkDeviceSize(dstOffset)
        } else {
            size
        }

        vkMapMemory(device.vulkanDevice, memory.L, bufferOffset + dstOffset, dstSize.L, 0, dest)
        memCopy(memAddress(data), dest.get(0), data.remaining().toLong())
        vkUnmapMemory(device.vulkanDevice, memory.L)
        memFree(dest)
    }

    /**
     * Copies data into the Vulkan buffer from a list of [chunks]. A [dstOffset] can
     * be given, defining the start position in the buffer.
     */
    fun copyFrom(chunks: List<ByteBuffer>, dstOffset: Long = 0) {
        MemoryStack.stackPush().use { stack ->
            resizeLazy()

            val dest = stack.callocPointer(1)

            val dstSize = if (dstOffset > 0) {
                size - VkDeviceSize(dstOffset)
            } else {
                size
            }

            var currentOffset = 0

            vkMapMemory(device.vulkanDevice, memory.L, bufferOffset + dstOffset, dstSize.L, 0, dest)
            chunks.forEach { chunk ->
                val chunkSize = chunk.remaining()
                memCopy(memAddress(chunk), dest.get(0) + currentOffset, chunk.remaining().toLong())
                currentOffset += chunkSize
            }
            vkUnmapMemory(device.vulkanDevice, memory.L)
        }
    }

    /**
     * Copies the contents of the device buffer to [dest].
     */
    fun copyTo(dest: ByteBuffer) {
        val src = memAllocPointer(1)
        vkMapMemory(device.vulkanDevice, memory.L, bufferOffset, size.L, 0, src)
        memCopy(src.get(0), memAddress(dest), dest.remaining().toLong())
        vkUnmapMemory(device.vulkanDevice, memory.L)
        memFree(src)
    }

    /**
     * Maps this buffer
     */
    fun map(): PointerBuffer {
        resizeLazy()

        val dest = memAllocPointer(1)
        vkMapMemory(device.vulkanDevice, memory.L, bufferOffset, size.L, 0, dest)

        currentPointer = dest
        mapped = true
        return dest
    }

    /**
     * Maps this buffer it wasn't mapped before, and rewinds it.
     */
    fun mapIfUnmapped(): PointerBuffer {
        resizeLazy()

        currentPointer?.let {
            if (mapped) {
                return it.rewind()
            }
        }

        return map()
    }

    /**
     * Unmaps this buffer.
     */
    fun unmap() {
        mapped = false
        vkUnmapMemory(device.vulkanDevice, memory.L)
    }

    /**
     * Copies data from the [stagingBuffer] to device memory.
     */
    fun copyFromStagingBuffer() {
        resizeLazy()

        stagingBuffer.flip()
        copyFrom(stagingBuffer)
    }

    /**
     * Returns true if this buffer is initialised correctly.
     */
    fun initialized(): Boolean {
        return vulkanBuffer.isValid && memory.isValid
    }

    private fun destroyVulkanBuffer() {
        if (memory.isInvalid || vulkanBuffer.isInvalid) {
            return
        }

        vkFreeMemory(device.vulkanDevice, memory.L, null)
        memory = VkDeviceMemory.NULL

        vkDestroyBuffer(device.vulkanDevice, vulkanBuffer.L, null)
        vulkanBuffer = VkBuffer.NULL
    }

    /**
     * Closes this buffer, freeing all allocated resources on host and device.
     */
    override fun close() {
        if (memory.isInvalid || vulkanBuffer.isInvalid) {
            return
        }

        if (suballocation != null) {
            logger.debug("Marking suballocation as free")
            suballocation?.free = true
            return
        }

        logger.trace("Closing buffer $this ...")

        if (mapped) {
            unmap()
        }

        memFree(stagingBuffer)

        vkFreeMemory(device.vulkanDevice, memory.L, null)
        memory = VkDeviceMemory.NULL

        vkDestroyBuffer(device.vulkanDevice, vulkanBuffer.L, null)
        vulkanBuffer = VkBuffer.NULL
    }

    /**
     * Factory methods for [VulkanBuffer].
     */
    companion object {
        /**
         * Creates a new VulkanBuffer of [size] that has it's memory managed by a [VulkanBufferPool]
         * given by [pool].
         */
        fun fromPool(pool: VulkanBufferPool, size: Long): VulkanBuffer {
            val suballocation = pool.create(size.toInt())
            return VulkanBuffer(pool.device, suballocation.size,
                usage = pool.usage, suballocation = suballocation)
        }
    }
}
