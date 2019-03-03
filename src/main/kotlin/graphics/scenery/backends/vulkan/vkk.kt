package graphics.scenery.backends.vulkan

import glm_.BYTES
import glm_.L
import kool.free
import kool.indices
import kool.set
import kool.stak
import org.lwjgl.glfw.GLFWVulkan
import org.lwjgl.system.MemoryUtil
import org.lwjgl.system.Struct
import org.lwjgl.system.StructBuffer
import org.lwjgl.vulkan.VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO
import org.lwjgl.vulkan.VK10.vkAllocateCommandBuffers
import org.lwjgl.vulkan.VkCommandBuffer
import org.lwjgl.vulkan.VkCommandBufferAllocateInfo
import org.lwjgl.vulkan.VkDevice
import vkk.*
import vkk.entities.*
import vkk.extensionFunctions.allocateDescriptorSet
import vkk.extensionFunctions.begin
import vkk.extensionFunctions.end
import vkk.extensionFunctions.updateDescriptorSets

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
fun VulkanDevice.newCommandBuffer(commandPool: VkCommandPool, level: VkCommandBufferLevel = VkCommandBufferLevel.PRIMARY): VkCommandBuffer =
    stak {
        val cmdBufAllocateInfo = VkCommandBufferAllocateInfo.callocStack(it)
            .sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO)
            .commandPool(commandPool.L)
            .level(level.i)
            .commandBufferCount(1)

        val pCommandBuffer = it.callocPointer(1)
        vkAllocateCommandBuffers(vulkanDevice, cmdBufAllocateInfo, pCommandBuffer)

        VkCommandBuffer(pCommandBuffer[0], vulkanDevice)
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
inline fun <R> VkCommandBuffer.record(flags: VkCommandBufferUsageFlags = VkCommandBufferUsage.SIMULTANEOUS_USE_BIT.i, block: VkCommandBuffer.() -> R): R {
    begin(flags)
    return block().also { end() }
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
