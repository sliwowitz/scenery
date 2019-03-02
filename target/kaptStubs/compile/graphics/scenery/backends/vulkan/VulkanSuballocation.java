package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Represents a suballocation of a VulkanBuffer [buffer], with [size] and [offset].
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanSuballocation;", "", "offset", "Lvkk/entities/VkDeviceSize;", "size", "buffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "(JJLgraphics/scenery/backends/vulkan/VulkanBuffer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBuffer", "()Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "setBuffer", "(Lgraphics/scenery/backends/vulkan/VulkanBuffer;)V", "value", "", "free", "getFree", "()Z", "setFree", "(Z)V", "getOffset", "()J", "setOffset-0GOl_3Q", "(J)V", "J", "getSize", "setSize-0GOl_3Q", "Ljava/nio/ByteBuffer;", "toString", "", "scenery"})
public final class VulkanSuballocation {
    
    /**
     * Mark this suballocation for garbage collection, can only be set true once. 
     */
    private boolean free;
    private long offset;
    private long size;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.VulkanBuffer buffer;
    
    public final boolean getFree() {
        return false;
    }
    
    public final void setFree(boolean value) {
    }
    
    /**
     * * Returns a view of the backing buffer of the [buffer], with position and limit
     *     * set to the right values.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    public final java.nio.ByteBuffer getBuffer() {
        return null;
    }
    
    /**
     * Returns a string representation of this suballocation. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final long getOffset() {
        return 0L;
    }
    
    public final long getSize() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanBuffer getBuffer() {
        return null;
    }
    
    public final void setBuffer(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanBuffer p0) {
    }
    
    private VulkanSuballocation(long offset, long size, graphics.scenery.backends.vulkan.VulkanBuffer buffer) {
        super();
    }
}