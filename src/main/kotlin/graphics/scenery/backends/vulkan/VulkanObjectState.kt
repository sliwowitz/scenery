package graphics.scenery.backends.vulkan

import graphics.scenery.textures.Texture
import org.lwjgl.system.MemoryUtil.*
import org.lwjgl.vulkan.*
import graphics.scenery.NodeMetadata
import graphics.scenery.backends.RenderConfigReader
import graphics.scenery.backends.RendererFlags
import graphics.scenery.utils.LazyLogger
import java.util.*
import java.util.concurrent.ConcurrentHashMap

/**
 * Vulkan Object State class. Saves texture, UBO, pipeline and vertex buffer state.
 *
 * @author Ulrik Günther <hello@ulrik.is>
 */
open class VulkanObjectState : NodeMetadata {
    protected val logger by LazyLogger()

    /** Consumers for this metadata object. */
    override val consumers: MutableList<String> = ArrayList(setOf("VulkanRenderer"))

    /** Whether this metadata object has been fully initialised. */
    var initialized = false
    /** Indicates whether the mesh is using indexed vertex storage. */
    var isIndexed = false
    /** Indicates the offset to the indices in the vertex buffer in bytes. */
    var indexOffset = 0L
    /** The number of indices stored. */
    var indexCount = 0
    /** The number of vertices stored. */
    var vertexCount = 0
    /** The number of instances the [graphics.scenery.Node] this metadata object is attached to has. */
    var instanceCount = 1

    /** Hash map storing necessary vertex buffers. */
    var vertexBuffers = ConcurrentHashMap<String, VulkanBuffer>()

    /** UBOs required by the [graphics.scenery.Node] this metadata object is attached to. */
    var UBOs = LinkedHashMap<String, Pair<Long, VulkanUBO>>()

    /** [VulkanTexture]s used by the [graphics.scenery.Node] this metadata object is attached to. */
    var textures = ConcurrentHashMap<String, VulkanTexture>()

    /** Material hash code, does not include textures. */
    var materialHashCode = 0

    /** Whether this [graphics.scenery.Node] will use any default textures for any of its texture slots. */
    var defaultTexturesFor = HashSet<String>()

    /** Descriptor sets required */
    var requiredDescriptorSets = HashMap<String, Long>()

    /** The vertex input type defining what are going to be inputs to the vertex shader. */
    var vertexInputType = VulkanRenderer.VertexDataKinds.PositionNormalTexcoord
    /** The vertex description, if necessary (can be null, e.g. for generative geometry). */
    var vertexDescription: VulkanRenderer.VertexDescription? = null

    /** Descriptor set for the textures this [graphics.scenery.Node] will be rendered with. */
    protected var textureDescriptorSets =  ConcurrentHashMap<Pair<String, String>, Long>()

    /** Time stamp of the last recreation of the texture descriptor sets */
    protected var descriptorSetsRecreated: Long = 0

    /** Whether the node is rendered as instanced */
    var instanced = false

    var flags = EnumSet.noneOf(RendererFlags::class.java)
    /** Skip for rendering if this is set. */
    var preDrawSkip = false

    /** Last reload time for textures */
    var texturesLastSeen = 0L

    /**
     * Creates or updates the [textureDescriptorSets] describing the textures used. Will cover all the renderpasses
     * given in [passes]. The set will reside on [device] and the descriptor set layout(s) determined from the renderpass.
     * The set will be allocated from [descriptorPool].
     */
    fun texturesToDescriptorSets(device: VulkanDevice, passes: Map<String, VulkanRenderpass>, descriptorPool: Long) {
        passes.forEach { (passName, pass) ->
            if(pass.recreated > descriptorSetsRecreated) {
                textureDescriptorSets.clear()
            }
            val textures = textures.entries.groupBy { Texture.objectTextures.contains(it.key) }
            val objectTextures = textures[true]
            val others = textures[false]

            val descriptorSetLayoutObjectTextures = pass.descriptorSetLayouts["ObjectTextures"]
            if(descriptorSetLayoutObjectTextures != null && objectTextures != null) {
                textureDescriptorSets[pass.passConfig.type.name to "ObjectTextures"] = createOrUpdateTextureDescriptorSet(
                    "ObjectTextures",
                    pass.passConfig.type.name,
                    Texture.objectTextures.map { ot -> objectTextures.first { it.key == ot } },
                    descriptorSetLayoutObjectTextures,
                    device,
                    descriptorPool)
            } else {
                if(pass.passConfig.type == RenderConfigReader.RenderpassType.geometry) {
                    logger.warn("$this: DSL for ObjectTextures not found for pass $passName")
                } else {
                    logger.debug("$this: DSL for ObjectTextures not found for pass $passName")
                }
            }

            others?.forEach { texture ->
                logger.trace("Pass descriptor sets are {}", pass.descriptorSetLayouts.keys.joinToString(","))
                val dsl = pass.descriptorSetLayouts[texture.key]
                if (dsl != null) {
                    textureDescriptorSets[pass.passConfig.type.name to texture.key] = createOrUpdateTextureDescriptorSet(
                        texture.key,
                        pass.passConfig.type.name,
                        listOf(texture),
                        dsl,
                        device,
                        descriptorPool)
                } else {
                    logger.warn("$this: DSL for ${texture.key} not found for pass $passName")
                }
            }
        }
    }

