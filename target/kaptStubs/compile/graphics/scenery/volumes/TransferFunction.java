package graphics.scenery.volumes;

/**
 * Transfer function class with an optional [name].
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u000b\b\u0016\u0018\u0000 22\u00020\u0001:\u000223B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%J\u001e\u0010\'\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0)2\u0006\u0010*\u001a\u00020\u0017H\u0004J\u0015\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u001eH\u0000\u00a2\u0006\u0002\b-J\u000e\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u000bJ\u000e\u0010.\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%J\u0006\u00100\u001a\u00020\u0006J\b\u00101\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 \u00a8\u00064"}, d2 = {"Lgraphics/scenery/volumes/TransferFunction;", "", "name", "", "(Ljava/lang/String;)V", "buffer", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", "controlPoints", "Ljava/util/ArrayList;", "Lgraphics/scenery/volumes/TransferFunction$ControlPoint;", "getControlPoints", "()Ljava/util/ArrayList;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getName", "()Ljava/lang/String;", "<set-?>", "", "stale", "getStale", "()Z", "setStale", "(Z)V", "textureHeight", "", "getTextureHeight", "()I", "textureSize", "getTextureSize", "addControlPoint", "value", "", "factor", "findExtremalControlPoint", "points", "", "left", "getControlPoint", "index", "getControlPoint$scenery", "removeControlPoint", "controlPoint", "serialise", "toString", "Companion", "ControlPoint", "scenery"})
public class TransferFunction {
    public static final graphics.scenery.volumes.TransferFunction.Companion Companion = null;
    private final kotlin.Lazy logger$delegate = null;
    /**
     * Control point storage for the transfer function
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<graphics.scenery.volumes.TransferFunction.ControlPoint> controlPoints = null;
    /**
     * Size of the auxiliary texture.
     */
    private final int textureSize = 1024;
    /**
     * Vertical size of the auxiliary texture.
     */
    private final int textureHeight = 16;
    /**
     * The auxiliary texture where the interpolated transfer function will be stored.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.nio.ByteBuffer buffer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    /**
     * Indicator whether the auxiliary texture needs to be reuploaded.
     */
    private boolean stale;

    public TransferFunction(@org.jetbrains.annotations.NotNull()
                                java.lang.String name) {
        super();
    }

    public TransferFunction() {
        super();
    }

    /**
     * Returns a flat transfer function that transfers all values
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.volumes.TransferFunction flat(float factor) {
        return null;
    }

    /**
     * Returns a flat transfer function that transfers all values
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.volumes.TransferFunction flat() {
        return null;
    }

    /**
     * Returns a ramp transfer function, transferring nothing before [offset] (0.0f by default), and everything at the top.
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.volumes.TransferFunction ramp(float offset, float rampMax) {
        return null;
    }

    /**
     * Returns a ramp transfer function, transferring nothing before [offset] (0.0f by default), and everything at the top.
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.volumes.TransferFunction ramp(float offset) {
        return null;
    }

    /**
     * Returns a ramp transfer function, transferring nothing before [offset] (0.0f by default), and everything at the top.
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.volumes.TransferFunction ramp() {
        return null;
    }

    private final org.slf4j.Logger getLogger() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<graphics.scenery.volumes.TransferFunction.ControlPoint> getControlPoints() {
        return null;
    }

    public final int getTextureSize() {
        return 0;
    }

    public final int getTextureHeight() {
        return 0;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.nio.ByteBuffer getBuffer() {
        return null;
    }

    public final boolean getStale() {
        return false;
    }

    protected final void setStale(boolean p0) {
    }

    /**
     * * Adds a new control point for position [value], with [factor].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.volumes.TransferFunction.ControlPoint addControlPoint(float value, float factor) {
        return null;
    }

    /**
     * * Removes the control point at [value]. Returns true if points have been removed.
     */
    public final boolean removeControlPoint(float value) {
        return false;
    }

    /**
     * * Removes the [controlPoint] by reference. Returns true if it has been removed.
     */
    public final boolean removeControlPoint(@org.jetbrains.annotations.NotNull()
                                                graphics.scenery.volumes.TransferFunction.ControlPoint controlPoint) {
        return false;
    }

    /**
     * * Returns the control point at [index]. Internal use only.
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.volumes.TransferFunction.ControlPoint getControlPoint$scenery(int index) {
        return null;
    }

    /**
     * * Finds extremal control points in a list of [points], with [left] given
     * * as option to indicate whether the control point is on the left or right
     * * end of the interval.
     */
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.volumes.TransferFunction.ControlPoint findExtremalControlPoint(@org.jetbrains.annotations.NotNull()
                                                                                                        java.lang.Iterable<graphics.scenery.volumes.TransferFunction.ControlPoint> points, boolean left) {
        return null;
    }

    /**
     * * Serialises the transfer function into a texture for evaluation
     * * in the shader.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.nio.ByteBuffer serialise() {
        return null;
    }

    /**
     * * Returns a string representation of the transfer function.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }

    /**
     * * Data class to contain control points for transfer functions.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lgraphics/scenery/volumes/TransferFunction$ControlPoint;", "", "value", "", "factor", "(FF)V", "getFactor", "()F", "setFactor", "(F)V", "getValue", "setValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class ControlPoint {
        private float value;
        private float factor;

        public ControlPoint(float value, float factor) {
            super();
        }

        public final float getValue() {
            return 0.0F;
        }

        public final void setValue(float p0) {
        }

        public final float getFactor() {
            return 0.0F;
        }

        public final void setFactor(float p0) {
        }

        public final float component1() {
            return 0.0F;
        }

        public final float component2() {
            return 0.0F;
        }

        /**
         * * Data class to contain control points for transfer functions.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.volumes.TransferFunction.ControlPoint copy(float value, float factor) {
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

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007J\u001c\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007\u00a8\u0006\n"}, d2 = {"Lgraphics/scenery/volumes/TransferFunction$Companion;", "", "()V", "flat", "Lgraphics/scenery/volumes/TransferFunction;", "factor", "", "ramp", "offset", "rampMax", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }

        /**
         * Returns a flat transfer function that transfers all values
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.volumes.TransferFunction flat(float factor) {
            return null;
        }

        /**
         * Returns a flat transfer function that transfers all values
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.volumes.TransferFunction flat() {
            return null;
        }

        /**
         * Returns a ramp transfer function, transferring nothing before [offset] (0.0f by default), and everything at the top.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.volumes.TransferFunction ramp(float offset, float rampMax) {
            return null;
        }

        /**
         * Returns a ramp transfer function, transferring nothing before [offset] (0.0f by default), and everything at the top.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.volumes.TransferFunction ramp(float offset) {
            return null;
        }

        /**
         * Returns a ramp transfer function, transferring nothing before [offset] (0.0f by default), and everything at the top.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.volumes.TransferFunction ramp() {
            return null;
        }
    }
}
