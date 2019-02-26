package graphics.scenery.backends.vulkan;

/**
 * * Vulkan Object State class. Saves texture, UBO, pipeline and vertex buffer state.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 f2\u00020\u0001:\u0001fB\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\\\u001a\u00020\u00072\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020b2\b\b\u0002\u0010c\u001a\u00020\u000e\u00f8\u0001\u0000\u00a2\u0006\u0004\bd\u0010eR5\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0004X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001f\u0010 \u001a\u00020!X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u0010\u0012R\u001a\u00100\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010*\"\u0004\b1\u0010,R\u001b\u00102\u001a\u0002038DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u00107\u001a\u0004\b4\u00105R)\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000709X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R)\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0007@DX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b@\u0010#\"\u0004\bA\u0010%R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020D0CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR&\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020J0CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR\u001a\u0010M\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0010\"\u0004\bO\u0010\u0012R\u001c\u0010P\u001a\u0004\u0018\u00010QX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020WX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006g"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanObjectState;", "Lgraphics/scenery/NodeMetadata;", "()V", "UBOs", "Ljava/util/LinkedHashMap;", "", "Lkotlin/Pair;", "Lvkk/entities/VkDescriptorSet;", "Lgraphics/scenery/backends/vulkan/VulkanUBO;", "getUBOs", "()Ljava/util/LinkedHashMap;", "setUBOs", "(Ljava/util/LinkedHashMap;)V", "blendingHashCode", "", "getBlendingHashCode", "()I", "setBlendingHashCode", "(I)V", "consumers", "", "getConsumers", "()Ljava/util/List;", "defaultTexturesFor", "Ljava/util/HashSet;", "getDefaultTexturesFor", "()Ljava/util/HashSet;", "setDefaultTexturesFor", "(Ljava/util/HashSet;)V", "indexCount", "getIndexCount", "setIndexCount", "indexOffset", "Lvkk/entities/VkDeviceSize;", "getIndexOffset", "()J", "setIndexOffset-0GOl_3Q", "(J)V", "J", "initialized", "", "getInitialized", "()Z", "setInitialized", "(Z)V", "instanceCount", "getInstanceCount", "setInstanceCount", "isIndexed", "setIndexed", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate$1", "Lkotlin/Lazy;", "requiredDescriptorSets", "Ljava/util/HashMap;", "getRequiredDescriptorSets", "()Ljava/util/HashMap;", "setRequiredDescriptorSets", "(Ljava/util/HashMap;)V", "<set-?>", "textureDescriptorSet", "getTextureDescriptorSet", "setTextureDescriptorSet-DEHYf1M", "textures", "Ljava/util/concurrent/ConcurrentHashMap;", "Lgraphics/scenery/backends/vulkan/VulkanTexture;", "getTextures", "()Ljava/util/concurrent/ConcurrentHashMap;", "setTextures", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "vertexBuffers", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "getVertexBuffers", "setVertexBuffers", "vertexCount", "getVertexCount", "setVertexCount", "vertexDescription", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDescription;", "getVertexDescription", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDescription;", "setVertexDescription", "(Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDescription;)V", "vertexInputType", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDataKinds;", "getVertexInputType", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDataKinds;", "setVertexInputType", "(Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDataKinds;)V", "texturesToDescriptorSet", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "descriptorSetLayout", "Lvkk/entities/VkDescriptorSetLayout;", "descriptorPool", "Lvkk/entities/VkDescriptorPool;", "targetBinding", "texturesToDescriptorSet-2u8nKCU", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;JJI)J", "Companion", "scenery"})
public class VulkanObjectState implements graphics.scenery.NodeMetadata {
    public static final graphics.scenery.backends.vulkan.VulkanObjectState.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy logger$delegate = null;
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
    private long textureDescriptorSet;

    public VulkanObjectState() {
        super();
    }

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

    public final long getTextureDescriptorSet() {
        return 0L;
    }

    /**
     * * Utility class for [VulkanObjectState].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001b\u0010\u0003\u001a\u00020\u00048DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanObjectState$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "textureTypeToSlot", "", "type", "", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }

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
    }
}
