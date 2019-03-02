package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Represents a pool of [VulkanBuffer]s, from which [VulkanSuballocation]s can be made.
 * * Each buffer pool resides on a [device] and has specific [usage] flags, e.g. for vertex
 * * or texture storage.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010!\u001a\u00020\"H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanBufferPool;", "", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "usage", "", "Lvkk/VkBufferUsageFlags;", "bufferSize", "Lvkk/entities/VkDeviceSize;", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;IJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "backingStore", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lgraphics/scenery/backends/vulkan/VulkanBufferAllocation;", "getBackingStore", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getBufferSize", "()J", "J", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getUsage", "()I", "create", "Lgraphics/scenery/backends/vulkan/VulkanSuballocation;", "size", "createBuffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "toString", "", "scenery"})
public final class VulkanBufferPool {
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.backends.vulkan.VulkanBufferAllocation> backingStore = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    private final int usage = 0;
    private final long bufferSize = 0L;
    
    private final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.backends.vulkan.VulkanBufferAllocation> getBackingStore() {
        return null;
    }
    
    /**
     * * Creates a new [VulkanSuballocation] of a given [size]. If the allocation cannot be made with
     *     * the current set of buffers in [backingStore], a new buffer will be added.
     */
    @org.jetbrains.annotations.NotNull()
    public final synchronized graphics.scenery.backends.vulkan.VulkanSuballocation create(int size) {
        return null;
    }
    
    /**
     * * Creates a new [VulkanBuffer] of [size], backed by this [VulkanBufferPool].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanBuffer createBuffer(int size) {
        return null;
    }
    
    /**
     * * Returns a string representation of this pool.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }
    
    public final int getUsage() {
        return 0;
    }
    
    public final long getBufferSize() {
        return 0L;
    }
    
    private VulkanBufferPool(graphics.scenery.backends.vulkan.VulkanDevice device, int usage, long bufferSize) {
        super();
    }
}