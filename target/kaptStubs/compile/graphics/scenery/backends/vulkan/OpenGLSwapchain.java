package graphics.scenery.backends.vulkan;

/**
 * * GLFW-based OpenGL swapchain and window, using Nvidia's NV_draw_vulkan_image GL extension.
 * * The swapchain will reside on [device] and submit to [queue]. All other parameters are not used.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010X\u001a\u00020YH\u0016J\u0012\u0010Z\u001a\u00020\u00012\b\u0010[\u001a\u0004\u0018\u00010\u0001H\u0016J\u001c\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020]2\n\u0010_\u001a\u00060`R\u00020aH\u0016J\u0006\u0010b\u001a\u00020YJ\u0012\u0010c\u001a\u00020Y2\b\u0010d\u001a\u0004\u0018\u00010eH\u0016J\u0006\u0010f\u001a\u00020\u000bJ\"\u0010g\u001a\u00020\u000b2\u0006\u0010h\u001a\u0002012\u0006\u0010i\u001a\u00020jH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\bk\u0010lJ\u0010\u0010m\u001a\u00020Y2\u0006\u0010n\u001a\u00020\u000eH\u0016J\u001c\u0010o\u001a\u00020Y2\b\u0010p\u001a\u0004\u0018\u00010qH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\br\u0010sJ\b\u0010:\u001a\u000201H\u0016J\u001c\u0010t\u001a\u00020Y2\u0006\u0010u\u001a\u00020v2\n\u0010_\u001a\u00060`R\u00020aH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u001fX\u0096\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001f\u0010%\u001a\u00020&X\u0096\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001f\u0010,\u001a\u00020-X\u0096\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R\u001a\u00100\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u00109\u001a\u0004\b6\u00107R\u001a\u0010:\u001a\u000201X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001a\u0010F\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010!\"\u0004\bH\u0010#R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010JR\u001a\u0010L\u001a\u00020MX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020SX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006w"}, d2 = {"Lgraphics/scenery/backends/vulkan/OpenGLSwapchain;", "Lgraphics/scenery/backends/vulkan/Swapchain;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "commandPools", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "renderConfig", "Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "useSRGB", "", "useFramelock", "bufferCount", "", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lorg/lwjgl/vulkan/VkQueue;Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;ZZI)V", "WINDOW_RESIZE_TIMEOUT", "", "getBufferCount", "()I", "getCommandPools", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "format", "Lvkk/VkFormat;", "getFormat", "()Lvkk/VkFormat;", "setFormat", "(Lvkk/VkFormat;)V", "handle", "Lvkk/entities/VkSwapchainKHR;", "getHandle", "()J", "setHandle-gV5nejE", "(J)V", "J", "imageViews", "Lvkk/entities/VkImageViewArray;", "getImageViews", "()[J", "setImageViews-iuesPy4", "([J)V", "[J", "images", "Lvkk/entities/VkImageArray;", "getImages", "setImages-LKiHwnM", "lastResize", "", "getLastResize", "setLastResize", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "presentedFrames", "getPresentedFrames", "setPresentedFrames", "getQueue", "()Lorg/lwjgl/vulkan/VkQueue;", "getRenderConfig", "()Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "supportedExtensions", "Ljava/util/ArrayList;", "", "getSupportedExtensions", "()Ljava/util/ArrayList;", "surface", "getSurface", "setSurface", "getUseFramelock", "()Z", "getUseSRGB", "window", "Lgraphics/scenery/backends/SceneryWindow$GLFWWindow;", "getWindow", "()Lgraphics/scenery/backends/SceneryWindow$GLFWWindow;", "setWindow", "(Lgraphics/scenery/backends/SceneryWindow$GLFWWindow;)V", "windowSizeCallback", "Lorg/lwjgl/glfw/GLFWWindowSizeCallback;", "getWindowSizeCallback", "()Lorg/lwjgl/glfw/GLFWWindowSizeCallback;", "setWindowSizeCallback", "(Lorg/lwjgl/glfw/GLFWWindowSizeCallback;)V", "close", "", "create", "oldSwapchain", "createWindow", "Lgraphics/scenery/backends/SceneryWindow;", "win", "swapchainRecreator", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer;", "disableFramelock", "embedIn", "panel", "Lgraphics/scenery/utils/SceneryPanel;", "enableFramelock", "next", "timeout", "signalSemaphore", "Lvkk/entities/VkSemaphore;", "next-jwsxT6c", "(JJ)Z", "postPresent", "image", "present", "waitForSemaphores", "Lvkk/entities/VkSemaphoreBuffer;", "present-JI_atPI", "(Ljava/nio/LongBuffer;)V", "toggleFullscreen", "hub", "Lgraphics/scenery/Hub;", "scenery"})
public final class OpenGLSwapchain implements graphics.scenery.backends.vulkan.Swapchain {
    private final kotlin.Lazy logger$delegate = null;
    /**
     * List of supported OpenGL extensions.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> supportedExtensions = null;
    private final double WINDOW_RESIZE_TIMEOUT = 2.0E9;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkQueue queue = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.RenderConfigReader.RenderConfig renderConfig = null;
    private final boolean useSRGB = false;
    private final boolean useFramelock = false;
    private final int bufferCount = 0;
    /**
     * Window instance to use.
     */
    @org.jetbrains.annotations.NotNull()
    public graphics.scenery.backends.SceneryWindow.GLFWWindow window;
    /**
     * Window size callback to use.
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
     * Color format of the images.
     */
    @org.jetbrains.annotations.NotNull()
    private vkk.VkFormat format;
    /**
     * Window surface to use.
     */
    private long surface;
    /**
     * Time of the last resize event in ns.
     */
    private long lastResize;

    public OpenGLSwapchain(@org.jetbrains.annotations.NotNull()
                               graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
                               org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
                               graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
                               graphics.scenery.backends.RenderConfigReader.RenderConfig renderConfig, boolean useSRGB, boolean useFramelock, int bufferCount) {
        super();
    }

    private final org.slf4j.Logger getLogger() {
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

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.SceneryWindow.GLFWWindow getWindow() {
        return null;
    }

    public final void setWindow(@org.jetbrains.annotations.NotNull()
                                    graphics.scenery.backends.SceneryWindow.GLFWWindow p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getSupportedExtensions() {
        return null;
    }

    public final long getSurface() {
        return 0L;
    }

    public final void setSurface(long p0) {
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
     * * Creates a new swapchain and returns it, potentially recycling or deallocating [oldSwapchain].
     * * In the special case of the [OpenGLSwapchain], an OpenGL context is created and checked for the
     * * GL_NV_draw_vulkan_image extension, which it requires.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.backends.vulkan.Swapchain create(@org.jetbrains.annotations.Nullable()
                                                                 graphics.scenery.backends.vulkan.Swapchain oldSwapchain) {
        return null;
    }

    /**
     * * Enables frame-locking for this swapchain, locking buffer swap events to other screens/machines.
     * * Works only if the WGL_NV_swap_group (Windows) or GLX_NV_swap_group extension is supported.
     */
    public final boolean enableFramelock() {
        return false;
    }

    /**
     * * Disables frame-lock for this swapchain.
     */
    @kotlin.Suppress(names = {"unused"})
    public final void disableFramelock() {
    }

    /**
     * * Post-present routine, does nothing in this case.
     */
    @java.lang.Override()
    public void postPresent(int image) {
    }

    /**
     * * Toggles fullscreen.
     */
    @java.lang.Override()
    public void toggleFullscreen(@org.jetbrains.annotations.NotNull()
                                     graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                                     graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator swapchainRecreator) {
    }

    /**
     * * Embeds the swapchain into a [SceneryPanel]. Not supported by [OpenGLSwapchain], see [FXSwapchain] instead.
     */
    @java.lang.Override()
    public void embedIn(@org.jetbrains.annotations.Nullable()
                            graphics.scenery.utils.SceneryPanel panel) {
    }

    /**
     * * Returns the number of presented frames.
     */
    @java.lang.Override()
    public long presentedFrames() {
        return 0L;
    }

    /**
     * * Closes the swapchain, freeing all of its resources.
     */
    @java.lang.Override()
    public void close() {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkQueue getQueue() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools getCommandPools() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.RenderConfigReader.RenderConfig getRenderConfig() {
        return null;
    }

    public final boolean getUseSRGB() {
        return false;
    }

    public final boolean getUseFramelock() {
        return false;
    }

    public final int getBufferCount() {
        return 0;
    }
}
