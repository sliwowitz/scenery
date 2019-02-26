package graphics.scenery;

/**
 * * Camera class that may be targeted or oriented
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @constructor Creates a new camera with default position and right-handed
 * *  coordinate system.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0001]B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010D\u001a\u00020\nJ<\u0010E\u001a\b\u0012\u0004\u0012\u00020G0F2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020I2\u0012\b\u0002\u0010K\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030L0F2\b\b\u0002\u0010M\u001a\u00020\u0004H\u0007J\b\u0010N\u001a\u00020;H\u0016J\u0010\u0010N\u001a\u00020;2\u0006\u0010O\u001a\u00020+H\u0016J\u0010\u0010P\u001a\u00020;2\u0006\u0010Q\u001a\u00020IH\u0016J2\u0010R\u001a\u00020S2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010T\u001a\u00020\n2\b\b\u0002\u0010U\u001a\u00020\nJ\u000e\u0010V\u001a\u00020\u00132\u0006\u0010W\u001a\u00020\u0013J\u001a\u0010X\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020\u00132\b\b\u0002\u0010Z\u001a\u00020\nH\u0007J\u0015\u0010[\u001a\u00020;*\u00020;2\u0006\u0010\\\u001a\u00020;H\u0086\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R$\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020+@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u001a\u00104\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u001a\u00107\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0015\"\u0004\b9\u0010\u0017R$\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020;@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000e\u00a8\u0006^"}, d2 = {"Lgraphics/scenery/Camera;", "Lgraphics/scenery/Node;", "()V", "active", "", "getActive", "()Z", "setActive", "(Z)V", "deltaT", "", "getDeltaT", "()F", "setDeltaT", "(F)V", "farPlaneDistance", "getFarPlaneDistance", "setFarPlaneDistance", "forward", "Lcleargl/GLVector;", "getForward", "()Lcleargl/GLVector;", "setForward", "(Lcleargl/GLVector;)V", "fov", "getFov", "setFov", "height", "getHeight", "setHeight", "nearPlaneDistance", "getNearPlaneDistance", "setNearPlaneDistance", "projectionType", "Lgraphics/scenery/Camera$ProjectionType;", "getProjectionType", "()Lgraphics/scenery/Camera$ProjectionType;", "setProjectionType", "(Lgraphics/scenery/Camera$ProjectionType;)V", "right", "getRight", "setRight", "q", "Lcom/jogamp/opengl/math/Quaternion;", "rotation", "getRotation", "()Lcom/jogamp/opengl/math/Quaternion;", "setRotation", "(Lcom/jogamp/opengl/math/Quaternion;)V", "target", "getTarget", "setTarget", "targeted", "getTargeted", "setTargeted", "up", "getUp", "setUp", "m", "Lcleargl/GLMatrix;", "view", "getView", "()Lcleargl/GLMatrix;", "setView", "(Lcleargl/GLMatrix;)V", "width", "getWidth", "setWidth", "aspectRatio", "getNodesForScreenSpacePosition", "", "Lgraphics/scenery/Scene$RaycastResult;", "x", "", "y", "ignoredObjects", "Ljava/lang/Class;", "debug", "getTransformation", "preRotation", "getTransformationForEye", "eye", "perspectiveCamera", "", "nearPlaneLocation", "farPlaneLocation", "viewToWorld", "v", "viewportToWorld", "vector", "offset", "times", "rhs", "ProjectionType", "scenery"})
public class Camera extends graphics.scenery.Node {

    /**
     * Is the camera targeted?
     */
    private boolean targeted;

    /**
     * Is this camera active? Setting one camera active will deactivate the others
     */
    private boolean active;

    /**
     * Target, used if [targeted] is true
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector target;

    /**
     * Forward vector of the camera, used if not targeted
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector forward;

    /**
     * Up vector of the camera, used if not targeted
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector up;

    /**
     * Right vector of the camera
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector right;

    /**
     * FOV of the camera
     */
    private float fov;

    /**
     * Z buffer near plane
     */
    private float nearPlaneDistance;

    /**
     * Z buffer far plane location
     */
    private float farPlaneDistance;

    /**
     * delta T from the renderer
     */
    private float deltaT;

    /**
     * Projection the camera uses
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Camera.ProjectionType projectionType;

    /**
     * Width of the projection
     */
    private float width;

    /**
     * Height of the projection
     */
    private float height;

    /**
     * View matrix of the camera. Setting the view matrix will re-set the forward
     * *  vector of the camera according to the given matrix.
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLMatrix view;

    /**
     * Rotation of the camera. The rotation is applied after the view matrix
     */
    @org.jetbrains.annotations.NotNull()
    private com.jogamp.opengl.math.Quaternion rotation;

    public Camera() {
        super(null);
    }

    public final boolean getTargeted() {
        return false;
    }

    public final void setTargeted(boolean p0) {
    }

    public final boolean getActive() {
        return false;
    }

    public final void setActive(boolean p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getTarget() {
        return null;
    }

    public final void setTarget(@org.jetbrains.annotations.NotNull()
                                    cleargl.GLVector p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getForward() {
        return null;
    }

    public final void setForward(@org.jetbrains.annotations.NotNull()
                                     cleargl.GLVector p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getUp() {
        return null;
    }

    public final void setUp(@org.jetbrains.annotations.NotNull()
                                cleargl.GLVector p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getRight() {
        return null;
    }

    public final void setRight(@org.jetbrains.annotations.NotNull()
                                   cleargl.GLVector p0) {
    }

    public final float getFov() {
        return 0.0F;
    }

    public final void setFov(float p0) {
    }

    public final float getNearPlaneDistance() {
        return 0.0F;
    }

    public final void setNearPlaneDistance(float p0) {
    }

    public final float getFarPlaneDistance() {
        return 0.0F;
    }

    public final void setFarPlaneDistance(float p0) {
    }

    public final float getDeltaT() {
        return 0.0F;
    }

    public final void setDeltaT(float p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Camera.ProjectionType getProjectionType() {
        return null;
    }

    public final void setProjectionType(@org.jetbrains.annotations.NotNull()
                                            graphics.scenery.Camera.ProjectionType p0) {
    }

    public final float getWidth() {
        return 0.0F;
    }

    public final void setWidth(float p0) {
    }

    public final float getHeight() {
        return 0.0F;
    }

    public final void setHeight(float p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getView() {
        return null;
    }

    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
                            cleargl.GLMatrix m) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jogamp.opengl.math.Quaternion getRotation() {
        return null;
    }

    @java.lang.Override()
    public void setRotation(@org.jetbrains.annotations.NotNull()
                                com.jogamp.opengl.math.Quaternion q) {
    }

    /**
     * * Returns the current aspect ratio
     */
    public final float aspectRatio() {
        return 0.0F;
    }

    /**
     * * Create a perspective projection camera
     */
    public final void perspectiveCamera(float fov, float width, float height, float nearPlaneLocation, float farPlaneLocation) {
    }

    /**
     * * Returns this camera's transformation matrix.
     */
    @org.jetbrains.annotations.NotNull()
    public cleargl.GLMatrix getTransformation() {
        return null;
    }

    /**
     * * Returns this camera's transformation matrix, including a
     * * [preRotation] that is applied before the camera's transformation.
     */
    @org.jetbrains.annotations.NotNull()
    public cleargl.GLMatrix getTransformation(@org.jetbrains.annotations.NotNull()
                                                  com.jogamp.opengl.math.Quaternion preRotation) {
        return null;
    }

    /**
     * * Returns this camera's transformation for eye with index [eye].
     */
    @org.jetbrains.annotations.NotNull()
    public cleargl.GLMatrix getTransformationForEye(int eye) {
        return null;
    }

    /**
     * * Multiplies this matrix with [GLMatrix] [rhs].
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLMatrix times(@org.jetbrains.annotations.NotNull()
                                            cleargl.GLMatrix $receiver, @org.jetbrains.annotations.NotNull()
                                            cleargl.GLMatrix rhs) {
        return null;
    }

    /**
     * * Transforms a 3D/4D vector from view space to world coordinates.
     * *
     * * @param v - The vector to be transformed into world space.
     * * @return GLVector - [v] transformed into world space.
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector viewToWorld(@org.jetbrains.annotations.NotNull()
                                                  cleargl.GLVector v) {
        return null;
    }

    /**
     * * Transforms a 2D/3D [vector] from NDC coordinates to world coordinates.
     * * If the vector is 2D, [nearPlaneDistance] is assumed for the Z value, otherwise
     * * the Z value from the vector is taken.
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector viewportToWorld(@org.jetbrains.annotations.NotNull()
                                                      cleargl.GLVector vector, float offset) {
        return null;
    }

    /**
     * * Transforms a 2D/3D [vector] from NDC coordinates to world coordinates.
     * * If the vector is 2D, [nearPlaneDistance] is assumed for the Z value, otherwise
     * * the Z value from the vector is taken.
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector viewportToWorld(@org.jetbrains.annotations.NotNull()
                                                      cleargl.GLVector vector) {
        return null;
    }

    /**
     * * Returns the list of objects (as [Scene.RaycastResult]) under the screen space position
     * * indicated by [x] and [y], sorted by their distance to the observer.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<graphics.scenery.Scene.RaycastResult> getNodesForScreenSpacePosition(int x, int y, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Class<?>> ignoredObjects, boolean debug) {
        return null;
    }

    /**
     * * Returns the list of objects (as [Scene.RaycastResult]) under the screen space position
     * * indicated by [x] and [y], sorted by their distance to the observer.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<graphics.scenery.Scene.RaycastResult> getNodesForScreenSpacePosition(int x, int y, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Class<?>> ignoredObjects) {
        return null;
    }

    /**
     * * Returns the list of objects (as [Scene.RaycastResult]) under the screen space position
     * * indicated by [x] and [y], sorted by their distance to the observer.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<graphics.scenery.Scene.RaycastResult> getNodesForScreenSpacePosition(int x, int y) {
        return null;
    }

    /**
     * Enum class for camera projection types
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lgraphics/scenery/Camera$ProjectionType;", "", "(Ljava/lang/String;I)V", "Undefined", "Perspective", "Orthographic", "scenery"})
    public static enum ProjectionType {
        /*public static final*/ Undefined /* = new Undefined() */,
        /*public static final*/ Perspective /* = new Perspective() */,
        /*public static final*/ Orthographic /* = new Orthographic() */;

        ProjectionType() {
        }
    }
}
