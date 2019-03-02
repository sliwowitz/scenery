package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * VU - Vulkan Utils
 * *
 * * A collection of convenience methods for various Vulkan-related tasks
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0004"}, d2 = {"Lgraphics/scenery/backends/vulkan/VU;", "", "()V", "Companion", "scenery"})
public final class VU {
    private static final kotlin.Lazy logger$delegate = null;
    public static final graphics.scenery.backends.vulkan.VU.Companion Companion = null;
    
    public VU() {
        super();
    }
    
    /**
     * * Companion object for [VU] to access methods statically.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0010J.\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J@\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u0010J:\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001e0\u001d2\b\b\u0002\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0010JF\u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0006\u0010\'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010%J*\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020%2\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00100-\u00a2\u0006\u0002\b/H\u0086\bJ2\u00100\u001a\u00020.2\u0006\u0010+\u001a\u00020%2\u0006\u00101\u001a\u00020\u00102\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00100-\u00a2\u0006\u0002\b/H\u0086\bJC\u00102\u001a\u00020\n2\u0006\u0010+\u001a\u00020%2\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00100-\u00a2\u0006\u0002\b/2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00010-\u00a2\u0006\u0002\b/H\u0086\bJK\u00105\u001a\u0002032\u0006\u0010+\u001a\u00020%2\u0006\u00101\u001a\u00020\u00102\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00100-\u00a2\u0006\u0002\b/2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00010-\u00a2\u0006\u0002\b/H\u0086\bJC\u00106\u001a\u00020\n2\u0006\u0010+\u001a\u00020%2\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00100-\u00a2\u0006\u0002\b/2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00010-\u00a2\u0006\u0002\b/H\u0086\bJ2\u00108\u001a\u0002072\u0006\u0010+\u001a\u00020%2\u0006\u00101\u001a\u00020\u00102\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00100-\u00a2\u0006\u0002\b/H\u0086\bJK\u00108\u001a\u0002072\u0006\u0010+\u001a\u00020%2\u0006\u00101\u001a\u00020\u00102\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00100-\u00a2\u0006\u0002\b/2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00010-\u00a2\u0006\u0002\b/H\u0086\bJ \u00109\u001a\u00020:2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010;\u001a\u00020\n2\b\b\u0002\u0010<\u001a\u00020\u0010J*\u00109\u001a\u00020:2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010;\u001a\u00020\n2\b\b\u0002\u0010<\u001a\u00020\u00102\b\b\u0002\u0010=\u001a\u00020>J-\u0010?\u001a\u00020@2\u0006\u0010+\u001a\u00020%2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100A2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00010AH\u0086\bJ/\u0010?\u001a\u00020@2\u0006\u0010+\u001a\u00020%2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100A2\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100\u001dH\u0086\bJ.\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020IJ8\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010F\u001a\u00020M2\u0006\u0010G\u001a\u00020M\u00f8\u0001\u0000\u00a2\u0006\u0004\bN\u0010OJ\u000e\u0010P\u001a\u00020%2\u0006\u0010Q\u001a\u00020\u0010J&\u0010R\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010S\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006T"}, d2 = {"Lgraphics/scenery/backends/vulkan/VU$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "createDescriptorSet", "", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "descriptorPool", "descriptorSetLayout", "bindingCount", "", "ubo", "Lgraphics/scenery/backends/vulkan/VulkanUBO$UBODescriptor;", "type", "createDescriptorSetDynamic", "buffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "createDescriptorSetLayout", "binding", "descriptorNum", "descriptorCount", "shaderStages", "types", "", "Lkotlin/Pair;", "createDeviceQueue", "Lorg/lwjgl/vulkan/VkQueue;", "queueFamilyIndex", "createRenderTargetDescriptorSet", "rt", "", "", "Lgraphics/scenery/backends/RenderConfigReader$TargetFormat;", "target", "Lgraphics/scenery/backends/vulkan/VulkanFramebuffer;", "onlyFor", "getInt", "name", "function", "Lkotlin/Function1;", "Ljava/nio/IntBuffer;", "Lkotlin/ExtensionFunctionType;", "getInts", "count", "getLong", "Ljava/nio/LongBuffer;", "cleanup", "getLongs", "getPointer", "Lorg/lwjgl/PointerBuffer;", "getPointers", "newCommandBuffer", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "commandPool", "level", "autostart", "", "run", "", "Lkotlin/Function0;", "allowedResults", "setImageLayout", "commandBuffer", "image", "oldImageLayout", "newImageLayout", "range", "Lorg/lwjgl/vulkan/VkImageSubresourceRange;", "Lvkk/entities/VkImage;", "aspectMask", "Lvkk/VkImageAspect;", "Lvkk/VkImageLayout;", "setImageLayout-D6fVZto", "(Lorg/lwjgl/vulkan/VkCommandBuffer;JIII)V", "translate", "result", "updateDynamicDescriptorSetBuffer", "descriptorSet", "scenery"})
    public static final class Companion {
        
        private final org.slf4j.Logger getLogger() {
            return null;
        }
        
        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. Allowed error codes
         *         * can be set in [allowedResults], for debugging, the call may be given a [name].
         */
        public final void run(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<java.lang.Integer> function, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> allowedResults) {
        }
        
        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. After the call, [cleanup] is run.
         *         * For debugging, the call may be given a [name].
         */
        public final void run(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<java.lang.Integer> function, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<? extends java.lang.Object> cleanup) {
        }
        
        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         *         * an int, which is in turn returned by this function.
         *         * For debugging, the call may be given a [name].
         */
        public final int getInt(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.nio.IntBuffer, java.lang.Integer> function) {
            return 0;
        }
        
        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         *         * an [IntBuffer], containing [count] elements, which is in turn returned by this function.
         *         * For debugging, the call may be given a [name].
         */
        @org.jetbrains.annotations.NotNull()
        public final java.nio.IntBuffer getInts(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int count, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.nio.IntBuffer, java.lang.Integer> function) {
            return null;
        }
        
        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         *         * a long, which is in turn returned by this function. After the function has been run, [cleanup] is called.
         *         * For debugging, the call may be given a [name].
         */
        public final long getLong(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.nio.LongBuffer, java.lang.Integer> function, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.nio.LongBuffer, ? extends java.lang.Object> cleanup) {
            return 0L;
        }
        
        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         *         * an [LongBuffer], containing [count] elements, which is in turn returned by this function. After running the
         *         * function, [cleanup] is called.
         *         * For debugging, the call may be given a [name].
         */
        @org.jetbrains.annotations.NotNull()
        public final java.nio.LongBuffer getLongs(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int count, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.nio.LongBuffer, java.lang.Integer> function, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.nio.LongBuffer, ? extends java.lang.Object> cleanup) {
            return null;
        }
        
        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         *         * a pointer, which is in turn returned by this function as a long. After running the function, [cleanup] is called.
         *         * For debugging, the call may be given a [name].
         */
        public final long getPointer(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.lwjgl.PointerBuffer, java.lang.Integer> function, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.lwjgl.PointerBuffer, ? extends java.lang.Object> cleanup) {
            return 0L;
        }
        
        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         *         * a [PointerBuffer], containing [count] elements, which is in turn returned by this function.
         *         * For debugging, the call may be given a [name].
         */
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.PointerBuffer getPointers(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int count, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.lwjgl.PointerBuffer, java.lang.Integer> function) {
            return null;
        }
        
        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         *         * a [PointerBuffer], containing [count] elements, which is in turn returned by this function. After running
         *         * the function, [cleanup] is run.
         *         * For debugging, the call may be given a [name].
         */
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.PointerBuffer getPointers(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int count, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.lwjgl.PointerBuffer, java.lang.Integer> function, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super org.lwjgl.PointerBuffer, ? extends java.lang.Object> cleanup) {
            return null;
        }
        
