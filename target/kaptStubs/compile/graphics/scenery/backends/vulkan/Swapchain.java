package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Swapchain interface for [VulkanRenderer].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H&J\u0012\u0010\u0019\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0000H&J\u001c\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\n\u0010\u001e\u001a\u00060\u001fR\u00020 H&J\u0012\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H&J\u001c\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010\'\u001a\u00020\tH&J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0003H&J\u0014\u0010*\u001a\u00020\u00182\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H&J\b\u0010-\u001a\u00020\tH&J\u001c\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u0002002\n\u0010\u001e\u001a\u00060\u001fR\u00020 H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013\u00a8\u00061"}, d2 = {"Lgraphics/scenery/backends/vulkan/Swapchain;", "Ljava/lang/AutoCloseable;", "format", "", "getFormat", "()I", "setFormat", "(I)V", "handle", "", "getHandle", "()J", "setHandle", "(J)V", "imageViews", "", "getImageViews", "()[J", "setImageViews", "([J)V", "images", "getImages", "setImages", "close", "", "create", "oldSwapchain", "createWindow", "Lgraphics/scenery/backends/SceneryWindow;", "win", "swapchainRecreator", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer;", "embedIn", "panel", "Lgraphics/scenery/utils/SceneryPanel;", "next", "", "timeout", "signalSemaphore", "postPresent", "image", "present", "waitForSemaphores", "Ljava/nio/LongBuffer;", "presentedFrames", "toggleFullscreen", "hub", "Lgraphics/scenery/Hub;", "scenery"})
public abstract interface Swapchain extends java.lang.AutoCloseable {
    
    public abstract long getHandle();
    
    public abstract void setHandle(long p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract long[] getImages();
    
    public abstract void setImages(@org.jetbrains.annotations.NotNull()
    long[] p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract long[] getImageViews();
    
    public abstract void setImageViews(@org.jetbrains.annotations.NotNull()
    long[] p0);
    
    public abstract int getFormat();
    
    public abstract void setFormat(int p0);
    
    /**
     * * Creates a window for this swapchain, and initialiases [win] to the appropriate window
     *     * kind (@see[SceneryWindow]. Needs to be handed a [VulkanRenderer.SwapchainRecreator].
     *     * Returns the initialised [SceneryWindow].
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
     * * Present routine, to be called when the image should be presented to a window or a buffer.
     *     * Optionally will wait on the semaphores given in [waitForSemaphores].
     */
    public abstract void present(@org.jetbrains.annotations.Nullable()
    java.nio.LongBuffer waitForSemaphores);
    
    /**
     * * Post-present routine, e.g. for copying the rendered image or showing it in another window.
     *     * [image] represents the current index with respect to [images].
     */
    public abstract void postPresent(int image);
    
    /**
     * * Will signal [signalSemaphore] that the next image is ready for being written to for presenting,
     *     * optionally waiting for a [timeout] before failing. Returns true if the swapchain needs to be
     *     * recreated and false if not.
     */
    public abstract boolean next(long timeout, long signalSemaphore);
    
    /**
     * * Closes this swapchain.
     */
    @java.lang.Override()
    public abstract void close();
    
    /**
     * * Toggles fullscreen mode for this swapchain. Needs to be given a [hub] for potential interactions
     *     * with other components of scenery, and a [swapchainRecreator] because it might need to signal
     *     * for swapchain recreation.
     */
    public abstract void toggleFullscreen(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator swapchainRecreator);
    
    /**
     * * Embeds this swapchain within [panel] (@see[SceneryFXPanel]).
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