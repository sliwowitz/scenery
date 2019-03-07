package graphics.scenery.backends.vulkan

import glm_.BYTES
import glm_.L
import kool.*
import org.lwjgl.glfw.GLFWVulkan
import org.lwjgl.system.MemoryUtil
import org.lwjgl.system.Pointer
import org.lwjgl.system.Struct
import org.lwjgl.system.StructBuffer
import org.lwjgl.vulkan.VK10
import org.lwjgl.vulkan.VkCommandBuffer
import org.lwjgl.vulkan.VkDevice
import org.lwjgl.vulkan.VkQueue
import vkk.*
import vkk.entities.*
import vkk.extensionFunctions.*
import java.nio.IntBuffer
import java.nio.LongBuffer

fun VkDeviceSize(size: Int): VkDeviceSize = VkDeviceSize(size.L)

operator fun VkDeviceSize.compareTo(int: Int) = L.compareTo(int)
operator fun VkDeviceSize.compareTo(long: Long) = L.compareTo(long)
operator fun VkDeviceSize.compareTo(size: VkDeviceSize) = L.compareTo(size.L)

fun <T : Struct, SELF : StructBuffer<T, SELF>, X : StructBuffer<T, SELF>> X.fill(collection: Collection<T>): X {
    for (i in indices)
        this[i] = collection.elementAt(i)
    return this
}

inline fun VkImageView_Buffer.use(block: (VkImageView_Buffer) -> Unit) {
    block(this)
    buffer.free()
}

inline class NanoSecond(val L: Long) {
    operator fun compareTo(other: NanoSecond) = L.compareTo(other.L)
}

/**
 * Creates and returns a new command buffer on [device], associated with [commandPool]. By default, it'll be a primary
 * command buffer, that can be changed by setting [level] to [VK_COMMAND_BUFFER_LEVEL_SECONDARY].
 */
fun VkDevice.useCommandBuffer(commandPool: VkCommandPool,
                               level: VkCommandBufferLevel = VkCommandBufferLevel.PRIMARY,
                               block: (VkCommandBuffer) -> Unit) {
    val cmdBufAllocateInfo = vk.CommandBufferAllocateInfo {
        this.commandPool = commandPool
        this.level = level
        commandBufferCount = 1
    }
    val cmd = allocateCommandBuffers<VkCommandBuffer>(cmdBufAllocateInfo)
    block(cmd)
    freeCommandBuffer(commandPool, cmd)
}

/**
 * Creates and returns a new command buffer on [device], associated with [commandPool]. By default, it'll be a primary
 * command buffer, that can be changed by setting [level] to [VK_COMMAND_BUFFER_LEVEL_SECONDARY].
 */
fun VkDevice.newCommandBuffer(commandPool: VkCommandPool,
                               level: VkCommandBufferLevel = VkCommandBufferLevel.PRIMARY): VkCommandBuffer {
    val cmdBufAllocateInfo = vk.CommandBufferAllocateInfo {
        this.commandPool = commandPool
        this.level = level
        commandBufferCount = 1
    }
    return allocateCommandBuffers(cmdBufAllocateInfo)
}

//fun newCommandBuffer(commandPool: VkCommandPool, level: VkCommandBufferLevel = VkCommandBufferLevel.PRIMARY): VkCommandBuffer {
//    val cmdBuf = newCommandBuffer(device, VkCommandPool(commandPool), VkCommandBufferLevel(level))
//
//    if (autostart) {
//        cmdBuf.begin(VkCommandBufferUsage.SIMULTANEOUS_USE_BIT.i)
//    }
//
//    return cmdBuf
//}

/** begin .. end */
inline fun VkCommandBuffer.record(flags: VkCommandBufferUsageFlags = VkCommandBufferUsage.SIMULTANEOUS_USE_BIT.i, block: VkCommandBuffer.() -> Unit): VkCommandBuffer {
    begin(flags)
    block()
    end()
    return this
}

object glfw {
    val requiredInstanceExtensions: ArrayList<String>
        get() = stak {
            val pCount = it.nmalloc(1, Int.BYTES)
            val ppNames = GLFWVulkan.nglfwGetRequiredInstanceExtensions(pCount)
            val count = MemoryUtil.memGetInt(pCount)
            val pNames = MemoryUtil.memPointerBuffer(ppNames, count) ?: return arrayListOf()
            val res = ArrayList<String>(count)
            for (i in 0 until count)
                res += MemoryUtil.memASCII(pNames[i])
            return res
        }
}


/**
 * Creates and returns a dynamic descriptor set allocated on [device] from the pool [descriptorPool], conforming
 * to the existing descriptor set layout [descriptorSetLayout]. The number of bindings ([bindingCount]) and the
 * associated [buffer] have to be given.
 */
