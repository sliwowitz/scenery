package graphics.scenery.backends.opengl;

import java.lang.System;

/**
 * * Vulkan Object State class. Saves texture, UBO, pipeline and vertex buffer state.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 &2\u00020\u0001:\u0003&\'(B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0005H\u0016R\u001b\u0010\t\u001a\u00020\n8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0014@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006)"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLShaderModule;", "", "gl", "Lcom/jogamp/opengl/GL4;", "entryPoint", "", "sp", "Lgraphics/scenery/backends/ShaderPackage;", "(Lcom/jogamp/opengl/GL4;Ljava/lang/String;Lgraphics/scenery/backends/ShaderPackage;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcleargl/GLShader;", "shader", "getShader", "()Lcleargl/GLShader;", "Lgraphics/scenery/backends/ShaderType;", "shaderType", "getShaderType", "()Lgraphics/scenery/backends/ShaderType;", "source", "getSource", "()Ljava/lang/String;", "uboSpecs", "Ljava/util/LinkedHashMap;", "Lgraphics/scenery/backends/opengl/OpenGLShaderModule$UBOSpec;", "getUboSpecs", "()Ljava/util/LinkedHashMap;", "setUboSpecs", "(Ljava/util/LinkedHashMap;)V", "toClearGLShaderType", "Lcleargl/GLShaderType;", "type", "toString", "Companion", "UBOMemberSpec", "UBOSpec", "scenery"})
public class OpenGLShaderModule {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLShader shader;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.ShaderType shaderType;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLShaderModule.UBOSpec> uboSpecs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String source;
    private static final java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.opengl.OpenGLShaderModule.Companion.ShaderSignature, graphics.scenery.backends.opengl.OpenGLShaderModule> shaderModuleCache = null;
    public static final graphics.scenery.backends.opengl.OpenGLShaderModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLShader getShader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.ShaderType getShaderType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLShaderModule.UBOSpec> getUboSpecs() {
        return null;
    }
    
    public final void setUboSpecs(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLShaderModule.UBOSpec> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    private final cleargl.GLShaderType toClearGLShaderType(graphics.scenery.backends.ShaderType type) {
        return null;
    }
    
    /**
     * * Returns a string representation of this module.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public OpenGLShaderModule(@org.jetbrains.annotations.NotNull()
    com.jogamp.opengl.GL4 gl, @org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.ShaderPackage sp) {
        super();
    }
    
    /**
     * * Creates a new [OpenGLShaderModule] or returns it from the cache.
     *         * Must be given a [ShaderPackage] [sp], a [gl], and the name for the main [entryPoint].
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.backends.opengl.OpenGLShaderModule getFromCacheOrCreate(@org.jetbrains.annotations.NotNull()
    com.jogamp.opengl.GL4 gl, @org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.ShaderPackage sp) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLShaderModule$UBOMemberSpec;", "", "name", "", "index", "", "offset", "range", "(Ljava/lang/String;JJJ)V", "getIndex", "()J", "getName", "()Ljava/lang/String;", "getOffset", "getRange", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "scenery"})
    public static final class UBOMemberSpec {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final long index = 0L;
        private final long offset = 0L;
        private final long range = 0L;
        
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
        
        public UBOMemberSpec(@org.jetbrains.annotations.NotNull()
        java.lang.String name, long index, long offset, long range) {
            super();
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
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLShaderModule.UBOMemberSpec copy(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J%\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\nH\u00c6\u0003JM\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\nH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR-\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLShaderModule$UBOSpec;", "", "name", "", "set", "", "binding", "members", "Ljava/util/LinkedHashMap;", "Lgraphics/scenery/backends/opengl/OpenGLShaderModule$UBOMemberSpec;", "Lkotlin/collections/LinkedHashMap;", "(Ljava/lang/String;JJLjava/util/LinkedHashMap;)V", "getBinding", "()J", "getMembers", "()Ljava/util/LinkedHashMap;", "getName", "()Ljava/lang/String;", "getSet", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "scenery"})
    public static final class UBOSpec {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final long set = 0L;
        private final long binding = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLShaderModule.UBOMemberSpec> members = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final long getSet() {
            return 0L;
        }
        
        public final long getBinding() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLShaderModule.UBOMemberSpec> getMembers() {
            return null;
        }
        
        public UBOSpec(@org.jetbrains.annotations.NotNull()
        java.lang.String name, long set, long binding, @org.jetbrains.annotations.NotNull()
        java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLShaderModule.UBOMemberSpec> members) {
            super();
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
        public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLShaderModule.UBOMemberSpec> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLShaderModule.UBOSpec copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, long set, long binding, @org.jetbrains.annotations.NotNull()
        java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLShaderModule.UBOMemberSpec> members) {
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
     * * Factory methods and cache.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLShaderModule$Companion;", "", "()V", "shaderModuleCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lgraphics/scenery/backends/opengl/OpenGLShaderModule$Companion$ShaderSignature;", "Lgraphics/scenery/backends/opengl/OpenGLShaderModule;", "getFromCacheOrCreate", "gl", "Lcom/jogamp/opengl/GL4;", "entryPoint", "", "sp", "Lgraphics/scenery/backends/ShaderPackage;", "ShaderSignature", "scenery"})
    public static final class Companion {
        
        /**
         * * Creates a new [OpenGLShaderModule] or returns it from the cache.
         *         * Must be given a [ShaderPackage] [sp], a [gl], and the name for the main [entryPoint].
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLShaderModule getFromCacheOrCreate(@org.jetbrains.annotations.NotNull()
        com.jogamp.opengl.GL4 gl, @org.jetbrains.annotations.NotNull()
        java.lang.String entryPoint, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.ShaderPackage sp) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLShaderModule$Companion$ShaderSignature;", "", "gl", "Lcom/jogamp/opengl/GL4;", "p", "Lgraphics/scenery/backends/ShaderPackage;", "(Lcom/jogamp/opengl/GL4;Lgraphics/scenery/backends/ShaderPackage;)V", "getGl", "()Lcom/jogamp/opengl/GL4;", "getP", "()Lgraphics/scenery/backends/ShaderPackage;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
        static final class ShaderSignature {
            @org.jetbrains.annotations.NotNull()
            private final com.jogamp.opengl.GL4 gl = null;
            @org.jetbrains.annotations.NotNull()
            private final graphics.scenery.backends.ShaderPackage p = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.jogamp.opengl.GL4 getGl() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final graphics.scenery.backends.ShaderPackage getP() {
                return null;
            }
            
            public ShaderSignature(@org.jetbrains.annotations.NotNull()
            com.jogamp.opengl.GL4 gl, @org.jetbrains.annotations.NotNull()
            graphics.scenery.backends.ShaderPackage p) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.jogamp.opengl.GL4 component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final graphics.scenery.backends.ShaderPackage component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final graphics.scenery.backends.opengl.OpenGLShaderModule.Companion.ShaderSignature copy(@org.jetbrains.annotations.NotNull()
            com.jogamp.opengl.GL4 gl, @org.jetbrains.annotations.NotNull()
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
    }
}