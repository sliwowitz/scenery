package graphics.scenery;

import java.lang.System;

/**
 * * Base class to use scenery with, keeping the needed boilerplate
 * * to a minimum. Inherit from this class for a quick start.
 * *
 * * @property[applicationName] Name of the application, do not use special chars.
 * * @property[windowWidth] Window width of the application window.
 * * @property[windowHeight] Window height of the application window.
 * * @property[wantREPL] Whether this application should automatically start and display a [REPL].
 * * @property[scijavaContext] A potential pre-existing SciJava context, or null.
 * *
 * * @constructor Creates a new SceneryBase
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\r\b\u0016\u0018\u0000 \u007f2\u00020\u0001:\u0005\u007f\u0080\u0001\u0081\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010t\u001a\u00020uJ\b\u0010v\u001a\u00020uH\u0016J\b\u0010w\u001a\u00020uH\u0016J\u0010\u0010x\u001a\u00020u2\b\u00104\u001a\u0004\u0018\u000105J\b\u0010y\u001a\u00020uH\u0016J\u000e\u0010z\u001a\u00020u2\u0006\u0010{\u001a\u00020\u0003J\u0006\u0010|\u001a\u00020\bJ\u0010\u0010}\u001a\u00020u2\b\b\u0002\u0010~\u001a\u00020\u0003R\u001a\u0010\f\u001a\u00020\rX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001b\u0010(\u001a\u00020)8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010F\u001a\u00020\r2\u0006\u0010@\u001a\u00020\r@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u000f\"\u0004\bH\u0010\u0011R\u0014\u0010I\u001a\u00020JX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020PX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010C\"\u0004\bW\u0010ER\u001a\u0010X\u001a\u00020YX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020\rX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u000f\"\u0004\b`\u0010\u0011R\u001a\u0010a\u001a\u00020\u0017X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0019\"\u0004\bc\u0010\u001bR\u001a\u0010d\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u000f\"\u0004\bf\u0010\u0011R\"\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010hX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010CR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010o\"\u0004\bs\u0010q\u00a8\u0006\u0082\u0001"}, d2 = {"Lgraphics/scenery/SceneryBase;", "", "applicationName", "", "windowWidth", "", "windowHeight", "wantREPL", "", "scijavaContext", "Lorg/scijava/Context;", "(Ljava/lang/String;IIZLorg/scijava/Context;)V", "accumulator", "", "getAccumulator", "()F", "setAccumulator", "(F)V", "getApplicationName", "()Ljava/lang/String;", "setApplicationName", "(Ljava/lang/String;)V", "currentTime", "", "getCurrentTime", "()J", "setCurrentTime", "(J)V", "hub", "Lgraphics/scenery/Hub;", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "inputHandler", "Lgraphics/scenery/controls/InputHandler;", "getInputHandler", "()Lgraphics/scenery/controls/InputHandler;", "setInputHandler", "(Lgraphics/scenery/controls/InputHandler;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate$1", "Lkotlin/Lazy;", "registerNewRenderer", "Lgraphics/scenery/SceneryBase$NewRendererParameters;", "getRegisterNewRenderer", "()Lgraphics/scenery/SceneryBase$NewRendererParameters;", "setRegisterNewRenderer", "(Lgraphics/scenery/SceneryBase$NewRendererParameters;)V", "renderer", "Lgraphics/scenery/backends/Renderer;", "getRenderer", "()Lgraphics/scenery/backends/Renderer;", "setRenderer", "(Lgraphics/scenery/backends/Renderer;)V", "repl", "Lgraphics/scenery/repl/REPL;", "getRepl", "()Lgraphics/scenery/repl/REPL;", "setRepl", "(Lgraphics/scenery/repl/REPL;)V", "<set-?>", "running", "getRunning", "()Z", "setRunning", "(Z)V", "runtime", "getRuntime", "setRuntime", "scene", "Lgraphics/scenery/Scene;", "getScene", "()Lgraphics/scenery/Scene;", "getScijavaContext", "()Lorg/scijava/Context;", "settings", "Lgraphics/scenery/Settings;", "getSettings", "()Lgraphics/scenery/Settings;", "setSettings", "(Lgraphics/scenery/Settings;)V", "shouldClose", "getShouldClose", "setShouldClose", "stats", "Lgraphics/scenery/utils/Statistics;", "getStats", "()Lgraphics/scenery/utils/Statistics;", "setStats", "(Lgraphics/scenery/utils/Statistics;)V", "t", "getT", "setT", "ticks", "getTicks", "setTicks", "timeStep", "getTimeStep", "setTimeStep", "updateFunction", "Lkotlin/Function0;", "getUpdateFunction", "()Lkotlin/jvm/functions/Function0;", "setUpdateFunction", "(Lkotlin/jvm/functions/Function0;)V", "getWantREPL", "getWindowHeight", "()I", "setWindowHeight", "(I)V", "getWindowWidth", "setWindowWidth", "close", "", "init", "inputSetup", "loadInputHandler", "main", "replaceRenderer", "rendererPreference", "sceneInitialized", "setupCameraModeSwitching", "keybinding", "Companion", "NewRendererParameters", "XLib", "scenery"})
public class SceneryBase {
    
    /**
     * The scene used by the renderer in the application 
     */
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.Scene scene = null;
    
    /**
     * REPL for the application, can be initialised in the [init] function 
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.repl.REPL repl;
    
    /**
     * Frame number for counting FPS 
     */
    private long ticks;
    
    /**
     * The Deferred Lighting Renderer for the application, see [OpenGLRenderer] 
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.backends.Renderer renderer;
    
    /**
     * The Hub used by the application, see [Hub] 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Hub hub;
    
    /**
     * Global settings storage 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Settings settings;
    
    /**
     * ui-behaviour input handler 
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.controls.InputHandler inputHandler;
    
    /**
     * [Statistics] object to collect runtime stats on various routines. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.utils.Statistics stats;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.SceneryBase.NewRendererParameters registerNewRenderer;
    
    /**
     * Logger for this application, will be instantiated upon first use. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate$1 = null;
    
    /**
     * An optional update function to call during the main loop. 
     */
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<? extends java.lang.Object> updateFunction;
    
    /**
     * Flag to indicate whether this instance is currently running. 
     */
    private boolean running;
    
    /**
     * Total runtime of this instance. 
     */
    private float runtime;
    
    /**
     * Time step for the main loop 
     */
    private float timeStep;
    private float accumulator;
    private long currentTime;
    private float t;
    private boolean shouldClose;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String applicationName;
    private int windowWidth;
    private int windowHeight;
    private final boolean wantREPL = false;
    @org.jetbrains.annotations.Nullable()
    private final org.scijava.Context scijavaContext = null;
    private static final kotlin.Lazy logger$delegate = null;
    public static final graphics.scenery.SceneryBase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.Scene getScene() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.repl.REPL getRepl() {
        return null;
    }
    
    protected final void setRepl(@org.jetbrains.annotations.Nullable()
    graphics.scenery.repl.REPL p0) {
    }
    
    protected final long getTicks() {
        return 0L;
    }
    
    protected final void setTicks(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.backends.Renderer getRenderer() {
        return null;
    }
    
    protected final void setRenderer(@org.jetbrains.annotations.Nullable()
    graphics.scenery.backends.Renderer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Hub getHub() {
        return null;
    }
    
    public final void setHub(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Hub p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.Settings getSettings() {
        return null;
    }
    
    protected final void setSettings(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Settings p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.controls.InputHandler getInputHandler() {
        return null;
    }
    
    protected final void setInputHandler(@org.jetbrains.annotations.Nullable()
    graphics.scenery.controls.InputHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.utils.Statistics getStats() {
        return null;
    }
    
    protected final void setStats(@org.jetbrains.annotations.NotNull()
    graphics.scenery.utils.Statistics p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.SceneryBase.NewRendererParameters getRegisterNewRenderer() {
        return null;
    }
    
    protected final void setRegisterNewRenderer(@org.jetbrains.annotations.Nullable()
    graphics.scenery.SceneryBase.NewRendererParameters p0) {
    }
    
    /**
     * Logger for this application, will be instantiated upon first use. 
     */
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<java.lang.Object> getUpdateFunction() {
        return null;
    }
    
    public final void setUpdateFunction(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends java.lang.Object> p0) {
    }
    
    public final boolean getRunning() {
        return false;
    }
    
    protected final void setRunning(boolean p0) {
    }
    
    public final float getRuntime() {
        return 0.0F;
    }
    
    protected final void setRuntime(float p0) {
    }
    
    public final float getTimeStep() {
        return 0.0F;
    }
    
    public final void setTimeStep(float p0) {
    }
    
    protected final float getAccumulator() {
        return 0.0F;
    }
    
    protected final void setAccumulator(float p0) {
    }
    
    protected final long getCurrentTime() {
        return 0L;
    }
    
    protected final void setCurrentTime(long p0) {
    }
    
    protected final float getT() {
        return 0.0F;
    }
    
    protected final void setT(float p0) {
    }
    
    protected final boolean getShouldClose() {
        return false;
    }
    
    protected final void setShouldClose(boolean p0) {
    }
    
    /**
     * * the init function of [SceneryBase], override this in your subclass,
     *     * e.g. for [Scene] construction and [Renderer] initialisation.
     */
    public void init() {
    }
    
    /**
     * * Function to contain any custom input setup.
     */
    public void inputSetup() {
    }
    
    /**
     * * Main routine for [SceneryBase]
     *     *
     *     * This routine will construct a internal [ClearGLDefaultEventListener], and initialize
     *     * with the [init] function. Override this in your subclass and be sure to call `super.main()`.
     *     *
     *     * The [ClearGLDefaultEventListener] will take care of usually used window functionality, like
     *     * resizing, closing, setting the OpenGL context, etc. It'll also read a keymap for the [InputHandler],
     *     * based on the [applicationName], from the file `~/.[applicationName].bindings
     *     *
     */
    public void main() {
    }
    
    /**
     * * Sets up switching between [ArcballCameraControl] and [FPSCameraControl].
     *     *
     *     * @param[keybinding] The key to trigger the switching.
     */
    public final void setupCameraModeSwitching(@org.jetbrains.annotations.NotNull()
    java.lang.String keybinding) {
    }
    
    /**
     * * Sets the shouldClose flag on renderer, causing it to shut down and thereby ending the main loop.
     */
    public final void close() {
    }
    
    /**
     * * Returns whether the current scene is done initialising.
     */
    public final boolean sceneInitialized() {
        return false;
    }
    
    /**
     * * Loads a new [InputHandler] for the given [Renderer]. If running headless,
     *     * [renderer] can also be null.
     *     *
     *     * @param[renderer] A [Renderer] instance or null.
     */
    public final void loadInputHandler(@org.jetbrains.annotations.Nullable()
    graphics.scenery.backends.Renderer renderer) {
    }
    
    public final void replaceRenderer(@org.jetbrains.annotations.NotNull()
    java.lang.String rendererPreference) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApplicationName() {
        return null;
    }
    
    public final void setApplicationName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getWindowWidth() {
        return 0;
    }
    
    public final void setWindowWidth(int p0) {
    }
    
    public final int getWindowHeight() {
        return 0;
    }
    
    public final void setWindowHeight(int p0) {
    }
    
    public final boolean getWantREPL() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.scijava.Context getScijavaContext() {
        return null;
    }
    
    public SceneryBase(@org.jetbrains.annotations.NotNull()
    java.lang.String applicationName, int windowWidth, int windowHeight, boolean wantREPL, @org.jetbrains.annotations.Nullable()
    org.scijava.Context scijavaContext) {
        super();
    }
    
    public SceneryBase(@org.jetbrains.annotations.NotNull()
    java.lang.String applicationName, int windowWidth, int windowHeight, boolean wantREPL) {
        super();
    }
    
    public SceneryBase(@org.jetbrains.annotations.NotNull()
    java.lang.String applicationName, int windowWidth, int windowHeight) {
        super();
    }
    
    public SceneryBase(@org.jetbrains.annotations.NotNull()
    java.lang.String applicationName, int windowWidth) {
        super();
    }
    
    public SceneryBase(@org.jetbrains.annotations.NotNull()
    java.lang.String applicationName) {
        super();
    }
    
    /**
     * * Returns the process ID we are running under.
     *         *
     *         * @return The process ID as integer.
     */
    public static final int getProcessID() {
        return 0;
    }
    
    /**
     * * Returns the path set defined by the environment variable SCENERY_DEMO_FILES.
     *         * Should only be used in examples that require the additional model files and will
     *         * emit a warning in case the variable is not set.
     *         *
     *         * @return String containing the path set in SCENERY_DEMO_FILES.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDemoFilesPath() {
        return null;
    }
    
    /**
     * State variable for registering a new renderer 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\bH\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016\u00a8\u0006+"}, d2 = {"Lgraphics/scenery/SceneryBase$NewRendererParameters;", "", "rendererType", "", "hub", "Lgraphics/scenery/Hub;", "applicationName", "width", "", "height", "scene", "Lgraphics/scenery/Scene;", "embedIn", "Lgraphics/scenery/utils/SceneryPanel;", "config", "(Ljava/lang/String;Lgraphics/scenery/Hub;Ljava/lang/String;IILgraphics/scenery/Scene;Lgraphics/scenery/utils/SceneryPanel;Ljava/lang/String;)V", "getApplicationName", "()Ljava/lang/String;", "getConfig", "getEmbedIn", "()Lgraphics/scenery/utils/SceneryPanel;", "getHeight", "()I", "getHub", "()Lgraphics/scenery/Hub;", "getRendererType", "getScene", "()Lgraphics/scenery/Scene;", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "scenery"})
    public static final class NewRendererParameters {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String rendererType = null;
        @org.jetbrains.annotations.NotNull()
        private final graphics.scenery.Hub hub = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String applicationName = null;
        private final int width = 0;
        private final int height = 0;
        @org.jetbrains.annotations.NotNull()
        private final graphics.scenery.Scene scene = null;
        @org.jetbrains.annotations.Nullable()
        private final graphics.scenery.utils.SceneryPanel embedIn = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String config = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRendererType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Hub getHub() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getApplicationName() {
            return null;
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Scene getScene() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final graphics.scenery.utils.SceneryPanel getEmbedIn() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getConfig() {
            return null;
        }
        
        public NewRendererParameters(@org.jetbrains.annotations.NotNull()
        java.lang.String rendererType, @org.jetbrains.annotations.NotNull()
        graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
        java.lang.String applicationName, int width, int height, @org.jetbrains.annotations.NotNull()
        graphics.scenery.Scene scene, @org.jetbrains.annotations.Nullable()
        graphics.scenery.utils.SceneryPanel embedIn, @org.jetbrains.annotations.NotNull()
        java.lang.String config) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Hub component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Scene component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final graphics.scenery.utils.SceneryPanel component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        /**
         * State variable for registering a new renderer 
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.SceneryBase.NewRendererParameters copy(@org.jetbrains.annotations.NotNull()
        java.lang.String rendererType, @org.jetbrains.annotations.NotNull()
        graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
        java.lang.String applicationName, int width, int height, @org.jetbrains.annotations.NotNull()
        graphics.scenery.Scene scene, @org.jetbrains.annotations.Nullable()
        graphics.scenery.utils.SceneryPanel embedIn, @org.jetbrains.annotations.NotNull()
        java.lang.String config) {
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
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lgraphics/scenery/SceneryBase$XLib;", "Lcom/sun/jna/Library;", "XInitThreads", "", "Companion", "scenery"})
    public static abstract interface XLib extends com.sun.jna.Library {
        public static final graphics.scenery.SceneryBase.XLib.Companion Companion = null;
        
        public abstract void XInitThreads();
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/SceneryBase$XLib$Companion;", "", "()V", "INSTANCE", "Lgraphics/scenery/SceneryBase$XLib;", "getINSTANCE", "()Lgraphics/scenery/SceneryBase$XLib;", "scenery"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            private static final graphics.scenery.SceneryBase.XLib INSTANCE = null;
            
            @org.jetbrains.annotations.NotNull()
            public final graphics.scenery.SceneryBase.XLib getINSTANCE() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lgraphics/scenery/SceneryBase$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getDemoFilesPath", "", "getProcessID", "", "scenery"})
    public static final class Companion {
        
        private final org.slf4j.Logger getLogger() {
            return null;
        }
        
        /**
         * * Returns the process ID we are running under.
         *         *
         *         * @return The process ID as integer.
         */
        public final int getProcessID() {
            return 0;
        }
        
        /**
         * * Returns the path set defined by the environment variable SCENERY_DEMO_FILES.
         *         * Should only be used in examples that require the additional model files and will
         *         * emit a warning in case the variable is not set.
         *         *
         *         * @return String containing the path set in SCENERY_DEMO_FILES.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDemoFilesPath() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}