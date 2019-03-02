package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Vulkan Command Buffer class. Wraps command buffer and fencing functionality.
 * * Allocates the command buffer on [device], and can wrap an existing raw [commandBuffer].
 * * [VulkanCommandBuffer]s are by default [fenced].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020!H\u0016J\u000e\u0010#\u001a\u00020\u0010\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020!J\u0017\u0010)\u001a\u00020!2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0002\u0010+R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0014\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanCommandBuffer;", "Ljava/lang/AutoCloseable;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "commandBuffer", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "fenced", "", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lorg/lwjgl/vulkan/VkCommandBuffer;Z)V", "getCommandBuffer", "()Lorg/lwjgl/vulkan/VkCommandBuffer;", "setCommandBuffer", "(Lorg/lwjgl/vulkan/VkCommandBuffer;)V", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "fence", "Lvkk/entities/VkFence;", "J", "fenceInitialized", "getFenced", "()Z", "stale", "getStale", "setStale", "(Z)V", "submitted", "getSubmitted", "setSubmitted", "vkDev", "Lorg/lwjgl/vulkan/VkDevice;", "getVkDev", "()Lorg/lwjgl/vulkan/VkDevice;", "addFence", "", "close", "getFence", "()J", "prepareAndStartRecording", "pool", "", "resetFence", "waitForFence", "timeout", "(Ljava/lang/Long;)V", "scenery"})
public final class VulkanCommandBuffer implements java.lang.AutoCloseable {
    
    /**
     * Whether this command buffer is stale and needs to be re-recorded. 
     */
    private boolean stale;
    private boolean fenceInitialized;
    private long fence;
    
    /**
     * Whether this command buffer has already been submitted to a queue. 
     */
    private boolean submitted;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    @org.jetbrains.annotations.Nullable()
    private org.lwjgl.vulkan.VkCommandBuffer commandBuffer;
    private final boolean fenced = false;
    
    public final boolean getStale() {
        return false;
    }
    
    public final void setStale(boolean p0) {
    }
    
    public final boolean getSubmitted() {
        return false;
    }
    
    public final void setSubmitted(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkDevice getVkDev() {
        return null;
    }
    
    /**
     * * Adds a fence to this command buffer for synchronisation.
     */
    public final void addFence() {
    }
    
    /**
     * * Waits for the command buffer's execution to complete via a fence,
     *     * waiting for [timeout] milliseconds.
     */
    public final void waitForFence(@org.jetbrains.annotations.Nullable()
    java.lang.Long timeout) {
    }
    
    /**
     * * Resets this command buffer's fence.
     */
    public final void resetFence() {
    }
    
    /**
     * * Returns a reference to the fence, or null if the command buffer is not [fenced].
     */
    public final long getFence() {
        return 0L;
    }
    
    /**
     * * Closes and deallocates this command buffer.
     */
    @java.lang.Override()
    public void close() {
    }
    
    /**
     * * Prepares this command buffer for recording, either initialising or
     *     * resetting the associated Vulkan command buffer. Recording will take place in command pool [pool].
     */
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkCommandBuffer prepareAndStartRecording(long pool) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.lwjgl.vulkan.VkCommandBuffer getCommandBuffer() {
        return null;
    }
    
    public final void setCommandBuffer(@org.jetbrains.annotations.Nullable()
    org.lwjgl.vulkan.VkCommandBuffer p0) {
    }
    
    public final boolean getFenced() {
        return false;
    }
    
    public VulkanCommandBuffer(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.Nullable()
    org.lwjgl.vulkan.VkCommandBuffer commandBuffer, boolean fenced) {
        super();
    }
}