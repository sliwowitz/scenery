package graphics.scenery.backends.vulkan;

/**
 * * Swapchain interface for [VulkanRenderer].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0018\u001a\u00020\u0019H&J\u0012\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000H&J\u001c\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\n\u0010\u001f\u001a\u00060 R\u00020!H&J\u0012\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H&J&\u0010%\u001a\u00020&2\b\b\u0002\u0010\'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H&\u00f8\u0001\u0000\u00a2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/H&J\u001e\u00100\u001a\u00020\u00192\n\b\u0002\u00101\u001a\u0004\u0018\u000102H&\u00f8\u0001\u0000\u00a2\u0006\u0004\b3\u00104J\b\u00105\u001a\u00020(H&J\u001c\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u0002082\n\u0010\u001f\u001a\u00060 R\u00020!H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\tX\u00a6\u000e\u00f8\u0001\u0000\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000fX\u00a6\u000e\u00f8\u0001\u0000\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u0015X\u00a6\u000e\u00f8\u0001\u0000\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lgraphics/scenery/backends/vulkan/Swapchain;", "Ljava/lang/AutoCloseable;", "format", "Lvkk/VkFormat;", "getFormat", "()Lvkk/VkFormat;", "setFormat", "(Lvkk/VkFormat;)V", "handle", "Lvkk/entities/VkSwapchainKHR;", "getHandle", "()J", "setHandle-gV5nejE", "(J)V", "imageViews", "Lvkk/entities/VkImageViewArray;", "getImageViews", "()[J", "setImageViews-iuesPy4", "([J)V", "images", "Lvkk/entities/VkImageArray;", "getImages", "setImages-LKiHwnM", "close", "", "create", "oldSwapchain", "createWindow", "Lgraphics/scenery/backends/SceneryWindow;", "win", "swapchainRecreator", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer;", "embedIn", "panel", "Lgraphics/scenery/utils/SceneryPanel;", "next", "", "timeout", "", "signalSemaphore", "Lvkk/entities/VkSemaphore;", "next-jwsxT6c", "(JJ)Z", "postPresent", "image", "", "present", "waitForSemaphores", "Lvkk/entities/VkSemaphoreBuffer;", "present-JI_atPI", "(Ljava/nio/LongBuffer;)V", "presentedFrames", "toggleFullscreen", "hub", "Lgraphics/scenery/Hub;", "scenery"})
public abstract interface Swapchain extends java.lang.AutoCloseable {

    public abstract long getHandle();

    @org.jetbrains.annotations.NotNull()
    public abstract long[] getImages();

    @org.jetbrains.annotations.NotNull()
    public abstract long[] getImageViews();

    @org.jetbrains.annotations.NotNull()
    public abstract vkk.VkFormat getFormat();

    public abstract void setFormat(@org.jetbrains.annotations.NotNull()
                                       vkk.VkFormat p0);

    /**
     * * Creates a window for this swapchain, and initialiases [win] to the appropriate window
     * * kind (@see[SceneryWindow]. Needs to be handed a [VulkanRenderer.SwapchainRecreator].
     * * Returns the initialised [SceneryWindow].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract graphics.scenery.backends.SceneryWindow createWindow(@org.jetbrains.annotations.NotNull()
                                                                             graphics.scenery.backends.SceneryWindow win, @org.jetbrains.annotations.NotNull()
                                                                             graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator swapchainRecreator);

    /**
     * * Creates a new swapchain and returns it, potentially recycling or deallocating [oldSwapchain].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract graphics.scenery.backends.vulkan.Swapchain create(@org.jetbrains.annotations.Nullable()
                                                                          graphics.scenery.backends.vulkan.Swapchain oldSwapchain);

    /**
     * * Post-present routine, e.g. for copying the rendered image or showing it in another window.
     * * [image] represents the current index with respect to [images].
     */
    public abstract void postPresent(int image);

    /**
     * * Closes this swapchain.
     */
    @java.lang.Override()
    public abstract void close();

    /**
     * * Toggles fullscreen mode for this swapchain. Needs to be given a [hub] for potential interactions
     * * with other components of scenery, and a [swapchainRecreator] because it might need to signal
     * * for swapchain recreation.
     */
    public abstract void toggleFullscreen(@org.jetbrains.annotations.NotNull()
                                              graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                                              graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator swapchainRecreator);

    /**
     * * Embeds this swapchain within [panel] (@see[SceneryPanel]).
     */
    public abstract void embedIn(@org.jetbrains.annotations.Nullable()
                                     graphics.scenery.utils.SceneryPanel panel);

    /**
     * * Returns the number of presented frames for this swapchain instance.
     */
    public abstract long presentedFrames();

    /**
     * * Swapchain interface for [VulkanRenderer].
     * *
     * * @author Ulrik Günther <hello@ulrik.is>
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}