fun VkDevice.createDescriptorSetDynamic(descriptorPool: VkDescriptorPool, descriptorSetLayout: VkDescriptorSetLayout,
                                        bindingCount: Int, buffer: VulkanBuffer): VkDescriptorSet {

    VU.logger.debug("Creating dynamic descriptor set with $bindingCount bindings, DSL=${descriptorSetLayout.asHexString}")

    val allocInfo = vk.DescriptorSetAllocateInfo(descriptorPool, descriptorSetLayout)

    val descriptorSet = allocateDescriptorSet(allocInfo)

    val d = vk.DescriptorBufferInfo {
        this.buffer = buffer.vulkanBuffer
        range = VkDeviceSize(2048L)
        offset = VkDeviceSize(0L)
    }
    val writeDescriptorSet = vk.WriteDescriptorSet(bindingCount)

    for (i in writeDescriptorSet.indices)
        writeDescriptorSet[i].apply {
            dstSet = descriptorSet
            dstBinding = i
            dstArrayElement = 0
            bufferInfo_ = d
            descriptorType = VkDescriptorType.UNIFORM_BUFFER_DYNAMIC
        }

    updateDescriptorSets(writeDescriptorSet)

    return descriptorSet
}

/**
 * Creates and returns a new descriptor set, allocated on [device] from [descriptorPool], conforming to existing
 * [descriptorSetLayout], a [bindingCount] needs to be given as well an an [ubo] to back the descriptor set.
 * The default [type] is [VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER].
 */
fun VkDevice.createDescriptorSet(descriptorPool: VkDescriptorPool, descriptorSetLayout: VkDescriptorSetLayout, bindingCount: Int,
                                 ubo: VulkanUBO.UBODescriptor, type: VkDescriptorType = VkDescriptorType.UNIFORM_BUFFER): VkDescriptorSet {

    VU.logger.debug("Creating descriptor set with $bindingCount bindings, DSL=$descriptorSetLayout")

    val allocInfo = vk.DescriptorSetAllocateInfo(descriptorPool, descriptorSetLayout)

    val descriptorSet = allocateDescriptorSet(allocInfo)

    val d = vk.DescriptorBufferInfo {
        buffer = ubo.buffer
        range = VkDeviceSize(ubo.range)
        offset = VkDeviceSize(ubo.offset)
    }
    val writeDescriptorSet = vk.WriteDescriptorSet(bindingCount)

    for (i in writeDescriptorSet.indices)
        writeDescriptorSet[i].apply {
            dstSet = descriptorSet
            dstBinding = i
            bufferInfo_ = d
            descriptorType = type
        }

    updateDescriptorSets(writeDescriptorSet)

    return descriptorSet
}

/**
 * Creates and returns a new descriptor set layout on [device] with one member of [type], which is by default a
 * dynamic uniform buffer. The [binding] and number of descriptors ([descriptorNum], [descriptorCount]) can be
 * customized,  as well as the shader stages to which the DSL should be visible ([shaderStages]).
 */
fun VkDevice.createDescriptorSetLayout(type: VkDescriptorType = VkDescriptorType.UNIFORM_BUFFER_DYNAMIC, binding: Int = 0, descriptorNum: Int = 1,
                                       descriptorCount: Int = 1, shaderStages: VkShaderStageFlags = VkShaderStage.ALL.i): VkDescriptorSetLayout {

    val layoutBinding = vk.DescriptorSetLayoutBinding(descriptorNum)

    (binding until descriptorNum).forEach { i ->
        layoutBinding[i].apply {
            this.binding = i
            descriptorType = type
            this.descriptorCount = descriptorCount
            stageFlags = shaderStages
        }
    }

    val descriptorLayout = vk.DescriptorSetLayoutCreateInfo(layoutBinding)

    return createDescriptorSetLayout(descriptorLayout).apply {
        VU.logger.debug("Created DSL $asHexString with $descriptorNum descriptors with $descriptorCount elements.")
    }
}

/**
 * Submits the given command buffer to the queue [queue].
 *
 * [submitInfoPNext], [signalSemaphores], [waitSemaphores] and [waitDstStageMask] can be used to further fine-grain
 * the submission process.
 */
fun VkCommandBuffer.submit(queue: VkQueue, submitInfoPNext: Pointer? = null,
                           signalSemaphores: VkSemaphore_Buffer? = null, waitSemaphores: VkSemaphore_Buffer? = null,
                           waitDstStageMask: IntBuffer? = null): VkCommandBuffer {

    queue.submit(vk.SubmitInfo {
        commandBuffer = this@submit
        this.signalSemaphores = signalSemaphores
        submitInfoPNext?.let { next = it.adr }
        waitSemaphores?.let {
            if (it.rem > 0 && waitDstStageMask != null) {
                this.waitSemaphores = it
                this.waitDstStageMask = waitDstStageMask
            }
        }
    })
    return this
}
//    vkFreeCommandBuffers(device.vulkanDevice, commandPool, this)


fun VkDeviceSize_Buffer.free() = buffer.free()
fun VkDeviceSize_Buffer.limit(newLimit: Int) = buffer.limit(newLimit)
fun VkBuffer_Buffer.free() = buffer.free()
fun VkBuffer_Buffer.limit(newLimit: Int) = buffer.limit(newLimit)
fun VkDescriptorSet_Buffer.free() = buffer.free()
fun VkDescriptorSet_Buffer.limit() = buffer.limit()
fun VkDescriptorSet_Buffer.limit(newLimit: Int) = buffer.limit(newLimit)
fun VkDescriptorSet_Buffer.rewind() = buffer.rewind()
fun VkDescriptorSet_Buffer.capacity() = buffer.capacity()
fun VkDescriptorSet_Buffer.position(newPosition: Int) = buffer.position(newPosition)
fun VkDescriptorSet_Buffer.put(src: LongBuffer) = buffer.put(src)
