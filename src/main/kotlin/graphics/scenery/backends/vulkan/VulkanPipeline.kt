package graphics.scenery.backends.vulkan

import glm_.i
import graphics.scenery.GeometryType
import graphics.scenery.utils.LazyLogger
import kool.adr
import kool.set
import org.lwjgl.system.MemoryUtil.NULL
import org.lwjgl.vulkan.*
import org.lwjgl.vulkan.VK10.*
import vkk.*
import vkk.entities.*
import vkk.extensionFunctions.createGraphicsPipelines
import vkk.extensionFunctions.createPipelineLayout
import vkk.extensionFunctions.destroyPipelineLayout
import java.util.*
import kotlin.collections.LinkedHashMap

/**
 * Vulkan Pipeline class.
 *
 * @author Ulrik Günther <hello@ulrik.is>
 */
class VulkanPipeline(val device: VulkanDevice, val pipelineCache: VkPipelineCache = VkPipelineCache.NULL) : AutoCloseable {
    private val logger by LazyLogger()

    val vkDev get() = device.vulkanDevice

    var pipeline = HashMap<GeometryType, VulkanRenderer.Pipeline>()
    var descriptorSpecs = LinkedHashMap<String, VulkanShaderModule.UBOSpec>()
    var pushConstantSpecs = LinkedHashMap<String, VulkanShaderModule.PushConstantSpec>()

    val inputAssemblyState: VkPipelineInputAssemblyStateCreateInfo = VkPipelineInputAssemblyStateCreateInfo {
        topology = VkPrimitiveTopology.TRIANGLE_LIST
    }
    val rasterizationState: VkPipelineRasterizationStateCreateInfo = VkPipelineRasterizationStateCreateInfo {
        polygonMode = VkPolygonMode.FILL
        cullMode = VkCullMode.BACK_BIT.i
        frontFace = VkFrontFace.COUNTER_CLOCKWISE
        depthClampEnable = false
        rasterizerDiscardEnable = false
        depthBiasEnable = false
        lineWidth = 1f
    }
    val colorWriteMask: VkPipelineColorBlendAttachmentState = VkPipelineColorBlendAttachmentState {
        blendEnable = false
        colorWriteMask = VkColorComponent.RGBA_BIT.i
    }
    val colorBlendState: VkPipelineColorBlendStateCreateInfo = VkPipelineColorBlendStateCreateInfo {
        attachment = colorWriteMask
    }
    val viewportState: VkPipelineViewportStateCreateInfo = VkPipelineViewportStateCreateInfo {
        viewportCount = 1
        scissorCount = 1
    }
    val dynamicStates = vkDynamicStateBufferOf(VkDynamicState.VIEWPORT, VkDynamicState.SCISSOR)

    val dynamicState: VkPipelineDynamicStateCreateInfo = VkPipelineDynamicStateCreateInfo {
        dynamicStates = this@VulkanPipeline.dynamicStates
    }

    var depthStencilState: VkPipelineDepthStencilStateCreateInfo = VkPipelineDepthStencilStateCreateInfo {
        depthTestEnable = true
        depthWriteEnable = true
        depthCompareOp = VkCompareOp.LESS
        depthBoundsTestEnable = false
        minDepthBounds = 0f
        maxDepthBounds = 1f
        stencilTestEnable = false
    }
    val multisampleState: VkPipelineMultisampleStateCreateInfo = VkPipelineMultisampleStateCreateInfo {
        rasterizationSamples = VkSampleCount._1_BIT
    }
    val shaderStages = ArrayList<VulkanShaderModule>(2)

    fun addShaderStages(shaderModules: List<VulkanShaderModule>) {
        shaderStages.clear()

        shaderModules.forEach {
            this.shaderStages += it

            it.uboSpecs.forEach { uboName, ubo ->
                descriptorSpecs[uboName]?.members?.putAll(ubo.members) ?: descriptorSpecs.put(uboName, ubo)
            }

            it.pushConstantSpecs.forEach { name, pushConstant ->
                pushConstantSpecs[name]?.members?.putAll(pushConstant.members)
                    ?: pushConstantSpecs.put(name, pushConstant)
            }
        }
    }

