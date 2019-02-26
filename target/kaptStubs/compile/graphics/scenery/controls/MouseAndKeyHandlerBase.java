package graphics.scenery.controls;

/**
 * * Base class for MouseAndKeyHandlers
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001oB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010`\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u000e\u0010d\u001a\u00020a2\u0006\u0010b\u001a\u00020eJ\u0012\u0010f\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\r\u0010g\u001a\u00020\tH\u0010\u00a2\u0006\u0002\bhJ\u000e\u0010i\u001a\u00020a2\u0006\u0010j\u001a\u00020\u0019J\u000e\u0010k\u001a\u00020a2\u0006\u0010l\u001a\u000204J\b\u0010m\u001a\u00020aH\u0004J\b\u0010n\u001a\u00020aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\tX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000e0\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0011R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00050*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\tX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\u0017R\u001a\u00103\u001a\u000204X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000e0\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0011R \u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0011R\u0014\u0010=\u001a\u00020>X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001b\u0010A\u001a\u00020B8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bC\u0010DR\u001a\u0010G\u001a\u00020HX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\tX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000b\"\u0004\bO\u0010\u0017R\u001a\u0010P\u001a\u00020\tX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\u0017R\u0014\u0010S\u001a\u00020TX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010VR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\u000e0\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010\u0011R\u001a\u0010Z\u001a\u00020HX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010J\"\u0004\b\\\u0010LR\u001a\u0010]\u001a\u00020HX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010J\"\u0004\b_\u0010L\u00a8\u0006p"}, d2 = {"Lgraphics/scenery/controls/MouseAndKeyHandlerBase;", "Lnet/java/games/input/ControllerListener;", "Lgraphics/scenery/utils/ExtractsNatives;", "()V", "CONTROLLER_DOWN_THRESHOLD", "", "CONTROLLER_HEARTBEAT", "", "DOUBLE_CLICK_INTERVAL", "", "getDOUBLE_CLICK_INTERVAL", "()I", "activeButtonDrags", "Ljava/util/ArrayList;", "Lgraphics/scenery/controls/MouseAndKeyHandlerBase$BehaviourEntry;", "Lorg/scijava/ui/behaviour/DragBehaviour;", "getActiveButtonDrags", "()Ljava/util/ArrayList;", "activeKeyDrags", "getActiveKeyDrags", "behaviourMapExpectedModCount", "getBehaviourMapExpectedModCount", "setBehaviourMapExpectedModCount", "(I)V", "behaviours", "Lorg/scijava/ui/behaviour/BehaviourMap;", "getBehaviours", "()Lorg/scijava/ui/behaviour/BehaviourMap;", "setBehaviours", "(Lorg/scijava/ui/behaviour/BehaviourMap;)V", "buttonClicks", "Lorg/scijava/ui/behaviour/ClickBehaviour;", "getButtonClicks", "buttonDrags", "getButtonDrags", "controller", "Lnet/java/games/input/Controller;", "getController", "()Lnet/java/games/input/Controller;", "setController", "(Lnet/java/games/input/Controller;)V", "controllerAxisDown", "Ljava/util/concurrent/ConcurrentHashMap;", "Lnet/java/games/input/Component$Identifier;", "controllerThread", "Ljava/lang/Thread;", "gamepads", "Lgraphics/scenery/controls/behaviours/GamepadBehaviour;", "inputMapExpectedModCount", "getInputMapExpectedModCount", "setInputMapExpectedModCount", "inputTriggerMap", "Lorg/scijava/ui/behaviour/InputTriggerMap;", "getInputTriggerMap", "()Lorg/scijava/ui/behaviour/InputTriggerMap;", "setInputTriggerMap", "(Lorg/scijava/ui/behaviour/InputTriggerMap;)V", "keyClicks", "getKeyClicks", "keyDrags", "getKeyDrags", "keyPressTimes", "Lgnu/trove/map/hash/TIntLongHashMap;", "getKeyPressTimes", "()Lgnu/trove/map/hash/TIntLongHashMap;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "metaPressed", "", "getMetaPressed", "()Z", "setMetaPressed", "(Z)V", "mouseX", "getMouseX", "setMouseX", "mouseY", "getMouseY", "setMouseY", "pressedKeys", "Lgnu/trove/set/hash/TIntHashSet;", "getPressedKeys", "()Lgnu/trove/set/hash/TIntHashSet;", "scrolls", "Lorg/scijava/ui/behaviour/ScrollBehaviour;", "getScrolls", "shiftPressed", "getShiftPressed", "setShiftPressed", "winPressed", "getWinPressed", "setWinPressed", "controllerAdded", "", "event", "Lnet/java/games/input/ControllerEvent;", "controllerEvent", "Lnet/java/games/input/Event;", "controllerRemoved", "getDoubleClickInterval", "getDoubleClickInterval$scenery", "setBehaviourMap", "behaviourMap", "setInputMap", "inputMap", "update", "updateInternalMaps", "BehaviourEntry", "scenery"})
public class MouseAndKeyHandlerBase implements net.java.games.input.ControllerListener, graphics.scenery.utils.ExtractsNatives {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    private final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<graphics.scenery.controls.behaviours.GamepadBehaviour>> gamepads = null;
    private final long CONTROLLER_HEARTBEAT = 5L;
    private final float CONTROLLER_DOWN_THRESHOLD = 0.95F;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.DragBehaviour>> buttonDrags = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.DragBehaviour>> keyDrags = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.ClickBehaviour>> buttonClicks = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.ClickBehaviour>> keyClicks = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.ScrollBehaviour>> scrolls = null;
    /**
     * * Which keys are currently pressed. This does not include modifier keys
     * * Control, Shift, Alt, AltGr, Meta.
     */
    @org.jetbrains.annotations.NotNull()
    private final gnu.trove.set.hash.TIntHashSet pressedKeys = null;
    /**
     * * When keys where pressed
     */
    @org.jetbrains.annotations.NotNull()
    private final gnu.trove.map.hash.TIntLongHashMap keyPressTimes = null;
    /**
     * * Active [DragBehaviour]s initiated by mouse button press.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.DragBehaviour>> activeButtonDrags = null;
    /**
     * * Active [DragBehaviour]s initiated by key press.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.DragBehaviour>> activeKeyDrags = null;
    /**
     * the windowing system's set double click interval
     */
    private final int DOUBLE_CLICK_INTERVAL = 0;
    /**
     * ui-behaviour input trigger map
     */
    @org.jetbrains.annotations.NotNull()
    protected org.scijava.ui.behaviour.InputTriggerMap inputTriggerMap;
    /**
     * ui-behaviour behaviour map
     */
    @org.jetbrains.annotations.NotNull()
    protected org.scijava.ui.behaviour.BehaviourMap behaviours;
    /**
     * expected modifier count
     */
    private int inputMapExpectedModCount;
    /**
     * behaviour expected modifier count
     */
    private int behaviourMapExpectedModCount;
    /**
     * handle to the active controller
     */
    @org.jetbrains.annotations.Nullable()
    private net.java.games.input.Controller controller;
    private java.lang.Thread controllerThread;
    private java.util.concurrent.ConcurrentHashMap<net.java.games.input.Component.Identifier, java.lang.Float> controllerAxisDown;
    /**
     * * Whether the SHIFT key is currently pressed. We need this, because for
     * * mouse-wheel AWT uses the SHIFT_DOWN_MASK to indicate horizontal
     * * scrolling. We keep track of whether the SHIFT key was actually pressed
     * * for disambiguation.
     */
    private boolean shiftPressed;
    /**
     * * Whether the META key is currently pressed. We need this, because on OS X
     * * AWT sets the META_DOWN_MASK to for right clicks. We keep track of whether
     * * the META key was actually pressed for disambiguation.
     */
    private boolean metaPressed;
    /**
     * * Whether the WINDOWS key is currently pressed.
     */
    private boolean winPressed;
    /**
     * * The current mouse coordinates, updated through [.mouseMoved].
     */
    private int mouseX;
    /**
     * * The current mouse coordinates, updated through [.mouseMoved].
     */
    private int mouseY;

    public MouseAndKeyHandlerBase() {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.scijava.ui.behaviour.InputTriggerMap getInputTriggerMap() {
        return null;
    }

    protected final void setInputTriggerMap(@org.jetbrains.annotations.NotNull()
                                                org.scijava.ui.behaviour.InputTriggerMap p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.scijava.ui.behaviour.BehaviourMap getBehaviours() {
        return null;
    }

    protected final void setBehaviours(@org.jetbrains.annotations.NotNull()
                                           org.scijava.ui.behaviour.BehaviourMap p0) {
    }

    protected final int getInputMapExpectedModCount() {
        return 0;
    }

    protected final void setInputMapExpectedModCount(int p0) {
    }

    protected final int getBehaviourMapExpectedModCount() {
        return 0;
    }

    protected final void setBehaviourMapExpectedModCount(int p0) {
    }

    @org.jetbrains.annotations.Nullable()
    protected final net.java.games.input.Controller getController() {
        return null;
    }

    protected final void setController(@org.jetbrains.annotations.Nullable()
                                           net.java.games.input.Controller p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.DragBehaviour>> getButtonDrags() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.DragBehaviour>> getKeyDrags() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.ClickBehaviour>> getButtonClicks() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.ClickBehaviour>> getKeyClicks() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.ScrollBehaviour>> getScrolls() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final gnu.trove.set.hash.TIntHashSet getPressedKeys() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final gnu.trove.map.hash.TIntLongHashMap getKeyPressTimes() {
        return null;
    }

    protected final boolean getShiftPressed() {
        return false;
    }

    protected final void setShiftPressed(boolean p0) {
    }

    protected final boolean getMetaPressed() {
        return false;
    }

    protected final void setMetaPressed(boolean p0) {
    }

    protected final boolean getWinPressed() {
        return false;
    }

    protected final void setWinPressed(boolean p0) {
    }

    protected final int getMouseX() {
        return 0;
    }

    protected final void setMouseX(int p0) {
    }

    protected final int getMouseY() {
        return 0;
    }

    protected final void setMouseY(int p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.DragBehaviour>> getActiveButtonDrags() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<graphics.scenery.controls.MouseAndKeyHandlerBase.BehaviourEntry<org.scijava.ui.behaviour.DragBehaviour>> getActiveKeyDrags() {
        return null;
    }

    protected int getDOUBLE_CLICK_INTERVAL() {
        return 0;
    }

    /**
     * * Queries the windowing system for the current double click interval
     * *
     * * @return The double click interval in ms
     */
    public int getDoubleClickInterval$scenery() {
        return 0;
    }

    /**
     * * Sets the input trigger map to the given map
     * *
     * * @param[inputMap] The input map to set
     */
    public final void setInputMap(@org.jetbrains.annotations.NotNull()
                                      org.scijava.ui.behaviour.InputTriggerMap inputMap) {
    }

    /**
     * * Sets the behaviour trigger map to the given map
     * *
     * * @param[behaviourMap] The behaviour map to set
     */
    public final void setBehaviourMap(@org.jetbrains.annotations.NotNull()
                                          org.scijava.ui.behaviour.BehaviourMap behaviourMap) {
    }

    /**
     * * Make sure that the internal behaviour lists are up to date. For this, we
     * * keep track the modification count of [.inputMap] and
     * * [.behaviourMap]. If expected mod counts are not matched, call
     * * [.updateInternalMaps] to rebuild the internal behaviour lists.
     */
    protected final synchronized void update() {
    }

    /**
     * * Build internal lists buttonDrag, keyDrags, etc from BehaviourMap(?) and
     * * InputMap(?). The internal lists only contain entries for Behaviours that
     * * can be actually triggered with the current InputMap, grouped by Behaviour
     * * type, such that hopefully lookup from the event handlers is fast.
     */
    private final void updateInternalMaps() {
    }

    /**
     * * Called when a new controller is added
     * *
     * * @param[event] The incoming controller event
     */
    @java.lang.Override()
    public void controllerAdded(@org.jetbrains.annotations.Nullable()
                                    net.java.games.input.ControllerEvent event) {
    }

    /**
     * * Called when a controller is removed
     * *
     * * @param[event] The incoming controller event
     */
    @java.lang.Override()
    public void controllerRemoved(@org.jetbrains.annotations.Nullable()
                                      net.java.games.input.ControllerEvent event) {
    }

    /**
     * * Called when a controller event is fired. This will update the currently down
     * * buttons/axis on the controller.
     * *
     * * @param[event] The incoming controller event
     */
    public final void controllerEvent(@org.jetbrains.annotations.NotNull()
                                          net.java.games.input.Event event) {
    }

    /**
     * * Cleans old temporary native libraries, e.g. all directories in the temporary directory,
     * * which have "scenery-natives-tmp" in their name, and do not have a lock file present.
     */
    public void cleanTempFiles() {
    }

    /**
     * * Utility function to extract native libraries from a given JAR, store them in a
     * * temporary directory and modify the JRE's library path such that it can find
     * * these libraries.
     * *
     * * @param[paths] A list of JAR paths to extract natives from.
     * * @param[replace] Whether or not the java.library.path should be replaced.
     */
    public void extractLibrariesFromJar(@org.jetbrains.annotations.NotNull()
                                            java.util.List<java.lang.String> paths, boolean replace) {
    }

    /**
     * * Utility function to search the current class path for JARs with native libraries
     * *
     * * @param[searchName] The string to match the JAR's name against
     * * @param[hint] A file name to look for, for the ImageJ classpath hack
     * * @return A list of JARs matching [searchName]
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.String> getNativeJars(@org.jetbrains.annotations.NotNull()
                                                              java.lang.String searchName, @org.jetbrains.annotations.NotNull()
                                                              java.lang.String hint) {
        return null;
    }

    /**
     * * Managing internal behaviour lists.
     * *
     * * The internal lists only contain entries for Behaviours that can be
     * * actually triggered with the current InputMap, grouped by Behaviour type,
     * * such that hopefully lookup from the event handlers is fast,
     * *
     * * @property[buttons] Buttons triggering the input
     * * @property[behaviour] Behaviour triggered by these buttons
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007R\u0013\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lgraphics/scenery/controls/MouseAndKeyHandlerBase$BehaviourEntry;", "T", "Lorg/scijava/ui/behaviour/Behaviour;", "", "buttons", "Lorg/scijava/ui/behaviour/InputTrigger;", "behaviour", "(Lorg/scijava/ui/behaviour/InputTrigger;Lorg/scijava/ui/behaviour/Behaviour;)V", "getBehaviour", "()Lorg/scijava/ui/behaviour/Behaviour;", "Lorg/scijava/ui/behaviour/Behaviour;", "getButtons", "()Lorg/scijava/ui/behaviour/InputTrigger;", "scenery"})
    public static final class BehaviourEntry<T extends org.scijava.ui.behaviour.Behaviour> {
        @org.jetbrains.annotations.NotNull()
        private final org.scijava.ui.behaviour.InputTrigger buttons = null;
        @org.jetbrains.annotations.NotNull()
        private final T behaviour = null;

        public BehaviourEntry(@org.jetbrains.annotations.NotNull()
                                  org.scijava.ui.behaviour.InputTrigger buttons, @org.jetbrains.annotations.NotNull()
                                  T behaviour) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final org.scijava.ui.behaviour.InputTrigger getButtons() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final T getBehaviour() {
            return null;
        }
    }
}
