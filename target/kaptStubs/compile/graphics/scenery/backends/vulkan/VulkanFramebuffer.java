package graphics.scenery.backends.vulkan;

/**
 * * Vulkan Framebuffer class. Creates a framebuffer on [device], associated with
 * * a [commandPool]. The framebuffer's [width] and [height] need to be given, as well
 * * as a [commandBuffer] during which's execution the framebuffer will be created.
 * *
 * * [shouldClear] - set if on the beginning of a render pass, the framebuffer should be cleared. On by default.
 * * [sRGB] - set if sRGB targets should be used. Off by default.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0002noBD\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ*\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u0007J*\u0010N\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u0007J*\u0010P\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u0007J*\u0010Q\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u0007J*\u0010R\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u0007J\u001e\u0010S\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00112\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0007J*\u0010W\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u0007J*\u0010X\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00072\b\b\u0002\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u0007J\b\u0010Y\u001a\u00020ZH\u0016J\u0006\u0010[\u001a\u00020\u0007J(\u0010\\\u001a\u00020Z2\u0006\u0010J\u001a\u00020\u00112\u0006\u0010]\u001a\u00020^2\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0007H\u0002J(\u0010_\u001a\u00020Z2\u0006\u0010J\u001a\u00020\u00112\u0006\u0010]\u001a\u00020^2\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0007H\u0002J0\u0010`\u001a\u00060\u0012R\u00020\u00002\u0006\u0010]\u001a\u00020^2\u0006\u0010a\u001a\u00020b2\b\b\u0002\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u0007H\u0004J\u0006\u0010c\u001a\u00020ZJ\u0006\u0010d\u001a\u00020\u0007J\b\u0010e\u001a\u00020fH\u0004J\u0010\u0010g\u001a\u00020hH\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010iJ\u0016\u0010j\u001a\b\u0012\u0004\u0012\u00020^0k2\u0006\u0010l\u001a\u00020^H\u0002J\b\u0010m\u001a\u00020\u0011H\u0016R*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u00060\u0012R\u00020\u00000\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\u00020\u0005X\u0084\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR)\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@DX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR)\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020%@DX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00102\u001a\u0002038DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u00107\u001a\u0004\b4\u00105R)\u00109\u001a\u0002082\u0006\u0010 \u001a\u000208@@X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001cR)\u0010=\u001a\u00020<2\u0006\u0010 \u001a\u00020<@DX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001cR\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010/R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010/\"\u0004\bB\u00101R\u0011\u0010C\u001a\u00020D8F\u00a2\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010*\"\u0004\bH\u0010,\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006p"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanFramebuffer;", "Ljava/lang/AutoCloseable;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "commandPool", "Lvkk/entities/VkCommandPool;", "width", "", "height", "commandBuffer", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "shouldClear", "", "sRGB", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;JIILorg/lwjgl/vulkan/VkCommandBuffer;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "attachments", "Ljava/util/LinkedHashMap;", "", "Lgraphics/scenery/backends/vulkan/VulkanFramebuffer$VulkanFramebufferAttachment;", "getAttachments", "()Ljava/util/LinkedHashMap;", "setAttachments", "(Ljava/util/LinkedHashMap;)V", "getCommandBuffer", "()Lorg/lwjgl/vulkan/VkCommandBuffer;", "getCommandPool", "()J", "setCommandPool-78nvDYs", "(J)V", "J", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "<set-?>", "Lvkk/entities/VkFramebuffer;", "framebuffer", "getFramebuffer", "setFramebuffer-oZzuLGk", "Lvkk/entities/VkSampler;", "framebufferSampler", "getFramebufferSampler", "setFramebufferSampler-p3Ewqcg", "getHeight", "()I", "setHeight", "(I)V", "initialized", "getInitialized", "()Z", "setInitialized", "(Z)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "Lvkk/entities/VkDescriptorSet;", "outputDescriptorSet", "getOutputDescriptorSet", "setOutputDescriptorSet-DEHYf1M$scenery", "Lvkk/entities/VkRenderPass;", "renderPass", "getRenderPass", "setRenderPass-bZlUdX0", "getSRGB", "getShouldClear", "setShouldClear", "vkDev", "Lorg/lwjgl/vulkan/VkDevice;", "getVkDev", "()Lorg/lwjgl/vulkan/VkDevice;", "getWidth", "setWidth", "addDepthBuffer", "name", "depth", "attachmentWidth", "attachmentHeight", "addFloatBuffer", "channelDepth", "addFloatRGBABuffer", "addFloatRGBBuffer", "addFloatRGBuffer", "addSwapchainAttachment", "swapchain", "Lgraphics/scenery/backends/vulkan/Swapchain;", "index", "addUnsignedByteRBuffer", "addUnsignedByteRGBABuffer", "close", "", "colorAttachmentCount", "createAndAddColorAttachmentInternal", "format", "Lvkk/VkFormat;", "createAndAddDepthStencilAttachmentInternal", "createAttachment", "usage", "Lvkk/VkImageUsage;", "createRenderpassAndFramebuffer", "depthAttachmentCount", "getAttachmentDescBuffer", "Lorg/lwjgl/vulkan/VkAttachmentDescription$Buffer;", "getAttachmentImageViews", "Lvkk/entities/VkImageViewBuffer;", "()Ljava/nio/LongBuffer;", "getBestDepthFormat", "", "preferredFormat", "toString", "VulkanFramebufferAttachment", "VulkanFramebufferType", "scenery"})
public class VulkanFramebuffer implements java.lang.AutoCloseable {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkCommandBuffer commandBuffer = null;
    private final boolean sRGB = false;
    /**
     * Raw Vulkan framebuffer reference.
     */
    private long framebuffer;
    /**
     * Raw Vulkan renderpass reference.
     */
    private long renderPass;
    private long framebufferSampler;
    /**
     * Descriptor set for this framebuffer's output.
     */
    private long outputDescriptorSet;
    /**
     * Flag to indicate whether this framebuffer has been initialiased or not.
     */
    private boolean initialized;
    /**
     * Linked hash map of this framebuffer's [VulkanFramebufferAttachment]s.
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanFramebuffer.VulkanFramebufferAttachment> attachments;
    private long commandPool;
    private int width;
    private int height;
    private boolean shouldClear;

    private VulkanFramebuffer(graphics.scenery.backends.vulkan.VulkanDevice device, long commandPool, int width, int height, org.lwjgl.vulkan.VkCommandBuffer commandBuffer, boolean shouldClear, boolean sRGB) {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }

    public final long getFramebuffer() {
        return 0L;
    }

    public final long getRenderPass() {
        return 0L;
    }

    public final long getFramebufferSampler() {
        return 0L;
    }

    public final long getOutputDescriptorSet() {
        return 0L;
    }

    protected final boolean getInitialized() {
        return false;
    }

    protected final void setInitialized(boolean p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanFramebuffer.VulkanFramebufferAttachment> getAttachments() {
        return null;
    }

    public final void setAttachments(@org.jetbrains.annotations.NotNull()
                                         java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanFramebuffer.VulkanFramebufferAttachment> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkDevice getVkDev() {
        return null;
    }

    /**
     * * Internal function to create attachments of [format], with image usage flags given in [usage].
     * * The attachment will have dimensions [attachmentWidth] x [attachmentHeight].
     * *
     * * This function also creates the necessary images, memory allocs, and image views.
     */
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanFramebuffer.VulkanFramebufferAttachment createAttachment(@org.jetbrains.annotations.NotNull()
                                                                                                                        vkk.VkFormat format, @org.jetbrains.annotations.NotNull()
                                                                                                                        vkk.VkImageUsage usage, int attachmentWidth, int attachmentHeight) {
        return null;
    }

    /**
     * * Internal function to create a depth/stencil attachment of [format], with
     * * dimensions [attachmentWidth] x [attachmentHeight].
     */
    private final void createAndAddDepthStencilAttachmentInternal(java.lang.String name, vkk.VkFormat format, int attachmentWidth, int attachmentHeight) {
    }

    /**
     * * Internal function to create a new color attachment of format [fornat], with
     * * dimensions [attachmentWidth] x [attachmentHeight].
     */
    private final void createAndAddColorAttachmentInternal(java.lang.String name, vkk.VkFormat format, int attachmentWidth, int attachmentHeight) {
    }

    /**
     * * Adds a float attachment with a bit depth of [channelDepth], and a size of [attachmentWidth] x [attachmentHeight].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanFramebuffer addFloatBuffer(@org.jetbrains.annotations.NotNull()
                                                                                       java.lang.String name, int channelDepth, int attachmentWidth, int attachmentHeight) {
        return null;
    }

    /**
     * * Adds a float RG attachment with a bit depth of [channelDepth], and a size of [attachmentWidth] x [attachmentHeight].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanFramebuffer addFloatRGBuffer(@org.jetbrains.annotations.NotNull()
                                                                                         java.lang.String name, int channelDepth, int attachmentWidth, int attachmentHeight) {
        return null;
    }

    /**
     * * Adds a float RGB attachment with a bit depth of [channelDepth], and a size of [attachmentWidth] x [attachmentHeight].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanFramebuffer addFloatRGBBuffer(@org.jetbrains.annotations.NotNull()
                                                                                          java.lang.String name, int channelDepth, int attachmentWidth, int attachmentHeight) {
        return null;
    }

    /**
     * * Adds a float RGBA attachment with a bit depth of [channelDepth], and a size of [attachmentWidth] x [attachmentHeight].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanFramebuffer addFloatRGBABuffer(@org.jetbrains.annotations.NotNull()
                                                                                           java.lang.String name, int channelDepth, int attachmentWidth, int attachmentHeight) {
        return null;
    }

    /**
     * * Adds an unsigned byte RGBA attachment with a bit depth of [channelDepth], and a size of [attachmentWidth] x [attachmentHeight].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanFramebuffer addUnsignedByteRGBABuffer(@org.jetbrains.annotations.NotNull()
                                                                                                  java.lang.String name, int channelDepth, int attachmentWidth, int attachmentHeight) {
        return null;
    }

    /**
     * * Adds an unsigned byte R attachment with a bit depth of [channelDepth], and a size of [attachmentWidth] x [attachmentHeight].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanFramebuffer addUnsignedByteRBuffer(@org.jetbrains.annotations.NotNull()
                                                                                               java.lang.String name, int channelDepth, int attachmentWidth, int attachmentHeight) {
        return null;
    }

    /**
     * * Adds a depth buffer attachment with a bit depth of [depth], and a size of [attachmentWidth] x [attachmentHeight].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanFramebuffer addDepthBuffer(@org.jetbrains.annotations.NotNull()
                                                                                       java.lang.String name, int depth, int attachmentWidth, int attachmentHeight) {
        return null;
    }

    /**
     * * Adds a swapchain-based attachment from the given [swapchain]. The image will be derived
     * * from the swapchain's image [index].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanFramebuffer addSwapchainAttachment(@org.jetbrains.annotations.NotNull()
                                                                                               java.lang.String name, @org.jetbrains.annotations.NotNull()
                                                                                               graphics.scenery.backends.vulkan.Swapchain swapchain, int index) {
        return null;
    }

    /**
     * * Gets a Vulkan attachment description from the current framebuffer state.
     */
    @org.jetbrains.annotations.NotNull()
    protected final org.lwjgl.vulkan.VkAttachmentDescription.Buffer getAttachmentDescBuffer() {
        return null;
    }

    /**
     * * Gets all the image views of the current framebuffer.
     */
    @org.jetbrains.annotations.NotNull()
    protected final java.nio.LongBuffer getAttachmentImageViews() {
        return null;
    }

    /**
     * * Creates the Vulkan Renderpass and Framebuffer from the state of the
     * * framebuffer.
     */
    public final void createRenderpassAndFramebuffer() {
    }

    /**
     * Returns a string representation of this framebuffer.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }

    /**
     * * Returns the best available depth format, from a list of [preferredFormat]s.
     */
    private final java.util.List<vkk.VkFormat> getBestDepthFormat(vkk.VkFormat preferredFormat) {
        return null;
    }

    /**
     * Returns the number of current color attachments.
     */
    public final int colorAttachmentCount() {
        return 0;
    }

    /**
     * Returns the number of current depth attachments.
     */
    public final int depthAttachmentCount() {
        return 0;
    }

    /**
     * Closes this framebuffer instance, releasing all of its resources.
     */
    @java.lang.Override()
    public void close() {
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }

    protected final long getCommandPool() {
        return 0L;
    }

    public final int getWidth() {
        return 0;
    }

    public final void setWidth(int p0) {
    }

    public final int getHeight() {
        return 0;
    }

    public final void setHeight(int p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkCommandBuffer getCommandBuffer() {
        return null;
    }

    public final boolean getShouldClear() {
        return false;
    }

    public final void setShouldClear(boolean p0) {
    }

    public final boolean getSRGB() {
        return false;
    }

    /**
     * Enum class for indicating whether a framebuffer containts a color or a depth attachment.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanFramebuffer$VulkanFramebufferType;", "", "(Ljava/lang/String;I)V", "COLOR_ATTACHMENT", "DEPTH_ATTACHMENT", "scenery"})
    public static enum VulkanFramebufferType {
        /*public static final*/ COLOR_ATTACHMENT /* = new COLOR_ATTACHMENT() */,
        /*public static final*/ DEPTH_ATTACHMENT /* = new DEPTH_ATTACHMENT() */;

        VulkanFramebufferType() {
        }
    }

    /**
     * Class to describe framebuffer attachments
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u001f\u0010 \u001a\u00020!X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanFramebuffer$VulkanFramebufferAttachment;", "Ljava/lang/AutoCloseable;", "(Lgraphics/scenery/backends/vulkan/VulkanFramebuffer;)V", "desc", "Lorg/lwjgl/vulkan/VkAttachmentDescription;", "getDesc", "()Lorg/lwjgl/vulkan/VkAttachmentDescription;", "setDesc", "(Lorg/lwjgl/vulkan/VkAttachmentDescription;)V", "format", "Lvkk/VkFormat;", "getFormat", "()Lvkk/VkFormat;", "setFormat", "(Lvkk/VkFormat;)V", "fromSwapchain", "", "getFromSwapchain", "()Z", "setFromSwapchain", "(Z)V", "image", "Lvkk/entities/VkImage;", "getImage", "()J", "setImage-AGuVLy0", "(J)V", "J", "imageView", "Lvkk/entities/VkImageView;", "getImageView", "setImageView-5bUGt5Q", "memory", "Lvkk/entities/VkDeviceMemory;", "getMemory", "setMemory-H4ZSszY", "type", "Lgraphics/scenery/backends/vulkan/VulkanFramebuffer$VulkanFramebufferType;", "getType", "()Lgraphics/scenery/backends/vulkan/VulkanFramebuffer$VulkanFramebufferType;", "setType", "(Lgraphics/scenery/backends/vulkan/VulkanFramebuffer$VulkanFramebufferType;)V", "close", "", "scenery"})
    public final class VulkanFramebufferAttachment implements java.lang.AutoCloseable {

        /**
         * Image reference for the attachment
         */
        private long image;

        /**
         * Memory reference for the attachment
         */
        private long memory;

        /**
         * Image view for the attachment
         */
        private long imageView;

        /**
         * Vulkan format of this attachment
         */
        @org.jetbrains.annotations.NotNull()
        private vkk.VkFormat format;

        /**
         * Attachment type
         */
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.backends.vulkan.VulkanFramebuffer.VulkanFramebufferType type;

        /**
         * Vulkan attachment description
         */
        @org.jetbrains.annotations.NotNull()
        private org.lwjgl.vulkan.VkAttachmentDescription desc;

        /**
         * * Indicates whether the image for this attachment comes from a swapchain image,
         * * in which case a dedicated allocation is not necessary.
         */
        private boolean fromSwapchain;

        public VulkanFramebufferAttachment() {
            super();
        }

        public final long getImage() {
            return 0L;
        }

        public final long getMemory() {
            return 0L;
        }

        public final long getImageView() {
            return 0L;
        }

        @org.jetbrains.annotations.NotNull()
        public final vkk.VkFormat getFormat() {
            return null;
        }

        public final void setFormat(@org.jetbrains.annotations.NotNull()
                                        vkk.VkFormat p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanFramebuffer.VulkanFramebufferType getType() {
            return null;
        }

        public final void setType(@org.jetbrains.annotations.NotNull()
                                      graphics.scenery.backends.vulkan.VulkanFramebuffer.VulkanFramebufferType p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkAttachmentDescription getDesc() {
            return null;
        }

        public final void setDesc(@org.jetbrains.annotations.NotNull()
                                      org.lwjgl.vulkan.VkAttachmentDescription p0) {
        }

        public final boolean getFromSwapchain() {
            return false;
        }

        public final void setFromSwapchain(boolean p0) {
        }

        /**
         * * Closes the attachment, freeing its resources.
         */
        @java.lang.Override()
        public void close() {
        }
    }
}
