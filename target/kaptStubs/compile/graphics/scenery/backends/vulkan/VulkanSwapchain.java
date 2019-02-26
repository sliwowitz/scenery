package graphics.scenery.backends.vulkan;

/**
 * * GLFW-based default Vulkan Swapchain and window, residing on [device], associated with [queue].
 * * Needs to be given [commandPools] to allocate command buffers from. [useSRGB] determines whether
 * * the sRGB colorspace will be used, [vsync] determines whether vertical sync will be forced (swapping
 * * rendered images in sync with the screen's frequency). [undecorated] determines whether the created
 * * window will have the window system's default chrome or not.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00f4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0095\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000eJ\b\u0010s\u001a\u00020tH\u0016J\u0012\u0010u\u001a\u00020\u00012\b\u0010v\u001a\u0004\u0018\u00010\u0001H\u0016J\u001c\u0010w\u001a\u00020h2\u0006\u0010x\u001a\u00020h2\n\u0010y\u001a\u00060zR\u00020{H\u0016J\u0012\u0010|\u001a\u00020t2\b\u0010}\u001a\u0004\u0018\u00010~H\u0016J$\u0010\u007f\u001a\u00030\u0080\u00012\u000f\u0010\u0081\u0001\u001a\n\u0012\u0005\u0012\u00030\u0080\u00010\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0080\u0001H\u0002J\n\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0004J(\u0010\u0086\u0001\u001a\u00020\u000b2\u0007\u0010\u0087\u0001\u001a\u00020.2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0012\u0010\u008c\u0001\u001a\u00020t2\u0007\u0010\u008d\u0001\u001a\u00020TH\u0016J \u0010\u008e\u0001\u001a\u00020t2\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u0091\u0001\u0010^J\b\u0010F\u001a\u00020.H\u0016J\u001f\u0010\u0092\u0001\u001a\u00020t2\b\u0010\u0093\u0001\u001a\u00030\u0094\u00012\n\u0010y\u001a\u00060zR\u00020{H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001b\u001a\u00020\u001cX\u0096\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001f\u0010\"\u001a\u00020#X\u0096\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001f\u0010)\u001a\u00020*X\u0096\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b+\u0010%\"\u0004\b,\u0010\'R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001b\u00101\u001a\u0002028DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104R\u0011\u00107\u001a\u0002088F\u00a2\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020.X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010CR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR#\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0N0MX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u001f\u0010O\u001a\u00020PX\u0096\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\bQ\u0010\u001e\"\u0004\bR\u0010 R\u001a\u0010S\u001a\u00020TX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020ZX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010\r\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010`R\u0011\u0010b\u001a\u00020c8F\u00a2\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010`R\u001a\u0010g\u001a\u00020hX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0096\u0001"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanSwapchain;", "Lgraphics/scenery/backends/vulkan/Swapchain;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "commandPools", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "renderConfig", "Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "useSRGB", "", "vsync", "undecorated", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lorg/lwjgl/vulkan/VkQueue;Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;ZZZ)V", "WINDOW_RESIZE_TIMEOUT", "", "getCommandPools", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "format", "Lvkk/VkFormat;", "getFormat", "()Lvkk/VkFormat;", "setFormat", "(Lvkk/VkFormat;)V", "handle", "Lvkk/entities/VkSwapchainKHR;", "getHandle", "()J", "setHandle-gV5nejE", "(J)V", "J", "imageViews", "Lvkk/entities/VkImageViewArray;", "getImageViews", "()[J", "setImageViews-iuesPy4", "([J)V", "[J", "images", "Lvkk/entities/VkImageArray;", "getImages", "setImages-LKiHwnM", "lastResize", "", "getLastResize", "setLastResize", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "phDev", "Lorg/lwjgl/vulkan/VkPhysicalDevice;", "getPhDev", "()Lorg/lwjgl/vulkan/VkPhysicalDevice;", "presentInfo", "Lorg/lwjgl/vulkan/VkPresentInfoKHR;", "getPresentInfo", "()Lorg/lwjgl/vulkan/VkPresentInfoKHR;", "setPresentInfo", "(Lorg/lwjgl/vulkan/VkPresentInfoKHR;)V", "presentQueue", "getPresentQueue", "()Lorg/lwjgl/vulkan/VkQueue;", "setPresentQueue", "(Lorg/lwjgl/vulkan/VkQueue;)V", "presentedFrames", "getPresentedFrames", "setPresentedFrames", "getQueue", "getRenderConfig", "()Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "retiredSwapchains", "Ljava/util/Queue;", "Lkotlin/Pair;", "surface", "Lvkk/entities/VkSurface;", "getSurface", "setSurface-e1L2ixc", "swapchainImage", "", "getSwapchainImage", "()I", "setSwapchainImage", "(I)V", "swapchainPointer", "Ljava/nio/LongBuffer;", "getSwapchainPointer", "()Ljava/nio/LongBuffer;", "setSwapchainPointer", "(Ljava/nio/LongBuffer;)V", "getUndecorated", "()Z", "getUseSRGB", "vkDev", "Lorg/lwjgl/vulkan/VkDevice;", "getVkDev", "()Lorg/lwjgl/vulkan/VkDevice;", "getVsync", "window", "Lgraphics/scenery/backends/SceneryWindow;", "getWindow", "()Lgraphics/scenery/backends/SceneryWindow;", "setWindow", "(Lgraphics/scenery/backends/SceneryWindow;)V", "windowSizeCallback", "Lorg/lwjgl/glfw/GLFWWindowSizeCallback;", "getWindowSizeCallback", "()Lorg/lwjgl/glfw/GLFWWindowSizeCallback;", "setWindowSizeCallback", "(Lorg/lwjgl/glfw/GLFWWindowSizeCallback;)V", "close", "", "create", "oldSwapchain", "createWindow", "win", "swapchainRecreator", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer;", "embedIn", "panel", "Lgraphics/scenery/utils/SceneryPanel;", "findBestPresentMode", "Lvkk/VkPresentMode;", "presentModes", "Ljava/util/ArrayList;", "preferredMode", "getColorFormatAndSpace", "Lgraphics/scenery/backends/vulkan/VulkanSwapchain$ColorFormatAndSpace;", "next", "timeout", "signalSemaphore", "Lvkk/entities/VkSemaphore;", "next-jwsxT6c", "(JJ)Z", "postPresent", "image", "present", "waitForSemaphores", "Lvkk/entities/VkSemaphoreBuffer;", "present-JI_atPI", "toggleFullscreen", "hub", "Lgraphics/scenery/Hub;", "ColorFormatAndSpace", "scenery"})
public class VulkanSwapchain implements graphics.scenery.backends.vulkan.Swapchain {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    private final double WINDOW_RESIZE_TIMEOUT = 2.0E9;
    private final java.util.Queue<kotlin.Pair<graphics.scenery.backends.vulkan.VulkanDevice, vkk.entities.VkSwapchainKHR>> retiredSwapchains = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkQueue queue = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.RenderConfigReader.RenderConfig renderConfig = null;
    private final boolean useSRGB = false;
    private final boolean vsync = false;
    private final boolean undecorated = false;
    /**
     * Vulkan queue used exclusively for presentation.
     */
    @org.jetbrains.annotations.NotNull()
    public org.lwjgl.vulkan.VkQueue presentQueue;
    /**
     * [SceneryWindow] instance we are using.
     */
    @org.jetbrains.annotations.NotNull()
    public graphics.scenery.backends.SceneryWindow window;

    /**
     * Callback to use upon window resizing.
     */
    @org.jetbrains.annotations.NotNull()
    public org.lwjgl.glfw.GLFWWindowSizeCallback windowSizeCallback;
    /**
     * Swapchain handle.
     */
    private long handle;
    /**
     * Array for rendered images.
     */
    @org.jetbrains.annotations.NotNull()
    private long[] images;
    /**
     * Array for image views.
     */
    @org.jetbrains.annotations.NotNull()
    private long[] imageViews;
    /**
     * Number of frames presented with this swapchain.
     */
    private long presentedFrames;
    /**
     * Color format for the swapchain images.
     */
    @org.jetbrains.annotations.NotNull()
    private vkk.VkFormat format;
    /**
     * Swapchain image.
     */
    private int swapchainImage;
    /**
     * Pointer to the current swapchain.
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.LongBuffer swapchainPointer;
    /**
     * Present info, allocated only once and reused.
     */
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.vulkan.VkPresentInfoKHR presentInfo;
    /**
     * Surface of the window to render into.
     */
    private long surface;
    /**
     * Time in ns of the last resize event.
     */
    private long lastResize;

    public VulkanSwapchain(@org.jetbrains.annotations.NotNull()
                               graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
                               org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
                               graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
                           @kotlin.Suppress(names = {"unused"})
                               graphics.scenery.backends.RenderConfigReader.RenderConfig renderConfig, boolean useSRGB, boolean vsync, boolean undecorated) {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }

    @java.lang.Override()
    public long getHandle() {
        return 0L;
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public long[] getImages() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public long[] getImageViews() {
        return null;
    }

    protected final long getPresentedFrames() {
        return 0L;
    }

    protected final void setPresentedFrames(long p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public vkk.VkFormat getFormat() {
        return null;
    }

    @java.lang.Override()
    public void setFormat(@org.jetbrains.annotations.NotNull()
                              vkk.VkFormat p0) {
    }

    public final int getSwapchainImage() {
        return 0;
    }

    public final void setSwapchainImage(int p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.nio.LongBuffer getSwapchainPointer() {
        return null;
    }

    public final void setSwapchainPointer(@org.jetbrains.annotations.NotNull()
                                              java.nio.LongBuffer p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPresentInfoKHR getPresentInfo() {
        return null;
    }

    public final void setPresentInfo(@org.jetbrains.annotations.NotNull()
                                         org.lwjgl.vulkan.VkPresentInfoKHR p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkQueue getPresentQueue() {
        return null;
    }

    public final void setPresentQueue(@org.jetbrains.annotations.NotNull()
                                          org.lwjgl.vulkan.VkQueue p0) {
    }

    public long getSurface() {
        return 0L;
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.SceneryWindow getWindow() {
        return null;
    }

    public final void setWindow(@org.jetbrains.annotations.NotNull()
                                    graphics.scenery.backends.SceneryWindow p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.glfw.GLFWWindowSizeCallback getWindowSizeCallback() {
        return null;
    }

    public final void setWindowSizeCallback(@org.jetbrains.annotations.NotNull()
                                                org.lwjgl.glfw.GLFWWindowSizeCallback p0) {
    }

    public final long getLastResize() {
        return 0L;
    }

    public final void setLastResize(long p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkDevice getVkDev() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPhysicalDevice getPhDev() {
        return null;
    }

    /**
     * * Creates a window for this swapchain, and initialiases [win] as [SceneryWindow.GLFWWindow].
     * * Needs to be handed a [VulkanRenderer.SwapchainRecreator].
     * * Returns the initialised [SceneryWindow].
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.backends.SceneryWindow createWindow(@org.jetbrains.annotations.NotNull()
                                                                    graphics.scenery.backends.SceneryWindow win, @org.jetbrains.annotations.NotNull()
                                                                    graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator swapchainRecreator) {
        return null;
    }

    /**
     * * Finds the best supported presentation mode, given the supported modes in [presentModes].
     * * The preferred mode can be selected via [preferredMode]. Returns the preferred mode, or
     * * VK_PRESENT_MODE_FIFO, if the preferred one is not supported.
     */
    private final vkk.VkPresentMode findBestPresentMode(java.util.ArrayList<vkk.VkPresentMode> presentModes, vkk.VkPresentMode preferredMode) {
        return null;
    }

    /**
     * * Creates a new swapchain and returns it, potentially recycling or deallocating [oldSwapchain].
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.backends.vulkan.Swapchain create(@org.jetbrains.annotations.Nullable()
                                                                 graphics.scenery.backends.vulkan.Swapchain oldSwapchain) {
        return null;
    }

    /**
     * * Returns the [ColorFormatAndSpace] supported by the [device].
     */
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanSwapchain.ColorFormatAndSpace getColorFormatAndSpace() {
        return null;
    }

    /**
     * * To be called after presenting, will deallocate retired swapchains.
     */
    @java.lang.Override()
    public void postPresent(int image) {
    }

    /**
     * * Changes the current window to fullscreen.
     */
    @java.lang.Override()
    public void toggleFullscreen(@org.jetbrains.annotations.NotNull()
                                     graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                                     graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator swapchainRecreator) {
    }

    /**
     * * Embeds the swapchain into a [SceneryPanel]. Not supported by [VulkanSwapchain],
     * * see [FXSwapchain] instead.
     */
    @java.lang.Override()
    public void embedIn(@org.jetbrains.annotations.Nullable()
                            graphics.scenery.utils.SceneryPanel panel) {
    }

    /**
     * * Returns the number of fully presented frames.
     */
    @java.lang.Override()
    public long presentedFrames() {
        return 0L;
    }

    /**
     * * Closes the swapchain, deallocating all of its resources.
     */
    @java.lang.Override()
    public void close() {
    }

    @org.jetbrains.annotations.NotNull()
    public graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public org.lwjgl.vulkan.VkQueue getQueue() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools getCommandPools() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public graphics.scenery.backends.RenderConfigReader.RenderConfig getRenderConfig() {
        return null;
    }

    public boolean getUseSRGB() {
        return false;
    }

    public boolean getVsync() {
        return false;
    }

    public boolean getUndecorated() {
        return false;
    }

    /**
     * * Data class for summarising [colorFormat] and [colorSpace] information.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanSwapchain$ColorFormatAndSpace;", "", "colorFormat", "Lvkk/VkFormat;", "colorSpace", "Lvkk/VkColorSpace;", "(Lvkk/VkFormat;Lvkk/VkColorSpace;)V", "getColorFormat", "()Lvkk/VkFormat;", "setColorFormat", "(Lvkk/VkFormat;)V", "getColorSpace", "()Lvkk/VkColorSpace;", "setColorSpace", "(Lvkk/VkColorSpace;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class ColorFormatAndSpace {
        @org.jetbrains.annotations.NotNull()
        private vkk.VkFormat colorFormat;
        @org.jetbrains.annotations.NotNull()
        private vkk.VkColorSpace colorSpace;

        public ColorFormatAndSpace(@org.jetbrains.annotations.NotNull()
                                       vkk.VkFormat colorFormat, @org.jetbrains.annotations.NotNull()
                                       vkk.VkColorSpace colorSpace) {
            super();
        }

        public ColorFormatAndSpace() {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final vkk.VkFormat getColorFormat() {
            return null;
        }

        public final void setColorFormat(@org.jetbrains.annotations.NotNull()
                                             vkk.VkFormat p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final vkk.VkColorSpace getColorSpace() {
            return null;
        }

        public final void setColorSpace(@org.jetbrains.annotations.NotNull()
                                            vkk.VkColorSpace p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final vkk.VkFormat component1() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final vkk.VkColorSpace component2() {
            return null;
        }

        /**
         * * Data class for summarising [colorFormat] and [colorSpace] information.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanSwapchain.ColorFormatAndSpace copy(@org.jetbrains.annotations.NotNull()
                                                                                                   vkk.VkFormat colorFormat, @org.jetbrains.annotations.NotNull()
                                                                                                   vkk.VkColorSpace colorSpace) {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }

        @java.lang.Override()
        public int hashCode() {
            return 0;
        }

        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
                                  java.lang.Object p0) {
            return false;
        }
    }
}
