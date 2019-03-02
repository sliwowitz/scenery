package graphics.scenery.backends;

import java.lang.System;

/**
 * * Data class to contain packages of shader source code and SPIRV byte code.
 * * [type] indicates the shader type. [priority] is set upon initialisation,
 * * after it has been determined whether the plain source or SPIRV is newer.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\r\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\rH\u00c6\u0003J[\u0010*\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\b\u0010.\u001a\u0004\u0018\u00010/J\t\u00100\u001a\u000201H\u00d6\u0001J\u0006\u00102\u001a\u00020\u0007J\t\u00103\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00064"}, d2 = {"Lgraphics/scenery/backends/ShaderPackage;", "", "baseClass", "Ljava/lang/Class;", "type", "Lgraphics/scenery/backends/ShaderType;", "spirvPath", "", "codePath", "spirv", "", "code", "priority", "Lgraphics/scenery/backends/SourceSPIRVPriority;", "(Ljava/lang/Class;Lgraphics/scenery/backends/ShaderType;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lgraphics/scenery/backends/SourceSPIRVPriority;)V", "getBaseClass", "()Ljava/lang/Class;", "getCode", "()Ljava/lang/String;", "getCodePath", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getPriority", "()Lgraphics/scenery/backends/SourceSPIRVPriority;", "setPriority", "(Lgraphics/scenery/backends/SourceSPIRVPriority;)V", "getSpirv", "()[B", "getSpirvPath", "getType", "()Lgraphics/scenery/backends/ShaderType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "getSPIRVBytecode", "Lgraphics/scenery/spirvcrossj/IntVec;", "hashCode", "", "toShortString", "toString", "scenery"})
public final class ShaderPackage {
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<?> baseClass = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.ShaderType type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String spirvPath = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String codePath = null;
    @org.jetbrains.annotations.Nullable()
    private final byte[] spirv = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String code = null;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.SourceSPIRVPriority priority;
    
    private final org.slf4j.Logger getLogger() {
        return null;
    }
    
    /**
     * * Returns the glslang-digestible SPIRV bytecode from this package.
     */
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.spirvcrossj.IntVec getSPIRVBytecode() {
        return null;
    }
    
    /**
     * * Returns a short string representation of this package.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toShortString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Class<?> getBaseClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.ShaderType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSpirvPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCodePath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getSpirv() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.SourceSPIRVPriority getPriority() {
        return null;
    }
    
    public final void setPriority(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.SourceSPIRVPriority p0) {
    }
    
    public ShaderPackage(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> baseClass, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.ShaderType type, @org.jetbrains.annotations.Nullable()
    java.lang.String spirvPath, @org.jetbrains.annotations.Nullable()
    java.lang.String codePath, @org.jetbrains.annotations.Nullable()
    byte[] spirv, @org.jetbrains.annotations.Nullable()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.SourceSPIRVPriority priority) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Class<?> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.ShaderType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.SourceSPIRVPriority component7() {
        return null;
    }
    
    /**
     * * Data class to contain packages of shader source code and SPIRV byte code.
     * * [type] indicates the shader type. [priority] is set upon initialisation,
     * * after it has been determined whether the plain source or SPIRV is newer.
     * *
     * * @author Ulrik Guenther <hello@ulrik.is>
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.ShaderPackage copy(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> baseClass, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.ShaderType type, @org.jetbrains.annotations.Nullable()
    java.lang.String spirvPath, @org.jetbrains.annotations.Nullable()
    java.lang.String codePath, @org.jetbrains.annotations.Nullable()
    byte[] spirv, @org.jetbrains.annotations.Nullable()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.SourceSPIRVPriority priority) {
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