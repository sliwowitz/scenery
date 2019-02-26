package graphics.scenery;

/**
 * * Point light class.
 * *
 * * Point lights have an extent given as [lightRadius].
 * * They also have an optional [Box] to accompany them for easier visualisation.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @constructor Creates a PointLight with default settings, e.g. white emission color.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u000e8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0004R,\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038\u0006@FX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0004R\u001c\u0010\u001e\u001a\u00020\u001f8\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b \u0010\b\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u000e8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b,\u0010\b\u001a\u0004\b-\u0010\u0011\u00a8\u0006."}, d2 = {"Lgraphics/scenery/PointLight;", "Lgraphics/scenery/Light;", "radius", "", "(F)V", "debugMode", "", "debugMode$annotations", "()V", "getDebugMode", "()I", "setDebugMode", "(I)V", "emissionColor", "Lcleargl/GLVector;", "emissionColor$annotations", "getEmissionColor", "()Lcleargl/GLVector;", "setEmissionColor", "(Lcleargl/GLVector;)V", "intensity", "intensity$annotations", "getIntensity", "()F", "setIntensity", "value", "lightRadius", "lightRadius$annotations", "getLightRadius", "setLightRadius", "lightType", "Lgraphics/scenery/Light$LightType;", "lightType$annotations", "getLightType", "()Lgraphics/scenery/Light$LightType;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "proxySphere", "Lgraphics/scenery/Sphere;", "worldPosition", "worldPosition$annotations", "getWorldPosition", "scenery"})
public final class PointLight extends graphics.scenery.Light {
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.Light.LightType lightType = null;
    private graphics.scenery.Sphere proxySphere;
    /**
     * The intensity of the point light. Bound to [0.0, 1.0] if using non-HDR rendering.
     */
    private float intensity;
    /**
     * The emission color of the point light. Setting it will also affect the accompanying Box' color.
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector emissionColor;
    /**
     * Maximum radius in world units
     */
    private float lightRadius;

    /**
     * Node name of the Point Light
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private int debugMode;

    public PointLight(float radius) {
        super(null);
    }

    public PointLight() {
        super(null);
    }

    @java.lang.Override()
    @ShaderProperty()
    public static void intensity$annotations() {
    }

    @java.lang.Override()
    @ShaderProperty()
    public static void emissionColor$annotations() {
    }

    @java.lang.Override()
    @ShaderProperty()
    public static void lightType$annotations() {
    }

    @kotlin.Suppress(names = {"unused"})
    @ShaderProperty()
    public static void lightRadius$annotations() {
    }

    @kotlin.Suppress(names = {"unused"})
    @ShaderProperty()
    public static void worldPosition$annotations() {
    }

    @kotlin.Suppress(names = {"unused"})
    @ShaderProperty()
    public static void debugMode$annotations() {
    }

    @java.lang.Override()
    public float getIntensity() {
        return 0.0F;
    }

    @java.lang.Override()
    public void setIntensity(float p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLVector getEmissionColor() {
        return null;
    }

    @java.lang.Override()
    public void setEmissionColor(@org.jetbrains.annotations.NotNull()
                                     cleargl.GLVector p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.Light.LightType getLightType() {
        return null;
    }

    public final float getLightRadius() {
        return 0.0F;
    }

    public final void setLightRadius(float value) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }

    @java.lang.Override()
    public void setName(@org.jetbrains.annotations.NotNull()
                            java.lang.String p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getWorldPosition() {
        return null;
    }

    public final int getDebugMode() {
        return 0;
    }

    public final void setDebugMode(int p0) {
    }
}
