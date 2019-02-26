package graphics.scenery.backends;

/**
 * * Class to ingest rendering configuration files.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0011"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader;", "", "()V", "loadFromFile", "Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "path", "", "FloatPairDeserializer", "RenderConfig", "RenderOrder", "RenderingQuality", "RenderpassConfig", "RenderpassType", "RendertargetConfig", "TargetFormat", "VREyeDeserializer", "VectorDeserializer", "scenery"})
public final class RenderConfigReader {

    public RenderConfigReader() {
        super();
    }

    /**
     * * Loads a [RenderConfig] from a file given by [path].
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.RenderConfigReader.RenderConfig loadFromFile(@org.jetbrains.annotations.NotNull()
                                                                                            java.lang.String path) {
        return null;
    }

    /**
     * Rendering quality enums
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader$RenderingQuality;", "", "(Ljava/lang/String;I)V", "Low", "Medium", "High", "Ultra", "scenery"})
    public static enum RenderingQuality {
        /*public static final*/ Low /* = new Low() */,
        /*public static final*/ Medium /* = new Medium() */,
        /*public static final*/ High /* = new High() */,
        /*public static final*/ Ultra /* = new Ultra() */;

        RenderingQuality() {
        }
    }

    /**
     * Renderpass types
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader$RenderpassType;", "", "(Ljava/lang/String;I)V", "geometry", "quad", "lights", "scenery"})
    public static enum RenderpassType {
        /*public static final*/ geometry /* = new geometry() */,
        /*public static final*/ quad /* = new quad() */,
        /*public static final*/ lights /* = new lights() */;

        RenderpassType() {
        }
    }

    /**
     * Render ordering
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader$RenderOrder;", "", "(Ljava/lang/String;I)V", "DontCare", "BackToFront", "FrontToBack", "scenery"})
    public static enum RenderOrder {
        /*public static final*/ DontCare /* = new DontCare() */,
        /*public static final*/ BackToFront /* = new BackToFront() */,
        /*public static final*/ FrontToBack /* = new FrontToBack() */;

        RenderOrder() {
        }
    }

    /**
     * Rendertarget formats
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader$TargetFormat;", "", "(Ljava/lang/String;I)V", "RGBA_Float32", "RGBA_Float16", "RGB_Float32", "RGB_Float16", "RG_Float32", "RG_Float16", "R_Float16", "Depth24", "Depth32", "RGBA_UInt8", "RGBA_UInt16", "R_UInt16", "R_UInt8", "scenery"})
    public static enum TargetFormat {
        /*public static final*/ RGBA_Float32 /* = new RGBA_Float32() */,
        /*public static final*/ RGBA_Float16 /* = new RGBA_Float16() */,
        /*public static final*/ RGB_Float32 /* = new RGB_Float32() */,
        /*public static final*/ RGB_Float16 /* = new RGB_Float16() */,
        /*public static final*/ RG_Float32 /* = new RG_Float32() */,
        /*public static final*/ RG_Float16 /* = new RG_Float16() */,
        /*public static final*/ R_Float16 /* = new R_Float16() */,
        /*public static final*/ Depth24 /* = new Depth24() */,
        /*public static final*/ Depth32 /* = new Depth32() */,
        /*public static final*/ RGBA_UInt8 /* = new RGBA_UInt8() */,
        /*public static final*/ RGBA_UInt16 /* = new RGBA_UInt16() */,
        /*public static final*/ R_UInt16 /* = new R_UInt16() */,
        /*public static final*/ R_UInt8 /* = new R_UInt8() */;

        TargetFormat() {
        }
    }

    /**
     * * Deserialiser for pairs of floats, separated by commas.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader$FloatPairDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "Lkotlin/Pair;", "", "()V", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "scenery"})
    public static final class FloatPairDeserializer extends com.fasterxml.jackson.databind.JsonDeserializer<kotlin.Pair<? extends java.lang.Float, ? extends java.lang.Float>> {

        public FloatPairDeserializer() {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.Pair<java.lang.Float, java.lang.Float> deserialize(@org.jetbrains.annotations.NotNull()
                                                                             com.fasterxml.jackson.core.JsonParser p, @org.jetbrains.annotations.Nullable()
                                                                             com.fasterxml.jackson.databind.DeserializationContext ctxt) {
            return null;
        }
    }

    /**
     * * Deserialiser for vectors of various lengths, separated by commas.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader$VectorDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "Lcleargl/GLVector;", "()V", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "scenery"})
    public static final class VectorDeserializer extends com.fasterxml.jackson.databind.JsonDeserializer<cleargl.GLVector> {

        public VectorDeserializer() {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public cleargl.GLVector deserialize(@org.jetbrains.annotations.NotNull()
                                                com.fasterxml.jackson.core.JsonParser p, @org.jetbrains.annotations.Nullable()
                                                com.fasterxml.jackson.databind.DeserializationContext ctxt) {
            return null;
        }
    }

    /**
     * * Eye description deserialiser, turns "LeftEye" to 0, "RightEye" to 1
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader$VREyeDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "", "()V", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Integer;", "scenery"})
    public static final class VREyeDeserializer extends com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Integer> {

        public VREyeDeserializer() {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Integer deserialize(@org.jetbrains.annotations.NotNull()
                                                 com.fasterxml.jackson.core.JsonParser p, @org.jetbrains.annotations.Nullable()
                                                 com.fasterxml.jackson.databind.DeserializationContext ctxt) {
            return null;
        }
    }

    /**
     * * Render configuration top-level class, containing information about [rendertargets]
     * * and [renderpasses], as well as [qualitySettings].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\t\u0012 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t0\t\u00a2\u0006\u0002\u0010\u000fJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\tH\u00c6\u0003J!\u0010*\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t0\tH\u00c6\u0003J\u0081\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\t2 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t0\tH\u00c6\u0001J\u0013\u0010,\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R2\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!\u00a8\u00061"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "", "name", "", "sRGB", "", "description", "stereoEnabled", "rendertargets", "", "Lgraphics/scenery/backends/RenderConfigReader$RendertargetConfig;", "renderpasses", "Lgraphics/scenery/backends/RenderConfigReader$RenderpassConfig;", "qualitySettings", "Lgraphics/scenery/backends/RenderConfigReader$RenderingQuality;", "(Ljava/lang/String;ZLjava/lang/String;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getName", "setName", "getQualitySettings", "()Ljava/util/Map;", "setQualitySettings", "(Ljava/util/Map;)V", "getRenderpasses", "setRenderpasses", "getRendertargets", "setRendertargets", "getSRGB", "()Z", "setSRGB", "(Z)V", "getStereoEnabled", "setStereoEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "scenery"})
    public static final class RenderConfig {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String name;
        private boolean sRGB;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String description;
        private boolean stereoEnabled;
        @org.jetbrains.annotations.NotNull()
        private java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RendertargetConfig> rendertargets;
        @org.jetbrains.annotations.NotNull()
        private java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RenderpassConfig> renderpasses;
        @org.jetbrains.annotations.NotNull()
        private java.util.Map<graphics.scenery.backends.RenderConfigReader.RenderingQuality, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> qualitySettings;

        public RenderConfig(@org.jetbrains.annotations.NotNull()
                                java.lang.String name, boolean sRGB, @org.jetbrains.annotations.Nullable()
                                java.lang.String description, boolean stereoEnabled, @org.jetbrains.annotations.NotNull()
                                java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RendertargetConfig> rendertargets, @org.jetbrains.annotations.NotNull()
                                java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RenderpassConfig> renderpasses, @org.jetbrains.annotations.NotNull()
                                java.util.Map<graphics.scenery.backends.RenderConfigReader.RenderingQuality, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> qualitySettings) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }

        public final void setName(@org.jetbrains.annotations.NotNull()
                                      java.lang.String p0) {
        }

        public final boolean getSRGB() {
            return false;
        }

        public final void setSRGB(boolean p0) {
        }

        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }

        public final void setDescription(@org.jetbrains.annotations.Nullable()
                                             java.lang.String p0) {
        }

        public final boolean getStereoEnabled() {
            return false;
        }

        public final void setStereoEnabled(boolean p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RendertargetConfig> getRendertargets() {
            return null;
        }

        public final void setRendertargets(@org.jetbrains.annotations.NotNull()
                                               java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RendertargetConfig> p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RenderpassConfig> getRenderpasses() {
            return null;
        }

        public final void setRenderpasses(@org.jetbrains.annotations.NotNull()
                                              java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RenderpassConfig> p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<graphics.scenery.backends.RenderConfigReader.RenderingQuality, java.util.Map<java.lang.String, java.lang.Object>> getQualitySettings() {
            return null;
        }

        public final void setQualitySettings(@org.jetbrains.annotations.NotNull()
                                                 java.util.Map<graphics.scenery.backends.RenderConfigReader.RenderingQuality, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }

        public final boolean component2() {
            return false;
        }

        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }

        public final boolean component4() {
            return false;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RendertargetConfig> component5() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RenderpassConfig> component6() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<graphics.scenery.backends.RenderConfigReader.RenderingQuality, java.util.Map<java.lang.String, java.lang.Object>> component7() {
            return null;
        }

        /**
         * * Render configuration top-level class, containing information about [rendertargets]
         * * and [renderpasses], as well as [qualitySettings].
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.RenderConfigReader.RenderConfig copy(@org.jetbrains.annotations.NotNull()
                                                                                        java.lang.String name, boolean sRGB, @org.jetbrains.annotations.Nullable()
                                                                                        java.lang.String description, boolean stereoEnabled, @org.jetbrains.annotations.NotNull()
                                                                                        java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RendertargetConfig> rendertargets, @org.jetbrains.annotations.NotNull()
                                                                                        java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.RenderpassConfig> renderpasses, @org.jetbrains.annotations.NotNull()
                                                                                        java.util.Map<graphics.scenery.backends.RenderConfigReader.RenderingQuality, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> qualitySettings) {
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
     * * Configuration for a single render target, defining its [size] and [attachments].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u00c6\u0003J5\u0010\u0012\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader$RendertargetConfig;", "", "size", "Lkotlin/Pair;", "", "attachments", "", "", "Lgraphics/scenery/backends/RenderConfigReader$TargetFormat;", "(Lkotlin/Pair;Ljava/util/Map;)V", "getAttachments", "()Ljava/util/Map;", "getSize", "()Lkotlin/Pair;", "setSize", "(Lkotlin/Pair;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "scenery"})
    public static final class RendertargetConfig {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.TargetFormat> attachments = null;
        @org.jetbrains.annotations.NotNull()
        private kotlin.Pair<java.lang.Float, java.lang.Float> size;

        public RendertargetConfig(@org.jetbrains.annotations.NotNull()
                                  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.FloatPairDeserializer.class)
                                      kotlin.Pair<java.lang.Float, java.lang.Float> size, @org.jetbrains.annotations.NotNull()
                                      java.util.Map<java.lang.String, ? extends graphics.scenery.backends.RenderConfigReader.TargetFormat> attachments) {
            super();
        }

        public RendertargetConfig() {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Float, java.lang.Float> getSize() {
            return null;
        }

        public final void setSize(@org.jetbrains.annotations.NotNull()
                                      kotlin.Pair<java.lang.Float, java.lang.Float> p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.TargetFormat> getAttachments() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Float, java.lang.Float> component1() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, graphics.scenery.backends.RenderConfigReader.TargetFormat> component2() {
            return null;
        }

        /**
         * * Configuration for a single render target, defining its [size] and [attachments].
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.RenderConfigReader.RendertargetConfig copy(@org.jetbrains.annotations.NotNull()
                                                                                          @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.FloatPairDeserializer.class)
                                                                                              kotlin.Pair<java.lang.Float, java.lang.Float> size, @org.jetbrains.annotations.NotNull()
                                                                                              java.util.Map<java.lang.String, ? extends graphics.scenery.backends.RenderConfigReader.TargetFormat> attachments) {
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
     * * Configuration for a single render pass
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bd\b\u0086\b\u0018\u00002\u00020\u0001B\u00a1\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a\u0012\u0014\b\u0003\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0014\b\u0003\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0014\b\u0003\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\b\b\u0003\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020\u001d\u0012\b\b\u0003\u0010#\u001a\u00020$\u00a2\u0006\u0002\u0010%J\t\u0010l\u001a\u00020\u0003H\u00c6\u0003J\t\u0010m\u001a\u00020\u0010H\u00c6\u0003J\t\u0010n\u001a\u00020\u0010H\u00c6\u0003J\t\u0010o\u001a\u00020\u0010H\u00c6\u0003J\t\u0010p\u001a\u00020\u0010H\u00c6\u0003J\u000f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u00c6\u0003J\t\u0010s\u001a\u00020\u0016H\u00c6\u0003J\u0017\u0010t\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aH\u00c6\u0003J\u0015\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001cH\u00c6\u0003J\u0015\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001cH\u00c6\u0003J\t\u0010w\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001cH\u00c6\u0003J\t\u0010y\u001a\u00020!H\u00c6\u0003J\t\u0010z\u001a\u00020\u001dH\u00c6\u0003J\t\u0010{\u001a\u00020$H\u00c6\u0003J\t\u0010|\u001a\u00020\u0005H\u00c6\u0003J\t\u0010}\u001a\u00020\u0005H\u00c6\u0003J\t\u0010~\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\nH\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\rH\u00c6\u0003J\u00b0\u0002\u0010\u0083\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a2\u0014\b\u0003\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c2\u0014\b\u0003\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c2\u0014\b\u0003\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0003\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u001d2\b\b\u0003\u0010#\u001a\u00020$H\u00c6\u0001J\u0015\u0010\u0084\u0001\u001a\u00020\u00052\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0086\u0001\u001a\u00020$H\u00d6\u0001J\n\u0010\u0087\u0001\u001a\u00020\u0016H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\'\"\u0004\b3\u0010)R\u001a\u0010\"\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010+\"\u0004\b;\u0010-R\u001a\u0010\u0013\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010=\"\u0004\bA\u0010?R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010\u0018\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010+\"\u0004\bW\u0010-R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010+\"\u0004\bY\u0010-R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010G\"\u0004\b_\u0010IR\u001a\u0010\u0012\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010=\"\u0004\ba\u0010?R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010=\"\u0004\bc\u0010?R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010[\"\u0004\bi\u0010]R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010[\"\u0004\bk\u0010]\u00a8\u0006\u0088\u0001"}, d2 = {"Lgraphics/scenery/backends/RenderConfigReader$RenderpassConfig;", "", "type", "Lgraphics/scenery/backends/RenderConfigReader$RenderpassType;", "blitInputs", "", "renderTransparent", "depthTestEnabled", "depthWriteEnabled", "order", "Lgraphics/scenery/backends/RenderConfigReader$RenderOrder;", "renderOpaque", "colorBlendOp", "Lgraphics/scenery/Blending$BlendOp;", "alphaBlendOp", "srcColorBlendFactor", "Lgraphics/scenery/Blending$BlendFactor;", "dstColorBlendFactor", "srcAlphaBlendFactor", "dstAlphaBlendFactor", "shaders", "", "", "inputs", "output", "parameters", "", "viewportSize", "Lkotlin/Pair;", "", "viewportOffset", "scissor", "clearColor", "Lcleargl/GLVector;", "depthClearValue", "eye", "", "(Lgraphics/scenery/backends/RenderConfigReader$RenderpassType;ZZZZLgraphics/scenery/backends/RenderConfigReader$RenderOrder;ZLgraphics/scenery/Blending$BlendOp;Lgraphics/scenery/Blending$BlendOp;Lgraphics/scenery/Blending$BlendFactor;Lgraphics/scenery/Blending$BlendFactor;Lgraphics/scenery/Blending$BlendFactor;Lgraphics/scenery/Blending$BlendFactor;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lcleargl/GLVector;FI)V", "getAlphaBlendOp", "()Lgraphics/scenery/Blending$BlendOp;", "setAlphaBlendOp", "(Lgraphics/scenery/Blending$BlendOp;)V", "getBlitInputs", "()Z", "setBlitInputs", "(Z)V", "getClearColor", "()Lcleargl/GLVector;", "setClearColor", "(Lcleargl/GLVector;)V", "getColorBlendOp", "setColorBlendOp", "getDepthClearValue", "()F", "setDepthClearValue", "(F)V", "getDepthTestEnabled", "setDepthTestEnabled", "getDepthWriteEnabled", "setDepthWriteEnabled", "getDstAlphaBlendFactor", "()Lgraphics/scenery/Blending$BlendFactor;", "setDstAlphaBlendFactor", "(Lgraphics/scenery/Blending$BlendFactor;)V", "getDstColorBlendFactor", "setDstColorBlendFactor", "getEye", "()I", "setEye", "(I)V", "getInputs", "()Ljava/util/List;", "setInputs", "(Ljava/util/List;)V", "getOrder", "()Lgraphics/scenery/backends/RenderConfigReader$RenderOrder;", "setOrder", "(Lgraphics/scenery/backends/RenderConfigReader$RenderOrder;)V", "getOutput", "()Ljava/lang/String;", "setOutput", "(Ljava/lang/String;)V", "getParameters", "()Ljava/util/Map;", "setParameters", "(Ljava/util/Map;)V", "getRenderOpaque", "setRenderOpaque", "getRenderTransparent", "setRenderTransparent", "getScissor", "()Lkotlin/Pair;", "setScissor", "(Lkotlin/Pair;)V", "getShaders", "setShaders", "getSrcAlphaBlendFactor", "setSrcAlphaBlendFactor", "getSrcColorBlendFactor", "setSrcColorBlendFactor", "getType", "()Lgraphics/scenery/backends/RenderConfigReader$RenderpassType;", "setType", "(Lgraphics/scenery/backends/RenderConfigReader$RenderpassType;)V", "getViewportOffset", "setViewportOffset", "getViewportSize", "setViewportSize", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "scenery"})
    public static final class RenderpassConfig {
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.backends.RenderConfigReader.RenderpassType type;
        private boolean blitInputs;
        private boolean renderTransparent;
        private boolean depthTestEnabled;
        private boolean depthWriteEnabled;
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.backends.RenderConfigReader.RenderOrder order;
        private boolean renderOpaque;
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.Blending.BlendOp colorBlendOp;
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.Blending.BlendOp alphaBlendOp;
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.Blending.BlendFactor srcColorBlendFactor;
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.Blending.BlendFactor dstColorBlendFactor;
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.Blending.BlendFactor srcAlphaBlendFactor;
        @org.jetbrains.annotations.NotNull()
        private graphics.scenery.Blending.BlendFactor dstAlphaBlendFactor;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.String> shaders;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<java.lang.String> inputs;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String output;
        @org.jetbrains.annotations.Nullable()
        private java.util.Map<java.lang.String, ? extends java.lang.Object> parameters;
        @org.jetbrains.annotations.NotNull()
        private kotlin.Pair<java.lang.Float, java.lang.Float> viewportSize;
        @org.jetbrains.annotations.NotNull()
        private kotlin.Pair<java.lang.Float, java.lang.Float> viewportOffset;
        @org.jetbrains.annotations.NotNull()
        private kotlin.Pair<java.lang.Float, java.lang.Float> scissor;
        @org.jetbrains.annotations.NotNull()
        private cleargl.GLVector clearColor;
        private float depthClearValue;
        private int eye;

        public RenderpassConfig(@org.jetbrains.annotations.NotNull()
                                    graphics.scenery.backends.RenderConfigReader.RenderpassType type, boolean blitInputs, boolean renderTransparent, boolean depthTestEnabled, boolean depthWriteEnabled, @org.jetbrains.annotations.NotNull()
                                    graphics.scenery.backends.RenderConfigReader.RenderOrder order, boolean renderOpaque, @org.jetbrains.annotations.NotNull()
                                    graphics.scenery.Blending.BlendOp colorBlendOp, @org.jetbrains.annotations.NotNull()
                                    graphics.scenery.Blending.BlendOp alphaBlendOp, @org.jetbrains.annotations.NotNull()
                                    graphics.scenery.Blending.BlendFactor srcColorBlendFactor, @org.jetbrains.annotations.NotNull()
                                    graphics.scenery.Blending.BlendFactor dstColorBlendFactor, @org.jetbrains.annotations.NotNull()
                                    graphics.scenery.Blending.BlendFactor srcAlphaBlendFactor, @org.jetbrains.annotations.NotNull()
                                    graphics.scenery.Blending.BlendFactor dstAlphaBlendFactor, @org.jetbrains.annotations.NotNull()
                                    java.util.List<java.lang.String> shaders, @org.jetbrains.annotations.Nullable()
                                    java.util.List<java.lang.String> inputs, @org.jetbrains.annotations.NotNull()
                                    java.lang.String output, @org.jetbrains.annotations.Nullable()
                                    java.util.Map<java.lang.String, ? extends java.lang.Object> parameters, @org.jetbrains.annotations.NotNull()
                                @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.FloatPairDeserializer.class)
                                    kotlin.Pair<java.lang.Float, java.lang.Float> viewportSize, @org.jetbrains.annotations.NotNull()
                                @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.FloatPairDeserializer.class)
                                    kotlin.Pair<java.lang.Float, java.lang.Float> viewportOffset, @org.jetbrains.annotations.NotNull()
                                @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.FloatPairDeserializer.class)
                                    kotlin.Pair<java.lang.Float, java.lang.Float> scissor, @org.jetbrains.annotations.NotNull()
                                @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.VectorDeserializer.class)
                                    cleargl.GLVector clearColor, float depthClearValue, @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.VREyeDeserializer.class)
                                    int eye) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.RenderConfigReader.RenderpassType getType() {
            return null;
        }

        public final void setType(@org.jetbrains.annotations.NotNull()
                                      graphics.scenery.backends.RenderConfigReader.RenderpassType p0) {
        }

        public final boolean getBlitInputs() {
            return false;
        }

        public final void setBlitInputs(boolean p0) {
        }

        public final boolean getRenderTransparent() {
            return false;
        }

        public final void setRenderTransparent(boolean p0) {
        }

        public final boolean getDepthTestEnabled() {
            return false;
        }

        public final void setDepthTestEnabled(boolean p0) {
        }

        public final boolean getDepthWriteEnabled() {
            return false;
        }

        public final void setDepthWriteEnabled(boolean p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.RenderConfigReader.RenderOrder getOrder() {
            return null;
        }

        public final void setOrder(@org.jetbrains.annotations.NotNull()
                                       graphics.scenery.backends.RenderConfigReader.RenderOrder p0) {
        }

        public final boolean getRenderOpaque() {
            return false;
        }

        public final void setRenderOpaque(boolean p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendOp getColorBlendOp() {
            return null;
        }

        public final void setColorBlendOp(@org.jetbrains.annotations.NotNull()
                                              graphics.scenery.Blending.BlendOp p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendOp getAlphaBlendOp() {
            return null;
        }

        public final void setAlphaBlendOp(@org.jetbrains.annotations.NotNull()
                                              graphics.scenery.Blending.BlendOp p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendFactor getSrcColorBlendFactor() {
            return null;
        }

        public final void setSrcColorBlendFactor(@org.jetbrains.annotations.NotNull()
                                                     graphics.scenery.Blending.BlendFactor p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendFactor getDstColorBlendFactor() {
            return null;
        }

        public final void setDstColorBlendFactor(@org.jetbrains.annotations.NotNull()
                                                     graphics.scenery.Blending.BlendFactor p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendFactor getSrcAlphaBlendFactor() {
            return null;
        }

        public final void setSrcAlphaBlendFactor(@org.jetbrains.annotations.NotNull()
                                                     graphics.scenery.Blending.BlendFactor p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendFactor getDstAlphaBlendFactor() {
            return null;
        }

        public final void setDstAlphaBlendFactor(@org.jetbrains.annotations.NotNull()
                                                     graphics.scenery.Blending.BlendFactor p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getShaders() {
            return null;
        }

        public final void setShaders(@org.jetbrains.annotations.NotNull()
                                         java.util.List<java.lang.String> p0) {
        }

        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getInputs() {
            return null;
        }

        public final void setInputs(@org.jetbrains.annotations.Nullable()
                                        java.util.List<java.lang.String> p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOutput() {
            return null;
        }

        public final void setOutput(@org.jetbrains.annotations.NotNull()
                                        java.lang.String p0) {
        }

        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.Object> getParameters() {
            return null;
        }

        public final void setParameters(@org.jetbrains.annotations.Nullable()
                                            java.util.Map<java.lang.String, ? extends java.lang.Object> p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Float, java.lang.Float> getViewportSize() {
            return null;
        }

        public final void setViewportSize(@org.jetbrains.annotations.NotNull()
                                              kotlin.Pair<java.lang.Float, java.lang.Float> p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Float, java.lang.Float> getViewportOffset() {
            return null;
        }

        public final void setViewportOffset(@org.jetbrains.annotations.NotNull()
                                                kotlin.Pair<java.lang.Float, java.lang.Float> p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Float, java.lang.Float> getScissor() {
            return null;
        }

        public final void setScissor(@org.jetbrains.annotations.NotNull()
                                         kotlin.Pair<java.lang.Float, java.lang.Float> p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector getClearColor() {
            return null;
        }

        public final void setClearColor(@org.jetbrains.annotations.NotNull()
                                            cleargl.GLVector p0) {
        }

        public final float getDepthClearValue() {
            return 0.0F;
        }

        public final void setDepthClearValue(float p0) {
        }

        public final int getEye() {
            return 0;
        }

        public final void setEye(int p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.RenderConfigReader.RenderpassType component1() {
            return null;
        }

        public final boolean component2() {
            return false;
        }

        public final boolean component3() {
            return false;
        }

        public final boolean component4() {
            return false;
        }

        public final boolean component5() {
            return false;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.RenderConfigReader.RenderOrder component6() {
            return null;
        }

        public final boolean component7() {
            return false;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendOp component8() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendOp component9() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendFactor component10() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendFactor component11() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendFactor component12() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Blending.BlendFactor component13() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component14() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> component15() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component16() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.Object> component17() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Float, java.lang.Float> component18() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Float, java.lang.Float> component19() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Float, java.lang.Float> component20() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector component21() {
            return null;
        }

        public final float component22() {
            return 0.0F;
        }

        public final int component23() {
            return 0;
        }

        /**
         * * Configuration for a single render pass
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.RenderConfigReader.RenderpassConfig copy(@org.jetbrains.annotations.NotNull()
                                                                                            graphics.scenery.backends.RenderConfigReader.RenderpassType type, boolean blitInputs, boolean renderTransparent, boolean depthTestEnabled, boolean depthWriteEnabled, @org.jetbrains.annotations.NotNull()
                                                                                            graphics.scenery.backends.RenderConfigReader.RenderOrder order, boolean renderOpaque, @org.jetbrains.annotations.NotNull()
                                                                                            graphics.scenery.Blending.BlendOp colorBlendOp, @org.jetbrains.annotations.NotNull()
                                                                                            graphics.scenery.Blending.BlendOp alphaBlendOp, @org.jetbrains.annotations.NotNull()
                                                                                            graphics.scenery.Blending.BlendFactor srcColorBlendFactor, @org.jetbrains.annotations.NotNull()
                                                                                            graphics.scenery.Blending.BlendFactor dstColorBlendFactor, @org.jetbrains.annotations.NotNull()
                                                                                            graphics.scenery.Blending.BlendFactor srcAlphaBlendFactor, @org.jetbrains.annotations.NotNull()
                                                                                            graphics.scenery.Blending.BlendFactor dstAlphaBlendFactor, @org.jetbrains.annotations.NotNull()
                                                                                            java.util.List<java.lang.String> shaders, @org.jetbrains.annotations.Nullable()
                                                                                            java.util.List<java.lang.String> inputs, @org.jetbrains.annotations.NotNull()
                                                                                            java.lang.String output, @org.jetbrains.annotations.Nullable()
                                                                                            java.util.Map<java.lang.String, ? extends java.lang.Object> parameters, @org.jetbrains.annotations.NotNull()
                                                                                        @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.FloatPairDeserializer.class)
                                                                                            kotlin.Pair<java.lang.Float, java.lang.Float> viewportSize, @org.jetbrains.annotations.NotNull()
                                                                                        @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.FloatPairDeserializer.class)
                                                                                            kotlin.Pair<java.lang.Float, java.lang.Float> viewportOffset, @org.jetbrains.annotations.NotNull()
                                                                                        @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.FloatPairDeserializer.class)
                                                                                            kotlin.Pair<java.lang.Float, java.lang.Float> scissor, @org.jetbrains.annotations.NotNull()
                                                                                        @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.VectorDeserializer.class)
                                                                                            cleargl.GLVector clearColor, float depthClearValue, @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = graphics.scenery.backends.RenderConfigReader.VREyeDeserializer.class)
                                                                                            int eye) {
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
}
