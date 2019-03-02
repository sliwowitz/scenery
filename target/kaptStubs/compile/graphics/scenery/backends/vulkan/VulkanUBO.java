package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * UBO class for Vulkan, providing specific functionality, such as buffer making and UBO buffer creation.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020#H\u0004J\u0006\u0010$\u001a\u00020\u001fJ\u0006\u0010%\u001a\u00020\u000fJ\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(J\u0010\u0010)\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020#JF\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2.\u0010,\u001a*\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0-j\u0014\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/`1J\u000e\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00065"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanUBO;", "Ljava/lang/AutoCloseable;", "Lgraphics/scenery/backends/UBO;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "backingBuffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lgraphics/scenery/backends/vulkan/VulkanBuffer;)V", "getBackingBuffer", "()Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "setBackingBuffer", "(Lgraphics/scenery/backends/vulkan/VulkanBuffer;)V", "closed", "", "<set-?>", "Lgraphics/scenery/backends/vulkan/VulkanUBO$UBODescriptor;", "descriptor", "getDescriptor", "()Lgraphics/scenery/backends/vulkan/VulkanUBO$UBODescriptor;", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "offsets", "Ljava/nio/IntBuffer;", "getOffsets", "()Ljava/nio/IntBuffer;", "setOffsets", "(Ljava/nio/IntBuffer;)V", "ownedBackingBuffer", "stagingMemory", "Ljava/nio/ByteBuffer;", "close", "", "copy", "data", "offset", "", "copyFromStagingBuffer", "createUniformBuffer", "fromInstance", "node", "Lgraphics/scenery/Node;", "populate", "populateParallel", "bufferView", "elements", "Ljava/util/LinkedHashMap;", "", "Lkotlin/Function0;", "", "Lkotlin/collections/LinkedHashMap;", "updateBackingBuffer", "newBackingBuffer", "UBODescriptor", "scenery"})
public class VulkanUBO extends graphics.scenery.backends.UBO implements java.lang.AutoCloseable {
    
    /**
     * [UBODescriptor] for this UBO, containing size, memory pointer, etc. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.VulkanUBO.UBODescriptor descriptor;
    
    /**
     * Offsets for this UBO, with respect to the backing buffer. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.IntBuffer offsets;
    private boolean closed;
    private graphics.scenery.backends.vulkan.VulkanBuffer ownedBackingBuffer;
    private java.nio.ByteBuffer stagingMemory;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.backends.vulkan.VulkanBuffer backingBuffer;
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanUBO.UBODescriptor getDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.nio.IntBuffer getOffsets() {
        return null;
    }
    
    public final void setOffsets(@org.jetbrains.annotations.NotNull()
    java.nio.IntBuffer p0) {
    }
    
    protected final void copy(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer data, long offset) {
    }
    
    /**
     * * Populates the [backingBuffer] with the members of this UBO, subject to the determined
     *     * sizes and alignments. A buffer [offset] can be given. This routine checks via it's super
     *     * if an actual buffer update is required, and if not, will just set the buffer to the
     *     * cached position. Otherwise it will serialise all the members into [backingBuffer].
     *     *
     *     * Returns true if [backingBuffer] has been updated, and false if not.
     */
    public final boolean populate(long offset) {
        return false;
    }
    
    /**
     * * Populates the [bufferView] with the members of this UBO, subject to the determined
     *     * sizes and alignments in a parallelized manner. A buffer [offset] can be given, as well as
     *     * a list of [elements], overriding the UBO's members. This routine checks via it's super
     *     * if an actual buffer update is required, and if not, will just set the buffer to the
     *     * cached position. Otherwise it will serialise all the members into [bufferView].
     *     *
     *     * Returns true if [bufferView] has been updated, and false if not.
     */
    public final boolean populateParallel(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer bufferView, long offset, @org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> elements) {
        return false;
    }
    
    /**
     * * Creates this UBO's members from the instancedProperties of [node].
     */
    public final void fromInstance(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Node node) {
    }
    
    /**
     * * Creates a [UBODescriptor] for this UBO and returns it.
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanUBO.UBODescriptor createUniformBuffer() {
        return null;
    }
    
    /**
     * * Updates this buffer to use a new [backingBuffer] buffer,
     *     * given as [newBackingBuffer].
     */
    @kotlin.Suppress(names = {"unused"})
    public final void updateBackingBuffer(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanBuffer newBackingBuffer) {
    }
    
    /**
     * * Copies the backing buffer's staging buffer content to the actual backing buffer,
     *     * used for RAM -> GPU copies.
     */
    @kotlin.Suppress(names = {"unused"})
    public final void copyFromStagingBuffer() {
    }
    
    /**
     * * Closes this UBO, freeing staging memory and closing any self-owned backing buffers.
     */
    @java.lang.Override()
    public void close() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.backends.vulkan.VulkanBuffer getBackingBuffer() {
        return null;
    }
    
    public final void setBackingBuffer(@org.jetbrains.annotations.Nullable()
    graphics.scenery.backends.vulkan.VulkanBuffer p0) {
    }
    
    public VulkanUBO(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.Nullable()
    graphics.scenery.backends.vulkan.VulkanBuffer backingBuffer) {
        super();
    }
    
    /**
     * * UBO descriptor class, wrapping memory pointers,
     *     * allocation sizes, offsets and ranges for the backing buffer.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001f\u0010\t\u001a\u00020\nX\u0080\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001f\u0010\u000e\u001a\u00020\u000fX\u0080\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanUBO$UBODescriptor;", "", "()V", "allocationSize", "", "getAllocationSize$scenery", "()J", "setAllocationSize$scenery", "(J)V", "buffer", "Lvkk/entities/VkBuffer;", "getBuffer$scenery", "setBuffer-7Y0Lqc0$scenery", "J", "memory", "Lvkk/entities/VkDeviceMemory;", "getMemory$scenery", "setMemory-H4ZSszY$scenery", "offset", "getOffset$scenery", "setOffset$scenery", "range", "getRange$scenery", "setRange$scenery", "scenery"})
    public static final class UBODescriptor {
        private long memory;
        private long allocationSize;
        private long buffer;
        private long offset;
        private long range;
        
        public final long getMemory$scenery() {
            return 0L;
        }
        
        public final long getAllocationSize$scenery() {
            return 0L;
        }
        
        public final void setAllocationSize$scenery(long p0) {
        }
        
        public final long getBuffer$scenery() {
            return 0L;
        }
        
        public final long getOffset$scenery() {
            return 0L;
        }
        
        public final void setOffset$scenery(long p0) {
        }
        
        public final long getRange$scenery() {
            return 0L;
        }
        
        public final void setRange$scenery(long p0) {
        }
        
        public UBODescriptor() {
            super();
        }
    }
}