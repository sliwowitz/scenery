package graphics.scenery.backends.vulkan;

/**
 * * Vulkan Texture class. Creates a texture on the [device], with [width]x[height]x[depth],
 * * of [format], with a given number of [mipLevels]. Filtering can be set via
 * * [minFilterLinear] and [maxFilterLinear]. Needs to be supplied with a [queue] to execute
 * * generic operations on, and a [transferQueue] for transfer operations. Both are allowed to
 * * be the same.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 V2\u00020\u0001:\u0002VWBM\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0010Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0016J\b\u0010=\u001a\u00020>H\u0016J\u000e\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020AJ\u007f\u0010B\u001a\u00060\"R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010C\u001a\u00060\fj\u0002`D2\u0006\u0010E\u001a\u00020F2\n\u0010G\u001a\u00060\fj\u0002`H2\u0006\u0010\u000b\u001a\u00020\f2\u001c\b\u0002\u0010I\u001a\u0016\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020M\u0018\u00010J2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O\u00f8\u0001\u0000J\"\u0010P\u001a\u00020Q2\n\u0010#\u001a\u00060\"R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u00020TH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010UR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR,\u0010#\u001a\u00060\"R\u00020\u00002\n\u0010!\u001a\u00060\"R\u00020\u0000@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001b\u0010(\u001a\u00020)8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u00103R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0012\u00106\u001a\u00060\"R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0011\u00108\u001a\u0002098F\u00a2\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006X"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanTexture;", "Ljava/lang/AutoCloseable;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "commandPools", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "transferQueue", "genericTexture", "Lgraphics/scenery/GenericTexture;", "mipLevels", "", "minFilterLinear", "", "maxFilterLinear", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;Lorg/lwjgl/vulkan/VkQueue;Lorg/lwjgl/vulkan/VkQueue;Lgraphics/scenery/GenericTexture;IZZ)V", "width", "height", "depth", "format", "Lvkk/VkFormat;", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;Lorg/lwjgl/vulkan/VkQueue;Lorg/lwjgl/vulkan/VkQueue;IIILvkk/VkFormat;IZZ)V", "getCommandPools", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "getDepth", "()I", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "getFormat", "()Lvkk/VkFormat;", "gt", "getHeight", "<set-?>", "Lgraphics/scenery/backends/vulkan/VulkanTexture$VulkanImage;", "image", "getImage", "()Lgraphics/scenery/backends/vulkan/VulkanTexture$VulkanImage;", "setImage", "(Lgraphics/scenery/backends/vulkan/VulkanTexture$VulkanImage;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate$1", "Lkotlin/Lazy;", "getMaxFilterLinear", "()Z", "getMinFilterLinear", "getMipLevels", "setMipLevels", "(I)V", "getQueue", "()Lorg/lwjgl/vulkan/VkQueue;", "stagingImage", "getTransferQueue", "vkDev", "Lorg/lwjgl/vulkan/VkDevice;", "getVkDev", "()Lorg/lwjgl/vulkan/VkDevice;", "getWidth", "close", "", "copyFrom", "data", "Ljava/nio/ByteBuffer;", "createImage", "usage", "Lvkk/VkImageUsageFlags;", "tiling", "Lvkk/VkImageTiling;", "memoryFlags", "Lvkk/VkMemoryPropertyFlags;", "customAllocator", "Lkotlin/Function2;", "Lorg/lwjgl/vulkan/VkMemoryRequirements;", "Lvkk/entities/VkImage;", "Lvkk/entities/VkDeviceMemory;", "imageCreateInfo", "Lorg/lwjgl/vulkan/VkImageCreateInfo;", "createImageView", "Lvkk/entities/VkImageView;", "(Lgraphics/scenery/backends/vulkan/VulkanTexture$VulkanImage;Lvkk/VkFormat;)J", "createSampler", "Lvkk/entities/VkSampler;", "()J", "Companion", "VulkanImage", "scenery"})
public class VulkanTexture implements java.lang.AutoCloseable {
    public static final graphics.scenery.backends.vulkan.VulkanTexture.Companion Companion = null;
    private static final kotlin.Lazy logger$delegate = null;
    private static final java.awt.image.ComponentColorModel StandardAlphaColorModel = null;
    private static final java.awt.image.ComponentColorModel StandardColorModel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate$1 = null;
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
    @org.jetbrains.annotations.NotNull()
    private final vkk.VkFormat format = null;
    private final boolean minFilterLinear = false;
    private final boolean maxFilterLinear = false;
    /**
     * The Vulkan image associated with this texture.
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage image;
    private graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage stagingImage;
    private graphics.scenery.GenericTexture gt;
    private int mipLevels;

    public VulkanTexture(@org.jetbrains.annotations.NotNull()
                             graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
                             graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
                             org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
                             org.lwjgl.vulkan.VkQueue transferQueue, int width, int height, int depth, @org.jetbrains.annotations.NotNull()
                             vkk.VkFormat format, int mipLevels, boolean minFilterLinear, boolean maxFilterLinear) {
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
                             graphics.scenery.GenericTexture genericTexture, int mipLevels, boolean minFilterLinear, boolean maxFilterLinear) {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage getImage() {
        return null;
    }

    protected final void setImage(@org.jetbrains.annotations.NotNull()
                                      graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkDevice getVkDev() {
        return null;
    }

    /**
     * * Creates a Vulkan image of [format] with a given [width], [height], and [depth].
     * * [usage] and [memoryFlags] need to be given, as well as the [tiling] parameter and number of [mipLevels].
     * * A custom memory allocator may be used and given as [customAllocator].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage createImage(int width, int height, int depth, @org.jetbrains.annotations.NotNull()
        vkk.VkFormat format, int usage, @org.jetbrains.annotations.NotNull()
                                                                                            vkk.VkImageTiling tiling, int memoryFlags, int mipLevels, @org.jetbrains.annotations.Nullable()
                                                                                            kotlin.jvm.functions.Function2<? super org.lwjgl.vulkan.VkMemoryRequirements, ? super vkk.entities.VkImage, vkk.entities.VkDeviceMemory> customAllocator, @org.jetbrains.annotations.Nullable()
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
                                          graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage image, @org.jetbrains.annotations.NotNull()
                                          vkk.VkFormat format) {
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
     * * related to it.
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

    @org.jetbrains.annotations.NotNull()
    public final vkk.VkFormat getFormat() {
        return null;
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

    /**
     * * Utility methods for [VulkanTexture].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0004J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002JP\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#JH\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#J>\u0010\'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010(\u001a\u00020)Jb\u0010*\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\f\b\u0002\u00104\u001a\u000601j\u0002`52\f\b\u0002\u00106\u001a\u000601j\u0002`52\u0006\u00107\u001a\u000208\u00f8\u0001\u0000\u00a2\u0006\u0004\b9\u0010:J\f\u0010;\u001a\u00020<*\u00020=H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006>"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanTexture$Companion;", "", "()V", "StandardAlphaColorModel", "Ljava/awt/image/ComponentColorModel;", "StandardColorModel", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "bufferedImageToRGBABuffer", "Ljava/nio/ByteBuffer;", "bufferedImage", "Ljava/awt/image/BufferedImage;", "createFlipped", "image", "createTransformed", "at", "Ljava/awt/geom/AffineTransform;", "loadFromFile", "Lgraphics/scenery/backends/vulkan/VulkanTexture;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "commandPools", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "transferQueue", "stream", "Ljava/io/InputStream;", "type", "", "linearMin", "", "linearMax", "generateMipmaps", "filename", "loadFromFileRaw", "dimensions", "", "transitionLayout", "", "Lvkk/entities/VkImage;", "oldLayout", "Lvkk/VkImageLayout;", "newLayout", "mipLevels", "", "subresourceRange", "Lorg/lwjgl/vulkan/VkImageSubresourceRange;", "srcStage", "Lvkk/VkPipelineStageFlags;", "dstStage", "commandBuffer", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "transitionLayout-3-L_5OA", "(JLvkk/VkImageLayout;Lvkk/VkImageLayout;ILorg/lwjgl/vulkan/VkImageSubresourceRange;IILorg/lwjgl/vulkan/VkCommandBuffer;)V", "toVulkanFormat", "Lvkk/VkFormat;", "Lgraphics/scenery/GenericTexture;", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
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

        private final vkk.VkFormat toVulkanFormat(@org.jetbrains.annotations.NotNull()
                                                      graphics.scenery.GenericTexture $receiver) {
            return null;
        }
    }

    /**
     * * Wrapper class for holding on to raw Vulkan [image]s backed by [memory].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B&\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0000R\u00020 R\u001f\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\nR\u001f\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@@X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0016@@X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanTexture$VulkanImage;", "", "image", "Lvkk/entities/VkImage;", "memory", "Lvkk/entities/VkDeviceMemory;", "maxSize", "Lvkk/entities/VkDeviceSize;", "(Lgraphics/scenery/backends/vulkan/VulkanTexture;JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getImage", "()J", "setImage-AGuVLy0", "(J)V", "J", "getMaxSize", "getMemory", "setMemory-H4ZSszY", "<set-?>", "Lvkk/entities/VkSampler;", "sampler", "getSampler", "setSampler-p3Ewqcg$scenery", "Lvkk/entities/VkImageView;", "view", "getView", "setView-5bUGt5Q$scenery", "copyFrom", "", "commandBuffer", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "buffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "Lgraphics/scenery/backends/vulkan/VulkanTexture;", "scenery"})
    public final class VulkanImage {

        private final long maxSize = 0L;
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

        private VulkanImage(long image, long memory, long maxSize) {
            super();
        }

        public final long getSampler() {
            return 0L;
        }

        public final long getView() {
            return 0L;
        }

        /**
         * * Copies the content of the image from [buffer]. This gets executed
         * * within a given [commandBuffer].
         */
        public final void copyFrom(@org.jetbrains.annotations.NotNull()
                                       org.lwjgl.vulkan.VkCommandBuffer commandBuffer, @org.jetbrains.annotations.NotNull()
                                       graphics.scenery.backends.vulkan.VulkanBuffer buffer) {
        }

        /**
         * * Copies the content of the image from a given [VulkanImage], [image].
         * * This gets executed within a given [commandBuffer].
         */
        public final void copyFrom(@org.jetbrains.annotations.NotNull()
                                       org.lwjgl.vulkan.VkCommandBuffer commandBuffer, @org.jetbrains.annotations.NotNull()
                                       graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage image) {
        }

        public final long getImage() {
            return 0L;
        }

        public final long getMemory() {
            return 0L;
        }

        public final long getMaxSize() {
            return 0L;
        }
    }
}
