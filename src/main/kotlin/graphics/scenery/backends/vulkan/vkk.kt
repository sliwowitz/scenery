package graphics.scenery.backends.vulkan

import glm_.L
import kool.free
import kool.indices
import kool.set
import org.lwjgl.system.Struct
import org.lwjgl.system.StructBuffer
import vkk.entities.VkDeviceSize
import vkk.entities.VkImageViewBuffer

fun VkDeviceSize(size: Int): VkDeviceSize = VkDeviceSize(size.L)

operator fun VkDeviceSize.compareTo(int: Int) = L.compareTo(int)
operator fun VkDeviceSize.compareTo(long: Long) = L.compareTo(long)
operator fun VkDeviceSize.compareTo(size: VkDeviceSize) = L.compareTo(size.L)

fun <T : Struct, SELF : StructBuffer<T, SELF>, X : StructBuffer<T, SELF>> X.fill(collection: Collection<T>): X {
    for (i in indices)
        this[i] = collection.elementAt(i)
    return this
}

inline fun VkImageViewBuffer.use(block: (VkImageViewBuffer) -> Unit) {
    block(this)
    buffer.free()
}
