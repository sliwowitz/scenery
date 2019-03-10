package graphics.scenery.backends.vulkan

import glm_.BYTES
import glm_.L
import graphics.scenery.backends.RenderConfigReader
import kool.*
import org.lwjgl.PointerBuffer
import org.lwjgl.glfw.GLFWVulkan
import org.lwjgl.system.MemoryUtil
import org.lwjgl.system.Pointer
import org.lwjgl.system.Struct
import org.lwjgl.system.StructBuffer
import org.lwjgl.vulkan.VkCommandBuffer
import org.lwjgl.vulkan.VkDevice
import org.lwjgl.vulkan.VkPhysicalDevice
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



fun VkSemaphore_Buffer.free() = buffer.free()
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

inline class VkCommandBuffer_Buffer(val buffer: PointerBuffer) {
    operator fun set(index: Int, value: VkCommandBuffer) {
        buffer[index] = value
    }
//    operator fun get(index: Int) = VkCommandBuffer(buffer[0])
}

fun VkCommandBuffer_Buffer(size: Int) = VkCommandBuffer_Buffer(PointerBuffer(size))
fun VkCommandBuffer_Buffer.free() = buffer.free()



fun VkPhysicalDevice_Buffer.isEmpty() = rem == 0
val VkPhysicalDevice_Buffer.indices get() = buffer.indices
