package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Vulkan Texture class. Creates a texture on the [device], with [width]x[height]x[depth],
 * * of [format], with a given number of [mipLevels]. Filtering can be set via
 * * [minFilterLinear] and [maxFilterLinear]. Needs to be supplied with a [queue] to execute
 * * generic operations on, and a [transferQueue] for transfer operations. Both are allowed to
 * * be the same.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 C2\u00020\u0001:\u0002CDB9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rBg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0015J\b\u00101\u001a\u000202H\u0016J\u000e\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u000205Jx\u00106\u001a\u00060 R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\f2\n\u00109\u001a\u00060\fj\u0002`:2\u0006\u0010\u000b\u001a\u00020\f2\u001c\b\u0002\u0010;\u001a\u0016\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020>\u0018\u00010<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@J\u001a\u0010A\u001a\u00020>2\n\u0010!\u001a\u00060 R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fJ\b\u0010B\u001a\u00020>H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R,\u0010!\u001a\u00060 R\u00020\u00002\n\u0010\u001f\u001a\u00060 R\u00020\u0000@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010+R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00060 R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0011\u0010\u000e\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0019\u00a8\u0006E"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanTexture;", "Ljava/lang/AutoCloseable;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "commandPools", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "transferQueue", "genericTexture", "Lgraphics/scenery/GenericTexture;", "mipLevels", "", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;Lorg/lwjgl/vulkan/VkQueue;Lorg/lwjgl/vulkan/VkQueue;Lgraphics/scenery/GenericTexture;I)V", "width", "height", "depth", "format", "minFilterLinear", "", "maxFilterLinear", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;Lorg/lwjgl/vulkan/VkQueue;Lorg/lwjgl/vulkan/VkQueue;IIIIIZZ)V", "getCommandPools", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "getDepth", "()I", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "getFormat", "gt", "getHeight", "<set-?>", "Lgraphics/scenery/backends/vulkan/VulkanTexture$VulkanImage;", "image", "getImage", "()Lgraphics/scenery/backends/vulkan/VulkanTexture$VulkanImage;", "setImage", "(Lgraphics/scenery/backends/vulkan/VulkanTexture$VulkanImage;)V", "getMaxFilterLinear", "()Z", "getMinFilterLinear", "getMipLevels", "setMipLevels", "(I)V", "getQueue", "()Lorg/lwjgl/vulkan/VkQueue;", "stagingImage", "getTransferQueue", "getWidth", "close", "", "copyFrom", "data", "Ljava/nio/ByteBuffer;", "createImage", "usage", "tiling", "memoryFlags", "Lvkk/VkMemoryPropertyFlags;", "customAllocator", "Lkotlin/Function2;", "Lorg/lwjgl/vulkan/VkMemoryRequirements;", "", "imageCreateInfo", "Lorg/lwjgl/vulkan/VkImageCreateInfo;", "createImageView", "createSampler", "Companion", "VulkanImage", "scenery"})
public class VulkanTexture implements java.lang.AutoCloseable {
    
    /**
     * The Vulkan image associated with this texture. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage image;
    private graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage stagingImage;
    private graphics.scenery.GenericTexture gt;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkQueue queue = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkQueue transferQueue = null;
    private final int width = 0;
    private final int height = 0;
    private final int depth = 0;
    private final int format = 0;
    private int mipLevels;
    private final boolean minFilterLinear = false;
    private final boolean maxFilterLinear = false;
    private static final kotlin.Lazy logger$delegate = null;
    private static final java.awt.image.ComponentColorModel StandardAlphaColorModel = null;
    private static final java.awt.image.ComponentColorModel StandardColorModel = null;
    public static final graphics.scenery.backends.vulkan.VulkanTexture.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage getImage() {
        return null;
    }
    
    protected final void setImage(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage p0) {
    }
    
    /**
     * * Creates a Vulkan image of [format] with a given [width], [height], and [depth].
     *     * [usage] and [memoryFlags] need to be given, as well as the [tiling] parameter and number of [mipLevels].
     *     * A custom memory allocator may be used and given as [customAllocator].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage createImage(int width, int height, int depth, int format, int usage, int tiling, int memoryFlags, int mipLevels, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super org.lwjgl.vulkan.VkMemoryRequirements, ? super java.lang.Long, java.lang.Long> customAllocator, @org.jetbrains.annotations.Nullable()
    org.lwjgl.vulkan.VkImageCreateInfo imageCreateInfo) {
        return null;
    }
    
    /**
     * * Copies the data for this texture from a [ByteBuffer], [data].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanTexture copyFrom(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer data) {
        return null;
    }
    
    /**
     * * Creates a Vulkan image view with [format] for an [image].
     */
    public final long createImageView(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage image, int format) {
        return 0L;
    }
    
    /**
     * * Creates a default sampler for this texture.
     */
    private final long createSampler() {
        return 0L;
    }
    
    /**
     * * Deallocates and destroys this [VulkanTexture] instance, freeing all memory
     *     * related to it.
     */
    @java.lang.Override()
    public void close() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools getCommandPools() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkQueue getQueue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkQueue getTransferQueue() {
        return null;
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public final int getDepth() {
        return 0;
    }
    
    public final int getFormat() {
        return 0;
    }
    
    public final int getMipLevels() {
        return 0;
    }
    
    public final void setMipLevels(int p0) {
    }
    
    public final boolean getMinFilterLinear() {
        return false;
    }
    
    public final boolean getMaxFilterLinear() {
        return false;
    }
    
    public VulkanTexture(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkQueue transferQueue, int width, int height, int depth, int format, int mipLevels, boolean minFilterLinear, boolean maxFilterLinear) {
        super();
    }
    
    /**
     * * Alternative constructor to create a [VulkanTexture] from a [GenericTexture].
     */
    @kotlin.Suppress(names = {"USELESS_ELVIS", "UNNECESSARY_SAFE_CALL"})
    public VulkanTexture(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkQueue transferQueue, @org.jetbrains.annotations.NotNull()
    graphics.scenery.GenericTexture genericTexture, int mipLevels) {
        super();
    }
    
    private static final org.slf4j.Logger getLogger() {
        return null;
    }
    
    /**
     * * Wrapper class for holding on to raw Vulkan [image]s backed by [memory].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J,\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0003J.\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u0003J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0000R\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR$\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\n\u00a8\u0006#"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanTexture$VulkanImage;", "", "image", "", "memory", "maxSize", "(Lgraphics/scenery/backends/vulkan/VulkanTexture;JJJ)V", "getImage", "()J", "setImage", "(J)V", "getMaxSize", "getMemory", "setMemory", "<set-?>", "sampler", "getSampler", "setSampler$scenery", "view", "getView", "setView$scenery", "copyFrom", "", "commandBuffer", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "buffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "update", "Lgraphics/scenery/TextureUpdate;", "bufferOffset", "updates", "", "Lgraphics/scenery/backends/vulkan/VulkanTexture;", "extents", "Lgraphics/scenery/TextureExtents;", "scenery"})
    public final class VulkanImage {
        
        /**
         * Raw Vulkan sampler. 
         */
        private long sampler;
        
        /**
         * Raw Vulkan view. 
         */
        private long view;
        private long image;
        private long memory;
        private final long maxSize = 0L;
        
        public final long getSampler() {
            return 0L;
        }
        
        public final void setSampler$scenery(long p0) {
        }
        
        public final long getView() {
            return 0L;
        }
        
        public final void setView$scenery(long p0) {
        }
        
        /**
         * * Copies the content of the image from [buffer]. This gets executed
         *         * within a given [commandBuffer].
         */
        public final void copyFrom(@org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkCommandBuffer commandBuffer, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanBuffer buffer, @org.jetbrains.annotations.Nullable()
        graphics.scenery.TextureUpdate update, long bufferOffset) {
        }
        
        /**
         * * Copies the content of the image to [buffer] from a series of [updates]. This gets executed
         *         * within a given [commandBuffer].
         */
        public final void copyFrom(@org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkCommandBuffer commandBuffer, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanBuffer buffer, @org.jetbrains.annotations.NotNull()
        java.util.List<graphics.scenery.TextureUpdate> updates, long bufferOffset) {
        }
        
        /**
         * * Copies the content of the image from a given [VulkanImage], [image].
         *         * This gets executed within a given [commandBuffer].
         */
        public final void copyFrom(@org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkCommandBuffer commandBuffer, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage image, @org.jetbrains.annotations.Nullable()
        graphics.scenery.TextureExtents extents) {
        }
        
        public final long getImage() {
            return 0L;
        }
        
        public final void setImage(long p0) {
        }
        
        public final long getMemory() {
            return 0L;
        }
        
        public final void setMemory(long p0) {
        }
        
        public final long getMaxSize() {
            return 0L;
        }
        
        public VulkanImage(long image, long memory, long maxSize) {
            super();
        }
    }
    
    /**
     * * Utility methods for [VulkanTexture].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0004J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002JP\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$JH\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$J>\u0010(\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010)\u001a\u00020*JP\u0010+\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\b\b\u0002\u00104\u001a\u00020/2\b\b\u0002\u00105\u001a\u00020/2\u0006\u00106\u001a\u000207J\f\u00108\u001a\u00020/*\u000209H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0006\u001a\u00020\u00078BX\u0083\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n\u00a8\u0006:"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanTexture$Companion;", "", "()V", "StandardAlphaColorModel", "Ljava/awt/image/ComponentColorModel;", "StandardColorModel", "logger", "Lorg/slf4j/Logger;", "logger$annotations", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "bufferedImageToRGBABuffer", "Ljava/nio/ByteBuffer;", "bufferedImage", "Ljava/awt/image/BufferedImage;", "createFlipped", "image", "createTransformed", "at", "Ljava/awt/geom/AffineTransform;", "loadFromFile", "Lgraphics/scenery/backends/vulkan/VulkanTexture;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "commandPools", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "transferQueue", "stream", "Ljava/io/InputStream;", "type", "", "linearMin", "", "linearMax", "generateMipmaps", "filename", "loadFromFileRaw", "dimensions", "", "transitionLayout", "", "", "oldLayout", "", "newLayout", "mipLevels", "subresourceRange", "Lorg/lwjgl/vulkan/VkImageSubresourceRange;", "srcStage", "dstStage", "commandBuffer", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "toVulkanFormat", "Lgraphics/scenery/GenericTexture;", "scenery"})
    public static final class Companion {
        
        private static void logger$annotations() {
        }
        
        private final org.slf4j.Logger getLogger() {
            return null;
        }
        
        /**
         * * Loads a texture from a file given by [filename], and allocates the [VulkanTexture] on [device].
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanTexture loadFromFile(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkQueue transferQueue, @org.jetbrains.annotations.NotNull()
        java.lang.String filename, boolean linearMin, boolean linearMax, boolean generateMipmaps) {
            return null;
        }
        
        /**
         * * Loads a texture from a file given by a [stream], and allocates the [VulkanTexture] on [device].
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanTexture loadFromFile(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkQueue transferQueue, @org.jetbrains.annotations.NotNull()
        java.io.InputStream stream, @org.jetbrains.annotations.NotNull()
        java.lang.String type, boolean linearMin, boolean linearMax, boolean generateMipmaps) {
            return null;
        }
        
        /**
         * * Loads a texture from a raw file given by a [stream], and allocates the [VulkanTexture] on [device].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
        public final graphics.scenery.backends.vulkan.VulkanTexture loadFromFileRaw(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkQueue transferQueue, @org.jetbrains.annotations.NotNull()
        java.io.InputStream stream, @org.jetbrains.annotations.NotNull()
        java.lang.String type, @org.jetbrains.annotations.NotNull()
        long[] dimensions) {
            return null;
        }
        
        /**
         * * Converts a buffered image to an RGBA byte buffer.
         */
        @org.jetbrains.annotations.NotNull()
        protected final java.nio.ByteBuffer bufferedImageToRGBABuffer(@org.jetbrains.annotations.NotNull()
        java.awt.image.BufferedImage bufferedImage) {
            return null;
        }
        
        private final java.awt.image.BufferedImage createFlipped(java.awt.image.BufferedImage image) {
            return null;
        }
        
        private final java.awt.image.BufferedImage createTransformed(java.awt.image.BufferedImage image, java.awt.geom.AffineTransform at) {
            return null;
        }
        
        /**
         * * Transitions Vulkan image layouts.
         */
        public final void transitionLayout(long image, int oldLayout, int newLayout, int mipLevels, @org.jetbrains.annotations.Nullable()
        org.lwjgl.vulkan.VkImageSubresourceRange subresourceRange, int srcStage, int dstStage, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkCommandBuffer commandBuffer) {
        }
        
        private final int toVulkanFormat(@org.jetbrains.annotations.NotNull()
        graphics.scenery.GenericTexture $receiver) {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}