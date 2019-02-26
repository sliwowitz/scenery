package graphics.scenery.backends.vulkan;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u001a&\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010\u001a.\u0010\u0012\u001a\u00020\u0013*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u0010\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u001a$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\u0004\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"vkDynamicStateBufferOf", "Lvkk/entities/VkDynamicStateBuffer;", "dynamicState", "Lvkk/VkDynamicState;", "(Lvkk/VkDynamicState;)Ljava/nio/IntBuffer;", "dynamicState0", "dynamicState1", "(Lvkk/VkDynamicState;Lvkk/VkDynamicState;)Ljava/nio/IntBuffer;", "dynamicState2", "(Lvkk/VkDynamicState;Lvkk/VkDynamicState;Lvkk/VkDynamicState;)Ljava/nio/IntBuffer;", "AttachmentDescription", "Lorg/lwjgl/vulkan/VkAttachmentDescription$Buffer;", "Lvkk/vk;", "size", "", "init", "Lkotlin/Function1;", "Lorg/lwjgl/vulkan/VkAttachmentDescription;", "ImageViewBuffer", "Lvkk/entities/VkImageViewBuffer;", "Lvkk/entities/VkImageView;", "(Lvkk/vk;ILkotlin/jvm/functions/Function1;)Ljava/nio/LongBuffer;", "createDevice", "Lkotlin/Pair;", "Lorg/lwjgl/vulkan/VkDevice;", "Lvkk/VkResult;", "Lorg/lwjgl/vulkan/VkPhysicalDevice;", "createInfo", "Lorg/lwjgl/vulkan/VkDeviceCreateInfo;", "scenery"})
public final class TmpKt {

    @org.jetbrains.annotations.NotNull()
    public static final kotlin.Pair<org.lwjgl.vulkan.VkDevice, vkk.VkResult> createDevice(@org.jetbrains.annotations.NotNull()
                                                                                              org.lwjgl.vulkan.VkPhysicalDevice $receiver, @org.jetbrains.annotations.NotNull()
                                                                                              org.lwjgl.vulkan.VkDeviceCreateInfo createInfo) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public static final org.lwjgl.vulkan.VkAttachmentDescription.Buffer AttachmentDescription(@org.jetbrains.annotations.NotNull()
                                                                                                  vkk.vk $receiver, int size, @org.jetbrains.annotations.NotNull()
                                                                                                  kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends org.lwjgl.vulkan.VkAttachmentDescription> init) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public static final java.nio.LongBuffer ImageViewBuffer(@org.jetbrains.annotations.NotNull()
                                                                vkk.vk $receiver, int size, @org.jetbrains.annotations.NotNull()
                                                                kotlin.jvm.functions.Function1<? super java.lang.Integer, vkk.entities.VkImageView> init) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public static final java.nio.IntBuffer vkDynamicStateBufferOf(@org.jetbrains.annotations.NotNull()
                                                                      vkk.VkDynamicState dynamicState) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public static final java.nio.IntBuffer vkDynamicStateBufferOf(@org.jetbrains.annotations.NotNull()
                                                                      vkk.VkDynamicState dynamicState0, @org.jetbrains.annotations.NotNull()
                                                                      vkk.VkDynamicState dynamicState1) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public static final java.nio.IntBuffer vkDynamicStateBufferOf(@org.jetbrains.annotations.NotNull()
                                                                      vkk.VkDynamicState dynamicState0, @org.jetbrains.annotations.NotNull()
                                                                      vkk.VkDynamicState dynamicState1, @org.jetbrains.annotations.NotNull()
                                                                      vkk.VkDynamicState dynamicState2) {
        return null;
    }
}
