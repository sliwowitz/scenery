package graphics.scenery;

/**
 * * Detached Head Camera is a Camera subclass that tracks the head orientation
 * * in addition to general orientation - useful for HMDs
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004\u00a8\u0006\u001d"}, d2 = {"Lgraphics/scenery/DetachedHeadCamera;", "Lgraphics/scenery/Camera;", "tracker", "Lgraphics/scenery/controls/TrackerInput;", "(Lgraphics/scenery/controls/TrackerInput;)V", "headPosition", "Lcleargl/GLVector;", "getHeadPosition", "()Lcleargl/GLVector;", "headPosition$delegate", "Lgraphics/scenery/DetachedHeadCamera$HeadPositionDelegate;", "value", "Lcleargl/GLMatrix;", "projection", "getProjection", "()Lcleargl/GLMatrix;", "setProjection", "(Lcleargl/GLMatrix;)V", "getTracker", "()Lgraphics/scenery/controls/TrackerInput;", "setTracker", "getTransformation", "preRotation", "Lcom/jogamp/opengl/math/Quaternion;", "getTransformationForEye", "eye", "", "HeadOrientationDelegate", "HeadPositionDelegate", "scenery"})
public final class DetachedHeadCamera extends graphics.scenery.Camera {
    /**
     * Orientation of the user's head
     */
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.DetachedHeadCamera.HeadPositionDelegate headPosition$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLMatrix projection;
    @org.jetbrains.annotations.Nullable()
    private transient graphics.scenery.controls.TrackerInput tracker;

    public DetachedHeadCamera(@org.jetbrains.annotations.Nullable()
                                  graphics.scenery.controls.TrackerInput tracker) {
        super();
    }

    public DetachedHeadCamera() {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getProjection() {
        return null;
    }

    @java.lang.Override()
    public void setProjection(@org.jetbrains.annotations.NotNull()
                                  cleargl.GLMatrix value) {
    }

    /**
     * Orientation of the user's head
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getHeadPosition() {
        return null;
    }

    /**
     * * Returns this camera's transformation matrix, taking an eventually existing [TrackerInput]
     * * into consideration as well.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getTransformation() {
        return null;
    }

    /**
     * * Returns this camera's transformation for eye with index [eye], taking an eventually existing [TrackerInput]
     * * into consideration as well.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getTransformationForEye(int eye) {
        return null;
    }

    /**
     * * Returns this camera's transformation matrix, including a
     * * [preRotation] that is applied before the camera's transformation.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getTransformation(@org.jetbrains.annotations.NotNull()
                                                  com.jogamp.opengl.math.Quaternion preRotation) {
        return null;
    }

    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.controls.TrackerInput getTracker() {
        return null;
    }

    public final void setTracker(@org.jetbrains.annotations.Nullable()
                                     graphics.scenery.controls.TrackerInput p0) {
    }

    /**
     * * Delegate class for getting a head rotation from a [TrackerInput].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002J\'\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/DetachedHeadCamera$HeadOrientationDelegate;", "", "(Lgraphics/scenery/DetachedHeadCamera;)V", "getValue", "Lcom/jogamp/opengl/math/Quaternion;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "scenery"})
    public final class HeadOrientationDelegate {

        public HeadOrientationDelegate() {
            super();
        }

        /**
         * * Returns the TrackerInput's orientation, or a unit Quaternion.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.jogamp.opengl.math.Quaternion getValue(@org.jetbrains.annotations.Nullable()
                                                                    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
                                                                    kotlin.reflect.KProperty<?> property) {
            return null;
        }

        public final void setValue(@org.jetbrains.annotations.Nullable()
                                       java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
                                       kotlin.reflect.KProperty<?> property, @org.jetbrains.annotations.NotNull()
                                       com.jogamp.opengl.math.Quaternion value) {
        }
    }

    /**
     * * Delegate class for getting a head translation from a [TrackerInput].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0086\u0002J\'\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002\u00a8\u0006\r"}, d2 = {"Lgraphics/scenery/DetachedHeadCamera$HeadPositionDelegate;", "Ljava/io/Serializable;", "(Lgraphics/scenery/DetachedHeadCamera;)V", "getValue", "Lcleargl/GLVector;", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "Lcom/jogamp/opengl/math/Quaternion;", "scenery"})
    public final class HeadPositionDelegate implements java.io.Serializable {

        public HeadPositionDelegate() {
            super();
        }

        /**
         * * Returns the TrackerInput's translation, or a zero vector.
         */
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector getValue(@org.jetbrains.annotations.Nullable()
                                                   java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
                                                   kotlin.reflect.KProperty<?> property) {
            return null;
        }

        public final void setValue(@org.jetbrains.annotations.Nullable()
                                       java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
                                       kotlin.reflect.KProperty<?> property, @org.jetbrains.annotations.NotNull()
                                       com.jogamp.opengl.math.Quaternion value) {
        }
    }
}
