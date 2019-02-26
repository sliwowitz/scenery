package graphics.scenery.backends.vulkan

import glm_.L
import org.lwjgl.system.MemoryUtil.NULL
import vkk.entities.VkDeviceMemory
import vkk.entities.VkDeviceSize

fun VkDeviceSize(size: Int): VkDeviceSize = VkDeviceSize(size.L)

operator fun VkDeviceSize.compareTo(int: Int) = L.compareTo(int)
operator fun VkDeviceSize.compareTo(long: Long) = L.compareTo(long)
operator fun VkDeviceSize.compareTo(size: VkDeviceSize) = L.compareTo(size.L)
