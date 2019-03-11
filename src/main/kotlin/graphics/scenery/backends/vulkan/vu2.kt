package graphics.scenery.backends.vulkan

import graphics.scenery.backends.RenderConfigReader
import kool.adr
import kool.indices
import org.lwjgl.system.Pointer
import org.lwjgl.vulkan.VkCommandBuffer
import org.lwjgl.vulkan.VkDevice
import org.lwjgl.vulkan.VkImageSubresourceRange
import org.lwjgl.vulkan.VkQueue
import vkk.*
import vkk.entities.*
import vkk.extensionFunctions.*
import java.nio.IntBuffer


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

/**
 * Creates and returns a dynamic descriptor set allocated on [device] from the pool [descriptorPool], conforming
 * to the existing descriptor set layout [descriptorSetLayout]. The number of bindings ([bindingCount]) and the
 * associated [buffer] have to be given.
 */
fun VkDevice.createDescriptorSetDynamic(descriptorPool: VkDescriptorPool, descriptorSetLayout: VkDescriptorSetLayout,
                                        bindingCount: Int, buffer: VulkanBuffer): VkDescriptorSet {

    VU.logger.debug("Creating dynamic descriptor set with $bindingCount bindings, DSL=${descriptorSetLayout.hexString}")

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
        VU.logger.debug("Created DSL $hexString with $descriptorNum descriptors with $descriptorCount elements.")
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
                           waitDstStageMask: IntBuffer? = null): VkQueue {

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
    return queue
}

/**
 * Creates and returns a new descriptor set layout on [device] with the members declared in [types], which is
 * a [List] of a Pair of a type, associated with a count (e.g. Dynamic UBO to 1). The base binding can be set with [binding].
 * The shader stages to which the DSL should be visible can be set via [shaderStages].
 */
fun VkDevice.createDescriptorSetLayout(types: List<Pair<VkDescriptorType, Int>>, binding: Int = 0, shaderStages: VkShaderStageFlags): VkDescriptorSetLayout {

    val layoutBinding = vk.DescriptorSetLayoutBinding(types.size)

    types.forEachIndexed { i, (type, count) ->
        layoutBinding[i].apply {
            this.binding = i + binding
            descriptorType = type
            descriptorCount = count
            stageFlags = shaderStages
        }
    }
    return createDescriptorSetLayout(vk.DescriptorSetLayoutCreateInfo(layoutBinding)).apply {
        VU.logger.debug("Created DSL $hexString with ${types.size} descriptors.")
    }
}

/**
 * Creates and returns a new descriptor set for a framebuffer given as [target]. The set will be allocated on [device],
 * from [descriptorPool], and conforms to an existing descriptor set layout [descriptorSetLayout]. Additional
 * metadata about the framebuffer needs to be given via [rt], and a subset of the framebuffer can be selected
 * by setting [onlyFor] to the respective name of the attachment.
 */
fun VkDevice.createRenderTargetDescriptorSet(descriptorPool: VkDescriptorPool, descriptorSetLayout: VkDescriptorSetLayout,
                                             rt: Map<String, RenderConfigReader.TargetFormat>,
                                             target: VulkanFramebuffer, onlyFor: String? = null): VkDescriptorSet {

    val allocInfo = vk.DescriptorSetAllocateInfo(descriptorPool, descriptorSetLayout)

    val descriptorSet: VkDescriptorSet = allocateDescriptorSets(allocInfo)

    val descriptorWrites = when (onlyFor) {
        null -> {
            val writeDescriptorSet = vk.WriteDescriptorSet(rt.size)

            rt.entries.forEachIndexed { i, entry ->
                val attachment = target.attachments[entry.key]!!
                val d = vk.DescriptorImageInfo(target.framebufferSampler, attachment.imageView, VkImageLayout.SHADER_READ_ONLY_OPTIMAL)

                writeDescriptorSet[i].apply {
                    dstSet = descriptorSet
                    dstBinding = i
                    dstArrayElement = 0
                    imageInfo = d
                    descriptorType = VkDescriptorType.COMBINED_IMAGE_SAMPLER
                }
            }
            writeDescriptorSet
        }
        else -> {
            val writeDescriptorSet = vk.WriteDescriptorSet(1)

            rt.entries.first { it.key == onlyFor }.apply {
                val attachment = target.attachments[this.key]!!
                val d = vk.DescriptorImageInfo(target.framebufferSampler, attachment.imageView, VkImageLayout.SHADER_READ_ONLY_OPTIMAL)

                writeDescriptorSet[0].apply {
                    dstSet = descriptorSet
                    dstBinding = 0
                    dstArrayElement = 0
                    imageInfo = d
                    descriptorType = VkDescriptorType.COMBINED_IMAGE_SAMPLER
                }
            }
            writeDescriptorSet
        }
    }

    updateDescriptorSets(descriptorWrites)

    VU.logger.debug("Creating framebuffer attachment descriptor $descriptorSet set with ${rt.size} bindings, DSL=$descriptorSetLayout")
    return descriptorSet
}

