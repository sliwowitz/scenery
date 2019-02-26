package graphics.scenery;

/**
 * * Abstract class for light [Node]s.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\u00020\u00068&@&X\u00a7\u000e\u00a2\u0006\u0012\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u000e8&@&X\u00a7\u000e\u00a2\u0006\u0012\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00158&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lgraphics/scenery/Light;", "Lgraphics/scenery/Mesh;", "name", "", "(Ljava/lang/String;)V", "emissionColor", "Lcleargl/GLVector;", "emissionColor$annotations", "()V", "getEmissionColor", "()Lcleargl/GLVector;", "setEmissionColor", "(Lcleargl/GLVector;)V", "intensity", "", "intensity$annotations", "getIntensity", "()F", "setIntensity", "(F)V", "lightType", "Lgraphics/scenery/Light$LightType;", "lightType$annotations", "getLightType", "()Lgraphics/scenery/Light$LightType;", "LightType", "scenery"})
public abstract class Light extends graphics.scenery.Mesh {

    public Light(@org.jetbrains.annotations.NotNull()
                     java.lang.String name) {
        super(null);
    }

    public Light() {
        super(null);
    }

    @ShaderProperty()
    public static void emissionColor$annotations() {
    }

    @ShaderProperty()
    public static void intensity$annotations() {
    }

    @ShaderProperty()
    public static void lightType$annotations() {
    }

    /**
     * Emission color of the light.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLVector getEmissionColor();

    /**
     * Emission color of the light.
     */
    public abstract void setEmissionColor(@org.jetbrains.annotations.NotNull()
                                              cleargl.GLVector p0);

    /**
     * Intensity of the light.
     */
    public abstract float getIntensity();

    /**
     * Intensity of the light.
     */
    public abstract void setIntensity(float p0);

    /**
     * The light's type, stored as [LightType].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract graphics.scenery.Light.LightType getLightType();

    /**
     * Enum class to determine light type.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lgraphics/scenery/Light$LightType;", "", "(Ljava/lang/String;I)V", "PointLight", "DirectionalLight", "scenery"})
    public static enum LightType {
        /*public static final*/ PointLight /* = new PointLight() */,
        /*public static final*/ DirectionalLight /* = new DirectionalLight() */;

        LightType() {
        }
    }
}
