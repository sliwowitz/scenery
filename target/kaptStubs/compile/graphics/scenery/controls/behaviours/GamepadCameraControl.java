package graphics.scenery.controls.behaviours;

/**
 * * Implementation of GamepadBehaviour for Camera Control
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[name] Name of the behaviour
 * * @property[axis] List of axis that are assigned to this behaviour
 * * @property[node] The camera to control
 * * @property[w] The window width
 * * @property[h] The window height
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001*B=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010&\u001a\u00020\'2\u0006\u0010\u0004\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0015H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\t8D@DX\u0084\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lgraphics/scenery/controls/behaviours/GamepadCameraControl;", "Lgraphics/scenery/controls/behaviours/GamepadBehaviour;", "name", "", "axis", "", "Lnet/java/games/input/Component$Identifier$Axis;", "n", "Ljava/util/function/Supplier;", "Lgraphics/scenery/Camera;", "w", "", "h", "(Ljava/lang/String;Ljava/util/List;Ljava/util/function/Supplier;II)V", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;II)V", "getAxis", "()Ljava/util/List;", "firstEntered", "", "lastX", "", "lastY", "<set-?>", "node", "getNode", "()Lgraphics/scenery/Camera;", "setNode", "(Lgraphics/scenery/Camera;)V", "node$delegate", "Lgraphics/scenery/controls/behaviours/GamepadCameraControl$CameraDelegate;", "pitch", "threshold", "getThreshold", "()F", "setThreshold", "(F)V", "yaw", "axisEvent", "", "Lnet/java/games/input/Component$Identifier;", "value", "CameraDelegate", "scenery"})
public class GamepadCameraControl implements graphics.scenery.controls.behaviours.GamepadBehaviour {
    /**
     * The [graphics.scenery.Node] this behaviour class controls
     */
    @org.jetbrains.annotations.Nullable()
    private final graphics.scenery.controls.behaviours.GamepadCameraControl.CameraDelegate node$delegate = null;
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<net.java.games.input.Component.Identifier.Axis> axis = null;
    private final kotlin.jvm.functions.Function0<graphics.scenery.Camera> n = null;
    private final int w = 0;
    private final int h = 0;
    private float lastX;
    private float lastY;
    private boolean firstEntered;
    /**
     * Pitch angle calculated from the axis position
     */
    private float pitch;
    /**
     * Yaw angle calculated from the axis position
     */
    private float yaw;
    /**
     * Threshold below which the behaviour will not trigger
     */
    private float threshold;

    public GamepadCameraControl(@org.jetbrains.annotations.NotNull()
                                    java.lang.String name, @org.jetbrains.annotations.NotNull()
                                    java.util.List<? extends net.java.games.input.Component.Identifier.Axis> axis, @org.jetbrains.annotations.NotNull()
                                    kotlin.jvm.functions.Function0<? extends graphics.scenery.Camera> n, int w, int h) {
        super();
    }

    /**
     * * Gamepad camera control, supplying a Camera via a Java [Supplier] lambda.
     */
    @kotlin.Suppress(names = {"unused"})
    public GamepadCameraControl(@org.jetbrains.annotations.NotNull()
                                    java.lang.String name, @org.jetbrains.annotations.NotNull()
                                    java.util.List<? extends net.java.games.input.Component.Identifier.Axis> axis, @org.jetbrains.annotations.NotNull()
                                    java.util.function.Supplier<graphics.scenery.Camera> n, int w, int h) {
        super();
    }

    /**
     * The [graphics.scenery.Node] this behaviour class controls
     */
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.Camera getNode() {
        return null;
    }

    /**
     * The [graphics.scenery.Node] this behaviour class controls
     */
    protected final void setNode(@org.jetbrains.annotations.Nullable()
                                     graphics.scenery.Camera p0) {
    }

    public final float getThreshold() {
        return 0.0F;
    }

    public final void setThreshold(float p0) {
    }

    /**
     * * This function is trigger upon arrival of an axis event that
     * * concerns this behaviour. It takes the event's value, as well as the
     * * other axis' state to construct pitch and yaw angles and reorients
     * * the camera.
     * *
     * * @param[axis] The gamepad axis.
     * * @param[value] The absolute value of the gamepad axis.
     */
    @java.lang.Override()
    public synchronized void axisEvent(@org.jetbrains.annotations.NotNull()
                                           net.java.games.input.Component.Identifier axis, float value) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<net.java.games.input.Component.Identifier.Axis> getAxis() {
        return null;
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002J)\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0086\u0002\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/controls/behaviours/GamepadCameraControl$CameraDelegate;", "", "(Lgraphics/scenery/controls/behaviours/GamepadCameraControl;)V", "getValue", "Lgraphics/scenery/Camera;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "scenery"})
    public final class CameraDelegate {

        public CameraDelegate() {
            super();
        }

        /**
         * Returns the [graphics.scenery.Node] resulting from the evaluation of [n]
         */
        @org.jetbrains.annotations.Nullable()
        public final graphics.scenery.Camera getValue(@org.jetbrains.annotations.Nullable()
                                                          java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
                                                          kotlin.reflect.KProperty<?> property) {
            return null;
        }

        /**
         * Setting the value is not supported
         */
        public final void setValue(@org.jetbrains.annotations.Nullable()
                                       java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
                                       kotlin.reflect.KProperty<?> property, @org.jetbrains.annotations.Nullable()
                                       graphics.scenery.Camera value) {
        }
    }
}
