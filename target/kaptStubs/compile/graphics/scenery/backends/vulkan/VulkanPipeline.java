package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Vulkan Pipeline class.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\'\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010Q\u001a\u00020R2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020J0TJ\b\u0010U\u001a\u00020RH\u0016J8\u0010V\u001a\u00020R2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020[2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00050T2\n\b\u0002\u0010]\u001a\u0004\u0018\u000107J\u000e\u0010^\u001a\u0002082\u0006\u0010_\u001a\u000207J\u0018\u0010`\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180a0TJ\b\u0010b\u001a\u00020\u0017H\u0016J\f\u0010c\u001a\u00020d*\u000207H\u0002R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020.\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u000202\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R&\u00105\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020806X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020A0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\u001cR\u0011\u0010D\u001a\u00020E\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010M\u001a\u00020N\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010P\u00a8\u0006e"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanPipeline;", "Ljava/lang/AutoCloseable;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "pipelineCache", "", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Ljava/lang/Long;)V", "colorBlendState", "Lorg/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo;", "getColorBlendState", "()Lorg/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo;", "colorWriteMask", "Lorg/lwjgl/vulkan/VkPipelineColorBlendAttachmentState$Buffer;", "getColorWriteMask", "()Lorg/lwjgl/vulkan/VkPipelineColorBlendAttachmentState$Buffer;", "depthStencilState", "Lorg/lwjgl/vulkan/VkPipelineDepthStencilStateCreateInfo;", "getDepthStencilState", "()Lorg/lwjgl/vulkan/VkPipelineDepthStencilStateCreateInfo;", "setDepthStencilState", "(Lorg/lwjgl/vulkan/VkPipelineDepthStencilStateCreateInfo;)V", "descriptorSpecs", "Ljava/util/LinkedHashMap;", "", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule$UBOSpec;", "getDescriptorSpecs", "()Ljava/util/LinkedHashMap;", "setDescriptorSpecs", "(Ljava/util/LinkedHashMap;)V", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "dynamicState", "Lorg/lwjgl/vulkan/VkPipelineDynamicStateCreateInfo;", "getDynamicState", "()Lorg/lwjgl/vulkan/VkPipelineDynamicStateCreateInfo;", "inputAssemblyState", "Lorg/lwjgl/vulkan/VkPipelineInputAssemblyStateCreateInfo;", "getInputAssemblyState", "()Lorg/lwjgl/vulkan/VkPipelineInputAssemblyStateCreateInfo;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "multisampleState", "Lorg/lwjgl/vulkan/VkPipelineMultisampleStateCreateInfo;", "getMultisampleState", "()Lorg/lwjgl/vulkan/VkPipelineMultisampleStateCreateInfo;", "pDynamicStates", "Ljava/nio/IntBuffer;", "getPDynamicStates", "()Ljava/nio/IntBuffer;", "pipeline", "Ljava/util/HashMap;", "Lgraphics/scenery/GeometryType;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$Pipeline;", "getPipeline", "()Ljava/util/HashMap;", "setPipeline", "(Ljava/util/HashMap;)V", "getPipelineCache", "()Ljava/lang/Long;", "Ljava/lang/Long;", "pushConstantSpecs", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule$PushConstantSpec;", "getPushConstantSpecs", "setPushConstantSpecs", "rasterizationState", "Lorg/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo;", "getRasterizationState", "()Lorg/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo;", "shaderStages", "Ljava/util/ArrayList;", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule;", "getShaderStages", "()Ljava/util/ArrayList;", "viewportState", "Lorg/lwjgl/vulkan/VkPipelineViewportStateCreateInfo;", "getViewportState", "()Lorg/lwjgl/vulkan/VkPipelineViewportStateCreateInfo;", "addShaderStages", "", "shaderModules", "", "close", "createPipelines", "renderpass", "Lgraphics/scenery/backends/vulkan/VulkanRenderpass;", "vulkanRenderpass", "vi", "Lorg/lwjgl/vulkan/VkPipelineVertexInputStateCreateInfo;", "descriptorSetLayouts", "onlyForTopology", "getPipelineForGeometryType", "type", "orderedDescriptorSpecs", "", "toString", "asVulkanTopology", "", "scenery"})
public final class VulkanPipeline implements java.lang.AutoCloseable {
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<graphics.scenery.GeometryType, graphics.scenery.backends.vulkan.VulkanRenderer.Pipeline> pipeline;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOSpec> descriptorSpecs;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.PushConstantSpec> pushConstantSpecs;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo inputAssemblyState = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo rasterizationState = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.Buffer colorWriteMask = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo colorBlendState = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo viewportState = null;
    @org.jetbrains.annotations.NotNull()
    private final java.nio.IntBuffer pDynamicStates = null;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo dynamicState = null;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo depthStencilState;
    @org.jetbrains.annotations.NotNull()
    private final org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo multisampleState = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<graphics.scenery.backends.vulkan.VulkanShaderModule> shaderStages = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long pipelineCache = null;
    
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
    public final org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.Buffer getColorWriteMask() {
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
    public final java.nio.IntBuffer getPDynamicStates() {
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
    
    public final void addShaderStages(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends graphics.scenery.backends.vulkan.VulkanShaderModule> shaderModules) {
    }
    
    public final void createPipelines(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanRenderpass renderpass, long vulkanRenderpass, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo vi, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> descriptorSetLayouts, @org.jetbrains.annotations.Nullable()
    graphics.scenery.GeometryType onlyForTopology) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanRenderer.Pipeline getPipelineForGeometryType(@org.jetbrains.annotations.NotNull()
    graphics.scenery.GeometryType type) {
        return null;
    }
    
    private final int asVulkanTopology(@org.jetbrains.annotations.NotNull()
    graphics.scenery.GeometryType $receiver) {
        return 0;
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPipelineCache() {
        return null;
    }
    
    public VulkanPipeline(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.Nullable()
    java.lang.Long pipelineCache) {
        super();
    }
}