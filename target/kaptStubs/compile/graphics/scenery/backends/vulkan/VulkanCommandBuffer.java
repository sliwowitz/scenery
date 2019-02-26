package graphics.scenery.backends.vulkan;

/**
 * * Vulkan Command Buffer class. Wraps command buffer and fencing functionality.
 * * Allocates the command buffer on [device], and can wrap an existing raw [commandBuffer].
 * * [VulkanCommandBuffer]s are by default [fenced].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010%\u001a\u00020&J\b\u0010\'\u001a\u00020&H\u0016J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020*\u00f8\u0001\u0000\u00a2\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*\u00f8\u0001\u0000\u00a2\u0006\u0004\b/\u00100J\u0006\u00101\u001a\u00020&J\u0017\u00102\u001a\u00020&2\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u00a2\u0006\u0002\u00105R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001dR\u0011\u0010!\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00066"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanCommandBuffer;", "Ljava/lang/AutoCloseable;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "commandBuffer", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "fenced", "", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lorg/lwjgl/vulkan/VkCommandBuffer;Z)V", "getCommandBuffer", "()Lorg/lwjgl/vulkan/VkCommandBuffer;", "setCommandBuffer", "(Lorg/lwjgl/vulkan/VkCommandBuffer;)V", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "<set-?>", "Lvkk/entities/VkFence;", "fence", "getFence", "()J", "setFence-D0u0NXc", "(J)V", "J", "fenceInitialized", "getFenced", "()Z", "stale", "getStale", "setStale", "(Z)V", "submitted", "getSubmitted", "setSubmitted", "vkDev", "Lorg/lwjgl/vulkan/VkDevice;", "getVkDev", "()Lorg/lwjgl/vulkan/VkDevice;", "addFence", "", "close", "prepare", "Lkotlin/Pair;", "Lvkk/entities/VkCommandPool;", "pool", "prepare-78nvDYs", "(J)Lkotlin/Pair;", "prepareAndStartRecording", "prepareAndStartRecording-78nvDYs", "(J)Lorg/lwjgl/vulkan/VkCommandBuffer;", "resetFence", "waitForFence", "timeout", "", "(Ljava/lang/Long;)V", "scenery"})
public final class VulkanCommandBuffer implements java.lang.AutoCloseable {

    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    private final boolean fenced = false;
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
    @org.jetbrains.annotations.Nullable()
    private org.lwjgl.vulkan.VkCommandBuffer commandBuffer;

    public VulkanCommandBuffer(@org.jetbrains.annotations.NotNull()
                                   graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.Nullable()
                                   org.lwjgl.vulkan.VkCommandBuffer commandBuffer, boolean fenced) {
        super();
    }

    public final boolean getStale() {
        return false;
    }

    public final void setStale(boolean p0) {
    }

    public final long getFence() {
        return 0L;
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
     * * waiting for [timeout] milliseconds.
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
     * * Closes and deallocates this command buffer.
     */
    @java.lang.Override()
    public void close() {
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
}
