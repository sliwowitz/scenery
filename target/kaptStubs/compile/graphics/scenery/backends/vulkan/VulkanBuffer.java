package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Vulkan buffer class, creates a buffer residing on [device], with a [size] and a defined [usage].
 * * The buffer may have [requestedMemoryProperties]. The buffer can be created with a [suballocation]
 * * from a [VulkanBufferPool] -- if created in this way it'll not manage its own memory, but leave that
 * * to the pool.
 * *
 * * @param[wantAligned] - whether the buffer should be aligned
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001:\u0001`BH\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001a\u0010A\u001a\u00020\u00072\b\b\u0002\u0010B\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0004\bC\u0010DJ\"\u0010E\u001a\u00020F2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\bG\u0010HJ\b\u0010I\u001a\u00020JH\u0016J\"\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020/2\b\b\u0002\u0010M\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0004\bN\u0010OJ(\u0010K\u001a\u00020J2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020/0Q2\b\b\u0002\u0010M\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0004\bR\u0010SJ\u0006\u0010T\u001a\u00020JJ\u000e\u0010U\u001a\u00020J2\u0006\u0010V\u001a\u00020/J\b\u0010W\u001a\u00020JH\u0002J\u0006\u0010X\u001a\u00020\fJ\n\u0010Y\u001a\u00060\u001bj\u0002`\u001cJ\n\u0010Z\u001a\u00060\u001bj\u0002`\u001cJ\u0006\u0010[\u001a\u00020JJ\u0010\u0010\\\u001a\u00020/2\b\b\u0002\u0010]\u001a\u00020\u0007J\b\u0010^\u001a\u00020JH\u0004J\u0006\u0010_\u001a\u00020JR#\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005@BX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005@BX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R#\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005@BX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00060\u001bj\u0002`\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u000e\u0010&\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010(\u001a\u00020\'2\u0006\u0010\u0010\u001a\u00020\'@BX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b)\u0010\u0013R\u0015\u0010\t\u001a\u00060\u0007j\u0002`\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001f\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010.R\u001e\u00100\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020/@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u0011\u00108\u001a\u0002098F\u00a2\u0006\u0006\u001a\u0004\b:\u0010;R#\u0010=\u001a\u00020<2\u0006\u0010\u0010\u001a\u00020<@BX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b>\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006a"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "Ljava/lang/AutoCloseable;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "size", "Lvkk/entities/VkDeviceSize;", "usage", "", "Lvkk/VkBufferUsageFlags;", "requestedMemoryProperties", "Lvkk/VkMemoryPropertyFlags;", "wantAligned", "", "suballocation", "Lgraphics/scenery/backends/vulkan/VulkanSuballocation;", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;JIIZLgraphics/scenery/backends/vulkan/VulkanSuballocation;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "alignment", "getAlignment", "()J", "J", "allocatedSize", "getAllocatedSize", "bufferOffset", "getBufferOffset", "bufferReallocNeeded", "currentPointer", "", "Lkool/Ptr;", "currentPosition", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "mapped", "Lvkk/entities/VkDeviceMemory;", "memory", "getMemory", "getRequestedMemoryProperties", "()I", "getSize", "setSize-0GOl_3Q", "(J)V", "Ljava/nio/ByteBuffer;", "stagingBuffer", "getStagingBuffer", "()Ljava/nio/ByteBuffer;", "getSuballocation", "()Lgraphics/scenery/backends/vulkan/VulkanSuballocation;", "setSuballocation", "(Lgraphics/scenery/backends/vulkan/VulkanSuballocation;)V", "getUsage", "vkDev", "Lorg/lwjgl/vulkan/VkDevice;", "getVkDev", "()Lorg/lwjgl/vulkan/VkDevice;", "Lvkk/entities/VkBuffer;", "vulkanBuffer", "getVulkanBuffer", "getWantAligned", "()Z", "advance", "align", "advance-0GOl_3Q", "(J)I", "allocateVulkanBuffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer$RawBuffer;", "allocateVulkanBuffer-1zyXo4s", "(JZ)Lgraphics/scenery/backends/vulkan/VulkanBuffer$RawBuffer;", "close", "", "copyFrom", "data", "dstOffset", "copyFrom-Fp-F_HU", "(Ljava/nio/ByteBuffer;J)V", "chunks", "", "copyFrom-llwJqH8", "(Ljava/util/List;J)V", "copyFromStagingBuffer", "copyTo", "dest", "destroyVulkanBuffer", "initialized", "map", "mapIfUnmapped", "reset", "resize", "newSize", "resizeLazy", "unmap", "RawBuffer", "scenery"})
public class VulkanBuffer implements java.lang.AutoCloseable {
    private final kotlin.Lazy logger$delegate = null;
    private long currentPosition;
    private long currentPointer;
    
    /**
     * Buffer alignment, 256 bytes by default (Vulkan standard) 
     */
    private long alignment;
    
    /**
     * Memory pointer 
     */
    private long memory;
    
    /**
     * Buffer to the Vulkan pointer struct 
     */
    private long vulkanBuffer;
    
    /**
     * Final allocated size of the buffer, might be different from the requested size, due to alignment. 
     */
    private long allocatedSize;
    
    /**
     * Buffer offset. 
     */
    private long bufferOffset;
    private boolean mapped;
    private boolean bufferReallocNeeded;
    
    /**
     * Staging buffer, providing host memory 
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.ByteBuffer stagingBuffer;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    private long size;
    private final int usage = 0;
    private final int requestedMemoryProperties = 0;
    private final boolean wantAligned = false;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.backends.vulkan.VulkanSuballocation suballocation;
    
    private final org.slf4j.Logger getLogger() {
        return null;
    }
    
    public final long getAlignment() {
        return 0L;
    }
    
    public final long getMemory() {
        return 0L;
    }
    
    public final long getVulkanBuffer() {
        return 0L;
    }
    
    public final long getAllocatedSize() {
        return 0L;
    }
    
    public final long getBufferOffset() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.nio.ByteBuffer getStagingBuffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkDevice getVkDev() {
        return null;
    }
    
    /**
     * * Resizes the backing buffer to [newSize], which is 1.5x the original size by default,
     *     * and returns the staging buffer.
     */
    @org.jetbrains.annotations.NotNull()
    public final synchronized java.nio.ByteBuffer resize(int newSize) {
        return null;
    }
    
    /**
     * * Resizes the actual Vulkan buffer. Called upon copying the staging buffer to the Vulkan buffer.
     */
    protected final synchronized void resizeLazy() {
    }
    
    /**
     * * Resets the staging buffer such that it can be again filled
     *     * from the beginning.
     */
    public final void reset() {
    }
    
    /**
     * * Copies the contents of the device buffer to [dest].
     */
    public final void copyTo(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer dest) {
    }
    
    /**
     * * Maps this buffer
     */
    public final long map() {
        return 0L;
    }
    
    /**
     * * Maps this buffer it wasn't mapped before, and rewinds it.
     */
    public final long mapIfUnmapped() {
        return 0L;
    }
    
    /**
     * * Unmaps this buffer.
     */
    public final void unmap() {
    }
    
    /**
     * * Copies data from the [stagingBuffer] to device memory.
     */
    public final void copyFromStagingBuffer() {
    }
    
    /**
     * * Returns true if this buffer is initialised correctly.
     */
    public final boolean initialized() {
        return false;
    }
    
    private final void destroyVulkanBuffer() {
    }
    
    /**
     * * Closes this buffer, freeing all allocated resources on host and device.
     */
    @java.lang.Override()
    public void close() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }
    
    public final long getSize() {
        return 0L;
    }
    
    public final int getUsage() {
        return 0;
    }
    
    public final int getRequestedMemoryProperties() {
        return 0;
    }
    
    public final boolean getWantAligned() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.backends.vulkan.VulkanSuballocation getSuballocation() {
        return null;
    }
    
    public final void setSuballocation(@org.jetbrains.annotations.Nullable()
    graphics.scenery.backends.vulkan.VulkanSuballocation p0) {
    }
    
    private VulkanBuffer(graphics.scenery.backends.vulkan.VulkanDevice device, long size, int usage, int requestedMemoryProperties, boolean wantAligned, graphics.scenery.backends.vulkan.VulkanSuballocation suballocation) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0016\u0010\b\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanBuffer$RawBuffer;", "", "buffer", "Lvkk/entities/VkBuffer;", "memory", "Lvkk/entities/VkDeviceMemory;", "size", "Lvkk/entities/VkDeviceSize;", "alignment", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment", "()J", "J", "getBuffer", "getMemory", "getSize", "component1", "component2", "component3", "component4", "copy", "copy-b-c6W4M", "(JJJJ)Lgraphics/scenery/backends/vulkan/VulkanBuffer$RawBuffer;", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    static final class RawBuffer {
        private final long buffer = 0L;
        private final long memory = 0L;
        private final long size = 0L;
        private final long alignment = 0L;
        
        public final long getBuffer() {
            return 0L;
        }
        
        public final long getMemory() {
            return 0L;
        }
        
        public final long getSize() {
            return 0L;
        }
        
        public final long getAlignment() {
            return 0L;
        }
        
        private RawBuffer(long buffer, long memory, long size, long alignment) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long component4() {
            return 0L;
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