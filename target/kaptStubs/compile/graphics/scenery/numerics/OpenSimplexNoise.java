package graphics.scenery.numerics;

/**
 * * OpenSimplexNoise implemention in Kotlin, based on
 * * OpenSimplex Noise in Java.
 * * by Kurt Spencer, in the public domain.
 * *
 * * v1.1 (October 5, 2014)
 * * - Added 2D and 4D implementations.
 * * - Proper gradient sets for all dimensions, from a
 * *   dimensionally-generalizable scheme with an actual
 * *   rhyme and reason behind it.
 * * - Removed default permutation array in favor of
 * *   default seed.
 * * - Changed seed-based constructor to be independent
 * *   of any particular randomization library, so results
 * *   will be the same when ported to other languages.
 * *
 * *   @author Kurt Spencer (original Java code)
 * *   @author Ulrik Guenther <hello@ulrik.is> (Kotlin port)
 * *
 * *   @param[seed] Seed to use
 */
@kotlin.Suppress(names = {"UNUSED_VALUE"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J8\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002JH\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0016J\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016J \u0010#\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0016J \u0010#\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020 H\u0016J(\u0010%\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0016J(\u0010%\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020 2\u0006\u0010&\u001a\u00020 H\u0016J\u0015\u0010\'\u001a\u00020(*\u00020(2\u0006\u0010)\u001a\u00020(H\u0082\u0004J\u0015\u0010*\u001a\u00020(*\u00020(2\u0006\u0010)\u001a\u00020(H\u0082\u0004R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lgraphics/scenery/numerics/OpenSimplexNoise;", "Lgraphics/scenery/numerics/ProceduralNoise;", "seed", "", "([I)V", "", "(J)V", "NORM_CONSTANT_2D", "", "NORM_CONSTANT_3D", "NORM_CONSTANT_4D", "SQUISH_CONSTANT_2D", "SQUISH_CONSTANT_3D", "SQUISH_CONSTANT_4D", "STRETCH_CONSTANT_2D", "STRETCH_CONSTANT_3D", "STRETCH_CONSTANT_4D", "perm", "permGradIndex3D", "extrapolate", "xsb", "", "ysb", "dx", "dy", "zsb", "dz", "wsb", "dw", "fastFloor", "x", "random1D", "", "random2D", "y", "random3D", "z", "random4D", "w", "and", "", "other", "or", "Companion", "scenery"})
public final class OpenSimplexNoise implements graphics.scenery.numerics.ProceduralNoise {
    public static final graphics.scenery.numerics.OpenSimplexNoise.Companion Companion = null;
    private static final byte[] gradients2D = null;
    private static final byte[] gradients3D = null;
    private static final byte[] gradients4D = null;
    private final double STRETCH_CONSTANT_2D = -0.211324865405187;
    private final double SQUISH_CONSTANT_2D = 0.366025403784439;
    private final double STRETCH_CONSTANT_3D = -0.16666666666666666;
    private final double SQUISH_CONSTANT_3D = 0.3333333333333333;
    private final double STRETCH_CONSTANT_4D = -0.138196601125011;
    private final double SQUISH_CONSTANT_4D = 0.309016994374947;
    private final double NORM_CONSTANT_2D = 47.0;
    private final double NORM_CONSTANT_3D = 103.0;
    private final double NORM_CONSTANT_4D = 30.0;
    private int[] perm;
    private int[] permGradIndex3D;

    public OpenSimplexNoise(long seed) {
        super();
    }

    public OpenSimplexNoise() {
        super();
    }

    public OpenSimplexNoise(@org.jetbrains.annotations.NotNull()
                                int[] seed) {
        super();
    }

    @java.lang.Override()
    public float random1D(float x) {
        return 0.0F;
    }

    @java.lang.Override()
    public double random1D(double x) {
        return 0.0;
    }

    @java.lang.Override()
    public float random2D(float x, float y) {
        return 0.0F;
    }

    @java.lang.Override()
    public double random2D(double x, double y) {
        return 0.0;
    }

    @java.lang.Override()
    public float random3D(float x, float y, float z) {
        return 0.0F;
    }

    @java.lang.Override()
    public double random3D(double x, double y, double z) {
        return 0.0;
    }

    @java.lang.Override()
    public float random4D(float x, float y, float z, float w) {
        return 0.0F;
    }

    @java.lang.Override()
    public double random4D(double x, double y, double z, double w) {
        return 0.0;
    }

    private final byte and(byte $receiver, byte other) {
        return 0;
    }

    private final byte or(byte $receiver, byte other) {
        return 0;
    }

    private final double extrapolate(int xsb, int ysb, double dx, double dy) {
        return 0.0;
    }

    private final double extrapolate(int xsb, int ysb, int zsb, double dx, double dy, double dz) {
        return 0.0;
    }

    private final double extrapolate(int xsb, int ysb, int zsb, int wsb, double dx, double dy, double dz, double dw) {
        return 0.0;
    }

    private final int fastFloor(double x) {
        return 0;
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/numerics/OpenSimplexNoise$Companion;", "", "()V", "gradients2D", "", "gradients3D", "gradients4D", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }
    }
}
