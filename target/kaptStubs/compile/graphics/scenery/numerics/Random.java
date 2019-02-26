package graphics.scenery.numerics;

/**
 * * Helper class to generate random numbers.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lgraphics/scenery/numerics/Random;", "", "()V", "Companion", "scenery"})
public final class Random {
    public static final graphics.scenery.numerics.Random.Companion Companion = null;

    public Random() {
        super();
    }

    /**
     * * Returns a random float from the range [min]-[max].
     */
    public static final float randomFromRange(float min, float max) {
        return 0.0F;
    }

    /**
     * * Returns a random [GLVector] with given [dimension], where all elements are in the
     * * range [min]-[max].
     */
    @org.jetbrains.annotations.NotNull()
    public static final cleargl.GLVector randomVectorFromRange(int dimension, float min, float max) {
        return null;
    }

    /**
     * * Returns a random [Quaternion] generated from random Euler angles.
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.jogamp.opengl.math.Quaternion randomQuaternion() {
        return null;
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lgraphics/scenery/numerics/Random$Companion;", "", "()V", "randomFromRange", "", "min", "max", "randomQuaternion", "Lcom/jogamp/opengl/math/Quaternion;", "randomVectorFromRange", "Lcleargl/GLVector;", "dimension", "", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }

        /**
         * * Returns a random float from the range [min]-[max].
         */
        public final float randomFromRange(float min, float max) {
            return 0.0F;
        }

        /**
         * * Returns a random [GLVector] with given [dimension], where all elements are in the
         * * range [min]-[max].
         */
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector randomVectorFromRange(int dimension, float min, float max) {
            return null;
        }

        /**
         * * Returns a random [Quaternion] generated from random Euler angles.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.jogamp.opengl.math.Quaternion randomQuaternion() {
            return null;
        }
    }
}
