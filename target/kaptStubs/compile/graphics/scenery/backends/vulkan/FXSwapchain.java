package graphics.scenery.backends.vulkan;

/**
 * * Extended Vulkan swapchain compatible with JavaFX, inherits from [HeadlessSwapchain], and
 * * adds JavaFX-specific functionality.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u001c\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\n\u0010$\u001a\u00060%R\u00020&H\u0016J\u0012\u0010\'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000eH\u0016J\b\u0010,\u001a\u00020-H\u0016J\u001c\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u0002002\n\u0010$\u001a\u00060%R\u00020&H\u0016R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u00061"}, d2 = {"Lgraphics/scenery/backends/vulkan/FXSwapchain;", "Lgraphics/scenery/backends/vulkan/HeadlessSwapchain;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "commandPools", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "renderConfig", "Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "useSRGB", "", "useFramelock", "bufferCount", "", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lorg/lwjgl/vulkan/VkQueue;Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;ZZI)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "setLock", "(Ljava/util/concurrent/locks/ReentrantLock;)V", "stage", "Ljavafx/stage/Window;", "getStage", "()Ljavafx/stage/Window;", "setStage", "(Ljavafx/stage/Window;)V", "close", "", "create", "Lgraphics/scenery/backends/vulkan/Swapchain;", "oldSwapchain", "createWindow", "Lgraphics/scenery/backends/SceneryWindow;", "win", "swapchainRecreator", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer;", "embedIn", "panel", "Lgraphics/scenery/utils/SceneryPanel;", "postPresent", "image", "presentedFrames", "", "toggleFullscreen", "hub", "Lgraphics/scenery/Hub;", "scenery"})
public final class FXSwapchain extends graphics.scenery.backends.vulkan.HeadlessSwapchain {
    @org.jetbrains.annotations.NotNull()
    protected javafx.stage.Window stage;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.locks.ReentrantLock lock;

    public FXSwapchain(@org.jetbrains.annotations.NotNull()
                           graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
                           org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.NotNull()
                           graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools, @org.jetbrains.annotations.NotNull()
                           graphics.scenery.backends.RenderConfigReader.RenderConfig renderConfig, boolean useSRGB, boolean useFramelock, int bufferCount) {
        super(null, null, null, null, false, false, 0);
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.locks.ReentrantLock getLock() {
        return null;
    }

    public final void setLock(@org.jetbrains.annotations.NotNull()
                                  java.util.concurrent.locks.ReentrantLock p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final javafx.stage.Window getStage() {
        return null;
    }

    protected final void setStage(@org.jetbrains.annotations.NotNull()
                                      javafx.stage.Window p0) {
    }

    /**
     * * Creates a window for this swapchain, and initialiases [win] as [SceneryWindow.JavaFXStage].
     * * In this case, only a proxy window is used, without any actual window creation.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.backends.SceneryWindow createWindow(@org.jetbrains.annotations.NotNull()
                                                                    graphics.scenery.backends.SceneryWindow win, @org.jetbrains.annotations.NotNull()
                                                                    graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator swapchainRecreator) {
        return null;
    }

    /**
     * * Creates a new swapchain, potentially recycling or deallocating [oldSwapchain].
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.backends.vulkan.Swapchain create(@org.jetbrains.annotations.Nullable()
                                                                 graphics.scenery.backends.vulkan.Swapchain oldSwapchain) {
        return null;
    }

    /**
     * * Post-present routine, copies the rendered image into the imageView of the [SceneryPanel].
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
     * * Embeds the swapchain into a [SceneryPanel].
     */
    @java.lang.Override()
    public void embedIn(@org.jetbrains.annotations.Nullable()
                            graphics.scenery.utils.SceneryPanel panel) {
    }

    /**
     * * Returns the number of frames presented with the current swapchain.
     */
    @java.lang.Override()
    public long presentedFrames() {
        return 0L;
    }

    /**
     * * Closes the swapchain, deallocating all resources.
     */
    @java.lang.Override()
    public void close() {
    }
}
