package graphics.scenery.backends.vulkan;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001ar\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\n\u001aL\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\n\u001a\n\u0010\u0015\u001a\u00020\u0016*\u00020\u0017\u001a\n\u0010\u0015\u001a\u00020\u0016*\u00020\u0006\u001a\n\u0010\u0018\u001a\u00020\u0019*\u00020\u001a\u001a\n\u0010\u0018\u001a\u00020\u0019*\u00020\u001b\u00a8\u0006\u001c"}, d2 = {"endCommandBuffer", "", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "commandPool", "", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "flush", "", "dealloc", "submitInfoPNext", "Lorg/lwjgl/system/Pointer;", "signalSemaphores", "Ljava/nio/LongBuffer;", "waitSemaphores", "waitDstStageMask", "Ljava/nio/IntBuffer;", "block", "submit", "toHexString", "", "Ljava/math/BigInteger;", "toVulkan", "", "Lgraphics/scenery/Blending$BlendFactor;", "Lgraphics/scenery/Blending$BlendOp;", "scenery"})
public final class VUKt {
    
    /**
     * * Returns a given Long as hex-formatted string.
     * *
     * * @returns The long value as hex string.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toHexString(long $receiver) {
        return null;
    }
    
    /**
     * * Returns a given BigInteger as hex-formatted string.
     * *
     * * @returns The BigInteger value as hex string.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toHexString(@org.jetbrains.annotations.NotNull()
    java.math.BigInteger $receiver) {
        return null;
    }
    
    /**
     * * Ends the recording of a command buffer.
     */
    public static final void endCommandBuffer(@org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkCommandBuffer $receiver) {
    }
    
    /**
     * * Ends the recording of a command buffer on the given [device] using [commandPool] on the queue [queue].
     * * If [flush] is set, ending the command buffer will trigger submission. If [dealloc] is set, the command buffer
     * * will be deallocated after running it.
     * *
     * * [submitInfoPNext], [signalSemaphores], [waitSemaphores] and [waitDstStageMask] can be used to further fine-grain
     * * the submission process.
     */
    public static final void endCommandBuffer(@org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkCommandBuffer $receiver, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, long commandPool, @org.jetbrains.annotations.Nullable()
    org.lwjgl.vulkan.VkQueue queue, boolean flush, boolean dealloc, @org.jetbrains.annotations.Nullable()
    org.lwjgl.system.Pointer submitInfoPNext, @org.jetbrains.annotations.Nullable()
    java.nio.LongBuffer signalSemaphores, @org.jetbrains.annotations.Nullable()
    java.nio.LongBuffer waitSemaphores, @org.jetbrains.annotations.Nullable()
    java.nio.IntBuffer waitDstStageMask, boolean block) {
    }
    
    /**
     * * Submits the given command buffer to the queue [queue].
     * *
     * * [submitInfoPNext], [signalSemaphores], [waitSemaphores] and [waitDstStageMask] can be used to further fine-grain
     * * the submission process.
     */
    public static final void submit(@org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkCommandBuffer $receiver, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkQueue queue, @org.jetbrains.annotations.Nullable()
    org.lwjgl.system.Pointer submitInfoPNext, @org.jetbrains.annotations.Nullable()
    java.nio.LongBuffer signalSemaphores, @org.jetbrains.annotations.Nullable()
    java.nio.LongBuffer waitSemaphores, @org.jetbrains.annotations.Nullable()
    java.nio.IntBuffer waitDstStageMask, boolean block) {
    }
    
    /**
     * * Converts a [Blending.BlendFactor] to a Vulkan-internal integer-based descriptor.
     */
    public static final int toVulkan(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor $receiver) {
        return 0;
    }
    
    /**
     * * Converts a [Blending.BlendOp] to a Vulkan-intenal integer-based descriptor.
     */
    public static final int toVulkan(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendOp $receiver) {
        return 0;
    }
}