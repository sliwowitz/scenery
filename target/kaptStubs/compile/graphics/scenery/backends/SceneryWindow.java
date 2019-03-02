package graphics.scenery.backends;

import java.lang.System;

/**
 * * Abstraction class for GLFW, ClearGL and JavaFX windows
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u001a\u001b\u001c\u001d\u001e\u001f B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\t\u0082\u0001\u0007!\"#$%&\'\u00a8\u0006("}, d2 = {"Lgraphics/scenery/backends/SceneryWindow;", "", "()V", "<set-?>", "", "height", "getHeight", "()I", "setHeight$scenery", "(I)V", "", "isFullscreen", "()Z", "setFullscreen$scenery", "(Z)V", "shouldClose", "getShouldClose", "setShouldClose", "width", "getWidth", "setWidth$scenery", "pollEvents", "", "setTitle", "title", "", "ClearGLWindow", "GLFWWindow", "HeadlessWindow", "JOGLDrawable", "JavaFXStage", "SwingWindow", "UninitializedWindow", "Lgraphics/scenery/backends/SceneryWindow$UninitializedWindow;", "Lgraphics/scenery/backends/SceneryWindow$GLFWWindow;", "Lgraphics/scenery/backends/SceneryWindow$ClearGLWindow;", "Lgraphics/scenery/backends/SceneryWindow$JOGLDrawable;", "Lgraphics/scenery/backends/SceneryWindow$JavaFXStage;", "Lgraphics/scenery/backends/SceneryWindow$SwingWindow;", "Lgraphics/scenery/backends/SceneryWindow$HeadlessWindow;", "scenery"})
public abstract class SceneryWindow {
    
    /**
     * Whether the window should be closed on the next main loop iteration. 
     */
    private boolean shouldClose;
    
    /**
     * Window width, can only be set from package-internal functions. 
     */
    private int width;
    
    /**
     * Window height, can only be set from package-internal functions. 
     */
    private int height;
    
    /**
     * Window fullscreen state, can only be set from package-internal functions. 
     */
    private boolean isFullscreen;
    
    public final boolean getShouldClose() {
        return false;
    }
    
    public final void setShouldClose(boolean p0) {
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public final void setWidth$scenery(int p0) {
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public final void setHeight$scenery(int p0) {
    }
    
    public final boolean isFullscreen() {
        return false;
    }
    
    public final void setFullscreen$scenery(boolean p0) {
    }
    
    /**
     * * Sets the title of this window to [title].
     */
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    /**
     * * Poll events function, in case the window system requires event polling.
     *     * (Only the case for GLFW so far)
     */
    public final void pollEvents() {
    }
    
    private SceneryWindow() {
        super();
    }
    
    /**
     * The default window state, before it becomes initialized to a specific window kind 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lgraphics/scenery/backends/SceneryWindow$UninitializedWindow;", "Lgraphics/scenery/backends/SceneryWindow;", "()V", "scenery"})
    public static final class UninitializedWindow extends graphics.scenery.backends.SceneryWindow {
        
        public UninitializedWindow() {
            super();
        }
    }
    
    /**
     * GLFW window, with [window] being the pointer to GLFW's window object. 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/backends/SceneryWindow$GLFWWindow;", "Lgraphics/scenery/backends/SceneryWindow;", "window", "", "(J)V", "getWindow", "()J", "setWindow", "scenery"})
    public static final class GLFWWindow extends graphics.scenery.backends.SceneryWindow {
        private long window;
        
        public final long getWindow() {
            return 0L;
        }
        
        public final void setWindow(long p0) {
        }
        
        public GLFWWindow(long window) {
            super();
        }
    }
    
    /**
     * ClearGL (JOGL) window, with [window] being the reference to a [cleargl.ClearGLWindow]. 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/backends/SceneryWindow$ClearGLWindow;", "Lgraphics/scenery/backends/SceneryWindow;", "window", "Lcleargl/ClearGLWindow;", "(Lcleargl/ClearGLWindow;)V", "getWindow", "()Lcleargl/ClearGLWindow;", "setWindow", "scenery"})
    public static final class ClearGLWindow extends graphics.scenery.backends.SceneryWindow {
        @org.jetbrains.annotations.NotNull()
        private cleargl.ClearGLWindow window;
        
        @org.jetbrains.annotations.NotNull()
        public final cleargl.ClearGLWindow getWindow() {
            return null;
        }
        
        public final void setWindow(@org.jetbrains.annotations.NotNull()
        cleargl.ClearGLWindow p0) {
        }
        
        public ClearGLWindow(@org.jetbrains.annotations.NotNull()
        cleargl.ClearGLWindow window) {
            super();
        }
    }
    
    /**
     * JOGL GLAutoDrawable, with [drawable] being the reference to a [GLAutoDrawable]. 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/backends/SceneryWindow$JOGLDrawable;", "Lgraphics/scenery/backends/SceneryWindow;", "drawable", "Lcom/jogamp/opengl/GLAutoDrawable;", "(Lcom/jogamp/opengl/GLAutoDrawable;)V", "getDrawable", "()Lcom/jogamp/opengl/GLAutoDrawable;", "setDrawable", "scenery"})
    public static final class JOGLDrawable extends graphics.scenery.backends.SceneryWindow {
        @org.jetbrains.annotations.NotNull()
        private com.jogamp.opengl.GLAutoDrawable drawable;
        
        @org.jetbrains.annotations.NotNull()
        public final com.jogamp.opengl.GLAutoDrawable getDrawable() {
            return null;
        }
        
        public final void setDrawable(@org.jetbrains.annotations.NotNull()
        com.jogamp.opengl.GLAutoDrawable p0) {
        }
        
        public JOGLDrawable(@org.jetbrains.annotations.NotNull()
        com.jogamp.opengl.GLAutoDrawable drawable) {
            super();
        }
    }
    
    /**
     * JavaFX window or stage, with [panel] being the [SceneryFXPanel] scenery will render to. 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/backends/SceneryWindow$JavaFXStage;", "Lgraphics/scenery/backends/SceneryWindow;", "panel", "Lgraphics/scenery/utils/SceneryFXPanel;", "(Lgraphics/scenery/utils/SceneryFXPanel;)V", "getPanel", "()Lgraphics/scenery/utils/SceneryFXPanel;", "setPanel", "scenery"})
    public static final class JavaFXStage extends graphics.scenery.backends.SceneryWindow {
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.utils.SceneryFXPanel panel;
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.utils.SceneryFXPanel getPanel() {
            return null;
        }
        
        public final void setPanel(@org.jetbrains.annotations.NotNull()
        graphics.scenery.utils.SceneryFXPanel p0) {
        }
        
        public JavaFXStage(@org.jetbrains.annotations.NotNull()
        graphics.scenery.utils.SceneryFXPanel panel) {
            super();
        }
    }
    
    /**
     * Swing window with [panel] being the [SceneryJPanel] 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/backends/SceneryWindow$SwingWindow;", "Lgraphics/scenery/backends/SceneryWindow;", "panel", "Lgraphics/scenery/utils/SceneryJPanel;", "(Lgraphics/scenery/utils/SceneryJPanel;)V", "getPanel", "()Lgraphics/scenery/utils/SceneryJPanel;", "setPanel", "scenery"})
    public static final class SwingWindow extends graphics.scenery.backends.SceneryWindow {
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.utils.SceneryJPanel panel;
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.utils.SceneryJPanel getPanel() {
            return null;
        }
        
        public final void setPanel(@org.jetbrains.annotations.NotNull()
        graphics.scenery.utils.SceneryJPanel p0) {
        }
        
        public SwingWindow(@org.jetbrains.annotations.NotNull()
        graphics.scenery.utils.SceneryJPanel panel) {
            super();
        }
    }
    
    /**
     * Headless window with no chrome whatsoever. 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lgraphics/scenery/backends/SceneryWindow$HeadlessWindow;", "Lgraphics/scenery/backends/SceneryWindow;", "()V", "scenery"})
    public static final class HeadlessWindow extends graphics.scenery.backends.SceneryWindow {
        
        public HeadlessWindow() {
            super();
        }
    }
}