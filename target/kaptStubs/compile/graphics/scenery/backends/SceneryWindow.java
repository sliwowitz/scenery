package graphics.scenery.backends;

/**
 * * Abstraction class for GLFW, ClearGL and JavaFX windows
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u001a\u001b\u001c\u001d\u001eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\t\u0082\u0001\u0005\u001f !\"#\u00a8\u0006$"}, d2 = {"Lgraphics/scenery/backends/SceneryWindow;", "", "()V", "<set-?>", "", "height", "getHeight", "()I", "setHeight$scenery", "(I)V", "", "isFullscreen", "()Z", "setFullscreen$scenery", "(Z)V", "shouldClose", "getShouldClose", "setShouldClose", "width", "getWidth", "setWidth$scenery", "pollEvents", "", "setTitle", "title", "", "ClearGLWindow", "GLFWWindow", "HeadlessWindow", "JavaFXStage", "UninitializedWindow", "Lgraphics/scenery/backends/SceneryWindow$UninitializedWindow;", "Lgraphics/scenery/backends/SceneryWindow$GLFWWindow;", "Lgraphics/scenery/backends/SceneryWindow$ClearGLWindow;", "Lgraphics/scenery/backends/SceneryWindow$JavaFXStage;", "Lgraphics/scenery/backends/SceneryWindow$HeadlessWindow;", "scenery"})
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

    private SceneryWindow() {
        super();
    }

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
     * * (Only the case for GLFW so far)
     */
    public final void pollEvents() {
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

        public GLFWWindow(long window) {
            super();
        }

        public final long getWindow() {
            return 0L;
        }

        public final void setWindow(long p0) {
        }
    }

    /**
     * ClearGL (JOGL) window, with [window] being the reference to a [cleargl.ClearGLWindow].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/backends/SceneryWindow$ClearGLWindow;", "Lgraphics/scenery/backends/SceneryWindow;", "window", "Lcleargl/ClearGLWindow;", "(Lcleargl/ClearGLWindow;)V", "getWindow", "()Lcleargl/ClearGLWindow;", "setWindow", "scenery"})
    public static final class ClearGLWindow extends graphics.scenery.backends.SceneryWindow {
        @org.jetbrains.annotations.NotNull()
        private cleargl.ClearGLWindow window;

        public ClearGLWindow(@org.jetbrains.annotations.NotNull()
                                 cleargl.ClearGLWindow window) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final cleargl.ClearGLWindow getWindow() {
            return null;
        }

        public final void setWindow(@org.jetbrains.annotations.NotNull()
                                        cleargl.ClearGLWindow p0) {
        }
    }

    /**
     * JavaFX window or stage, with [panel] being the [SceneryPanel] scenery will render to.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/backends/SceneryWindow$JavaFXStage;", "Lgraphics/scenery/backends/SceneryWindow;", "panel", "Lgraphics/scenery/utils/SceneryPanel;", "(Lgraphics/scenery/utils/SceneryPanel;)V", "getPanel", "()Lgraphics/scenery/utils/SceneryPanel;", "setPanel", "scenery"})
    public static final class JavaFXStage extends graphics.scenery.backends.SceneryWindow {
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.utils.SceneryPanel panel;

        public JavaFXStage(@org.jetbrains.annotations.NotNull()
                               graphics.scenery.utils.SceneryPanel panel) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.utils.SceneryPanel getPanel() {
            return null;
        }

        public final void setPanel(@org.jetbrains.annotations.NotNull()
                                       graphics.scenery.utils.SceneryPanel p0) {
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