        /**
         * * Translates a Vulkan `VkResult` value given as [result] to a String describing the result.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String translate(int result) {
            return null;
        }
        
        /**
         * * Transforms a Vulkan [image] from the old image layout [oldImageLayout] to the new [newImageLayout], taking into account the
         *         * [VkImageSubresourceRange] given in [range]. This function can only be run within a [commandBuffer].
         */
        public final void setImageLayout(@org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkCommandBuffer commandBuffer, long image, int oldImageLayout, int newImageLayout, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkImageSubresourceRange range) {
        }
        
        /**
         * * Creates a new Vulkan queue on [device] with the queue family index [queueFamilyIndex] and returns the queue.
         */
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkQueue createDeviceQueue(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, int queueFamilyIndex) {
            return null;
        }
        
        /**
         * * Creates and returns a new command buffer on [device], associated with [commandPool]. By default, it'll be a primary
         *         * command buffer, that can be changed by setting [level] to [VK_COMMAND_BUFFER_LEVEL_SECONDARY].
         */
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkCommandBuffer newCommandBuffer(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, long commandPool, int level) {
            return null;
        }
        
        /**
         * * Creates and returns a new command buffer on [device], associated with [commandPool]. By default, it'll be a primary
         *         * command buffer, that can be changed by setting [level] to [VK_COMMAND_BUFFER_LEVEL_SECONDARY]. If recording should
         *         * be started automatically, set [autostart] to true.
         */
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkCommandBuffer newCommandBuffer(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, long commandPool, int level, boolean autostart) {
            return null;
        }
        
