package graphics.scenery.controls.behaviours;

/**
 * * Targeted ArcBall control
 * *
 * * This Behaviour provides ArcBall control for scenery, with a customizable target. If you
 * * activate this behaviour, it'll use the current camera distance to the target as initial distance.
 * *
 * * The Targeted ArcBall also provides [minimumDistance] and [maximumDistance] to clamp the distance
 * * to the target to this range.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[name] The name of the behaviour
 * * @property[node] The node this behaviour controls
 * * @property[w] Window width
 * * @property[h] Window height
 * * @property[target] [GLVector]-supplying with the look-at target of the arcball
 * * @constructor Creates a new ArcballCameraControl behaviour
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001?B=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\u0002\u0010\rB7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\u000fB7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0010B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\u0002\u0010\u0011J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0016J\u0018\u00109\u001a\u0002062\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0016J\u0018\u0010:\u001a\u0002062\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0016J(\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0016R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u001a\u0010 \u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010#\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\'\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010\u00078D@DX\u0084\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lgraphics/scenery/controls/behaviours/ArcballCameraControl;", "Lorg/scijava/ui/behaviour/DragBehaviour;", "Lorg/scijava/ui/behaviour/ScrollBehaviour;", "name", "", "n", "Ljava/util/function/Supplier;", "Lgraphics/scenery/Camera;", "w", "", "h", "target", "Lcleargl/GLVector;", "(Ljava/lang/String;Ljava/util/function/Supplier;IILjava/util/function/Supplier;)V", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;IILcleargl/GLVector;)V", "(Ljava/lang/String;Ljava/util/function/Supplier;IILcleargl/GLVector;)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;IILkotlin/jvm/functions/Function0;)V", "value", "", "distance", "getDistance", "()F", "setDistance", "(F)V", "firstEntered", "", "lastX", "lastY", "maximumDistance", "getMaximumDistance", "setMaximumDistance", "minimumDistance", "getMinimumDistance", "setMinimumDistance", "mouseSpeedMultiplier", "getMouseSpeedMultiplier", "setMouseSpeedMultiplier", "<set-?>", "node", "getNode", "()Lgraphics/scenery/Camera;", "setNode", "(Lgraphics/scenery/Camera;)V", "node$delegate", "Lgraphics/scenery/controls/behaviours/ArcballCameraControl$CameraDelegate;", "scrollSpeedMultiplier", "getScrollSpeedMultiplier", "setScrollSpeedMultiplier", "getTarget", "()Lkotlin/jvm/functions/Function0;", "setTarget", "(Lkotlin/jvm/functions/Function0;)V", "drag", "", "x", "y", "end", "init", "scroll", "wheelRotation", "", "isHorizontal", "CameraDelegate", "scenery"})
public class ArcballCameraControl implements org.scijava.ui.behaviour.DragBehaviour, org.scijava.ui.behaviour.ScrollBehaviour {
    /**
     * The [graphics.scenery.Node] this behaviour class controls
     */
    @org.jetbrains.annotations.Nullable()
    private final graphics.scenery.controls.behaviours.ArcballCameraControl.CameraDelegate node$delegate = null;
    private final java.lang.String name = null;
    private final kotlin.jvm.functions.Function0<graphics.scenery.Camera> n = null;
    private final int w = 0;
    private final int h = 0;
    private int lastX;
    private int lastY;
    private boolean firstEntered;
    /**
     * distance to target
     */
    private float distance;
    /**
     * multiplier for zooming in and out
     */
    private float scrollSpeedMultiplier;
    /**
     * multiplier for mouse movement
     */
    private float mouseSpeedMultiplier;
    /**
     * minimum distance value to target
     */
    private float minimumDistance;
    /**
     * maximum distance value to target
     */
    private float maximumDistance;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<? extends cleargl.GLVector> target;

    public ArcballCameraControl(@org.jetbrains.annotations.NotNull()
                                    java.lang.String name, @org.jetbrains.annotations.NotNull()
                                    kotlin.jvm.functions.Function0<? extends graphics.scenery.Camera> n, int w, int h, @org.jetbrains.annotations.NotNull()
                                    kotlin.jvm.functions.Function0<? extends cleargl.GLVector> target) {
        super();
    }

    /**
     * * Arcball camera control, supplying a Camera via a Java [Supplier] lambda.
     */
    @kotlin.Suppress(names = {"unused"})
    public ArcballCameraControl(@org.jetbrains.annotations.NotNull()
                                    java.lang.String name, @org.jetbrains.annotations.NotNull()
                                    java.util.function.Supplier<graphics.scenery.Camera> n, int w, int h, @org.jetbrains.annotations.NotNull()
                                    java.util.function.Supplier<cleargl.GLVector> target) {
        super();
    }

    /**
     * * Arcball camera control, supplying a Camera via a Java [Supplier] lambda.
     * * In this version, [target] is a static [GLVector].
     */
    @kotlin.Suppress(names = {"unused"})
    public ArcballCameraControl(@org.jetbrains.annotations.NotNull()
                                    java.lang.String name, @org.jetbrains.annotations.NotNull()
                                    kotlin.jvm.functions.Function0<? extends graphics.scenery.Camera> n, int w, int h, @org.jetbrains.annotations.NotNull()
                                    cleargl.GLVector target) {
        super();
    }

    /**
     * * Arcball camera control, supplying a Camera via a Java [Supplier] lambda.
     * * In this version, [target] is a static [GLVector].
     */
    @kotlin.Suppress(names = {"unused"})
    public ArcballCameraControl(@org.jetbrains.annotations.NotNull()
                                    java.lang.String name, @org.jetbrains.annotations.NotNull()
                                    java.util.function.Supplier<graphics.scenery.Camera> n, int w, int h, @org.jetbrains.annotations.NotNull()
                                    cleargl.GLVector target) {
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

    public final float getDistance() {
        return 0.0F;
    }

    public final void setDistance(float value) {
    }

    public final float getScrollSpeedMultiplier() {
        return 0.0F;
    }

    public final void setScrollSpeedMultiplier(float p0) {
    }

    public final float getMouseSpeedMultiplier() {
        return 0.0F;
    }

    public final void setMouseSpeedMultiplier(float p0) {
    }

    public final float getMinimumDistance() {
        return 0.0F;
    }

    public final void setMinimumDistance(float p0) {
    }

    public final float getMaximumDistance() {
        return 0.0F;
    }

    public final void setMaximumDistance(float p0) {
    }

    /**
     * * This function is called upon mouse down and initialises the camera control
     * * with the current window size.
     * *
     * * @param[x] x position in window
     * * @param[y] y position in window
     */
    @java.lang.Override()
    public void init(int x, int y) {
    }

    /**
     * * This function is called upon mouse down ends.
     * *
     * * @param[x] x position in window
     * * @param[y] y position in window
     */
    @java.lang.Override()
    public void end(int x, int y) {
    }

    /**
     * * This function is called during mouse down and updates the yaw and pitch states,
     * * and resets the cam's forward and up vectors according to these angles.
     * *
     * * @param[x] x position in window
     * * @param[y] y position in window
     */
    @java.lang.Override()
    public void drag(int x, int y) {
    }

    /**
     * * The scroll function is called when a scroll event is detected and will change
     * * the [distance] according to the scroll direction and bound by the [minimumDistance] and
     * * [maximumDistance] values.
     * *
     * * @param[wheelRotation] Absolute rotation value of the mouse wheel
     * * @param[isHorizontal] Whether the scroll event is horizontal. We use only vertical events.
     * * @param [x] unused
     * * @param[y] unused
     */
    @java.lang.Override()
    public void scroll(double wheelRotation, boolean isHorizontal, int x, int y) {
    }

    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<cleargl.GLVector> getTarget() {
        return null;
    }

    public final void setTarget(@org.jetbrains.annotations.NotNull()
                                    kotlin.jvm.functions.Function0<? extends cleargl.GLVector> p0) {
    }

    /**
     * Camera delegate class, converting lambdas to Cameras.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002J)\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0086\u0002\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/controls/behaviours/ArcballCameraControl$CameraDelegate;", "", "(Lgraphics/scenery/controls/behaviours/ArcballCameraControl;)V", "getValue", "Lgraphics/scenery/Camera;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "scenery"})
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
