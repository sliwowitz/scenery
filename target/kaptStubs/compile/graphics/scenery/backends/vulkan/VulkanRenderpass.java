package graphics.scenery.backends.vulkan;

import java.lang.System;

/**
 * * Class to encapsulate a Vulkan renderpass with [name] and associated [RenderConfigReader.RenderConfig] [config].
 * * The renderpass will be created on [device], with descriptors being allocated from [descriptorPool].
 * * A [pipelineCache] can be used for performance gains. The available vertex descriptors need to be handed
 * * over in [vertexDescriptors].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00f0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\'\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u009f\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\u0002\u0010\u000fJ\n\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0016J\u0011\u0010\u0082\u0001\u001a\u00020V2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001J\u0007\u0010\u0085\u0001\u001a\u00020VJ\u0006\u0010N\u001a\u00020;J\u0007\u0010\u0086\u0001\u001a\u00020!J\u001e\u0010\u0087\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0088\u00012\b\u0010\u0089\u0001\u001a\u00030\u0084\u0001J\b\u0010\u008a\u0001\u001a\u00030\u0081\u0001J0\u0010\u008b\u0001\u001a\u00020\t2\u0007\u0010\u008c\u0001\u001a\u00020\t2\u001c\u0010\u008d\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u00010\u008e\u0001H\u0002J\u0019\u0010\u0091\u0001\u001a\u00030\u0081\u00012\u000f\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u008e\u0001JH\u0010\u0094\u0001\u001a\u00030\u0081\u00012\t\b\u0002\u0010\u0095\u0001\u001a\u00020\u00032\u000f\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u008e\u00012\t\b\u0002\u0010\u0097\u0001\u001a\u00020\u000e2\u0017\b\u0002\u0010\u0098\u0001\u001a\u0010\u0012\u0004\u0012\u00020V\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u0001J\u0012\u0010\u009b\u0001\u001a\u00030\u0081\u00012\b\u0010\u0098\u0001\u001a\u00030\u009c\u0001J\u0007\u0010\u009d\u0001\u001a\u00020\tJ\b\u0010\u009e\u0001\u001a\u00030\u0081\u0001R<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\f@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R?\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020/0.2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020/0.@DX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R<\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\f@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0014\"\u0004\b7\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001d\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020;0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0014R\u001a\u0010=\u001a\u00020>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010?\"\u0004\b@\u0010AR\u001b\u0010B\u001a\u00020C8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bD\u0010ER\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0.X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u00102\"\u0004\bL\u00104R\u001d\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020;0\f\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0014R$\u0010P\u001a\u00020O2\u0006\u0010\u0010\u001a\u00020O@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010-R<\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020V0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020V0\f@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0014\"\u0004\bY\u0010\u0016R)\u0010[\u001a\u00020Z2\u0006\u0010\u0010\u001a\u00020Z@DX\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010_\u001a\u0004\b\\\u0010-\"\u0004\b]\u0010^R$\u0010`\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010-\"\u0004\bb\u0010^R4\u0010e\u001a\n d*\u0004\u0018\u00010c0c2\u000e\u0010\u0010\u001a\n d*\u0004\u0018\u00010c0c@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR4\u0010k\u001a\n d*\u0004\u0018\u00010j0j2\u000e\u0010\u0010\u001a\n d*\u0004\u0018\u00010j0j@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010\u0014R$\u0010r\u001a\u00020q2\u0006\u0010\u0010\u001a\u00020q@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR4\u0010w\u001a\n d*\u0004\u0018\u00010c0c2\u000e\u0010\u0010\u001a\n d*\u0004\u0018\u00010c0c@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010g\"\u0004\by\u0010iR4\u0010{\u001a\n d*\u0004\u0018\u00010z0z2\u000e\u0010\u0010\u001a\n d*\u0004\u0018\u00010z0z@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00a0\u0001"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderpass;", "Ljava/lang/AutoCloseable;", "name", "", "config", "Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "descriptorPool", "", "pipelineCache", "vertexDescriptors", "Ljava/util/concurrent/ConcurrentHashMap;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDataKinds;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDescription;", "(Ljava/lang/String;Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;Lgraphics/scenery/backends/vulkan/VulkanDevice;JJLjava/util/concurrent/ConcurrentHashMap;)V", "<set-?>", "Lgraphics/scenery/backends/vulkan/VulkanUBO;", "UBOs", "getUBOs", "()Ljava/util/concurrent/ConcurrentHashMap;", "setUBOs", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "b", "Lgraphics/scenery/backends/vulkan/VulkanCommandBuffer;", "commandBuffer", "getCommandBuffer", "()Lgraphics/scenery/backends/vulkan/VulkanCommandBuffer;", "setCommandBuffer", "(Lgraphics/scenery/backends/vulkan/VulkanCommandBuffer;)V", "commandBufferBacking", "Lgraphics/scenery/utils/RingBuffer;", "count", "", "commandBufferCount", "getCommandBufferCount", "()I", "setCommandBufferCount", "(I)V", "getConfig", "()Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "setConfig", "(Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;)V", "currentPosition", "getDescriptorPool", "()J", "Ljava/util/LinkedHashMap;", "Lvkk/entities/VkDescriptorSetLayout;", "descriptorSetLayouts", "getDescriptorSetLayouts", "()Ljava/util/LinkedHashMap;", "setDescriptorSetLayouts", "(Ljava/util/LinkedHashMap;)V", "descriptorSets", "getDescriptorSets", "setDescriptorSets", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "inputs", "Lgraphics/scenery/backends/vulkan/VulkanFramebuffer;", "getInputs", "isViewportRenderpass", "", "()Z", "setViewportRenderpass", "(Z)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getName", "()Ljava/lang/String;", "oldDescriptorSetLayouts", "getOldDescriptorSetLayouts", "setOldDescriptorSetLayouts", "output", "getOutput", "Lgraphics/scenery/backends/RenderConfigReader$RenderpassConfig;", "passConfig", "getPassConfig", "()Lgraphics/scenery/backends/RenderConfigReader$RenderpassConfig;", "setPassConfig", "(Lgraphics/scenery/backends/RenderConfigReader$RenderpassConfig;)V", "getPipelineCache", "Lgraphics/scenery/backends/vulkan/VulkanPipeline;", "pipelines", "getPipelines", "setPipelines", "Lgraphics/scenery/backends/vulkan/NanoSecond;", "recreated", "getRecreated", "setRecreated-HBoJQQE", "(J)V", "J", "semaphore", "getSemaphore", "setSemaphore", "Ljava/nio/LongBuffer;", "kotlin.jvm.PlatformType", "signalSemaphores", "getSignalSemaphores", "()Ljava/nio/LongBuffer;", "setSignalSemaphores", "(Ljava/nio/LongBuffer;)V", "Lorg/lwjgl/PointerBuffer;", "submitCommandBuffers", "getSubmitCommandBuffers", "()Lorg/lwjgl/PointerBuffer;", "setSubmitCommandBuffers", "(Lorg/lwjgl/PointerBuffer;)V", "getVertexDescriptors", "Lgraphics/scenery/backends/vulkan/VulkanRenderpass$VulkanMetadata;", "vulkanMetadata", "getVulkanMetadata", "()Lgraphics/scenery/backends/vulkan/VulkanRenderpass$VulkanMetadata;", "setVulkanMetadata", "(Lgraphics/scenery/backends/vulkan/VulkanRenderpass$VulkanMetadata;)V", "waitSemaphores", "getWaitSemaphores", "setWaitSemaphores", "Ljava/nio/IntBuffer;", "waitStages", "getWaitStages", "()Ljava/nio/IntBuffer;", "setWaitStages", "(Ljava/nio/IntBuffer;)V", "close", "", "getActivePipeline", "forNode", "Lgraphics/scenery/Node;", "getDefaultPipeline", "getReadPosition", "getShaderPropertyOrder", "", "node", "initializeDefaultPipeline", "initializeDescriptorSetLayoutForSpecs", "setId", "specs", "", "", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule$UBOSpec;", "initializeInputAttachmentDescriptorSetLayouts", "shaderModules", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule;", "initializePipeline", "pipelineName", "shaders", "vertexInputType", "settings", "Lkotlin/Function1;", "", "initializeShaderParameterDescriptorSetLayouts", "Lgraphics/scenery/Settings;", "initializeShaderPropertyDescriptorSetLayout", "updateShaderParameters", "VulkanMetadata", "scenery"})
public class VulkanRenderpass implements java.lang.AutoCloseable {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    
    /**
     * [VulkanFramebuffer] inputs of this render pass 
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanFramebuffer> inputs = null;
    
    /**
     * [VulkanFramebuffer] outputs of this render pass 
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanFramebuffer> output = null;
    
    /**
     * The pipelines this renderpass contains 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanPipeline> pipelines;
    
    /**
     * The UBOs this renderpass contains, e.g. for storage of shader parameters 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanUBO> UBOs;
    
    /**
     * Descriptor sets needed 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> descriptorSets;
    
    /**
     * Descriptor set layouts needed 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, vkk.entities.VkDescriptorSetLayout> descriptorSetLayouts;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, java.lang.Long> oldDescriptorSetLayouts;
    
    /**
     * Semaphores this renderpass is going to wait on when executed 
     */
    private java.nio.LongBuffer waitSemaphores;
    
    /**
     * Stages this renderpass will wait for when executed 
     */
    private java.nio.IntBuffer waitStages;
    
    /**
     * Semaphores this renderpass is going to signal after finishing execution 
     */
    private java.nio.LongBuffer signalSemaphores;
    
    /**
     * Pointers to command buffers associated with running this renderpass 
     */
    private org.lwjgl.PointerBuffer submitCommandBuffers;
    private graphics.scenery.utils.RingBuffer<graphics.scenery.backends.vulkan.VulkanCommandBuffer> commandBufferBacking;
    
    /**
     * This renderpasses' semaphore 
     */
    private long semaphore;
    
    /**
     * This renderpasses' [RenderConfigReader.RenderpassConfig]. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.RenderConfigReader.RenderpassConfig passConfig;
    
    /**
     * Whether this renderpass will render to the viewport or to a [VulkanFramebuffer] 
     */
    private boolean isViewportRenderpass;
    
    /**
     * The number of command buffers to keep in the [RingBuffer] [commandBufferBacking]. 
     */
    private int commandBufferCount;
    
    /**
     * Timestamp of the renderpass recreation 
     */
    private long recreated;
    private int currentPosition;
    
    /**
     * [VulkanMetadata] for this renderpass 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.VulkanRenderpass.VulkanMetadata vulkanMetadata;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.RenderConfigReader.RenderConfig config;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    private final long descriptorPool = 0L;
    private final long pipelineCache = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.VertexDataKinds, graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription> vertexDescriptors = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanFramebuffer> getInputs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanFramebuffer> getOutput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanPipeline> getPipelines() {
        return null;
    }
    
    protected final void setPipelines(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanPipeline> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanUBO> getUBOs() {
        return null;
    }
    
    protected final void setUBOs(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanUBO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> getDescriptorSets() {
        return null;
    }
    
    protected final void setDescriptorSets(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, vkk.entities.VkDescriptorSetLayout> getDescriptorSetLayouts() {
        return null;
    }
    
    protected final void setDescriptorSetLayouts(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, vkk.entities.VkDescriptorSetLayout> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.LinkedHashMap<java.lang.String, java.lang.Long> getOldDescriptorSetLayouts() {
        return null;
    }
    
    protected final void setOldDescriptorSetLayouts(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, java.lang.Long> p0) {
    }
    
    public final java.nio.LongBuffer getWaitSemaphores() {
        return null;
    }
    
    protected final void setWaitSemaphores(java.nio.LongBuffer p0) {
    }
    
    public final java.nio.IntBuffer getWaitStages() {
        return null;
    }
    
    protected final void setWaitStages(java.nio.IntBuffer p0) {
    }
    
    public final java.nio.LongBuffer getSignalSemaphores() {
        return null;
    }
    
    protected final void setSignalSemaphores(java.nio.LongBuffer p0) {
    }
    
    public final org.lwjgl.PointerBuffer getSubmitCommandBuffers() {
        return null;
    }
    
    protected final void setSubmitCommandBuffers(org.lwjgl.PointerBuffer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanCommandBuffer getCommandBuffer() {
        return null;
    }
    
    public final void setCommandBuffer(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanCommandBuffer b) {
    }
    
    public final long getSemaphore() {
        return 0L;
    }
    
    protected final void setSemaphore(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.RenderConfigReader.RenderpassConfig getPassConfig() {
        return null;
    }
    
    protected final void setPassConfig(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.RenderConfigReader.RenderpassConfig p0) {
    }
    
    public final boolean isViewportRenderpass() {
        return false;
    }
    
    public final void setViewportRenderpass(boolean p0) {
    }
    
    public final int getCommandBufferCount() {
        return 0;
    }
    
    public final void setCommandBufferCount(int count) {
    }
    
    public final long getRecreated() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanRenderpass.VulkanMetadata getVulkanMetadata() {
        return null;
    }
    
    protected final void setVulkanMetadata(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanRenderpass.VulkanMetadata p0) {
    }
    
    /**
     * * Initialises descriptor set layouts coming for the passes' [inputs].
     */
    public final void initializeInputAttachmentDescriptorSetLayouts(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends graphics.scenery.backends.vulkan.VulkanShaderModule> shaderModules) {
    }
    
    /**
     * * Initialiases descriptor set layours associated with this passes' shader parameters.
     */
    public final void initializeShaderParameterDescriptorSetLayouts(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Settings settings) {
    }
    
    /**
     * * Initialiases descriptor set layouts for [graphics.scenery.ShaderProperty]s.
     */
    public final long initializeShaderPropertyDescriptorSetLayout() {
        return 0L;
    }
    
    /**
     * * Returns the order of shader properties as a map for a given [node] as required by the shader file.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Integer> getShaderPropertyOrder(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Node node) {
        return null;
    }
    
    /**
     * * Updates all shader parameters.
     */
    public final void updateShaderParameters() {
    }
    
    /**
     * * Initialiases the default [VulkanPipeline] for this renderpass.
     */
    public final void initializeDefaultPipeline() {
    }
    
    /**
     * * Initialiases a custom [VulkanPipeline] with [pipelineName], built out of the [shaders] for a specific [vertexInputType].
     *     * The pipeline settings are customizable using the lambda [settings].
     */
    public final void initializePipeline(@org.jetbrains.annotations.NotNull()
    java.lang.String pipelineName, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends graphics.scenery.backends.vulkan.VulkanShaderModule> shaders, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription vertexInputType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super graphics.scenery.backends.vulkan.VulkanPipeline, ? extends java.lang.Object> settings) {
    }
    
    private final long initializeDescriptorSetLayoutForSpecs(long setId, java.util.List<? extends java.util.Map.Entry<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOSpec>> specs) {
        return 0L;
    }
    
    /**
     * * Returns the default output [VulkanFramebuffer] of this renderpass.
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanFramebuffer getOutput() {
        return null;
    }
    
    /**
     * * Returns the [commandBufferBacking]'s current read position. Used e.g.
     *     * to determine the most currently rendered swapchain image for a viewport pass.
     */
    public final int getReadPosition() {
        return 0;
    }
    
    /**
     * * Returns the active [VulkanPipeline] for [forNode], if it has a preferred pipeline,
     *     * or the default one if not.
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanPipeline getActivePipeline(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Node forNode) {
        return null;
    }
    
    /**
     * * Returns this renderpasses' default pipeline.
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanPipeline getDefaultPipeline() {
        return null;
    }
    
    /**
     * * Closes this renderpass and deallocates its resources.
     */
    @java.lang.Override()
    public void close() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.RenderConfigReader.RenderConfig getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.RenderConfigReader.RenderConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }
    
    public final long getDescriptorPool() {
        return 0L;
    }
    
    public final long getPipelineCache() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.VertexDataKinds, graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription> getVertexDescriptors() {
        return null;
    }
    
    public VulkanRenderpass(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.RenderConfigReader.RenderConfig config, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, long descriptorPool, long pipelineCache, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.VertexDataKinds, graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription> vertexDescriptors) {
        super();
    }
    
    /**
     * * Vulkan metadata class, keeping information about viewports, scissor areas, etc.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0014\u00a2\u0006\u0002\u0010\u0018J\b\u0010?\u001a\u00020@H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R,\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\u00a8\u0006A"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderpass$VulkanMetadata;", "Ljava/lang/AutoCloseable;", "descriptorSets", "Ljava/nio/LongBuffer;", "vertexBufferOffsets", "scissor", "Lorg/lwjgl/vulkan/VkRect2D$Buffer;", "viewport", "Lorg/lwjgl/vulkan/VkViewport$Buffer;", "vertexBuffers", "clearValues", "Lorg/lwjgl/vulkan/VkClearValue$Buffer;", "renderArea", "Lorg/lwjgl/vulkan/VkRect2D;", "renderPassBeginInfo", "Lorg/lwjgl/vulkan/VkRenderPassBeginInfo;", "uboOffsets", "Ljava/nio/IntBuffer;", "eye", "renderLists", "Ljava/util/HashMap;", "Lgraphics/scenery/backends/vulkan/VulkanCommandBuffer;", "", "Lgraphics/scenery/Node;", "(Ljava/nio/LongBuffer;Ljava/nio/LongBuffer;Lorg/lwjgl/vulkan/VkRect2D$Buffer;Lorg/lwjgl/vulkan/VkViewport$Buffer;Ljava/nio/LongBuffer;Lorg/lwjgl/vulkan/VkClearValue$Buffer;Lorg/lwjgl/vulkan/VkRect2D;Lorg/lwjgl/vulkan/VkRenderPassBeginInfo;Ljava/nio/IntBuffer;Ljava/nio/IntBuffer;Ljava/util/HashMap;)V", "getClearValues", "()Lorg/lwjgl/vulkan/VkClearValue$Buffer;", "setClearValues", "(Lorg/lwjgl/vulkan/VkClearValue$Buffer;)V", "getDescriptorSets", "()Ljava/nio/LongBuffer;", "setDescriptorSets", "(Ljava/nio/LongBuffer;)V", "getEye", "()Ljava/nio/IntBuffer;", "setEye", "(Ljava/nio/IntBuffer;)V", "getRenderArea", "()Lorg/lwjgl/vulkan/VkRect2D;", "setRenderArea", "(Lorg/lwjgl/vulkan/VkRect2D;)V", "getRenderLists", "()Ljava/util/HashMap;", "setRenderLists", "(Ljava/util/HashMap;)V", "getRenderPassBeginInfo", "()Lorg/lwjgl/vulkan/VkRenderPassBeginInfo;", "setRenderPassBeginInfo", "(Lorg/lwjgl/vulkan/VkRenderPassBeginInfo;)V", "getScissor", "()Lorg/lwjgl/vulkan/VkRect2D$Buffer;", "setScissor", "(Lorg/lwjgl/vulkan/VkRect2D$Buffer;)V", "getUboOffsets", "setUboOffsets", "getVertexBufferOffsets", "setVertexBufferOffsets", "getVertexBuffers", "setVertexBuffers", "getViewport", "()Lorg/lwjgl/vulkan/VkViewport$Buffer;", "setViewport", "(Lorg/lwjgl/vulkan/VkViewport$Buffer;)V", "close", "", "scenery"})
    public static final class VulkanMetadata implements java.lang.AutoCloseable {
        @org.jetbrains.annotations.NotNull()
        private java.nio.LongBuffer descriptorSets;
        @org.jetbrains.annotations.NotNull()
        private java.nio.LongBuffer vertexBufferOffsets;
        @org.jetbrains.annotations.NotNull()
        private org.lwjgl.vulkan.VkRect2D.Buffer scissor;
        @org.jetbrains.annotations.NotNull()
        private org.lwjgl.vulkan.VkViewport.Buffer viewport;
        @org.jetbrains.annotations.NotNull()
        private java.nio.LongBuffer vertexBuffers;
        @org.jetbrains.annotations.Nullable()
        private org.lwjgl.vulkan.VkClearValue.Buffer clearValues;
        @org.jetbrains.annotations.NotNull()
        private org.lwjgl.vulkan.VkRect2D renderArea;
        @org.jetbrains.annotations.NotNull()
        private org.lwjgl.vulkan.VkRenderPassBeginInfo renderPassBeginInfo;
        @org.jetbrains.annotations.NotNull()
        private java.nio.IntBuffer uboOffsets;
        @org.jetbrains.annotations.NotNull()
        private java.nio.IntBuffer eye;
        @org.jetbrains.annotations.NotNull()
        private java.util.HashMap<graphics.scenery.backends.vulkan.VulkanCommandBuffer, graphics.scenery.Node[]> renderLists;
        
        /**
         * Close this metadata instance, and frees all members 
         */
        @java.lang.Override()
        public void close() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.nio.LongBuffer getDescriptorSets() {
            return null;
        }
        
        public final void setDescriptorSets(@org.jetbrains.annotations.NotNull()
        java.nio.LongBuffer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.nio.LongBuffer getVertexBufferOffsets() {
            return null;
        }
        
        public final void setVertexBufferOffsets(@org.jetbrains.annotations.NotNull()
        java.nio.LongBuffer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkRect2D.Buffer getScissor() {
            return null;
        }
        
        public final void setScissor(@org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkRect2D.Buffer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkViewport.Buffer getViewport() {
            return null;
        }
        
        public final void setViewport(@org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkViewport.Buffer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.nio.LongBuffer getVertexBuffers() {
            return null;
        }
        
        public final void setVertexBuffers(@org.jetbrains.annotations.NotNull()
        java.nio.LongBuffer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.lwjgl.vulkan.VkClearValue.Buffer getClearValues() {
            return null;
        }
        
        public final void setClearValues(@org.jetbrains.annotations.Nullable()
        org.lwjgl.vulkan.VkClearValue.Buffer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkRect2D getRenderArea() {
            return null;
        }
        
        public final void setRenderArea(@org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkRect2D p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkRenderPassBeginInfo getRenderPassBeginInfo() {
            return null;
        }
        
        public final void setRenderPassBeginInfo(@org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkRenderPassBeginInfo p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.nio.IntBuffer getUboOffsets() {
            return null;
        }
        
        public final void setUboOffsets(@org.jetbrains.annotations.NotNull()
        java.nio.IntBuffer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.nio.IntBuffer getEye() {
            return null;
        }
        
        public final void setEye(@org.jetbrains.annotations.NotNull()
        java.nio.IntBuffer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<graphics.scenery.backends.vulkan.VulkanCommandBuffer, graphics.scenery.Node[]> getRenderLists() {
            return null;
        }
        
        public final void setRenderLists(@org.jetbrains.annotations.NotNull()
        java.util.HashMap<graphics.scenery.backends.vulkan.VulkanCommandBuffer, graphics.scenery.Node[]> p0) {
        }
        
        public VulkanMetadata(@org.jetbrains.annotations.NotNull()
        java.nio.LongBuffer descriptorSets, @org.jetbrains.annotations.NotNull()
        java.nio.LongBuffer vertexBufferOffsets, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkRect2D.Buffer scissor, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkViewport.Buffer viewport, @org.jetbrains.annotations.NotNull()
        java.nio.LongBuffer vertexBuffers, @org.jetbrains.annotations.Nullable()
        org.lwjgl.vulkan.VkClearValue.Buffer clearValues, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkRect2D renderArea, @org.jetbrains.annotations.NotNull()
        org.lwjgl.vulkan.VkRenderPassBeginInfo renderPassBeginInfo, @org.jetbrains.annotations.NotNull()
        java.nio.IntBuffer uboOffsets, @org.jetbrains.annotations.NotNull()
        java.nio.IntBuffer eye, @org.jetbrains.annotations.NotNull()
        java.util.HashMap<graphics.scenery.backends.vulkan.VulkanCommandBuffer, graphics.scenery.Node[]> renderLists) {
            super();
        }
        
        public VulkanMetadata() {
            super();
        }
    }
}