package graphics.scenery.backends.vulkan;

/**
 * * VU - Vulkan Utils
 * *
 * * A collection of convenience methods for various Vulkan-related tasks
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0004"}, d2 = {"Lgraphics/scenery/backends/vulkan/VU;", "", "()V", "Companion", "scenery"})
public final class VU {
    public static final graphics.scenery.backends.vulkan.VU.Companion Companion = null;
    private static final kotlin.Lazy logger$delegate = null;

    public VU() {
        super();
    }

    /**
     * * Companion object for [VU] to access methods statically.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ec\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJB\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 \u00f8\u0001\u0000\u00a2\u0006\u0004\b!\u0010\"JH\u0010#\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0&0%2\b\b\u0002\u0010\'\u001a\u00020\u000e2\f\b\u0002\u0010(\u001a\u00060\u000ej\u0002`)\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*JL\u0010#\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\'\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000e2\f\b\u0002\u0010(\u001a\u00060\u000ej\u0002`)\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000eJP\u00103\u001a\u0002042\u0006\u00100\u001a\u0002012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208062\u0006\u00109\u001a\u00020:2\n\b\u0002\u0010;\u001a\u0004\u0018\u000107\u00f8\u0001\u0000\u00a2\u0006\u0004\b<\u0010=J*\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u0002072\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u000e0A\u00a2\u0006\u0002\bCH\u0086\bJ2\u0010D\u001a\u00020B2\u0006\u0010?\u001a\u0002072\u0006\u0010E\u001a\u00020\u000e2\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u000e0A\u00a2\u0006\u0002\bCH\u0086\bJC\u0010F\u001a\u0002042\u0006\u0010?\u001a\u0002072\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u000e0A\u00a2\u0006\u0002\bC2\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00010A\u00a2\u0006\u0002\bCH\u0086\bJK\u0010I\u001a\u00020G2\u0006\u0010?\u001a\u0002072\u0006\u0010E\u001a\u00020\u000e2\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u000e0A\u00a2\u0006\u0002\bC2\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00010A\u00a2\u0006\u0002\bCH\u0086\bJC\u0010J\u001a\u0002042\u0006\u0010?\u001a\u0002072\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u000e0A\u00a2\u0006\u0002\bC2\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00010A\u00a2\u0006\u0002\bCH\u0086\bJ2\u0010L\u001a\u00020K2\u0006\u0010?\u001a\u0002072\u0006\u0010E\u001a\u00020\u000e2\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u000e0A\u00a2\u0006\u0002\bCH\u0086\bJK\u0010L\u001a\u00020K2\u0006\u0010?\u001a\u0002072\u0006\u0010E\u001a\u00020\u000e2\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u000e0A\u00a2\u0006\u0002\bC2\u0017\u0010H\u001a\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00010A\u00a2\u0006\u0002\bCH\u0086\bJ4\u0010M\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020S\u00f8\u0001\u0000\u00a2\u0006\u0004\bT\u0010UJ-\u0010V\u001a\u00020\n2\u0006\u0010?\u001a\u0002072\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0W2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00010WH\u0086\bJ/\u0010V\u001a\u00020\n2\u0006\u0010?\u001a\u0002072\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0W2\u000e\b\u0002\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000e0%H\u0086\bJ<\u0010Y\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010Z\u001a\u00020[2\n\u0010\\\u001a\u00060\u000ej\u0002`]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020_\u00f8\u0001\u0000\u00a2\u0006\u0004\ba\u0010bJ8\u0010Y\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010Z\u001a\u00020[2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020_2\u0006\u0010c\u001a\u00020d\u00f8\u0001\u0000\u00a2\u0006\u0004\be\u0010fJ\u000e\u0010g\u001a\u0002072\u0006\u0010h\u001a\u00020\u000eJ&\u0010i\u001a\u0002042\u0006\u00100\u001a\u0002012\u0006\u0010j\u001a\u0002042\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006k"}, d2 = {"Lgraphics/scenery/backends/vulkan/VU$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "beginCommandBuffer", "", "commandBuffer", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "flags", "", "createDescriptorSet", "Lvkk/entities/VkDescriptorSet;", "vkDev", "Lorg/lwjgl/vulkan/VkDevice;", "descriptorPool", "Lvkk/entities/VkDescriptorPool;", "descriptorSetLayout", "Lvkk/entities/VkDescriptorSetLayout;", "bindingCount", "ubo", "Lgraphics/scenery/backends/vulkan/VulkanUBO$UBODescriptor;", "type", "Lvkk/VkDescriptorType;", "createDescriptorSet-D4l8xMw", "(Lorg/lwjgl/vulkan/VkDevice;JJILgraphics/scenery/backends/vulkan/VulkanUBO$UBODescriptor;Lvkk/VkDescriptorType;)J", "createDescriptorSetDynamic", "buffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "createDescriptorSetDynamic-4fYo4xE", "(Lorg/lwjgl/vulkan/VkDevice;JJILgraphics/scenery/backends/vulkan/VulkanBuffer;)J", "createDescriptorSetLayout", "types", "", "Lkotlin/Pair;", "binding", "shaderStages", "Lvkk/VkShaderStageFlags;", "(Lorg/lwjgl/vulkan/VkDevice;Ljava/util/List;II)J", "descriptorNum", "descriptorCount", "(Lorg/lwjgl/vulkan/VkDevice;Lvkk/VkDescriptorType;IIII)J", "createDeviceQueue", "Lorg/lwjgl/vulkan/VkQueue;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "queueFamilyIndex", "createRenderTargetDescriptorSet", "", "rt", "", "", "Lgraphics/scenery/backends/RenderConfigReader$TargetFormat;", "target", "Lgraphics/scenery/backends/vulkan/VulkanFramebuffer;", "onlyFor", "createRenderTargetDescriptorSet-27Ifle8", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;JJLjava/util/Map;Lgraphics/scenery/backends/vulkan/VulkanFramebuffer;Ljava/lang/String;)J", "getInt", "name", "function", "Lkotlin/Function1;", "Ljava/nio/IntBuffer;", "Lkotlin/ExtensionFunctionType;", "getInts", "count", "getLong", "Ljava/nio/LongBuffer;", "cleanup", "getLongs", "getPointer", "Lorg/lwjgl/PointerBuffer;", "getPointers", "newCommandBuffer", "commandPool", "Lvkk/entities/VkCommandPool;", "level", "Lvkk/VkCommandBufferLevel;", "autostart", "", "newCommandBuffer-PkqghhY", "(Lorg/lwjgl/vulkan/VkDevice;JLvkk/VkCommandBufferLevel;Z)Lorg/lwjgl/vulkan/VkCommandBuffer;", "run", "Lkotlin/Function0;", "allowedResults", "setImageLayout", "image", "Lvkk/entities/VkImage;", "aspectMask", "Lvkk/VkImageAspectFlags;", "oldImageLayout", "Lvkk/VkImageLayout;", "newImageLayout", "setImageLayout-JIFkzks", "(Lorg/lwjgl/vulkan/VkCommandBuffer;JILvkk/VkImageLayout;Lvkk/VkImageLayout;)V", "range", "Lorg/lwjgl/vulkan/VkImageSubresourceRange;", "setImageLayout-T9lObMQ", "(Lorg/lwjgl/vulkan/VkCommandBuffer;JLvkk/VkImageLayout;Lvkk/VkImageLayout;Lorg/lwjgl/vulkan/VkImageSubresourceRange;)V", "translate", "result", "updateDynamicDescriptorSetBuffer", "descriptorSet", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }

        private final org.slf4j.Logger getLogger() {
            return null;
        }

        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. Allowed error codes
         * * can be set in [allowedResults], for debugging, the call may be given a [name].
         */
        public final void run(@org.jetbrains.annotations.NotNull()
                                  java.lang.String name, @org.jetbrains.annotations.NotNull()
                                  kotlin.jvm.functions.Function0<java.lang.Integer> function, @org.jetbrains.annotations.NotNull()
                                  java.util.List<java.lang.Integer> allowedResults) {
        }

        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. After the call, [cleanup] is run.
         * * For debugging, the call may be given a [name].
         */
        public final void run(@org.jetbrains.annotations.NotNull()
                                  java.lang.String name, @org.jetbrains.annotations.NotNull()
                                  kotlin.jvm.functions.Function0<java.lang.Integer> function, @org.jetbrains.annotations.NotNull()
                                  kotlin.jvm.functions.Function0<? extends java.lang.Object> cleanup) {
        }

        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         * * an int, which is in turn returned by this function.
         * * For debugging, the call may be given a [name].
         */
        public final int getInt(@org.jetbrains.annotations.NotNull()
                                    java.lang.String name, @org.jetbrains.annotations.NotNull()
                                    kotlin.jvm.functions.Function1<? super java.nio.IntBuffer, java.lang.Integer> function) {
            return 0;
        }

        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         * * an [IntBuffer], containing [count] elements, which is in turn returned by this function.
         * * For debugging, the call may be given a [name].
         */
        @org.jetbrains.annotations.NotNull()
        public final java.nio.IntBuffer getInts(@org.jetbrains.annotations.NotNull()
                                                    java.lang.String name, int count, @org.jetbrains.annotations.NotNull()
                                                    kotlin.jvm.functions.Function1<? super java.nio.IntBuffer, java.lang.Integer> function) {
            return null;
        }

        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         * * a long, which is in turn returned by this function. After the function has been run, [cleanup] is called.
         * * For debugging, the call may be given a [name].
         */
        public final long getLong(@org.jetbrains.annotations.NotNull()
                                      java.lang.String name, @org.jetbrains.annotations.NotNull()
                                      kotlin.jvm.functions.Function1<? super java.nio.LongBuffer, java.lang.Integer> function, @org.jetbrains.annotations.NotNull()
                                      kotlin.jvm.functions.Function1<? super java.nio.LongBuffer, ? extends java.lang.Object> cleanup) {
            return 0L;
        }

        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         * * an [LongBuffer], containing [count] elements, which is in turn returned by this function. After running the
         * * function, [cleanup] is called.
         * * For debugging, the call may be given a [name].
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
         * * a pointer, which is in turn returned by this function as a long. After running the function, [cleanup] is called.
         * * For debugging, the call may be given a [name].
         */
        public final long getPointer(@org.jetbrains.annotations.NotNull()
                                         java.lang.String name, @org.jetbrains.annotations.NotNull()
                                         kotlin.jvm.functions.Function1<? super org.lwjgl.PointerBuffer, java.lang.Integer> function, @org.jetbrains.annotations.NotNull()
                                         kotlin.jvm.functions.Function1<? super org.lwjgl.PointerBuffer, ? extends java.lang.Object> cleanup) {
            return 0L;
        }

        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         * * a [PointerBuffer], containing [count] elements, which is in turn returned by this function.
         * * For debugging, the call may be given a [name].
         */
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.PointerBuffer getPointers(@org.jetbrains.annotations.NotNull()
                                                             java.lang.String name, int count, @org.jetbrains.annotations.NotNull()
                                                             kotlin.jvm.functions.Function1<? super org.lwjgl.PointerBuffer, java.lang.Integer> function) {
            return null;
        }

        /**
         * * Runs a lambda [function] containing a Vulkan call, and checks it for errors. The Vulkan call will return
         * * a [PointerBuffer], containing [count] elements, which is in turn returned by this function. After running
         * * the function, [cleanup] is run.
         * * For debugging, the call may be given a [name].
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
         * * Creates a new Vulkan queue on [device] with the queue family index [queueFamilyIndex] and returns the queue.
         */
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkQueue createDeviceQueue(@org.jetbrains.annotations.NotNull()
                                                                    graphics.scenery.backends.vulkan.VulkanDevice device, int queueFamilyIndex) {
            return null;
        }

        /**
         * * Starts recording of [commandBuffer]. Usually called from [newCommandBuffer]. Additional [flags] may be set,
         * * e.g. for creating resettable or simultaneous use buffer.
         */
        public final void beginCommandBuffer(@org.jetbrains.annotations.NotNull()
                                                 org.lwjgl.vulkan.VkCommandBuffer commandBuffer, int flags) {
        }

        /**
         * * Creates and returns a new descriptor set layout on [device] with one member of [type], which is by default a
         * * dynamic uniform buffer. The [binding] and number of descriptors ([descriptorNum], [descriptorCount]) can be
         * * customized,  as well as the shader stages to which the DSL should be visible ([shaderStages]).
         */
        public final long createDescriptorSetLayout(@org.jetbrains.annotations.NotNull()
                                                        org.lwjgl.vulkan.VkDevice vkDev, @org.jetbrains.annotations.NotNull()
                                                        vkk.VkDescriptorType type, int binding, int descriptorNum, int descriptorCount, int shaderStages) {
            return 0L;
        }

        /**
         * * Creates and returns a new descriptor set layout on [vkDev] with the members declared in [types], which is
         * * a [List] of a Pair of a type, associated with a count (e.g. Dynamic UBO to 1). The base binding can be set with [binding].
         * * The shader stages to which the DSL should be visible can be set via [shaderStages].
         */
        public final long createDescriptorSetLayout(@org.jetbrains.annotations.NotNull()
                                                        org.lwjgl.vulkan.VkDevice vkDev, @org.jetbrains.annotations.NotNull()
                                                        java.util.List<? extends kotlin.Pair<? extends vkk.VkDescriptorType, java.lang.Integer>> types, int binding, int shaderStages) {
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
    }
}
