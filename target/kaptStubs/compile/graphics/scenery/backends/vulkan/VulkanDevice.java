package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Describes a Vulkan device attached to an [instance] and a [physicalDevice].
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 =2\u00020\u0001:\u0004=>?@B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010-\u001a\u00020.J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0018\u00104\u001a\u00020.2\u0006\u00105\u001a\u000200\u00f8\u0001\u0000\u00a2\u0006\u0004\b6\u00107J \u00108\u001a\b\u0012\u0004\u0012\u0002020\u000e2\u0006\u00109\u001a\u0002022\n\u0010:\u001a\u000602j\u0002`;J\b\u0010<\u001a\u00020\u000bH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010)\u001a\u00020*\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanDevice;", "", "instance", "Lorg/lwjgl/vulkan/VkInstance;", "physicalDevice", "Lorg/lwjgl/vulkan/VkPhysicalDevice;", "deviceData", "Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceData;", "extensionsQuery", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "validationLayers", "", "headless", "", "(Lorg/lwjgl/vulkan/VkInstance;Lorg/lwjgl/vulkan/VkPhysicalDevice;Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceData;Lkotlin/jvm/functions/Function1;Ljava/util/List;Z)V", "getDeviceData", "()Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceData;", "extensions", "getExtensions", "()Ljava/util/ArrayList;", "getInstance", "()Lorg/lwjgl/vulkan/VkInstance;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate$1", "Lkotlin/Lazy;", "memoryProperties", "Lorg/lwjgl/vulkan/VkPhysicalDeviceMemoryProperties;", "getMemoryProperties", "()Lorg/lwjgl/vulkan/VkPhysicalDeviceMemoryProperties;", "getPhysicalDevice", "()Lorg/lwjgl/vulkan/VkPhysicalDevice;", "queueIndices", "Lgraphics/scenery/backends/vulkan/VulkanDevice$QueueIndices;", "getQueueIndices", "()Lgraphics/scenery/backends/vulkan/VulkanDevice$QueueIndices;", "vulkanDevice", "Lorg/lwjgl/vulkan/VkDevice;", "getVulkanDevice", "()Lorg/lwjgl/vulkan/VkDevice;", "close", "", "createCommandPool", "Lvkk/entities/VkCommandPool;", "queueNodeIndex", "", "(I)J", "destroyCommandPool", "commandPool", "destroyCommandPool-78nvDYs", "(J)V", "getMemoryType", "typeBits", "flags", "Lvkk/VkMemoryPropertyFlags;", "toString", "Companion", "DeviceData", "DeviceType", "QueueIndices", "scenery"})
public class VulkanDevice {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate$1 = null;
    
    /**
     * Stores available memory types on the device. 
     */
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties memoryProperties = null;
    
    /**
     * Stores the Vulkan-internal device. 
     */
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkDevice vulkanDevice = null;
    
    /**
     * Stores available queue indices. 
     */
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice.QueueIndices queueIndices = null;
    
    /**
     * Stores available extensions 
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> extensions = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkInstance instance = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPhysicalDevice physicalDevice = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice.DeviceData deviceData = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<graphics.scenery.backends.vulkan.VulkanDevice.Companion.DeviceWorkaround> deviceWorkarounds = null;
    public static final graphics.scenery.backends.vulkan.VulkanDevice.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties getMemoryProperties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkDevice getVulkanDevice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice.QueueIndices getQueueIndices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getExtensions() {
        return null;
    }
    
    /**
     * * Returns the available memory types on this devices that
     *     * bear [typeBits] and [flags]. May return an empty list in case
     *     * the device does not support the given types and flags.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getMemoryType(int typeBits, int flags) {
        return null;
    }
    
    /**
     * * Creates a command pool with a given [queueNodeIndex] for this device.
     */
    public final long createCommandPool(int queueNodeIndex) {
        return 0L;
    }
    
    /**
     * * Returns a string representation of this device.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * * Destroys this device, waiting for all operations to finish before.
     */
    public final void close() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkInstance getInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPhysicalDevice getPhysicalDevice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice.DeviceData getDeviceData() {
        return null;
    }
    
    public VulkanDevice(@org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkInstance instance, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkPhysicalDevice physicalDevice, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice.DeviceData deviceData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.lwjgl.vulkan.VkPhysicalDevice, ? extends java.util.ArrayList<java.lang.String>> extensionsQuery, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> validationLayers, boolean headless) {
        super();
    }
    
    /**
     * * Creates a [VulkanDevice] in a given [instance] from a physical device, requesting extensions
     *         * given by [additionalExtensions]. The device selection is done in a fuzzy way by [physicalDeviceFilter],
     *         * such that one can filter for certain vendors, e.g.
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.backends.vulkan.VulkanDevice fromPhysicalDevice(@org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkInstance instance, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, java.lang.Boolean> physicalDeviceFilter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.lwjgl.vulkan.VkPhysicalDevice, ? extends java.util.ArrayList<java.lang.String>> additionalExtensions, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> validationLayers, boolean headless) {
        return null;
    }
    
    /**
     * * Enum class for GPU device types. Can be unknown, other, integrated, discrete, virtual or CPU.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceType;", "", "(Ljava/lang/String;I)V", "Unknown", "Other", "IntegratedGPU", "DiscreteGPU", "VirtualGPU", "CPU", "scenery"})
    public static enum DeviceType {
        /*public static final*/ Unknown /* = new Unknown() */,
        /*public static final*/ Other /* = new Other() */,
        /*public static final*/ IntegratedGPU /* = new IntegratedGPU() */,
        /*public static final*/ DiscreteGPU /* = new DiscreteGPU() */,
        /*public static final*/ VirtualGPU /* = new VirtualGPU() */,
        /*public static final*/ CPU /* = new CPU() */;
        
        DeviceType() {
        }
    }
    
    /**
     * * Class to store device-specific metadata.
     *     *
     *     * @property[vendor] The vendor name of the device.
     *     * @property[name] The name of the device.
     *     * @property[driverVersion] The driver version as represented as string.
     *     * @property[apiVersion] The Vulkan API version supported by the device, represented as string.
     *     * @property[type] The [DeviceType] of the GPU.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceData;", "", "prop", "Lorg/lwjgl/vulkan/VkPhysicalDeviceProperties;", "(Lorg/lwjgl/vulkan/VkPhysicalDeviceProperties;)V", "apiVersion", "", "getApiVersion", "()Ljava/lang/String;", "driverVersion", "getDriverVersion", "name", "getName", "type", "Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceType;", "getType", "()Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceType;", "vendor", "Lvkk/VkVendor;", "getVendor", "()Lvkk/VkVendor;", "scenery"})
    public static final class DeviceData {
        @org.jetbrains.annotations.NotNull()
        private final vkk.VkVendor vendor = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String driverVersion = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String apiVersion = null;
        @org.jetbrains.annotations.NotNull()
        private final graphics.scenery.backends.vulkan.VulkanDevice.DeviceType type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final vkk.VkVendor getVendor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDriverVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getApiVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanDevice.DeviceType getType() {
            return null;
        }
        
        public DeviceData(@org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkPhysicalDeviceProperties prop) {
            super();
        }
    }
    
    /**
     * * Data class to store device-specific queue indices.
     *     *
     *     * @property[presentQueue] The index of the present queue
     *     * @property[graphicsQueue] The index of the graphics queue
     *     * @property[computeQueue] The index of the compute queue
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanDevice$QueueIndices;", "", "presentQueue", "", "transferQueue", "graphicsQueue", "computeQueue", "(IIII)V", "getComputeQueue", "()I", "getGraphicsQueue", "getPresentQueue", "getTransferQueue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "scenery"})
    public static final class QueueIndices {
        private final int presentQueue = 0;
        private final int transferQueue = 0;
        private final int graphicsQueue = 0;
        private final int computeQueue = 0;
        
        public final int getPresentQueue() {
            return 0;
        }
        
        public final int getTransferQueue() {
            return 0;
        }
        
        public final int getGraphicsQueue() {
            return 0;
        }
        
        public final int getComputeQueue() {
            return 0;
        }
        
        public QueueIndices(int presentQueue, int transferQueue, int graphicsQueue, int computeQueue) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        /**
         * * Data class to store device-specific queue indices.
         *     *
         *     * @property[presentQueue] The index of the present queue
         *     * @property[graphicsQueue] The index of the graphics queue
         *     * @property[computeQueue] The index of the compute queue
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanDevice.QueueIndices copy(int presentQueue, int transferQueue, int graphicsQueue, int computeQueue) {
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
    
    /**
     * * Utility functions for [VulkanDevice].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001(B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0015H\u0002Jj\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e2$\b\u0002\u0010!\u001a\u001e\u0012\u0004\u0012\u00020#\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180$j\b\u0012\u0004\u0012\u00020\u0018`%0\"2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0002\u0010\'\u001a\u00020 H\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108F\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanDevice$Companion;", "", "()V", "deviceWorkarounds", "", "Lgraphics/scenery/backends/vulkan/VulkanDevice$Companion$DeviceWorkaround;", "getDeviceWorkarounds", "()Ljava/util/List;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "deviceType", "Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceType;", "Lvkk/VkPhysicalDeviceType;", "getDeviceType-kOn8zao", "(I)Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceType;", "decodeDriverVersion", "Lkotlin/Triple;", "", "version", "driverVersionToString", "", "fromPhysicalDevice", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "instance", "Lorg/lwjgl/vulkan/VkInstance;", "physicalDeviceFilter", "Lkotlin/Function2;", "Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceData;", "", "additionalExtensions", "Lkotlin/Function1;", "Lorg/lwjgl/vulkan/VkPhysicalDevice;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "validationLayers", "headless", "DeviceWorkaround", "scenery"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.slf4j.Logger getLogger() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<graphics.scenery.backends.vulkan.VulkanDevice.Companion.DeviceWorkaround> getDeviceWorkarounds() {
            return null;
        }
        
        private final kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer> decodeDriverVersion(int version) {
            return null;
        }
        
        private final java.lang.String driverVersionToString(int version) {
            return null;
        }
        
        /**
         * * Creates a [VulkanDevice] in a given [instance] from a physical device, requesting extensions
         *         * given by [additionalExtensions]. The device selection is done in a fuzzy way by [physicalDeviceFilter],
         *         * such that one can filter for certain vendors, e.g.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanDevice fromPhysicalDevice(@org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkInstance instance, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, java.lang.Boolean> physicalDeviceFilter, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.lwjgl.vulkan.VkPhysicalDevice, ? extends java.util.ArrayList<java.lang.String>> additionalExtensions, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> validationLayers, boolean headless) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        /**
         * * Data class for defining device/driver-specific workarounds.
         *         *
         *         * @property[filter] A lambda to define the condition to trigger this workaround, must return a boolean.
         *         * @property[description] A string description of the cause and effects of the workaround
         *         * @property[workaround] A lambda that will be executed if this [DeviceWorkaround] is triggered.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J?\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanDevice$Companion$DeviceWorkaround;", "", "filter", "Lkotlin/Function1;", "Lgraphics/scenery/backends/vulkan/VulkanDevice$DeviceData;", "", "description", "", "workaround", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getDescription", "()Ljava/lang/String;", "getFilter", "()Lkotlin/jvm/functions/Function1;", "getWorkaround", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "scenery"})
        public static final class DeviceWorkaround {
            @org.jetbrains.annotations.NotNull()
            private final kotlin.jvm.functions.Function1<graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, java.lang.Boolean> filter = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String description = null;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.jvm.functions.Function1<graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, java.lang.Object> workaround = null;
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.jvm.functions.Function1<graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, java.lang.Boolean> getFilter() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDescription() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.jvm.functions.Function1<graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, java.lang.Object> getWorkaround() {
                return null;
            }
            
            public DeviceWorkaround(@org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function1<? super graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, java.lang.Boolean> filter, @org.jetbrains.annotations.NotNull()
            java.lang.String description, @org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function1<? super graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, ? extends java.lang.Object> workaround) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.jvm.functions.Function1<graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, java.lang.Boolean> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.jvm.functions.Function1<graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, java.lang.Object> component3() {
                return null;
            }
            
            /**
             * * Data class for defining device/driver-specific workarounds.
             *         *
             *         * @property[filter] A lambda to define the condition to trigger this workaround, must return a boolean.
             *         * @property[description] A string description of the cause and effects of the workaround
             *         * @property[workaround] A lambda that will be executed if this [DeviceWorkaround] is triggered.
             */
            @org.jetbrains.annotations.NotNull()
            public final graphics.scenery.backends.vulkan.VulkanDevice.Companion.DeviceWorkaround copy(@org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function1<? super graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, java.lang.Boolean> filter, @org.jetbrains.annotations.NotNull()
            java.lang.String description, @org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function1<? super graphics.scenery.backends.vulkan.VulkanDevice.DeviceData, ? extends java.lang.Object> workaround) {
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
}