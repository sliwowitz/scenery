package graphics.scenery.backends;

/**
 * * Renderer interface. Defines the minimal set of functions a renderer has to implement.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 C2\u00020\u0001:\u0001CB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00103\u001a\u000204H&J\b\u00105\u001a\u000204H&J\u000e\u00106\u001a\u00020%2\u0006\u0010$\u001a\u00020%J\b\u00107\u001a\u000204H&J\u0018\u00108\u001a\u0002042\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H&J\u0006\u0010<\u001a\u000204J\u001c\u0010<\u001a\u0002042\b\b\u0002\u0010=\u001a\u00020\u001f2\b\b\u0002\u0010>\u001a\u00020\nH&J\u0010\u0010?\u001a\u0002042\u0006\u0010@\u001a\u00020AH&J\u0006\u0010B\u001a\u000204R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@dX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@dX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0013\u001a\u00020\u0014X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0018\u0010\u001b\u001a\u00020\nX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u0018\u0010\u001e\u001a\u00020\u001fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010$\u001a\u00020%X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0018\u0010*\u001a\u00020\nX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR\u0018\u0010-\u001a\u00020.X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u0006D"}, d2 = {"Lgraphics/scenery/backends/Renderer;", "Lgraphics/scenery/Hubable;", "()V", "embedIn", "Lgraphics/scenery/utils/SceneryPanel;", "getEmbedIn", "()Lgraphics/scenery/utils/SceneryPanel;", "setEmbedIn", "(Lgraphics/scenery/utils/SceneryPanel;)V", "<set-?>", "", "firstImageReady", "getFirstImageReady", "()Z", "setFirstImageReady", "(Z)V", "initialized", "getInitialized", "setInitialized", "lastFrameTime", "", "getLastFrameTime", "()F", "setLastFrameTime", "(F)V", "managesRenderLoop", "getManagesRenderLoop", "pushMode", "getPushMode", "setPushMode", "renderConfigFile", "", "getRenderConfigFile", "()Ljava/lang/String;", "setRenderConfigFile", "(Ljava/lang/String;)V", "settings", "Lgraphics/scenery/Settings;", "getSettings", "()Lgraphics/scenery/Settings;", "setSettings", "(Lgraphics/scenery/Settings;)V", "shouldClose", "getShouldClose", "setShouldClose", "window", "Lgraphics/scenery/backends/SceneryWindow;", "getWindow", "()Lgraphics/scenery/backends/SceneryWindow;", "setWindow", "(Lgraphics/scenery/backends/SceneryWindow;)V", "close", "", "initializeScene", "loadDefaultRendererSettings", "render", "reshape", "newWidth", "", "newHeight", "screenshot", "filename", "overwrite", "setRenderingQuality", "quality", "Lgraphics/scenery/backends/RenderConfigReader$RenderingQuality;", "toggleVR", "Companion", "scenery"})
public abstract class Renderer implements graphics.scenery.Hubable {
    public static final graphics.scenery.backends.Renderer.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy logger$delegate = null;

    public Renderer() {
        super();
    }

    /**
     * * Creates a new [Renderer] instance, based on what is available on the current platform, or set via
     * * the scenery.Renderer system property.
     * *
     * * On Linux and Windows, [VulkanRenderer]will be created by default.
     * * On macOS, [OpenGLRenderer] will be created by default.
     * *
     * * @param[hub] The [Hub] to use.
     * * @param[applicationName] Application name, mainly used for the title bar if shown.
     * * @param[scene] The initial [Scene] the renderer should display.
     * * @param[windowWidth] Window width for the renderer window.
     * * @param[windowHeight] Window height for the renderer window.
     * * @param[embedIn] A [SceneryWindow] to embed the renderer in, can e.g. be a JavaFX window.
     * * @param[renderConfigFile] A YAML file with the render path configuration from which a [RenderConfigReader.RenderConfig] will be created.
     * *
     * * @return A new [Renderer] instance.
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.backends.Renderer createRenderer(@org.jetbrains.annotations.NotNull()
                                                                              graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                                                                              java.lang.String applicationName, @org.jetbrains.annotations.NotNull()
                                                                              graphics.scenery.Scene scene, int windowWidth, int windowHeight, @org.jetbrains.annotations.Nullable()
                                                                              graphics.scenery.utils.SceneryPanel embedIn, @org.jetbrains.annotations.Nullable()
                                                                              java.lang.String renderConfigFile) {
        return null;
    }

    /**
     * * Creates a new [Renderer] instance, based on what is available on the current platform, or set via
     * * the scenery.Renderer system property.
     * *
     * * On Linux and Windows, [VulkanRenderer]will be created by default.
     * * On macOS, [OpenGLRenderer] will be created by default.
     * *
     * * @param[hub] The [Hub] to use.
     * * @param[applicationName] Application name, mainly used for the title bar if shown.
     * * @param[scene] The initial [Scene] the renderer should display.
     * * @param[windowWidth] Window width for the renderer window.
     * * @param[windowHeight] Window height for the renderer window.
     * * @param[embedIn] A [SceneryWindow] to embed the renderer in, can e.g. be a JavaFX window.
     * * @param[renderConfigFile] A YAML file with the render path configuration from which a [RenderConfigReader.RenderConfig] will be created.
     * *
     * * @return A new [Renderer] instance.
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.backends.Renderer createRenderer(@org.jetbrains.annotations.NotNull()
                                                                              graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                                                                              java.lang.String applicationName, @org.jetbrains.annotations.NotNull()
                                                                              graphics.scenery.Scene scene, int windowWidth, int windowHeight, @org.jetbrains.annotations.Nullable()
                                                                              graphics.scenery.utils.SceneryPanel embedIn) {
        return null;
    }

    /**
     * * Creates a new [Renderer] instance, based on what is available on the current platform, or set via
     * * the scenery.Renderer system property.
     * *
     * * On Linux and Windows, [VulkanRenderer]will be created by default.
     * * On macOS, [OpenGLRenderer] will be created by default.
     * *
     * * @param[hub] The [Hub] to use.
     * * @param[applicationName] Application name, mainly used for the title bar if shown.
     * * @param[scene] The initial [Scene] the renderer should display.
     * * @param[windowWidth] Window width for the renderer window.
     * * @param[windowHeight] Window height for the renderer window.
     * * @param[embedIn] A [SceneryWindow] to embed the renderer in, can e.g. be a JavaFX window.
     * * @param[renderConfigFile] A YAML file with the render path configuration from which a [RenderConfigReader.RenderConfig] will be created.
     * *
     * * @return A new [Renderer] instance.
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.backends.Renderer createRenderer(@org.jetbrains.annotations.NotNull()
                                                                              graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                                                                              java.lang.String applicationName, @org.jetbrains.annotations.NotNull()
                                                                              graphics.scenery.Scene scene, int windowWidth, int windowHeight) {
        return null;
    }

    /**
     * * Initializes scene and contents
     */
    public abstract void initializeScene();

    /**
     * * Renders the scene
     */
    public abstract void render();

    /**
     * Signals whether the current renderer should stop working and close all open windows.
     */
    public abstract boolean getShouldClose();

    /**
     * Signals whether the current renderer should stop working and close all open windows.
     */
    public abstract void setShouldClose(boolean p0);

    /**
     * Signals whether the renderer is done initialiasing and can start with scene initialisation and rendering.
     */
    public abstract boolean getInitialized();

    protected abstract void setInitialized(boolean p0);

    /**
     * Signals whether a first image has been drawn.
     */
    public abstract boolean getFirstImageReady();

    protected abstract void setFirstImageReady(boolean p0);

    /**
     * [Settings] instance the renderer is using.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract graphics.scenery.Settings getSettings();

    /**
     * [Settings] instance the renderer is using.
     */
    public abstract void setSettings(@org.jetbrains.annotations.NotNull()
                                         graphics.scenery.Settings p0);

    /**
     * [SceneryWindow] the renderer is drawing to.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract graphics.scenery.backends.SceneryWindow getWindow();

    /**
     * [SceneryWindow] the renderer is drawing to.
     */
    public abstract void setWindow(@org.jetbrains.annotations.NotNull()
                                       graphics.scenery.backends.SceneryWindow p0);

    /**
     * A [SceneryPanel] the renderer might be embedded in.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract graphics.scenery.utils.SceneryPanel getEmbedIn();

    /**
     * A [SceneryPanel] the renderer might be embedded in.
     */
    public abstract void setEmbedIn(@org.jetbrains.annotations.Nullable()
                                        graphics.scenery.utils.SceneryPanel p0);

    /**
     * * Method to close the renderer.
     */
    public abstract void close();

    /**
     * * Takes a screenshot, and saves it to the users's desktop directory.
     */
    public final void screenshot() {
    }

    /**
     * * Takes a screenshot, and saves it as [filename].
     * *
     * * @param[filename] The filename where to save the screenshot.
     */
    public abstract void screenshot(@org.jetbrains.annotations.NotNull()
                                        java.lang.String filename, boolean overwrite);

    /**
     * * Reshapes the window to the given sizes.
     * *
     * * @param[newWidth] The new width of the window.
     * * @param[newHeight] The new height of the window.
     */
    public abstract void reshape(int newWidth, int newHeight);

    /**
     * * Sets the rendering quality, if the loaded renderer config file supports it.
     * *
     * * @param[quality] The [RenderConfigReader.RenderingQuality] to be set.
     */
    public abstract void setRenderingQuality(@org.jetbrains.annotations.NotNull()
                                                 graphics.scenery.backends.RenderConfigReader.RenderingQuality quality);

    /**
     * * Activate or deactivate push-based rendering mode (render only on scene changes
     * * or input events). Push mode is activated if [pushMode] is true.
     */
    public abstract boolean getPushMode();

    /**
     * * Activate or deactivate push-based rendering mode (render only on scene changes
     * * or input events). Push mode is activated if [pushMode] is true.
     */
    public abstract void setPushMode(boolean p0);

    /**
     * * Whether the renderer manages it's own main loop. If false, [graphics.scenery.SceneryBase] will take
     * * care of the rendering loop inside its main loop.
     */
    public abstract boolean getManagesRenderLoop();

    /**
     * Total time taken for the last frame (in milliseconds).
     */
    public abstract float getLastFrameTime();

    /**
     * Total time taken for the last frame (in milliseconds).
     */
    public abstract void setLastFrameTime(float p0);

    /**
     * The file to read the [RenderConfigReader.RenderConfig] from.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getRenderConfigFile();

    /**
     * The file to read the [RenderConfigReader.RenderConfig] from.
     */
    public abstract void setRenderConfigFile(@org.jetbrains.annotations.NotNull()
                                                 java.lang.String p0);

    /**
     * * Toggles VR on and off, and loads the appropriate renderer config file, if it exists.
     * * The name is the name of the current renderer config file, with "Stereo" at the end.
     */
    @kotlin.Suppress(names = {"UNUSED"})
    public final void toggleVR() {
    }

    /**
     * * Adds the default [Settings] for [Renderer] to a given [Settings] instance.
     * *
     * * Providing some sane defaults that may of course be overridden after
     * * construction of the renderer.
     * *
     * * @param[settings] The [Settings] instance to augment.
     * * @return Default [Settings] values.
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Settings loadDefaultRendererSettings(@org.jetbrains.annotations.NotNull()
                                                                           graphics.scenery.Settings settings) {
        return null;
    }

    /**
     * * Factory methods for creating renderers.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JH\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0007R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lgraphics/scenery/backends/Renderer$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "createRenderer", "Lgraphics/scenery/backends/Renderer;", "hub", "Lgraphics/scenery/Hub;", "applicationName", "", "scene", "Lgraphics/scenery/Scene;", "windowWidth", "", "windowHeight", "embedIn", "Lgraphics/scenery/utils/SceneryPanel;", "renderConfigFile", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final org.slf4j.Logger getLogger() {
            return null;
        }

        /**
         * * Creates a new [Renderer] instance, based on what is available on the current platform, or set via
         * * the scenery.Renderer system property.
         * *
         * * On Linux and Windows, [VulkanRenderer]will be created by default.
         * * On macOS, [OpenGLRenderer] will be created by default.
         * *
         * * @param[hub] The [Hub] to use.
         * * @param[applicationName] Application name, mainly used for the title bar if shown.
         * * @param[scene] The initial [Scene] the renderer should display.
         * * @param[windowWidth] Window width for the renderer window.
         * * @param[windowHeight] Window height for the renderer window.
         * * @param[embedIn] A [SceneryWindow] to embed the renderer in, can e.g. be a JavaFX window.
         * * @param[renderConfigFile] A YAML file with the render path configuration from which a [RenderConfigReader.RenderConfig] will be created.
         * *
         * * @return A new [Renderer] instance.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.Renderer createRenderer(@org.jetbrains.annotations.NotNull()
                                                                           graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                                                                           java.lang.String applicationName, @org.jetbrains.annotations.NotNull()
                                                                           graphics.scenery.Scene scene, int windowWidth, int windowHeight, @org.jetbrains.annotations.Nullable()
                                                                           graphics.scenery.utils.SceneryPanel embedIn, @org.jetbrains.annotations.Nullable()
                                                                           java.lang.String renderConfigFile) {
            return null;
        }

        /**
         * * Creates a new [Renderer] instance, based on what is available on the current platform, or set via
         * * the scenery.Renderer system property.
         * *
         * * On Linux and Windows, [VulkanRenderer]will be created by default.
         * * On macOS, [OpenGLRenderer] will be created by default.
         * *
         * * @param[hub] The [Hub] to use.
         * * @param[applicationName] Application name, mainly used for the title bar if shown.
         * * @param[scene] The initial [Scene] the renderer should display.
         * * @param[windowWidth] Window width for the renderer window.
         * * @param[windowHeight] Window height for the renderer window.
         * * @param[embedIn] A [SceneryWindow] to embed the renderer in, can e.g. be a JavaFX window.
         * * @param[renderConfigFile] A YAML file with the render path configuration from which a [RenderConfigReader.RenderConfig] will be created.
         * *
         * * @return A new [Renderer] instance.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.Renderer createRenderer(@org.jetbrains.annotations.NotNull()
                                                                           graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                                                                           java.lang.String applicationName, @org.jetbrains.annotations.NotNull()
                                                                           graphics.scenery.Scene scene, int windowWidth, int windowHeight, @org.jetbrains.annotations.Nullable()
                                                                           graphics.scenery.utils.SceneryPanel embedIn) {
            return null;
        }

        /**
         * * Creates a new [Renderer] instance, based on what is available on the current platform, or set via
         * * the scenery.Renderer system property.
         * *
         * * On Linux and Windows, [VulkanRenderer]will be created by default.
         * * On macOS, [OpenGLRenderer] will be created by default.
         * *
         * * @param[hub] The [Hub] to use.
         * * @param[applicationName] Application name, mainly used for the title bar if shown.
         * * @param[scene] The initial [Scene] the renderer should display.
         * * @param[windowWidth] Window width for the renderer window.
         * * @param[windowHeight] Window height for the renderer window.
         * * @param[embedIn] A [SceneryWindow] to embed the renderer in, can e.g. be a JavaFX window.
         * * @param[renderConfigFile] A YAML file with the render path configuration from which a [RenderConfigReader.RenderConfig] will be created.
         * *
         * * @return A new [Renderer] instance.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.Renderer createRenderer(@org.jetbrains.annotations.NotNull()
                                                                           graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                                                                           java.lang.String applicationName, @org.jetbrains.annotations.NotNull()
                                                                           graphics.scenery.Scene scene, int windowWidth, int windowHeight) {
            return null;
        }
    }
}
