package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Vulkan Object State class. Saves texture, UBO, pipeline and vertex buffer state.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 v2\u00020\u0001:\u0001vB\u0005\u00a2\u0006\u0002\u0010\u0002JT\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\u00052\u0018\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020I0c0b2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020iH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\bj\u0010kJ\u001d\u0010l\u001a\u0004\u0018\u00010\u00072\u0006\u0010m\u001a\u00020\u00052\b\b\u0002\u0010n\u001a\u00020\u0005\u00f8\u0001\u0000J4\u0010o\u001a\u00020p2\u0006\u0010f\u001a\u00020g2\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020s0r2\u0006\u0010h\u001a\u00020i\u00f8\u0001\u0000\u00a2\u0006\u0004\bt\u0010uR5\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0004X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001f\u0010\u001d\u001a\u00020\u001eX\u0084\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\u001f\u0010\'\u001a\u00020(X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001a\u0010+\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R\u001a\u00104\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010.\"\u0004\b5\u00100R\u001b\u00106\u001a\u0002078DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b8\u00109R)\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070=X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR5\u0010B\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0004\u0012\u00020\u00070CX\u0084\u000e\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020I0CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020M0CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010E\"\u0004\bO\u0010GR\u001a\u0010P\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0010\"\u0004\bR\u0010\u0012R\u001c\u0010S\u001a\u0004\u0018\u00010TX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020ZX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006w"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanObjectState;", "Lgraphics/scenery/NodeMetadata;", "()V", "UBOs", "Ljava/util/LinkedHashMap;", "", "Lkotlin/Pair;", "Lvkk/entities/VkDescriptorSet;", "Lgraphics/scenery/backends/vulkan/VulkanUBO;", "getUBOs", "()Ljava/util/LinkedHashMap;", "setUBOs", "(Ljava/util/LinkedHashMap;)V", "blendingHashCode", "", "getBlendingHashCode", "()I", "setBlendingHashCode", "(I)V", "consumers", "", "getConsumers", "()Ljava/util/List;", "defaultTexturesFor", "Ljava/util/HashSet;", "getDefaultTexturesFor", "()Ljava/util/HashSet;", "setDefaultTexturesFor", "(Ljava/util/HashSet;)V", "descriptorSetsRecreated", "Lgraphics/scenery/backends/vulkan/NanoSecond;", "getDescriptorSetsRecreated", "()J", "setDescriptorSetsRecreated-HBoJQQE", "(J)V", "J", "indexCount", "getIndexCount", "setIndexCount", "indexOffset", "Lvkk/entities/VkDeviceSize;", "getIndexOffset", "setIndexOffset-0GOl_3Q", "initialized", "", "getInitialized", "()Z", "setInitialized", "(Z)V", "instanceCount", "getInstanceCount", "setInstanceCount", "isIndexed", "setIndexed", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate$1", "Lkotlin/Lazy;", "requiredDescriptorSets", "Ljava/util/HashMap;", "getRequiredDescriptorSets", "()Ljava/util/HashMap;", "setRequiredDescriptorSets", "(Ljava/util/HashMap;)V", "textureDescriptorSets", "Ljava/util/concurrent/ConcurrentHashMap;", "getTextureDescriptorSets", "()Ljava/util/concurrent/ConcurrentHashMap;", "setTextureDescriptorSets", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "textures", "Lgraphics/scenery/backends/vulkan/VulkanTexture;", "getTextures", "setTextures", "vertexBuffers", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "getVertexBuffers", "setVertexBuffers", "vertexCount", "getVertexCount", "setVertexCount", "vertexDescription", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDescription;", "getVertexDescription", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDescription;", "setVertexDescription", "(Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDescription;)V", "vertexInputType", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDataKinds;", "getVertexInputType", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDataKinds;", "setVertexInputType", "(Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDataKinds;)V", "createOrUpdateTextureDescriptorSet", "name", "passName", "", "", "descriptorSetLayout", "Lvkk/entities/VkDescriptorSetLayout;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "descriptorPool", "Lvkk/entities/VkDescriptorPool;", "createOrUpdateTextureDescriptorSet-LxPxeE8", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLgraphics/scenery/backends/vulkan/VulkanDevice;J)J", "getTextureDescriptorSet", "passname", "textureSet", "texturesToDescriptorSets", "", "passes", "", "Lgraphics/scenery/backends/vulkan/VulkanRenderpass;", "texturesToDescriptorSets-GWwa6-s", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Ljava/util/Map;J)V", "Companion", "scenery"})
public class VulkanObjectState implements graphics.scenery.NodeMetadata {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate$1 = null;
    
    /**
     * Consumers for this metadata object. 
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> consumers = null;
    
    /**
     * Whether this metadata object has been fully initialised. 
     */
    private boolean initialized;
    
    /**
     * Indicates whether the mesh is using indexed vertex storage. 
     */
    private boolean isIndexed;
    
    /**
     * Indicates the offset to the indices in the vertex buffer in bytes. 
     */
    private long indexOffset;
    
    /**
     * The number of indices stored. 
     */
    private int indexCount;
    
    /**
     * The number of vertices stored. 
     */
    private int vertexCount;
    
