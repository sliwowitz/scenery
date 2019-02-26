package graphics.scenery.backends.vulkan;

/**
 * * Vulkan Pipeline class.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010V\u001a\u00020W2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020K0YJ\b\u0010Z\u001a\u00020WH\u0016J<\u0010[\u001a\u00020W2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\n\b\u0002\u0010d\u001a\u0004\u0018\u000108\u00f8\u0001\u0000\u00a2\u0006\u0004\be\u0010fJ\u000e\u0010g\u001a\u0002092\u0006\u0010h\u001a\u000208J\u0018\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180j0YJ\b\u0010k\u001a\u00020\u0017H\u0016J\f\u0010l\u001a\u00020m*\u000208H\u0002R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020$\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u000203\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R&\u00106\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020907X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R&\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020B0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001a\"\u0004\bD\u0010\u001cR\u0011\u0010E\u001a\u00020F\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020O\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010R\u001a\u00020S8F\u00a2\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006n"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanPipeline;", "Ljava/lang/AutoCloseable;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "pipelineCache", "Lvkk/entities/VkPipelineCache;", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "colorBlendState", "Lorg/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo;", "getColorBlendState", "()Lorg/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo;", "colorWriteMask", "Lorg/lwjgl/vulkan/VkPipelineColorBlendAttachmentState;", "getColorWriteMask", "()Lorg/lwjgl/vulkan/VkPipelineColorBlendAttachmentState;", "depthStencilState", "Lorg/lwjgl/vulkan/VkPipelineDepthStencilStateCreateInfo;", "getDepthStencilState", "()Lorg/lwjgl/vulkan/VkPipelineDepthStencilStateCreateInfo;", "setDepthStencilState", "(Lorg/lwjgl/vulkan/VkPipelineDepthStencilStateCreateInfo;)V", "descriptorSpecs", "Ljava/util/LinkedHashMap;", "", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule$UBOSpec;", "getDescriptorSpecs", "()Ljava/util/LinkedHashMap;", "setDescriptorSpecs", "(Ljava/util/LinkedHashMap;)V", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "dynamicState", "Lorg/lwjgl/vulkan/VkPipelineDynamicStateCreateInfo;", "getDynamicState", "()Lorg/lwjgl/vulkan/VkPipelineDynamicStateCreateInfo;", "dynamicStates", "Lvkk/entities/VkDynamicStateBuffer;", "getDynamicStates", "()Ljava/nio/IntBuffer;", "Ljava/nio/IntBuffer;", "inputAssemblyState", "Lorg/lwjgl/vulkan/VkPipelineInputAssemblyStateCreateInfo;", "getInputAssemblyState", "()Lorg/lwjgl/vulkan/VkPipelineInputAssemblyStateCreateInfo;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "multisampleState", "Lorg/lwjgl/vulkan/VkPipelineMultisampleStateCreateInfo;", "getMultisampleState", "()Lorg/lwjgl/vulkan/VkPipelineMultisampleStateCreateInfo;", "pipeline", "Ljava/util/HashMap;", "Lgraphics/scenery/GeometryType;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$Pipeline;", "getPipeline", "()Ljava/util/HashMap;", "setPipeline", "(Ljava/util/HashMap;)V", "getPipelineCache", "()J", "J", "pushConstantSpecs", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule$PushConstantSpec;", "getPushConstantSpecs", "setPushConstantSpecs", "rasterizationState", "Lorg/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo;", "getRasterizationState", "()Lorg/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo;", "shaderStages", "Ljava/util/ArrayList;", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule;", "getShaderStages", "()Ljava/util/ArrayList;", "viewportState", "Lorg/lwjgl/vulkan/VkPipelineViewportStateCreateInfo;", "getViewportState", "()Lorg/lwjgl/vulkan/VkPipelineViewportStateCreateInfo;", "vkDev", "Lorg/lwjgl/vulkan/VkDevice;", "getVkDev", "()Lorg/lwjgl/vulkan/VkDevice;", "addShaderStages", "", "shaderModules", "", "close", "createPipelines", "renderpass", "Lgraphics/scenery/backends/vulkan/VulkanRenderpass;", "vulkanRenderpass", "Lvkk/entities/VkRenderPass;", "vi", "Lorg/lwjgl/vulkan/VkPipelineVertexInputStateCreateInfo;", "descriptorSetLayouts", "Lvkk/entities/VkDescriptorSetLayoutBuffer;", "onlyForTopology", "createPipelines-eVLyIvQ", "(Lgraphics/scenery/backends/vulkan/VulkanRenderpass;JLorg/lwjgl/vulkan/VkPipelineVertexInputStateCreateInfo;Ljava/nio/LongBuffer;Lgraphics/scenery/GeometryType;)V", "getPipelineForGeometryType", "type", "orderedDescriptorSpecs", "", "toString", "asVulkanTopology", "Lvkk/VkPrimitiveTopology;", "scenery"})
public final class VulkanPipeline implements java.lang.AutoCloseable {
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo inputAssemblyState = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo rasterizationState = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState colorWriteMask = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo colorBlendState = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo viewportState = null;
    @org.jetbrains.annotations.NotNull()
    private final java.nio.IntBuffer dynamicStates = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo dynamicState = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo multisampleState = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<graphics.scenery.backends.vulkan.VulkanShaderModule> shaderStages = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    private final long pipelineCache = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<graphics.scenery.GeometryType, graphics.scenery.backends.vulkan.VulkanRenderer.Pipeline> pipeline;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOSpec> descriptorSpecs;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.PushConstantSpec> pushConstantSpecs;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo depthStencilState;

    private VulkanPipeline(graphics.scenery.backends.vulkan.VulkanDevice device, long pipelineCache) {
        super();
    }

    private final org.slf4j.Logger getLogger() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<graphics.scenery.GeometryType, graphics.scenery.backends.vulkan.VulkanRenderer.Pipeline> getPipeline() {
        return null;
    }

    public final void setPipeline(@org.jetbrains.annotations.NotNull()
                                      java.util.HashMap<graphics.scenery.GeometryType, graphics.scenery.backends.vulkan.VulkanRenderer.Pipeline> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOSpec> getDescriptorSpecs() {
        return null;
    }

    public final void setDescriptorSpecs(@org.jetbrains.annotations.NotNull()
                                             java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOSpec> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.PushConstantSpec> getPushConstantSpecs() {
        return null;
    }

    public final void setPushConstantSpecs(@org.jetbrains.annotations.NotNull()
                                               java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.PushConstantSpec> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo getInputAssemblyState() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo getRasterizationState() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState getColorWriteMask() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo getColorBlendState() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo getViewportState() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.nio.IntBuffer getDynamicStates() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo getDynamicState() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo getDepthStencilState() {
        return null;
    }

    public final void setDepthStencilState(@org.jetbrains.annotations.NotNull()
                                               org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo getMultisampleState() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<graphics.scenery.backends.vulkan.VulkanShaderModule> getShaderStages() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkDevice getVkDev() {
        return null;
    }

    public final void addShaderStages(@org.jetbrains.annotations.NotNull()
                                          java.util.List<? extends graphics.scenery.backends.vulkan.VulkanShaderModule> shaderModules) {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanRenderer.Pipeline getPipelineForGeometryType(@org.jetbrains.annotations.NotNull()
                                                                                                         graphics.scenery.GeometryType type) {
        return null;
    }

    private final vkk.VkPrimitiveTopology asVulkanTopology(@org.jetbrains.annotations.NotNull()
                                                               graphics.scenery.GeometryType $receiver) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.Map.Entry<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOSpec>> orderedDescriptorSpecs() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }

    @java.lang.Override()
    public void close() {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }

    public final long getPipelineCache() {
        return 0L;
    }
}