/**
 * Transforms a Vulkan [image] from the old image layout [oldImageLayout] to the new [newImageLayout], the
 * [VkImageSubresourceRange] is constructed based on the image size, and only uses the base MIP level and array layer.
 * This function can only be run within a [commandBuffer].
 */
fun VkCommandBuffer.setImageLayout(image: VkImage, aspectMask: VkImageAspectFlags, oldImageLayout: VkImageLayout, newImageLayout: VkImageLayout) {
    val range = vk.ImageSubresourceRange {
        this.aspectMask = aspectMask
        baseMipLevel = 0
        levelCount = 1
        layerCount = 1
    }
    setImageLayout(image, oldImageLayout, newImageLayout, range)
}

/**
 * Transforms a Vulkan [image] from the old image layout [oldImageLayout] to the new [newImageLayout], taking into account the
 * [VkImageSubresourceRange] given in [range]. This function can only be run within a [commandBuffer].
 */
fun VkCommandBuffer.setImageLayout(image: VkImage, oldImageLayout: VkImageLayout, newImageLayout: VkImageLayout, range: VkImageSubresourceRange) {

    val imageMemoryBarrier = vk.ImageMemoryBarrier {
        oldLayout = oldImageLayout
        newLayout = newImageLayout
        this.image = image
        subresourceRange = range
        srcAccessMask = when (oldImageLayout) {
            VkImageLayout.PREINITIALIZED -> VkAccess.HOST_WRITE_BIT.i
            VkImageLayout.COLOR_ATTACHMENT_OPTIMAL -> VkAccess.COLOR_ATTACHMENT_WRITE_BIT.i
            VkImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL -> VkAccess.DEPTH_STENCIL_ATTACHMENT_WRITE_BIT.i
            VkImageLayout.TRANSFER_SRC_OPTIMAL -> VkAccess.TRANSFER_READ_BIT.i
            VkImageLayout.TRANSFER_DST_OPTIMAL -> VkAccess.TRANSFER_WRITE_BIT.i
            VkImageLayout.SHADER_READ_ONLY_OPTIMAL -> VkAccess.SHADER_READ_BIT.i
            VkImageLayout.UNDEFINED -> 0
            else -> 0
        }
    }
    imageMemoryBarrier.apply {
        when (newImageLayout) {
            VkImageLayout.TRANSFER_DST_OPTIMAL -> dstAccessMask = VkAccess.TRANSFER_WRITE_BIT.i
            VkImageLayout.TRANSFER_SRC_OPTIMAL -> {
                srcAccessMask = srcAccessMask or VkAccess.TRANSFER_READ_BIT
                dstAccessMask = VkAccess.TRANSFER_READ_BIT.i
            }
            VkImageLayout.COLOR_ATTACHMENT_OPTIMAL -> {
                srcAccessMask = VkAccess.TRANSFER_READ_BIT.i
                dstAccessMask = VkAccess.COLOR_ATTACHMENT_WRITE_BIT.i
            }
            VkImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL -> dstAccessMask = dstAccessMask or VkAccess.DEPTH_STENCIL_ATTACHMENT_WRITE_BIT.i
            VkImageLayout.SHADER_READ_ONLY_OPTIMAL -> {
                if (srcAccessMask == 0) {
                    dstAccessMask = VkAccess.HOST_WRITE_BIT or VkAccess.TRANSFER_WRITE_BIT
                }
                dstAccessMask = VkAccess.SHADER_READ_BIT.i
            }
            VkImageLayout.PRESENT_SRC_KHR -> dstAccessMask = dstAccessMask or VkAccess.MEMORY_READ_BIT
        }
    }

    pipelineBarrier(
        srcStage = VkPipelineStage.COLOR_ATTACHMENT_OUTPUT_BIT,
        dstStage = VkPipelineStage.FRAGMENT_SHADER_BIT,
        imageMemoryBarrier = imageMemoryBarrier)
}
