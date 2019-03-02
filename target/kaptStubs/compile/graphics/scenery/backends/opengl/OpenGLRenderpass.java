package graphics.scenery.backends.opengl;

import java.lang.System;

/**
 * * Class to contain an OpenGL render pass with name [passName] and associated configuration
 * * [passConfig].
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004789:B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u000206R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006;"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLRenderpass;", "", "passName", "", "passConfig", "Lgraphics/scenery/backends/RenderConfigReader$RenderpassConfig;", "(Ljava/lang/String;Lgraphics/scenery/backends/RenderConfigReader$RenderpassConfig;)V", "UBOs", "Ljava/util/concurrent/ConcurrentHashMap;", "Lgraphics/scenery/backends/opengl/OpenGLUBO;", "getUBOs", "()Ljava/util/concurrent/ConcurrentHashMap;", "setUBOs", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "defaultShader", "Lgraphics/scenery/backends/opengl/OpenGLShaderProgram;", "getDefaultShader", "()Lgraphics/scenery/backends/opengl/OpenGLShaderProgram;", "setDefaultShader", "(Lgraphics/scenery/backends/opengl/OpenGLShaderProgram;)V", "inputs", "Lcleargl/GLFramebuffer;", "getInputs", "setInputs", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "openglMetadata", "Lgraphics/scenery/backends/opengl/OpenGLRenderpass$OpenGLMetadata;", "getOpenglMetadata", "()Lgraphics/scenery/backends/opengl/OpenGLRenderpass$OpenGLMetadata;", "setOpenglMetadata", "(Lgraphics/scenery/backends/opengl/OpenGLRenderpass$OpenGLMetadata;)V", "output", "getOutput", "setOutput", "getPassConfig", "()Lgraphics/scenery/backends/RenderConfigReader$RenderpassConfig;", "setPassConfig", "(Lgraphics/scenery/backends/RenderConfigReader$RenderpassConfig;)V", "getPassName", "()Ljava/lang/String;", "setPassName", "(Ljava/lang/String;)V", "initializeShaderParameters", "", "settings", "Lgraphics/scenery/Settings;", "backingBuffer", "Lgraphics/scenery/backends/opengl/OpenGLRenderer$OpenGLBuffer;", "updateShaderParameters", "", "ClearValue", "OpenGLMetadata", "Rect2D", "Viewport", "scenery"})
public final class OpenGLRenderpass {
    private final kotlin.Lazy logger$delegate = null;
    
    /**
     * OpenGL metadata 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.opengl.OpenGLRenderpass.OpenGLMetadata openglMetadata;
    
    /**
     * Output(s) of the pass 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, cleargl.GLFramebuffer> output;
    
    /**
     * Inputs of the pass 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, cleargl.GLFramebuffer> inputs;
    
    /**
     * The default shader the pass uses 
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.backends.opengl.OpenGLShaderProgram defaultShader;
    
    /**
     * UBOs required by this pass 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLUBO> UBOs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String passName;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.RenderConfigReader.RenderpassConfig passConfig;
    
    private final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.opengl.OpenGLRenderpass.OpenGLMetadata getOpenglMetadata() {
        return null;
    }
    
    public final void setOpenglMetadata(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.opengl.OpenGLRenderpass.OpenGLMetadata p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, cleargl.GLFramebuffer> getOutput() {
        return null;
    }
    
    public final void setOutput(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, cleargl.GLFramebuffer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, cleargl.GLFramebuffer> getInputs() {
        return null;
    }
    
    public final void setInputs(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, cleargl.GLFramebuffer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.backends.opengl.OpenGLShaderProgram getDefaultShader() {
        return null;
    }
    
    public final void setDefaultShader(@org.jetbrains.annotations.Nullable()
    graphics.scenery.backends.opengl.OpenGLShaderProgram p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLUBO> getUBOs() {
        return null;
    }
    
    public final void setUBOs(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLUBO> p0) {
    }
    
    /**
     * * Initialises shader parameters for this pass from [settings], which will be serialised
     *     * into [backingBuffer].
     */
    public final void initializeShaderParameters(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Settings settings, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.opengl.OpenGLRenderer.OpenGLBuffer backingBuffer) {
    }
    
    /**
     * * Updates previously set-up shader parameters.
     *     *
     *     * Returns true if the parameters have been updated, and false if not.
     */
    public final boolean updateShaderParameters() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassName() {
        return null;
    }
    
    public final void setPassName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.RenderConfigReader.RenderpassConfig getPassConfig() {
        return null;
    }
    
    public final void setPassConfig(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.RenderConfigReader.RenderpassConfig p0) {
    }
    
    public OpenGLRenderpass(@org.jetbrains.annotations.NotNull()
    java.lang.String passName, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.RenderConfigReader.RenderpassConfig passConfig) {
        super();
    }
    
    /**
     * Class to store 2D rectangles with [width], [height] and offsets [offsetX] and [offsetY] 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;", "", "width", "", "height", "offsetX", "offsetY", "(IIII)V", "getHeight", "()I", "setHeight", "(I)V", "getOffsetX", "setOffsetX", "getOffsetY", "setOffsetY", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "scenery"})
    public static final class Rect2D {
        private int width;
        private int height;
        private int offsetX;
        private int offsetY;
        
        public final int getWidth() {
            return 0;
        }
        
        public final void setWidth(int p0) {
        }
        
        public final int getHeight() {
            return 0;
        }
        
        public final void setHeight(int p0) {
        }
        
        public final int getOffsetX() {
            return 0;
        }
        
        public final void setOffsetX(int p0) {
        }
        
        public final int getOffsetY() {
            return 0;
        }
        
        public final void setOffsetY(int p0) {
        }
        
        public Rect2D(int width, int height, int offsetX, int offsetY) {
            super();
        }
        
        public Rect2D() {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        /**
         * Class to store 2D rectangles with [width], [height] and offsets [offsetX] and [offsetY] 
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D copy(int width, int height, int offsetX, int offsetY) {
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
     * Class to store viewport information, [area], and minimal/maximal depth coordinates ([minDepth] and [maxDepth]). 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Viewport;", "", "area", "Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;", "minDepth", "", "maxDepth", "(Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;FF)V", "getArea", "()Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;", "setArea", "(Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;)V", "getMaxDepth", "()F", "setMaxDepth", "(F)V", "getMinDepth", "setMinDepth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class Viewport {
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D area;
        private float minDepth;
        private float maxDepth;
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D getArea() {
            return null;
        }
        
        public final void setArea(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D p0) {
        }
        
        public final float getMinDepth() {
            return 0.0F;
        }
        
        public final void setMinDepth(float p0) {
        }
        
        public final float getMaxDepth() {
            return 0.0F;
        }
        
        public final void setMaxDepth(float p0) {
        }
        
        public Viewport(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D area, float minDepth, float maxDepth) {
            super();
        }
        
        public Viewport() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D component1() {
            return null;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        /**
         * Class to store viewport information, [area], and minimal/maximal depth coordinates ([minDepth] and [maxDepth]). 
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.Viewport copy(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D area, float minDepth, float maxDepth) {
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
     * Class to store clear values for color targets ([clearColor]) and depth targets ([clearDepth]) 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLRenderpass$ClearValue;", "", "clearColor", "Lcleargl/GLVector;", "clearDepth", "", "(Lcleargl/GLVector;F)V", "getClearColor", "()Lcleargl/GLVector;", "setClearColor", "(Lcleargl/GLVector;)V", "getClearDepth", "()F", "setClearDepth", "(F)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class ClearValue {
        @org.jetbrains.annotations.NotNull()
        private cleargl.GLVector clearColor;
        private float clearDepth;
        
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector getClearColor() {
            return null;
        }
        
        public final void setClearColor(@org.jetbrains.annotations.NotNull()
        cleargl.GLVector p0) {
        }
        
        public final float getClearDepth() {
            return 0.0F;
        }
        
        public final void setClearDepth(float p0) {
        }
        
        public ClearValue(@org.jetbrains.annotations.NotNull()
        cleargl.GLVector clearColor, float clearDepth) {
            super();
        }
        
        public ClearValue() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector component1() {
            return null;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        /**
         * Class to store clear values for color targets ([clearColor]) and depth targets ([clearDepth]) 
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.ClearValue copy(@org.jetbrains.annotations.NotNull()
        cleargl.GLVector clearColor, float clearDepth) {
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
     * * OpenGL metadata class, storing [scissor] areas, [renderArea]s, [clearValues], [viewports], and
     *     * for which [eye] this metadata is valid.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\nH\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006*"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLRenderpass$OpenGLMetadata;", "", "scissor", "Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;", "renderArea", "clearValues", "Lgraphics/scenery/backends/opengl/OpenGLRenderpass$ClearValue;", "viewport", "Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Viewport;", "eye", "", "(Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;Lgraphics/scenery/backends/opengl/OpenGLRenderpass$ClearValue;Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Viewport;I)V", "getClearValues", "()Lgraphics/scenery/backends/opengl/OpenGLRenderpass$ClearValue;", "setClearValues", "(Lgraphics/scenery/backends/opengl/OpenGLRenderpass$ClearValue;)V", "getEye", "()I", "setEye", "(I)V", "getRenderArea", "()Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;", "setRenderArea", "(Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;)V", "getScissor", "setScissor", "getViewport", "()Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Viewport;", "setViewport", "(Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Viewport;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "scenery"})
    public static final class OpenGLMetadata {
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D scissor;
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D renderArea;
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.backends.opengl.OpenGLRenderpass.ClearValue clearValues;
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.backends.opengl.OpenGLRenderpass.Viewport viewport;
        private int eye;
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D getScissor() {
            return null;
        }
        
        public final void setScissor(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D getRenderArea() {
            return null;
        }
        
        public final void setRenderArea(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.ClearValue getClearValues() {
            return null;
        }
        
        public final void setClearValues(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.ClearValue p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.Viewport getViewport() {
            return null;
        }
        
        public final void setViewport(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Viewport p0) {
        }
        
        public final int getEye() {
            return 0;
        }
        
        public final void setEye(int p0) {
        }
        
        public OpenGLMetadata(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D scissor, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D renderArea, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.ClearValue clearValues, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Viewport viewport, int eye) {
            super();
        }
        
        public OpenGLMetadata() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.ClearValue component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.Viewport component4() {
            return null;
        }
        
        public final int component5() {
            return 0;
        }
        
        /**
         * * OpenGL metadata class, storing [scissor] areas, [renderArea]s, [clearValues], [viewports], and
         *     * for which [eye] this metadata is valid.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.opengl.OpenGLRenderpass.OpenGLMetadata copy(@org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D scissor, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D renderArea, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.ClearValue clearValues, @org.jetbrains.annotations.NotNull()
        graphics.scenery.backends.opengl.OpenGLRenderpass.Viewport viewport, int eye) {
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