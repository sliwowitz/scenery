package graphics.scenery.backends.vulkan;

/**
 * * Vulkan Shader Module
 * *
 * * Class facilitating the use of shaders in Vulkan. Supports loading SPIR-V binaries and compiling GLSL
 * * shader text files to SPIR-V binaries, with introspection.
 * *
 * * When loading a SPIR-V binary, VulkanShaderModule will check if a newer GLSL text file with the same name
 * * exists and load that.
 * *
 * * @param[device] The Vulkan device to use (VkDevice)
 * * @param[entryPoint] Customizable main entry point for the shader, usually "main"
 * * @param[sp] A [ShaderPackage] originating from the [Shaders] class.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 62\u00020\u0001:\u00056789:B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u00101\u001a\u000202J\f\u00103\u001a\u000204*\u000205H\u0004R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001f\u0010 \u001a\u00020!X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u0011\u0010-\u001a\u00020.8F\u00a2\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006;"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanShaderModule;", "", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "entryPoint", "", "sp", "Lgraphics/scenery/backends/ShaderPackage;", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Ljava/lang/String;Lgraphics/scenery/backends/ShaderPackage;)V", "deallocated", "", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "pushConstantSpecs", "Ljava/util/LinkedHashMap;", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule$PushConstantSpec;", "getPushConstantSpecs", "()Ljava/util/LinkedHashMap;", "setPushConstantSpecs", "(Ljava/util/LinkedHashMap;)V", "shader", "Lorg/lwjgl/vulkan/VkPipelineShaderStageCreateInfo;", "getShader", "()Lorg/lwjgl/vulkan/VkPipelineShaderStageCreateInfo;", "setShader", "(Lorg/lwjgl/vulkan/VkPipelineShaderStageCreateInfo;)V", "shaderModule", "Lvkk/entities/VkShaderModule;", "getShaderModule", "()J", "setShaderModule-cOP9gqQ", "(J)V", "J", "signature", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule$ShaderSignature;", "uboSpecs", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule$UBOSpec;", "getUboSpecs", "setUboSpecs", "vkDev", "Lorg/lwjgl/vulkan/VkDevice;", "getVkDev", "()Lorg/lwjgl/vulkan/VkDevice;", "close", "", "toVulkanShaderStage", "Lvkk/VkShaderStage;", "Lgraphics/scenery/backends/ShaderType;", "Companion", "PushConstantSpec", "ShaderSignature", "UBOMemberSpec", "UBOSpec", "scenery"})
public class VulkanShaderModule {
    public static final graphics.scenery.backends.vulkan.VulkanShaderModule.Companion Companion = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, graphics.scenery.backends.vulkan.VulkanShaderModule> shaderModuleCache = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo shader;
    private long shaderModule;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOSpec> uboSpecs;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.PushConstantSpec> pushConstantSpecs;
    private boolean deallocated;
    private graphics.scenery.backends.vulkan.VulkanShaderModule.ShaderSignature signature;

    public VulkanShaderModule(@org.jetbrains.annotations.NotNull()
                                  graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
                                  java.lang.String entryPoint, @org.jetbrains.annotations.NotNull()
                                  graphics.scenery.backends.ShaderPackage sp) {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo getShader() {
        return null;
    }

    public final void setShader(@org.jetbrains.annotations.NotNull()
                                    org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo p0) {
    }

    public final long getShaderModule() {
        return 0L;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOSpec> getUboSpecs() {
        return null;
    }

    public final void setUboSpecs(@org.jetbrains.annotations.NotNull()
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
    public final org.lwjgl.vulkan.VkDevice getVkDev() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final vkk.VkShaderStage toVulkanShaderStage(@org.jetbrains.annotations.NotNull()
                                                              graphics.scenery.backends.ShaderType $receiver) {
        return null;
    }

    /**
     * * Closes this Vulkan shader module, deallocating all of it's resources.
     * * If the module has already been closed, no deallocation takes place.
     */
    public final void close() {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }

    /**
     * * Specification of UBO members, storing [name], [index] in the buffer, [offset] from the beginning,
     * * and size of the member as [range].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanShaderModule$UBOMemberSpec;", "", "name", "", "index", "", "offset", "range", "(Ljava/lang/String;JJJ)V", "getIndex", "()J", "getName", "()Ljava/lang/String;", "getOffset", "getRange", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "scenery"})
    public static final class UBOMemberSpec {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final long index = 0L;
        private final long offset = 0L;
        private final long range = 0L;

        public UBOMemberSpec(@org.jetbrains.annotations.NotNull()
                                 java.lang.String name, long index, long offset, long range) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }

        public final long getIndex() {
            return 0L;
        }

        public final long getOffset() {
            return 0L;
        }

        public final long getRange() {
            return 0L;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }

        public final long component2() {
            return 0L;
        }

        public final long component3() {
            return 0L;
        }

        public final long component4() {
            return 0L;
        }

        /**
         * * Specification of UBO members, storing [name], [index] in the buffer, [offset] from the beginning,
         * * and size of the member as [range].
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec copy(@org.jetbrains.annotations.NotNull()
                                                                                                java.lang.String name, long index, long offset, long range) {
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
     * * Specification of an UBO, storing [name], descriptor [set], [binding], and a set of [members].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J%\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\nH\u00c6\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR-\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f\u00a8\u0006!"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanShaderModule$UBOSpec;", "", "name", "", "set", "", "binding", "members", "Ljava/util/LinkedHashMap;", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule$UBOMemberSpec;", "Lkotlin/collections/LinkedHashMap;", "(Ljava/lang/String;JJLjava/util/LinkedHashMap;)V", "getBinding", "()J", "setBinding", "(J)V", "getMembers", "()Ljava/util/LinkedHashMap;", "getName", "()Ljava/lang/String;", "getSet", "setSet", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "scenery"})
    public static final class UBOSpec {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec> members = null;
        private long set;
        private long binding;

        public UBOSpec(@org.jetbrains.annotations.NotNull()
                           java.lang.String name, long set, long binding, @org.jetbrains.annotations.NotNull()
                           java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec> members) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }

        public final long getSet() {
            return 0L;
        }

        public final void setSet(long p0) {
        }

        public final long getBinding() {
            return 0L;
        }

        public final void setBinding(long p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec> getMembers() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }

        public final long component2() {
            return 0L;
        }

        public final long component3() {
            return 0L;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec> component4() {
            return null;
        }

        /**
         * * Specification of an UBO, storing [name], descriptor [set], [binding], and a set of [members].
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanShaderModule.UBOSpec copy(@org.jetbrains.annotations.NotNull()
                                                                                          java.lang.String name, long set, long binding, @org.jetbrains.annotations.NotNull()
                                                                                          java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec> members) {
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
     * * Specification for push constants, containing [name] and [members].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J%\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J9\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanShaderModule$PushConstantSpec;", "", "name", "", "members", "Ljava/util/LinkedHashMap;", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule$UBOMemberSpec;", "Lkotlin/collections/LinkedHashMap;", "(Ljava/lang/String;Ljava/util/LinkedHashMap;)V", "getMembers", "()Ljava/util/LinkedHashMap;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "scenery"})
    public static final class PushConstantSpec {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec> members = null;

        public PushConstantSpec(@org.jetbrains.annotations.NotNull()
                                    java.lang.String name, @org.jetbrains.annotations.NotNull()
                                    java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec> members) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec> getMembers() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec> component2() {
            return null;
        }

        /**
         * * Specification for push constants, containing [name] and [members].
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanShaderModule.PushConstantSpec copy(@org.jetbrains.annotations.NotNull()
                                                                                                   java.lang.String name, @org.jetbrains.annotations.NotNull()
                                                                                                   java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanShaderModule.UBOMemberSpec> members) {
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

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanShaderModule$ShaderSignature;", "", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "p", "Lgraphics/scenery/backends/ShaderPackage;", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;Lgraphics/scenery/backends/ShaderPackage;)V", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "getP", "()Lgraphics/scenery/backends/ShaderPackage;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    static final class ShaderSignature {
        @org.jetbrains.annotations.NotNull()
        private final graphics.scenery.backends.vulkan.VulkanDevice device = null;
        @org.jetbrains.annotations.NotNull()
        private final graphics.scenery.backends.ShaderPackage p = null;

        public ShaderSignature(@org.jetbrains.annotations.NotNull()
                                   graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
                                   graphics.scenery.backends.ShaderPackage p) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.ShaderPackage getP() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanDevice component1() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.ShaderPackage component2() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanShaderModule.ShaderSignature copy(@org.jetbrains.annotations.NotNull()
                                                                                                  graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
                                                                                                  graphics.scenery.backends.ShaderPackage p) {
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
     * * Factory and cache methods for [VulkanShaderModule].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanShaderModule$Companion;", "", "()V", "shaderModuleCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lgraphics/scenery/backends/vulkan/VulkanShaderModule;", "clearCache", "", "getFromCacheOrCreate", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "entryPoint", "", "sp", "Lgraphics/scenery/backends/ShaderPackage;", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }

        /**
         * * Creates a new [VulkanShaderModule] or returns it from the cache.
         * * Must be given a [ShaderPackage] [sp], a [VulkanDevice] [device], and the name
         * * for the main [entryPoint].
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanShaderModule getFromCacheOrCreate(@org.jetbrains.annotations.NotNull()
                                                                                                  graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
                                                                                                  java.lang.String entryPoint, @org.jetbrains.annotations.NotNull()
                                                                                                  graphics.scenery.backends.ShaderPackage sp) {
            return null;
        }

        /**
         * * Clears the shader cache.
         */
        public final void clearCache() {
        }
    }
}
