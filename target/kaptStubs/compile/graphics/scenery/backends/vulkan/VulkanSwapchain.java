package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * GLFW-based default Vulkan Swapchain and window, residing on [device], associated with [queue].
 * * Needs to be given [commandPools] to allocate command buffers from. [useSRGB] determines whether
 * * the sRGB colorspace will be used, [vsync] determines whether vertical sync will be forced (swapping
 * * rendered images in sync with the screen's frequency). [undecorated] determines whether the created
 * * window will have the window system's default chrome or not.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0082\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000eJ\b\u0010f\u001a\u00020gH\u0016J\u0012\u0010h\u001a\u00020\u00012\b\u0010i\u001a\u0004\u0018\u00010\u0001H\u0016J\u001c\u0010j\u001a\u00020[2\u0006\u0010k\u001a\u00020[2\n\u0010l\u001a\u00060mR\u00020nH\u0016J\u0012\u0010o\u001a\u00020g2\b\u0010p\u001a\u0004\u0018\u00010qH\u0016J \u0010r\u001a\u00020\u00162\u0006\u0010s\u001a\u00020K2\u0006\u0010t\u001a\u00020\u00162\u0006\u0010u\u001a\u00020\u0016H\u0002J\b\u0010v\u001a\u00020wH\u0004J\u0018\u0010x\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u001c2\u0006\u0010z\u001a\u00020\u001cH\u0016J\u0010\u0010{\u001a\u00020g2\u0006\u0010|\u001a\u00020\u0016H\u0016J\u0012\u0010}\u001a\u00020g2\b\u0010~\u001a\u0004\u0018\u00010QH\u0016J\b\u0010>\u001a\u00020\u001cH\u0016J\u001e\u0010\u007f\u001a\u00020g2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\n\u0010l\u001a\u00060mR\u00020nH\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020\"X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001a\u0010*\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001b\u0010-\u001a\u00020.8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u00102\u001a\u0004\b/\u00100R\u001a\u00103\u001a\u000204X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u001cX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010;R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR \u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0F0EX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R\u001a\u0010J\u001a\u00020KX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020QX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010\r\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010WR\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010WR\u001a\u0010Z\u001a\u00020[X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e\u00a8\u0006\u0083\u0001"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanSwapchain;", "Lgraphics/scenery/backends/vulkan/Swapchain;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "commandPools", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "renderConfig", "Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "useSRGB", "", "vsync", "undecorated", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lorg/lwjgl/vulkan/VkQueue;Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;ZZZ)V", "WINDOW_RESIZE_TIMEOUT", "", "getCommandPools", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "format", "", "getFormat", "()I", "setFormat", "(I)V", "handle", "", "getHandle", "()J", "setHandle", "(J)V", "imageViews", "", "getImageViews", "()[J", "setImageViews", "([J)V", "images", "getImages", "setImages", "lastResize", "getLastResize", "setLastResize", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "presentInfo", "Lorg/lwjgl/vulkan/VkPresentInfoKHR;", "getPresentInfo", "()Lorg/lwjgl/vulkan/VkPresentInfoKHR;", "setPresentInfo", "(Lorg/lwjgl/vulkan/VkPresentInfoKHR;)V", "presentQueue", "getPresentQueue", "()Lorg/lwjgl/vulkan/VkQueue;", "setPresentQueue", "(Lorg/lwjgl/vulkan/VkQueue;)V", "presentedFrames", "getPresentedFrames", "setPresentedFrames", "getQueue", "getRenderConfig", "()Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "retiredSwapchains", "Ljava/util/Queue;", "Lkotlin/Pair;", "surface", "getSurface", "setSurface", "swapchainImage", "Ljava/nio/IntBuffer;", "getSwapchainImage", "()Ljava/nio/IntBuffer;", "setSwapchainImage", "(Ljava/nio/IntBuffer;)V", "swapchainPointer", "Ljava/nio/LongBuffer;", "getSwapchainPointer", "()Ljava/nio/LongBuffer;", "setSwapchainPointer", "(Ljava/nio/LongBuffer;)V", "getUndecorated", "()Z", "getUseSRGB", "getVsync", "window", "Lgraphics/scenery/backends/SceneryWindow;", "getWindow", "()Lgraphics/scenery/backends/SceneryWindow;", "setWindow", "(Lgraphics/scenery/backends/SceneryWindow;)V", "windowSizeCallback", "Lorg/lwjgl/glfw/GLFWWindowSizeCallback;", "getWindowSizeCallback", "()Lorg/lwjgl/glfw/GLFWWindowSizeCallback;", "setWindowSizeCallback", "(Lorg/lwjgl/glfw/GLFWWindowSizeCallback;)V", "close", "", "create", "oldSwapchain", "createWindow", "win", "swapchainRecreator", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer;", "embedIn", "panel", "Lgraphics/scenery/utils/SceneryPanel;", "findBestPresentMode", "presentModes", "count", "preferredMode", "getColorFormatAndSpace", "Lgraphics/scenery/backends/vulkan/VulkanSwapchain$ColorFormatAndSpace;", "next", "timeout", "signalSemaphore", "postPresent", "image", "present", "waitForSemaphores", "toggleFullscreen", "hub", "Lgraphics/scenery/Hub;", "ColorFormatAndSpace", "scenery"})
public class VulkanSwapchain implements graphics.scenery.backends.vulkan.Swapchain {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    
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
    private int format;
    
    /**
     * Swapchain image. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.IntBuffer swapchainImage;
    
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
     * Vulkan queue used exclusively for presentation. 
     */
    @org.jetbrains.annotations.NotNull()
    public org.lwjgl.vulkan.VkQueue presentQueue;
    
    /**
     * Surface of the window to render into. 
     */
    private long surface;
    
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
     * Time in ns of the last resize event. 
     */
    private long lastResize;
    private final double WINDOW_RESIZE_TIMEOUT = 2.0E9;
    private final java.util.Queue<kotlin.Pair<graphics.scenery.backends.vulkan.VulkanDevice, java.lang.Long>> retiredSwapchains = null;
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
    
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @java.lang.Override()
    public long getHandle() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setHandle(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public long[] getImages() {
        return null;
    }
    
    @java.lang.Override()
    public void setImages(@org.jetbrains.annotations.NotNull()
    long[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public long[] getImageViews() {
        return null;
    }
    
    @java.lang.Override()
    public void setImageViews(@org.jetbrains.annotations.NotNull()
    long[] p0) {
    }
    
    protected final long getPresentedFrames() {
        return 0L;
    }
    
    protected final void setPresentedFrames(long p0) {
    }
    
    @java.lang.Override()
    public int getFormat() {
        return 0;
    }
    
    @java.lang.Override()
    public void setFormat(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.nio.IntBuffer getSwapchainImage() {
        return null;
    }
    
    public final void setSwapchainImage(@org.jetbrains.annotations.NotNull()
    java.nio.IntBuffer p0) {
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
    
    public void setSurface(long p0) {
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
    
    /**
     * * Creates a window for this swapchain, and initialiases [win] as [SceneryWindow.GLFWWindow].
     *     * Needs to be handed a [VulkanRenderer.SwapchainRecreator].
     *     * Returns the initialised [SceneryWindow].
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
     *     * The preferred mode can be selected via [preferredMode]. Returns the preferred mode, or
     *     * VK_PRESENT_MODE_FIFO, if the preferred one is not supported.
     */
    private final int findBestPresentMode(java.nio.IntBuffer presentModes, int count, int preferredMode) {
        return 0;
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
     * * Presents the current swapchain image on screen.
     */
    @java.lang.Override()
    public void present(@org.jetbrains.annotations.Nullable()
    java.nio.LongBuffer waitForSemaphores) {
    }
    
    /**
     * * To be called after presenting, will deallocate retired swapchains.
     */
    @java.lang.Override()
    public void postPresent(int image) {
    }
    
    /**
     * * Acquires the next swapchain image.
     */
    @java.lang.Override()
    public boolean next(long timeout, long signalSemaphore) {
        return false;
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
     *     * see [FXSwapchain] instead.
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
    
    public VulkanSwapchain(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    graphics.scenery.backends.RenderConfigReader.RenderConfig renderConfig, boolean useSRGB, boolean vsync, boolean undecorated) {
        super();
    }
    
    /**
     * * Data class for summarising [colorFormat] and [colorSpace] information.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanSwapchain$ColorFormatAndSpace;", "", "colorFormat", "", "colorSpace", "(II)V", "getColorFormat", "()I", "setColorFormat", "(I)V", "getColorSpace", "setColorSpace", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "scenery"})
    public static final class ColorFormatAndSpace {
        private int colorFormat;
        private int colorSpace;
        
        public final int getColorFormat() {
            return 0;
        }
        
        public final void setColorFormat(int p0) {
        }
        
        public final int getColorSpace() {
            return 0;
        }
        
        public final void setColorSpace(int p0) {
        }
        
        public ColorFormatAndSpace(int colorFormat, int colorSpace) {
            super();
        }
        
        public ColorFormatAndSpace() {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        /**
         * * Data class for summarising [colorFormat] and [colorSpace] information.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanSwapchain.ColorFormatAndSpace copy(int colorFormat, int colorSpace) {
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