    fun clearTextureDescriptorSets() {
        textureDescriptorSets.clear()
    }

    private fun createOrUpdateTextureDescriptorSet(name: String, passName: String, textures: List<MutableMap.MutableEntry<String, VulkanTexture>>, descriptorSetLayout: Long, device: VulkanDevice, descriptorPool: Long): Long {
        val cacheKey = TextureKey(device.vulkanDevice, descriptorSetLayout, textures)

        val existing = cache[cacheKey]

        if(existing != null) {
            return existing
        }

        val descriptorSet: Long = textureDescriptorSets.getOrPut(passName to name) {
            val pDescriptorSetLayout = memAllocLong(1)
            pDescriptorSetLayout.put(0, descriptorSetLayout)

            val allocInfo = VkDescriptorSetAllocateInfo.calloc()
                .sType(VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO)
                .pNext(NULL)
                .descriptorPool(descriptorPool)
                .pSetLayouts(pDescriptorSetLayout)

            descriptorSetsRecreated = System.nanoTime()

            VU.getLong("vkAllocateDescriptorSets",
                { VK10.vkAllocateDescriptorSets(device.vulkanDevice, allocInfo, this) },
                { allocInfo.free(); memFree(pDescriptorSetLayout) })

        }

        val d = (1..textures.count()).map { VkDescriptorImageInfo.calloc(1) }.toTypedArray()
        val wd = VkWriteDescriptorSet.calloc(textures.count())
        var i = 0

        textures.forEach { texture ->
            d[i]
                .imageView(texture.value.image.view)
                .sampler(texture.value.image.sampler)
                .imageLayout(VK10.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL)

            wd[i]
                .sType(VK10.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET)
                .pNext(NULL)
                .dstSet(descriptorSet)
                .dstBinding(0)
                .dstArrayElement(i)
                .pImageInfo(d[i])
                .descriptorType(VK10.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)
                .descriptorCount(1)

            i++
        }

        VK10.vkUpdateDescriptorSets(device.vulkanDevice, wd, null)
        wd.free()
        d.forEach { it.free() }

        logger.debug("Creating texture descriptor for $name in pass $passName {} set with 1 bindings, DSL={}", descriptorSet.toHexString(), descriptorSetLayout.toHexString())
        cache[cacheKey] = descriptorSet
        return descriptorSet
    }

    /**
     * Returns the descriptor set named [textureSet] containing referring to the textures needed in a given [passname].
     * If [textureSet] is not found for [passname], null is returned.
     */
    fun getTextureDescriptorSet(passname: String, textureSet: String = ""): Long? {
        val texture = if(textureSet == "") {
            "ObjectTextures"
        } else {
            textureSet
        }

        val set = textureDescriptorSets[passname to texture]
        if(set == null) {
            logger.warn("$this: Could not find descriptor set for $passname and texture set $texture")
//            logger.warn("DS are: ${textureDescriptorSets.keys().asSequence().joinToString { "${it.first} in ${it.second}" }}")
            logger.warn("DS are: ${textureDescriptorSets.keys().asSequence().groupBy { it.first }.entries.joinToString { "${it.key}: ${it.value.joinToString(", ") { ds -> ds.second }}" }}")
        }

        return set
    }

    data class TextureKey(val device: VkDevice, val dsl: Long, val textures: List<MutableMap.MutableEntry<String, VulkanTexture>>)

    /**
     * Utility class for [VulkanObjectState].
     */
    companion object {
        protected val logger by LazyLogger()

        protected val cache = HashMap<TextureKey, Long>()

        /**
         * Returns the array index of a texture [type].
         */
        fun textureTypeToSlot(type: String): Int {
            return when (type) {
                "ambient" -> 0
                "diffuse" -> 1
                "specular" -> 2
                "normal" -> 3
                "alphamask" -> 4
                "displacement" -> 5
                "3D-volume" -> 0
                else -> { logger.trace("Don't know how to determine slot for: {}", type); 0 }
            }
        }
    }
}