        /**
         * * Creates and returns a new descriptor set layout on [device] with one member of [type], which is by default a
         *         * dynamic uniform buffer. The [binding] and number of descriptors ([descriptorNum], [descriptorCount]) can be
         *         * customized,  as well as the shader stages to which the DSL should be visible ([shaderStages]).
         */
        public final long createDescriptorSetLayout(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, int type, int binding, int descriptorNum, int descriptorCount, int shaderStages) {
            return 0L;
        }
        
        /**
         * * Creates and returns a new descriptor set layout on [device] with the members declared in [types], which is
         *         * a [List] of a Pair of a type, associated with a count (e.g. Dynamic UBO to 1). The base binding can be set with [binding].
         *         * The shader stages to which the DSL should be visible can be set via [shaderStages].
         */
        public final long createDescriptorSetLayout(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
        java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> types, int binding, int shaderStages) {
            return 0L;
        }
        
        /**
         * * Creates and returns a dynamic descriptor set allocated on [device] from the pool [descriptorPool], conforming
         *         * to the existing descriptor set layout [descriptorSetLayout]. The number of bindings ([bindingCount]) and the
         *         * associated [buffer] have to be given.
         */
        public final long createDescriptorSetDynamic(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, long descriptorPool, long descriptorSetLayout, int bindingCount, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanBuffer buffer) {
            return 0L;
        }
        
        /**
         * * Updates a given _dynamic_ [descriptorSet] to use [buffer] from now on.
         */
        public final long updateDynamicDescriptorSetBuffer(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, long descriptorSet, int bindingCount, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanBuffer buffer) {
            return 0L;
        }
        
        /**
         * * Creates and returns a new descriptor set, allocated on [device] from [descriptorPool], conforming to existing
         *         * [descriptorSetLayout], a [bindingCount] needs to be given as well an an [ubo] to back the descriptor set.
         *         * The default [type] is [VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER].
         */
        public final long createDescriptorSet(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, long descriptorPool, long descriptorSetLayout, int bindingCount, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanUBO.UBODescriptor ubo, int type) {
            return 0L;
        }
        
        /**
         * * Creates and returns a new descriptor set for a framebuffer given as [target]. The set will be allocated on [device],
         *         * from [descriptorPool], and conforms to an existing descriptor set layout [descriptorSetLayout]. Additional
         *         * metadata about the framebuffer needs to be given via [rt], and a subset of the framebuffer can be selected
         *         * by setting [onlyFor] to the respective name of the attachment.
         */
        public final long createRenderTargetDescriptorSet(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanDevice device, long descriptorPool, long descriptorSetLayout, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends graphics.scenery.backends.RenderConfigReader.TargetFormat> rt, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.vulkan.VulkanFramebuffer target, @org.jetbrains.annotations.Nullable()
        java.lang.String onlyFor) {
            return 0L;
        }
        
        private Companion() {
            super();
        }
    }
}