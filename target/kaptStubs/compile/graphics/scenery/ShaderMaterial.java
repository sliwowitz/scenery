package graphics.scenery;

import java.lang.System;

/**
 * * This class stores paths to GLSL shader files to be used for rendering preferentially,
 * * as well as any parameters that are then expanded by the GLSL precompiler.
 * *
 * * @param[shaders]: The list of custom shaders to use as material
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\t"}, d2 = {"Lgraphics/scenery/ShaderMaterial;", "Lgraphics/scenery/Material;", "shaders", "Lgraphics/scenery/backends/Shaders;", "(Lgraphics/scenery/backends/Shaders;)V", "getShaders", "()Lgraphics/scenery/backends/Shaders;", "setShaders", "Companion", "scenery"})
public final class ShaderMaterial extends graphics.scenery.Material {
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.Shaders shaders;
    public static final graphics.scenery.ShaderMaterial.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.Shaders getShaders() {
        return null;
    }
    
    public final void setShaders(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.Shaders p0) {
    }
    
    public ShaderMaterial(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.Shaders shaders) {
        super();
    }
    
    /**
     * Creates a new file-based ShaderMaterial from a list of [files]. 
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.ShaderMaterial fromFiles(@org.jetbrains.annotations.NotNull()
    java.lang.String... files) {
        return null;
    }
    
    /**
     * Creates a new file-based ShaderMaterial the simpleName of the class [clazz]. 
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.ShaderMaterial fromClass(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends graphics.scenery.backends.ShaderType> types) {
        return null;
    }
    
    /**
     * Creates a new file-based ShaderMaterial the simpleName of the class [clazz]. 
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.ShaderMaterial fromClass(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> clazz) {
        return null;
    }
    
    /**
     * Factory functions for ShaderMaterial 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J!\u0010\n\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0007\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lgraphics/scenery/ShaderMaterial$Companion;", "", "()V", "fromClass", "Lgraphics/scenery/ShaderMaterial;", "clazz", "Ljava/lang/Class;", "types", "", "Lgraphics/scenery/backends/ShaderType;", "fromFiles", "files", "", "", "([Ljava/lang/String;)Lgraphics/scenery/ShaderMaterial;", "scenery"})
    public static final class Companion {
        
        /**
         * Creates a new file-based ShaderMaterial from a list of [files]. 
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.ShaderMaterial fromFiles(@org.jetbrains.annotations.NotNull()
        java.lang.String... files) {
            return null;
        }
        
        /**
         * Creates a new file-based ShaderMaterial the simpleName of the class [clazz]. 
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.ShaderMaterial fromClass(@org.jetbrains.annotations.NotNull()
        java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends graphics.scenery.backends.ShaderType> types) {
            return null;
        }
        
        /**
         * Creates a new file-based ShaderMaterial the simpleName of the class [clazz]. 
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.ShaderMaterial fromClass(@org.jetbrains.annotations.NotNull()
        java.lang.Class<?> clazz) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}