    /**
     * The number of instances the [graphics.scenery.Node] this metadata object is attached to has. 
     */
    private int instanceCount;
    
    /**
     * Hash map storing necessary vertex buffers. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanBuffer> vertexBuffers;
    
    /**
     * UBOs required by the [graphics.scenery.Node] this metadata object is attached to. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, kotlin.Pair<vkk.entities.VkDescriptorSet, graphics.scenery.backends.vulkan.VulkanUBO>> UBOs;
    
    /**
     * [VulkanTexture]s used by the [graphics.scenery.Node] this metadata object is attached to. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanTexture> textures;
    
    /**
     * Hash code for the blending options used in the last command buffer recording. 
     */
    private int blendingHashCode;
    
    /**
     * Whether this [graphics.scenery.Node] will use any default textures for any of its texture slots. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.HashSet<java.lang.String> defaultTexturesFor;
    
    /**
     * Descriptor sets required 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.String, vkk.entities.VkDescriptorSet> requiredDescriptorSets;
    
    /**
     * The vertex input type defining what are going to be inputs to the vertex shader. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.VulkanRenderer.VertexDataKinds vertexInputType;
    
    /**
     * The vertex description, if necessary (can be null, e.g. for generative geometry). 
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription vertexDescription;
    
    /**
     * Descriptor set for the textures this [graphics.scenery.Node] will be rendered with. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<kotlin.Pair<java.lang.String, java.lang.String>, vkk.entities.VkDescriptorSet> textureDescriptorSets;
    
    /**
     * Time stamp of the last recreation of the texture descriptor sets 
     */
    private long descriptorSetsRecreated;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy logger$delegate = null;
    public static final graphics.scenery.backends.vulkan.VulkanObjectState.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getConsumers() {
        return null;
    }
    
    public final boolean getInitialized() {
        return false;
    }
    
    public final void setInitialized(boolean p0) {
    }
    
    public final boolean isIndexed() {
        return false;
    }
    
    public final void setIndexed(boolean p0) {
    }
    
    public final long getIndexOffset() {
        return 0L;
    }
    
    public final int getIndexCount() {
        return 0;
    }
    
    public final void setIndexCount(int p0) {
    }
    
    public final int getVertexCount() {
        return 0;
    }
    
    public final void setVertexCount(int p0) {
    }
    
    public final int getInstanceCount() {
        return 0;
    }
    
    public final void setInstanceCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanBuffer> getVertexBuffers() {
        return null;
    }
    
    public final void setVertexBuffers(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanBuffer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, kotlin.Pair<vkk.entities.VkDescriptorSet, graphics.scenery.backends.vulkan.VulkanUBO>> getUBOs() {
        return null;
    }
    
    public final void setUBOs(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, kotlin.Pair<vkk.entities.VkDescriptorSet, graphics.scenery.backends.vulkan.VulkanUBO>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanTexture> getTextures() {
        return null;
    }
    
    public final void setTextures(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanTexture> p0) {
    }
    
    public final int getBlendingHashCode() {
        return 0;
    }
    
    public final void setBlendingHashCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashSet<java.lang.String> getDefaultTexturesFor() {
        return null;
    }
    
    public final void setDefaultTexturesFor(@org.jetbrains.annotations.NotNull()
    java.util.HashSet<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, vkk.entities.VkDescriptorSet> getRequiredDescriptorSets() {
        return null;
    }
    
    public final void setRequiredDescriptorSets(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, vkk.entities.VkDescriptorSet> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanRenderer.VertexDataKinds getVertexInputType() {
        return null;
    }
    
    public final void setVertexInputType(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanRenderer.VertexDataKinds p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription getVertexDescription() {
        return null;
    }
    
    public final void setVertexDescription(@org.jetbrains.annotations.Nullable()
    graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<kotlin.Pair<java.lang.String, java.lang.String>, vkk.entities.VkDescriptorSet> getTextureDescriptorSets() {
        return null;
    }
    
    protected final void setTextureDescriptorSets(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<kotlin.Pair<java.lang.String, java.lang.String>, vkk.entities.VkDescriptorSet> p0) {
    }
    
    protected final long getDescriptorSetsRecreated() {
        return 0L;
    }
    
    /**
     * * Returns the descriptor set named [textureSet] containing referring to the textures needed in a given [passname].
     *     * If [textureSet] is not found for [passname], null is returned.
     */
    @org.jetbrains.annotations.Nullable()
    public final vkk.entities.VkDescriptorSet getTextureDescriptorSet(@org.jetbrains.annotations.NotNull()
    java.lang.String passname, @org.jetbrains.annotations.NotNull()
    java.lang.String textureSet) {
        return null;
    }
    
    public VulkanObjectState() {
        super();
    }
    
    /**
     * * Utility class for [VulkanObjectState].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001b\u0010\u0003\u001a\u00020\u00048DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanObjectState$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "textureTypeToSlot", "", "type", "", "scenery"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        protected final org.slf4j.Logger getLogger() {
            return null;
        }
        
        /**
         * * Returns the array index of a texture [type].
         */
        public final int textureTypeToSlot(@org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}