    fun createPipelines(renderpass: VulkanRenderpass, vulkanRenderpass: VkRenderPass, vi: VkPipelineVertexInputStateCreateInfo,
                        descriptorSetLayouts: List<VkDescriptorSetLayout>, onlyForTopology: GeometryType? = null) {
        val setLayouts = vk.DescriptorSetLayout_Buffer(descriptorSetLayouts)

        val pushConstantRanges = when {
            pushConstantSpecs.isNotEmpty() -> {
                val pcr = vk.PushConstantRange(pushConstantSpecs.size)
                pushConstantSpecs.entries.forEachIndexed { i, p ->
                    val offset: Long = p.value.members.map { it.value.offset }.min() ?: 0L
                    val size = p.value.members.map { it.value.range }.sum()

                    logger.debug("Push constant: id $i name=${p.key} offset=$offset size=$size")

                    pcr[i].also {
                        it.offset = offset.i
                        it.size = size.i
                        it.stageFlags = VkShaderStage.ALL.i
                    }
                }
                pcr
            }
            else -> null
        }

        val pipelineLayoutCreateInfo = vk.PipelineLayoutCreateInfo().also {
            it.setLayouts = setLayouts
            it.pushConstantRanges = pushConstantRanges
        }
        val layout = vkDev.createPipelineLayout(pipelineLayoutCreateInfo)

        val stages = vk.PipelineShaderStageCreateInfo(shaderStages.size)
        shaderStages.forEachIndexed { i, shaderStage ->
            stages[i] = shaderStage.shader
        }

        val pipelineCreateInfo = vk.GraphicsPipelineCreateInfo().also {
            it.layout = layout
            it.renderPass = vulkanRenderpass
            it.vertexInputState = vi
            it.inputAssemblyState = inputAssemblyState
            it.rasterizationState  = rasterizationState
            it.colorBlendState = colorBlendState
            it.multisampleState = multisampleState
            it.viewportState=viewportState
            it.depthStencilState=depthStencilState
            it.stages=stages
            it.dynamicState=dynamicState
            it.flags = VkPipelineCreate.ALLOW_DERIVATIVES_BIT.i
            it.subpass=0
        }
        if (onlyForTopology != null) {
            inputAssemblyState.topology = onlyForTopology.asVulkanTopology()
        }

        val p = vkDev.createGraphicsPipelines(pipelineCache, pipelineCreateInfo)

        val vkp = VulkanRenderer.Pipeline(p, layout)

        this.pipeline[GeometryType.TRIANGLES] = vkp
//        descriptorSpecs.sortBy { spec -> spec.set }

        logger.debug("Pipeline needs descriptor sets ${descriptorSpecs.keys.joinToString()}")

        if (onlyForTopology == null) {
            // create pipelines for other topologies as well
            GeometryType.values().filter { it != GeometryType.TRIANGLES }.forEach { topology ->

                inputAssemblyState.topology = topology.asVulkanTopology() // TODO check .pNext(NULL)

                pipelineCreateInfo.apply {
                    this.inputAssemblyState = inputAssemblyState
                    basePipelineHandle = vkp.pipeline
                    basePipelineIndex = -1
                    flags = VkPipelineCreate.DERIVATIVE_BIT.i
                }
                val derivativeP = vkDev.createGraphicsPipelines(pipelineCache, pipelineCreateInfo)

                this.pipeline[topology] = VulkanRenderer.Pipeline(derivativeP, layout)
            }
        }

        logger.debug("Created $this for renderpass ${renderpass.name} ($vulkanRenderpass) with pipeline layout $layout (${if (onlyForTopology == null) {
            "Derivatives:" + this.pipeline.keys.joinToString()
        } else {
            "no derivatives, only ${this.pipeline.keys.first()}"
        }})")
    }

    fun getPipelineForGeometryType(type: GeometryType): VulkanRenderer.Pipeline {
        return pipeline.getOrElse(type) {
            logger.error("Pipeline $this does not contain a fitting pipeline for $type, return triangle pipeline")
            pipeline.getOrElse(GeometryType.TRIANGLES) { throw IllegalStateException("Default triangle pipeline not present for $this") }
        }
    }

    private fun GeometryType.asVulkanTopology(): VkPrimitiveTopology {
        return when (this) {
            GeometryType.TRIANGLE_FAN -> VkPrimitiveTopology.TRIANGLE_FAN
            GeometryType.TRIANGLES -> VkPrimitiveTopology.TRIANGLE_LIST
            GeometryType.LINE -> VkPrimitiveTopology.LINE_LIST
            GeometryType.POINTS -> VkPrimitiveTopology.POINT_LIST
            GeometryType.LINES_ADJACENCY -> VkPrimitiveTopology.LINE_LIST_WITH_ADJACENCY
            GeometryType.LINE_STRIP_ADJACENCY -> VkPrimitiveTopology.LINE_STRIP_WITH_ADJACENCY
            GeometryType.POLYGON -> VkPrimitiveTopology.TRIANGLE_LIST
            GeometryType.TRIANGLE_STRIP -> VkPrimitiveTopology.TRIANGLE_STRIP
        }
    }

    fun orderedDescriptorSpecs(): List<MutableMap.MutableEntry<String, VulkanShaderModule.UBOSpec>> {
        return descriptorSpecs.entries.sortedBy { it.value.binding }.sortedBy { it.value.set }
    }

    override fun toString(): String {
        return "VulkanPipeline (${pipeline.map { "${it.key.name} -> ${String.format("0x%X", it.value.pipeline.L)}" }.joinToString()})"
    }

    override fun close() {
        val removedLayouts = ArrayList<VkPipelineLayout>()

        pipeline.forEach { _, pipeline ->
            vkDestroyPipeline(device.vulkanDevice, pipeline.pipeline.L, null)

            if (pipeline.layout !in removedLayouts) {
                vkDev.destroyPipelineLayout(pipeline.layout)
                removedLayouts += pipeline.layout
            }
        }

        inputAssemblyState.free()
        rasterizationState.free()
        depthStencilState.free()
//        colorWriteMask.free() TODO why this produces black screen after a window resize
        colorBlendState.attachments?.free()
        colorBlendState.free()
        viewportState.free()
        dynamicState.free()
        dynamicStates.free()
        multisampleState.free()
    }
}
