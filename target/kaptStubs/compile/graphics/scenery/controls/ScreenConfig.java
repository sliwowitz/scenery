package graphics.scenery.controls;

/**
 * * Screen config class, for configuration and use of projection screen geometry and transformations.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \u00032\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\t"}, d2 = {"Lgraphics/scenery/controls/ScreenConfig;", "", "()V", "Companion", "Config", "ScreenMatcher", "ScreenMatcherType", "SingleScreenConfig", "VectorDeserializer", "scenery"})
public final class ScreenConfig {
    public static final graphics.scenery.controls.ScreenConfig.Companion Companion = null;
    private static final kotlin.Lazy logger$delegate = null;

    public ScreenConfig() {
        super();
    }

    /**
     * * Matches a single screen to the [config] given.
     * *
     * * Returns a [SingleScreenConfig] if the screen could be matched, and null otherwise.
     */
    @org.jetbrains.annotations.Nullable()
    public static final graphics.scenery.controls.ScreenConfig.SingleScreenConfig getScreen(@org.jetbrains.annotations.NotNull()
                                                                                                graphics.scenery.controls.ScreenConfig.Config config) {
        return null;
    }

    /**
     * * Loads a [ScreenConfig.Config] from a [path] and returns it.
     * *
     * * If [path] cannot be found, a default configuration included with scenery will be loaded.
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.controls.ScreenConfig.Config loadFromFile(@org.jetbrains.annotations.NotNull()
                                                                                       java.lang.String path) {
        return null;
    }

    /**
     * A screen matcher can be based on a system property or a hostname currently.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lgraphics/scenery/controls/ScreenConfig$ScreenMatcherType;", "", "(Ljava/lang/String;I)V", "Property", "Hostname", "scenery"})
    public static enum ScreenMatcherType {
        /*public static final*/ Property /* = new Property() */,
        /*public static final*/ Hostname /* = new Hostname() */;

        ScreenMatcherType() {
        }
    }

    /**
     * * Deserializer class for [GLVector] objects. Takes a string, splits it at "," and
     * * serializes the results into a new GLVector.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lgraphics/scenery/controls/ScreenConfig$VectorDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "Lcleargl/GLVector;", "()V", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "scenery"})
    public static final class VectorDeserializer extends com.fasterxml.jackson.databind.JsonDeserializer<cleargl.GLVector> {

        public VectorDeserializer() {
            super();
        }

        /**
         * Runs the deserialization process with parser [p] and optional content [ctxt].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public cleargl.GLVector deserialize(@org.jetbrains.annotations.NotNull()
                                                com.fasterxml.jackson.core.JsonParser p, @org.jetbrains.annotations.Nullable()
                                                com.fasterxml.jackson.databind.DeserializationContext ctxt) {
            return null;
        }
    }

    /**
     * * Represents a screen configuration, potentially with multiple [screens] with a
     * * shared size of [screenWidth] x [screenHeight]. A [name] and [description] can be given.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JI\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\'"}, d2 = {"Lgraphics/scenery/controls/ScreenConfig$Config;", "", "name", "", "description", "screenWidth", "", "screenHeight", "screens", "", "Lgraphics/scenery/controls/ScreenConfig$SingleScreenConfig;", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getName", "setName", "getScreenHeight", "()I", "setScreenHeight", "(I)V", "getScreenWidth", "setScreenWidth", "getScreens", "()Ljava/util/Map;", "setScreens", "(Ljava/util/Map;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "scenery"})
    public static final class Config {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String description;
        private int screenWidth;
        private int screenHeight;
        @org.jetbrains.annotations.NotNull()
        private java.util.Map<java.lang.String, graphics.scenery.controls.ScreenConfig.SingleScreenConfig> screens;

        public Config(@org.jetbrains.annotations.NotNull()
                          java.lang.String name, @org.jetbrains.annotations.Nullable()
                          java.lang.String description, int screenWidth, int screenHeight, @org.jetbrains.annotations.NotNull()
                          java.util.Map<java.lang.String, graphics.scenery.controls.ScreenConfig.SingleScreenConfig> screens) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }

        public final void setName(@org.jetbrains.annotations.NotNull()
                                      java.lang.String p0) {
        }

        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }

        public final void setDescription(@org.jetbrains.annotations.Nullable()
                                             java.lang.String p0) {
        }

        public final int getScreenWidth() {
            return 0;
        }

        public final void setScreenWidth(int p0) {
        }

        public final int getScreenHeight() {
            return 0;
        }

        public final void setScreenHeight(int p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, graphics.scenery.controls.ScreenConfig.SingleScreenConfig> getScreens() {
            return null;
        }

        public final void setScreens(@org.jetbrains.annotations.NotNull()
                                         java.util.Map<java.lang.String, graphics.scenery.controls.ScreenConfig.SingleScreenConfig> p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }

        public final int component3() {
            return 0;
        }

        public final int component4() {
            return 0;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, graphics.scenery.controls.ScreenConfig.SingleScreenConfig> component5() {
            return null;
        }

        /**
         * * Represents a screen configuration, potentially with multiple [screens] with a
         * * shared size of [screenWidth] x [screenHeight]. A [name] and [description] can be given.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.controls.ScreenConfig.Config copy(@org.jetbrains.annotations.NotNull()
                                                                            java.lang.String name, @org.jetbrains.annotations.Nullable()
                                                                            java.lang.String description, int screenWidth, int screenHeight, @org.jetbrains.annotations.NotNull()
                                                                            java.util.Map<java.lang.String, graphics.scenery.controls.ScreenConfig.SingleScreenConfig> screens) {
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

    /**
     * Represents a single screen in the configuration
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u0006\u0010!\u001a\u00020\u001bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R$\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000f\u00a8\u0006\""}, d2 = {"Lgraphics/scenery/controls/ScreenConfig$SingleScreenConfig;", "", "match", "Lgraphics/scenery/controls/ScreenConfig$ScreenMatcher;", "lowerLeft", "Lcleargl/GLVector;", "lowerRight", "upperLeft", "(Lgraphics/scenery/controls/ScreenConfig$ScreenMatcher;Lcleargl/GLVector;Lcleargl/GLVector;Lcleargl/GLVector;)V", "<set-?>", "", "height", "getHeight", "()F", "setHeight", "(F)V", "getLowerLeft", "()Lcleargl/GLVector;", "setLowerLeft", "(Lcleargl/GLVector;)V", "getLowerRight", "setLowerRight", "getMatch", "()Lgraphics/scenery/controls/ScreenConfig$ScreenMatcher;", "setMatch", "(Lgraphics/scenery/controls/ScreenConfig$ScreenMatcher;)V", "screenTransform", "Lcleargl/GLMatrix;", "getUpperLeft", "setUpperLeft", "width", "getWidth", "setWidth", "getTransform", "scenery"})
    public static final class SingleScreenConfig {
        private cleargl.GLMatrix screenTransform;

        /**
         * Calculated width of the screen, in meters
         */
        private float width;

        /**
         * Calculated height of the screen, in meters
         */
        private float height;

        /**
         * How to match this screen (e.g. by host or IP)
         */
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.controls.ScreenConfig.ScreenMatcher match;

        /**
         * Lower left screen corner, in meters
         */
        @org.jetbrains.annotations.NotNull()
        private cleargl.GLVector lowerLeft;

        /**
         * Lower right screen corner, in meters
         */
        @org.jetbrains.annotations.NotNull()
        private cleargl.GLVector lowerRight;

        /**
         * Upper left screen corner, in meters
         */
        @org.jetbrains.annotations.NotNull()
        private cleargl.GLVector upperLeft;

        public SingleScreenConfig(@org.jetbrains.annotations.NotNull()
                                      graphics.scenery.controls.ScreenConfig.ScreenMatcher match, @org.jetbrains.annotations.NotNull()
                                  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.controls.ScreenConfig.VectorDeserializer.class)
                                      cleargl.GLVector lowerLeft, @org.jetbrains.annotations.NotNull()
                                  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.controls.ScreenConfig.VectorDeserializer.class)
                                      cleargl.GLVector lowerRight, @org.jetbrains.annotations.NotNull()
                                  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.controls.ScreenConfig.VectorDeserializer.class)
                                      cleargl.GLVector upperLeft) {
            super();
        }

        public final float getWidth() {
            return 0.0F;
        }

        private final void setWidth(float p0) {
        }

        public final float getHeight() {
            return 0.0F;
        }

        private final void setHeight(float p0) {
        }

        /**
         * Returns the frustum transform for this screen
         */
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLMatrix getTransform() {
            return null;
        }

        /**
         * How to match this screen (e.g. by host or IP)
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.controls.ScreenConfig.ScreenMatcher getMatch() {
            return null;
        }

        /**
         * How to match this screen (e.g. by host or IP)
         */
        public final void setMatch(@org.jetbrains.annotations.NotNull()
                                       graphics.scenery.controls.ScreenConfig.ScreenMatcher p0) {
        }

        /**
         * Lower left screen corner, in meters
         */
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector getLowerLeft() {
            return null;
        }

        /**
         * Lower left screen corner, in meters
         */
        public final void setLowerLeft(@org.jetbrains.annotations.NotNull()
                                           cleargl.GLVector p0) {
        }

        /**
         * Lower right screen corner, in meters
         */
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector getLowerRight() {
            return null;
        }

        /**
         * Lower right screen corner, in meters
         */
        public final void setLowerRight(@org.jetbrains.annotations.NotNull()
                                            cleargl.GLVector p0) {
        }

        /**
         * Upper left screen corner, in meters
         */
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector getUpperLeft() {
            return null;
        }

        /**
         * Upper left screen corner, in meters
         */
        public final void setUpperLeft(@org.jetbrains.annotations.NotNull()
                                           cleargl.GLVector p0) {
        }
    }

    /**
     * * Screen matcher class with [type] and [value].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lgraphics/scenery/controls/ScreenConfig$ScreenMatcher;", "", "type", "Lgraphics/scenery/controls/ScreenConfig$ScreenMatcherType;", "value", "", "(Lgraphics/scenery/controls/ScreenConfig$ScreenMatcherType;Ljava/lang/String;)V", "getType", "()Lgraphics/scenery/controls/ScreenConfig$ScreenMatcherType;", "setType", "(Lgraphics/scenery/controls/ScreenConfig$ScreenMatcherType;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "scenery"})
    public static final class ScreenMatcher {
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.controls.ScreenConfig.ScreenMatcherType type;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String value;

        public ScreenMatcher(@org.jetbrains.annotations.NotNull()
                                 graphics.scenery.controls.ScreenConfig.ScreenMatcherType type, @org.jetbrains.annotations.NotNull()
                                 java.lang.String value) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.controls.ScreenConfig.ScreenMatcherType getType() {
            return null;
        }

        public final void setType(@org.jetbrains.annotations.NotNull()
                                      graphics.scenery.controls.ScreenConfig.ScreenMatcherType p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }

        public final void setValue(@org.jetbrains.annotations.NotNull()
                                       java.lang.String p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.controls.ScreenConfig.ScreenMatcherType component1() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }

        /**
         * * Screen matcher class with [type] and [value].
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.controls.ScreenConfig.ScreenMatcher copy(@org.jetbrains.annotations.NotNull()
                                                                                   graphics.scenery.controls.ScreenConfig.ScreenMatcherType type, @org.jetbrains.annotations.NotNull()
                                                                                   java.lang.String value) {
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

    /**
     * * ScreenConfig companion class for static functions
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lgraphics/scenery/controls/ScreenConfig$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getHostname", "", "getScreen", "Lgraphics/scenery/controls/ScreenConfig$SingleScreenConfig;", "config", "Lgraphics/scenery/controls/ScreenConfig$Config;", "loadFromFile", "path", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }

        private final org.slf4j.Logger getLogger() {
            return null;
        }

        /**
         * * Matches a single screen to the [config] given.
         * *
         * * Returns a [SingleScreenConfig] if the screen could be matched, and null otherwise.
         */
        @org.jetbrains.annotations.Nullable()
        public final graphics.scenery.controls.ScreenConfig.SingleScreenConfig getScreen(@org.jetbrains.annotations.NotNull()
                                                                                             graphics.scenery.controls.ScreenConfig.Config config) {
            return null;
        }

        private final java.lang.String getHostname() {
            return null;
        }

        /**
         * * Loads a [ScreenConfig.Config] from a [path] and returns it.
         * *
         * * If [path] cannot be found, a default configuration included with scenery will be loaded.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.controls.ScreenConfig.Config loadFromFile(@org.jetbrains.annotations.NotNull()
                                                                                    java.lang.String path) {
            return null;
        }
    }
}
