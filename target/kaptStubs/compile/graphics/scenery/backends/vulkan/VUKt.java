package graphics.scenery.backends.vulkan;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00c6\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000b\u0010\f\u001a>\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\b2\f\b\u0002\u0010\u0012\u001a\u00060\bj\u0002`\u0013\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u001aD\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f0\u00162\b\b\u0002\u0010\u0011\u001a\u00020\b2\f\b\u0002\u0010\u0012\u001a\u00060\bj\u0002`\u0013\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u001a\u0019\u0010\u0018\u001a\u00020\u0019*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000f\u00f8\u0001\u0000\u001a\n\u0010\u001c\u001a\u00020\u0019*\u00020\u001a\u001a|\u0010\u001c\u001a\u00020\u0019*\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001a\u00020$\u00f8\u0001\u0000\u00a2\u0006\u0004\b.\u0010/\u001a2\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000f*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u00101\u001a\u000202\u00f8\u0001\u0000\u00a2\u0006\u0004\b3\u00104\u001aA\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000f*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000f2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001906\u00a2\u0006\u0002\b7H\u0086\b\u00f8\u0001\u0000\u001a8\u00108\u001a\u00020\u0019*\u00020\u001a2\u0006\u00109\u001a\u00020:2\n\u0010;\u001a\u00060\bj\u0002`<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>\u00f8\u0001\u0000\u00a2\u0006\u0004\b@\u0010A\u001an\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000f*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001a\u00020$\u00f8\u0001\u0000\u00a2\u0006\u0004\bC\u0010D\u001aV\u0010B\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001a\u00020$\u00f8\u0001\u0000\u00a2\u0006\u0004\bE\u0010F\u001a\n\u0010G\u001a\u00020H*\u00020I\u001a\n\u0010G\u001a\u00020H*\u00020 \u001a\n\u0010J\u001a\u00020K*\u00020L\u001a\n\u0010J\u001a\u00020M*\u00020N\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006O"}, d2 = {"createDescriptorSetDynamic", "Lvkk/entities/VkDescriptorSet;", "Lorg/lwjgl/vulkan/VkDevice;", "descriptorPool", "Lvkk/entities/VkDescriptorPool;", "descriptorSetLayout", "Lvkk/entities/VkDescriptorSetLayout;", "bindingCount", "", "buffer", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "createDescriptorSetDynamic-4fYo4xE", "(Lorg/lwjgl/vulkan/VkDevice;JJILgraphics/scenery/backends/vulkan/VulkanBuffer;)J", "createDescriptorSetLayout", "type", "Lkotlin/Pair;", "Lvkk/VkDescriptorType;", "binding", "shaderStages", "Lvkk/VkShaderStageFlags;", "(Lorg/lwjgl/vulkan/VkDevice;Lkotlin/Pair;II)J", "types", "", "(Lorg/lwjgl/vulkan/VkDevice;Ljava/util/List;II)J", "deallocate", "", "Lorg/lwjgl/vulkan/VkCommandBuffer;", "Lvkk/entities/VkCommandPool;", "endCommandBuffer", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "commandPool", "", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "flush", "", "dealloc", "submitInfoPNext", "Lorg/lwjgl/system/Pointer;", "signalSemaphores", "Lvkk/entities/VkSemaphoreBuffer;", "waitSemaphores", "waitDstStageMask", "Ljava/nio/IntBuffer;", "block", "endCommandBuffer-Z_szyh4", "(Lorg/lwjgl/vulkan/VkCommandBuffer;Lgraphics/scenery/backends/vulkan/VulkanDevice;JLorg/lwjgl/vulkan/VkQueue;ZZLorg/lwjgl/system/Pointer;Ljava/nio/LongBuffer;Ljava/nio/LongBuffer;Ljava/nio/IntBuffer;Z)V", "newCommandBuffer", "level", "Lvkk/VkCommandBufferLevel;", "newCommandBuffer-aVWM3P4", "(Lorg/lwjgl/vulkan/VkDevice;JLvkk/VkCommandBufferLevel;)Lkotlin/Pair;", "record", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "setImageLayout", "image", "Lvkk/entities/VkImage;", "aspectMask", "Lvkk/VkImageAspectFlags;", "oldImageLayout", "Lvkk/VkImageLayout;", "newImageLayout", "setImageLayout-JIFkzks", "(Lorg/lwjgl/vulkan/VkCommandBuffer;JILvkk/VkImageLayout;Lvkk/VkImageLayout;)V", "submit", "submit--F0_hBs", "(Lkotlin/Pair;Lorg/lwjgl/vulkan/VkQueue;Lorg/lwjgl/system/Pointer;Ljava/nio/LongBuffer;Ljava/nio/LongBuffer;Ljava/nio/IntBuffer;Z)Lkotlin/Pair;", "submit-J-XRPnI", "(Lorg/lwjgl/vulkan/VkCommandBuffer;Lorg/lwjgl/vulkan/VkQueue;Lorg/lwjgl/system/Pointer;Ljava/nio/LongBuffer;Ljava/nio/LongBuffer;Ljava/nio/IntBuffer;Z)Lorg/lwjgl/vulkan/VkCommandBuffer;", "toHexString", "", "Ljava/math/BigInteger;", "toVulkan", "Lvkk/VkBlendFactor;", "Lgraphics/scenery/Blending$BlendFactor;", "Lvkk/VkBlendOp;", "Lgraphics/scenery/Blending$BlendOp;", "scenery"})
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
     * begin .. end
     */
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.Pair<org.lwjgl.vulkan.VkCommandBuffer, vkk.entities.VkCommandPool> record(@org.jetbrains.annotations.NotNull()
                                                                                                             kotlin.Pair<? extends org.lwjgl.vulkan.VkCommandBuffer, vkk.entities.VkCommandPool> $receiver, @org.jetbrains.annotations.NotNull()
                                                                                                             kotlin.jvm.functions.Function1<? super org.lwjgl.vulkan.VkCommandBuffer, kotlin.Unit> block) {
        return null;
    }

    public static final void deallocate(@org.jetbrains.annotations.NotNull()
                                            kotlin.Pair<? extends org.lwjgl.vulkan.VkCommandBuffer, vkk.entities.VkCommandPool> $receiver) {
    }

    /**
     * * Ends the recording of a command buffer.
     */
    public static final void endCommandBuffer(@org.jetbrains.annotations.NotNull()
                                                  org.lwjgl.vulkan.VkCommandBuffer $receiver) {
    }

    /**
     * * Converts a [Blending.BlendFactor] to a Vulkan-internal integer-based descriptor.
     */
    @org.jetbrains.annotations.NotNull()
    public static final vkk.VkBlendFactor toVulkan(@org.jetbrains.annotations.NotNull()
                                                       graphics.scenery.Blending.BlendFactor $receiver) {
        return null;
    }

    /**
     * * Converts a [Blending.BlendOp] to a Vulkan-intenal integer-based descriptor.
     */
    @org.jetbrains.annotations.NotNull()
    public static final vkk.VkBlendOp toVulkan(@org.jetbrains.annotations.NotNull()
                                                   graphics.scenery.Blending.BlendOp $receiver) {
        return null;
    }

    /**
     * * Creates and returns a new descriptor set layout on [vkDev] with the members declared in [type], which is
     * * a [List] of a Pair of a type, associated with a count (e.g. Dynamic UBO to 1). The base binding can be set with [binding].
     * * The shader stages to which the DSL should be visible can be set via [shaderStages].
     */
    public static final long createDescriptorSetLayout(@org.jetbrains.annotations.NotNull()
                                                           org.lwjgl.vulkan.VkDevice $receiver, @org.jetbrains.annotations.NotNull()
                                                           kotlin.Pair<? extends vkk.VkDescriptorType, java.lang.Integer> type, int binding, int shaderStages) {
        return 0L;
    }

    /**
     * * Creates and returns a new descriptor set layout on [vkDev] with the members declared in [types], which is
     * * a [List] of a Pair of a type, associated with a count (e.g. Dynamic UBO to 1). The base binding can be set with [binding].
     * * The shader stages to which the DSL should be visible can be set via [shaderStages].
     */
    public static final long createDescriptorSetLayout(@org.jetbrains.annotations.NotNull()
                                                           org.lwjgl.vulkan.VkDevice $receiver, @org.jetbrains.annotations.NotNull()
                                                           java.util.List<? extends kotlin.Pair<? extends vkk.VkDescriptorType, java.lang.Integer>> types, int binding, int shaderStages) {
        return 0L;
    }
}
