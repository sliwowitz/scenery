package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Represents an allocation in a [VulkanBufferPool]'s backing store. This class does most
 * * of the work, such as keeping track of all [VulkanBufferPool]'s [VulkanSuballocation]s.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001(BF\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fJ\u001c\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010$\u001a\u00020%H\u0016J\u0014\u0010&\u001a\u00020\u0006*\u00020 H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u0016\u0010\t\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001a\u0010\u0010R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanBufferAllocation;", "", "usage", "", "Lvkk/VkBufferUsageFlags;", "size", "Lvkk/entities/VkDeviceSize;", "buffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "alignment", "suballocations", "Ljava/util/ArrayList;", "Lgraphics/scenery/backends/vulkan/VulkanSuballocation;", "Lkotlin/collections/ArrayList;", "(IJLgraphics/scenery/backends/vulkan/VulkanBuffer;JLjava/util/ArrayList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment", "()J", "J", "getBuffer", "()Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getSize", "getUsage", "()I", "allocate", "suballocation", "findFreeSpaceCandidate", "Lgraphics/scenery/backends/vulkan/VulkanBufferAllocation$FreeSpace;", "findFreeSpaceCandidate-0GOl_3Q", "(J)Lgraphics/scenery/backends/vulkan/VulkanBufferAllocation$FreeSpace;", "fit", "toString", "", "getFreeSpace", "(Lgraphics/scenery/backends/vulkan/VulkanBufferAllocation$FreeSpace;)J", "FreeSpace", "scenery"})
public final class VulkanBufferAllocation {
    private final kotlin.Lazy logger$delegate = null;
    private final int usage = 0;
    private final long size = 0L;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanBuffer buffer = null;
    private final long alignment = 0L;
    private final java.util.ArrayList<graphics.scenery.backends.vulkan.VulkanSuballocation> suballocations = null;
    
    private final org.slf4j.Logger getLogger() {
        return null;
    }
    
    /**
     * * Adds a new [suballocation].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanSuballocation allocate(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanSuballocation suballocation) {
        return null;
    }
    
    private final long getFreeSpace(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanBufferAllocation.FreeSpace $receiver) {
        return 0L;
    }
    
    /**
     * * Tries to fit a new suballocation of [size] with the current suballocations. Returns
     *     * a new possible suballocation if feasible, and null otherwise.
     */
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.backends.vulkan.VulkanSuballocation fit(int size) {
        return null;
    }
    
    /**
     * Returns a string representation of this allocation, along with its [suballocations]. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final int getUsage() {
        return 0;
    }
    
    public final long getSize() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanBuffer getBuffer() {
        return null;
    }
    
    public final long getAlignment() {
        return 0L;
    }
    
    private VulkanBufferAllocation(int usage, long size, graphics.scenery.backends.vulkan.VulkanBuffer buffer, long alignment, java.util.ArrayList<graphics.scenery.backends.vulkan.VulkanSuballocation> suballocations) {
        super();
    }
    
    /**
     * Data class to contain free space regions between two [VulkanSuballocation]s 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanBufferAllocation$FreeSpace;", "", "left", "Lgraphics/scenery/backends/vulkan/VulkanSuballocation;", "right", "(Lgraphics/scenery/backends/vulkan/VulkanSuballocation;Lgraphics/scenery/backends/vulkan/VulkanSuballocation;)V", "getLeft", "()Lgraphics/scenery/backends/vulkan/VulkanSuballocation;", "getRight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class FreeSpace {
        @org.jetbrains.annotations.Nullable()
        private final graphics.scenery.backends.vulkan.VulkanSuballocation left = null;
        @org.jetbrains.annotations.Nullable()
        private final graphics.scenery.backends.vulkan.VulkanSuballocation right = null;
        
        @org.jetbrains.annotations.Nullable()
        public final graphics.scenery.backends.vulkan.VulkanSuballocation getLeft() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final graphics.scenery.backends.vulkan.VulkanSuballocation getRight() {
            return null;
        }
        
        public FreeSpace(@org.jetbrains.annotations.Nullable()
        graphics.scenery.backends.vulkan.VulkanSuballocation left, @org.jetbrains.annotations.Nullable()
        graphics.scenery.backends.vulkan.VulkanSuballocation right) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final graphics.scenery.backends.vulkan.VulkanSuballocation component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final graphics.scenery.backends.vulkan.VulkanSuballocation component2() {
            return null;
        }
        
        /**
         * Data class to contain free space regions between two [VulkanSuballocation]s 
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanBufferAllocation.FreeSpace copy(@org.jetbrains.annotations.Nullable()
        graphics.scenery.backends.vulkan.VulkanSuballocation left, @org.jetbrains.annotations.Nullable()
        graphics.scenery.backends.vulkan.VulkanSuballocation right) {
            return null;
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