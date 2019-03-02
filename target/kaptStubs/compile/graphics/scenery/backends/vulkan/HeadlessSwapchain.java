package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Extended Vulkan swapchain that runs in headless mode.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001]BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010E\u001a\u00020FH\u0016J\u0012\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016J\u001c\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020K2\n\u0010M\u001a\u00060?R\u00020@H\u0016J\u0012\u0010N\u001a\u00020F2\b\u0010O\u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020RH\u0016J\u0010\u0010T\u001a\u00020F2\u0006\u0010U\u001a\u00020\u000eH\u0016J\u0012\u0010V\u001a\u00020F2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u0006\u0010Y\u001a\u00020FJ\u001c\u0010Z\u001a\u00020F2\u0006\u0010[\u001a\u00020\\2\n\u0010M\u001a\u00060?R\u00020@H\u0016R\u0014\u0010\u0010\u001a\u00020\u0011X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00060,R\u00020\u0000X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u001a\u00108\u001a\u000209X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u00060?R\u00020@X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u00a8\u0006^"}, d2 = {"Lgraphics/scenery/backends/vulkan/HeadlessSwapchain;", "Lgraphics/scenery/backends/vulkan/VulkanSwapchain;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "commandPools", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "renderConfig", "Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "useSRGB", "", "useFramelock", "bufferCount", "", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lorg/lwjgl/vulkan/VkQueue;Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;ZZI)V", "WINDOW_RESIZE_TIMEOUT", "", "getWINDOW_RESIZE_TIMEOUT", "()D", "getBufferCount", "()I", "currentImage", "getCurrentImage", "setCurrentImage", "(I)V", "imageBuffer", "Ljava/nio/ByteBuffer;", "getImageBuffer", "()Ljava/nio/ByteBuffer;", "setImageBuffer", "(Ljava/nio/ByteBuffer;)V", "imagePanel", "Lgraphics/scenery/utils/SceneryPanel;", "getImagePanel", "()Lgraphics/scenery/utils/SceneryPanel;", "setImagePanel", "(Lgraphics/scenery/utils/SceneryPanel;)V", "initialized", "getInitialized", "()Z", "setInitialized", "(Z)V", "resizeHandler", "Lgraphics/scenery/backends/vulkan/HeadlessSwapchain$ResizeHandler;", "getResizeHandler", "()Lgraphics/scenery/backends/vulkan/HeadlessSwapchain$ResizeHandler;", "setResizeHandler", "(Lgraphics/scenery/backends/vulkan/HeadlessSwapchain$ResizeHandler;)V", "sharingBuffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "getSharingBuffer", "()Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "setSharingBuffer", "(Lgraphics/scenery/backends/vulkan/VulkanBuffer;)V", "getUseFramelock", "vulkanInstance", "Lorg/lwjgl/vulkan/VkInstance;", "getVulkanInstance", "()Lorg/lwjgl/vulkan/VkInstance;", "setVulkanInstance", "(Lorg/lwjgl/vulkan/VkInstance;)V", "vulkanSwapchainRecreator", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer;", "getVulkanSwapchainRecreator", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "setVulkanSwapchainRecreator", "(Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;)V", "close", "", "create", "Lgraphics/scenery/backends/vulkan/Swapchain;", "oldSwapchain", "createWindow", "Lgraphics/scenery/backends/SceneryWindow;", "win", "swapchainRecreator", "embedIn", "panel", "next", "timeout", "", "signalSemaphore", "postPresent", "image", "present", "waitForSemaphores", "Ljava/nio/LongBuffer;", "queryResize", "toggleFullscreen", "hub", "Lgraphics/scenery/Hub;", "ResizeHandler", "scenery"})
public class HeadlessSwapchain extends graphics.scenery.backends.vulkan.VulkanSwapchain {
    private boolean initialized;
    @org.jetbrains.annotations.NotNull()
    protected graphics.scenery.backends.vulkan.VulkanBuffer sharingBuffer;
    @org.jetbrains.annotations.NotNull()
    protected java.nio.ByteBuffer imageBuffer;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.utils.SceneryPanel imagePanel;
    @org.jetbrains.annotations.NotNull()
    protected org.lwjgl.vulkan.VkInstance vulkanInstance;
    @org.jetbrains.annotations.NotNull()
    protected graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator vulkanSwapchainRecreator;
    private final double WINDOW_RESIZE_TIMEOUT = 6.0E8;
    
    /**
     * State variable for the current swapchain image. 
     */
    private int currentImage;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.HeadlessSwapchain.ResizeHandler resizeHandler;
    private final boolean useFramelock = false;
    private final int bufferCount = 0;
    
    protected final boolean getInitialized() {
        return false;
    }
    
    protected final void setInitialized(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanBuffer getSharingBuffer() {
        return null;
    }
    
    protected final void setSharingBuffer(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanBuffer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.nio.ByteBuffer getImageBuffer() {
        return null;
    }
    
    protected final void setImageBuffer(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.utils.SceneryPanel getImagePanel() {
        return null;
    }
    
    protected final void setImagePanel(@org.jetbrains.annotations.Nullable()
    graphics.scenery.utils.SceneryPanel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.lwjgl.vulkan.VkInstance getVulkanInstance() {
        return null;
    }
    
    protected final void setVulkanInstance(@org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkInstance p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator getVulkanSwapchainRecreator() {
        return null;
    }
    
    protected final void setVulkanSwapchainRecreator(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator p0) {
    }
    
    protected final double getWINDOW_RESIZE_TIMEOUT() {
        return 0.0;
    }
    
    protected final int getCurrentImage() {
        return 0;
    }
    
    protected final void setCurrentImage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.HeadlessSwapchain.ResizeHandler getResizeHandler() {
        return null;
    }
    
    protected final void setResizeHandler(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.HeadlessSwapchain.ResizeHandler p0) {
    }
    
    /**
     * * Creates a window for this swapchain, and initialiases [win] as [SceneryWindow.HeadlessWindow].
     *     * In this case, only a proxy window is used, without any actual window creation.
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
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.backends.vulkan.Swapchain create(@org.jetbrains.annotations.Nullable()
    graphics.scenery.backends.vulkan.Swapchain oldSwapchain) {
        return null;
    }
    
    /**
     * * Will signal [signalSemaphore] that the next image is ready for being written to for presenting,
     *     * optionally waiting for a [timeout] before failing. Returns true if the swapchain needs to be
     *     * recreated and false if not.
     */
    @java.lang.Override()
    public boolean next(long timeout, long signalSemaphore) {
        return false;
    }
    
    /**
     * * Presents the current image.
     */
    @java.lang.Override()
    public void present(@org.jetbrains.annotations.Nullable()
    java.nio.LongBuffer waitForSemaphores) {
    }
    
    /**
     * * Post-present routine, will copy the rendered image into the [images] array.
     */
    @java.lang.Override()
    public void postPresent(int image) {
    }
    
    /**
     * * Queries the resize handler for changes, setting the
     *     * [VulkanRenderer.SwapchainRecreator.mustRecreate] if necessary.
     */
    public final void queryResize() {
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
     * * Embeds the swapchain into a [SceneryPanel].
     */
    @java.lang.Override()
    public void embedIn(@org.jetbrains.annotations.Nullable()
    graphics.scenery.utils.SceneryPanel panel) {
    }
    
    /**
     * * Closes the swapchain, deallocating all resources.
     */
    @java.lang.Override()
    public void close() {
    }
    
    public final boolean getUseFramelock() {
        return false;
    }
    
    public final int getBufferCount() {
        return 0;
    }
    
    public HeadlessSwapchain(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.RenderConfigReader.RenderConfig renderConfig, boolean useSRGB, @kotlin.Suppress(names = {"unused"})
    boolean useFramelock, @kotlin.Suppress(names = {"unused"})
    int bufferCount) {
        super(null, null, null, null, false, false, false);
    }
    
    /**
     * * Special resize handler for HeadlessSwapchain, as resize events
     *     * here are externally triggered, outside of the regular event loop.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lgraphics/scenery/backends/vulkan/HeadlessSwapchain$ResizeHandler;", "", "(Lgraphics/scenery/backends/vulkan/HeadlessSwapchain;)V", "lastHeight", "", "getLastHeight", "()I", "setLastHeight", "(I)V", "lastResize", "", "getLastResize", "()J", "setLastResize", "(J)V", "lastWidth", "getLastWidth", "setLastWidth", "queryResize", "", "scenery"})
    public final class ResizeHandler {
        
        /**
         * Timestamp of the last resize 
         */
        private volatile long lastResize;
        
        /**
         * Last reported width 
         */
        private int lastWidth;
        
        /**
         * Last reported height 
         */
        private int lastHeight;
        
        public final long getLastResize() {
            return 0L;
        }
        
        public final void setLastResize(long p0) {
        }
        
        public final int getLastWidth() {
            return 0;
        }
        
        public final void setLastWidth(int p0) {
        }
        
        public final int getLastHeight() {
            return 0;
        }
        
        public final void setLastHeight(int p0) {
        }
        
        /**
         * * Checks whether a resize is necessary and sets the [VulkanRenderer.SwapchainRecreator.mustRecreate]
         *         * flag if necessary.
         */
        public final synchronized void queryResize() {
        }
        
        public ResizeHandler() {
            super();
        }
    }
}