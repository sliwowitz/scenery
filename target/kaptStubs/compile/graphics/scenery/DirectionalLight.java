package graphics.scenery;

import java.lang.System;

/**
 * * Point light class.
 * *
 * * Point lights have an extent given as [lightRadius].
 * * They also have an optional [Box] to accompany them for easier visualisation.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @constructor Creates a PointLight with default settings, e.g. white emission color.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R$\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0004R$\u0010\u0014\u001a\u00020\u00158\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u00020\u001e8\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\b\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020\u00038FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b)\u0010\b\u001a\u0004\b*\u0010\u000e\u00a8\u0006+"}, d2 = {"Lgraphics/scenery/DirectionalLight;", "Lgraphics/scenery/Light;", "direction", "Lcleargl/GLVector;", "(Lcleargl/GLVector;)V", "debugMode", "", "debugMode$annotations", "()V", "getDebugMode", "()I", "setDebugMode", "(I)V", "getDirection", "()Lcleargl/GLVector;", "setDirection", "emissionColor", "emissionColor$annotations", "getEmissionColor", "setEmissionColor", "intensity", "", "intensity$annotations", "getIntensity", "()F", "setIntensity", "(F)V", "lightRadius", "lightRadius$annotations", "lightType", "Lgraphics/scenery/Light$LightType;", "lightType$annotations", "getLightType", "()Lgraphics/scenery/Light$LightType;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "worldPosition", "worldPosition$annotations", "getWorldPosition", "scenery"})
public final class DirectionalLight extends graphics.scenery.Light {
    
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
     * Type of the light, can be DirectionalLight or PointLight 
     */
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.Light.LightType lightType = null;
    private float lightRadius;
    
    /**
     * Node name of the Point Light 
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private int debugMode;
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector direction;
    
    @java.lang.Override()
    @ShaderProperty()
    public static void intensity$annotations() {
    }
    
    @java.lang.Override()
    public float getIntensity() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public void setIntensity(float p0) {
    }
    
    @java.lang.Override()
    @ShaderProperty()
    public static void emissionColor$annotations() {
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
    
    @java.lang.Override()
    @ShaderProperty()
    public static void lightType$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.Light.LightType getLightType() {
        return null;
    }
    
    @ShaderProperty()
    private static void lightRadius$annotations() {
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
    
    @kotlin.Suppress(names = {"unused"})
    @ShaderProperty()
    public static void worldPosition$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getWorldPosition() {
        return null;
    }
    
    @kotlin.Suppress(names = {"unused"})
    @ShaderProperty()
    public static void debugMode$annotations() {
    }
    
    public final int getDebugMode() {
        return 0;
    }
    
    public final void setDebugMode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getDirection() {
        return null;
    }
    
    public final void setDirection(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0) {
    }
    
    public DirectionalLight(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector direction) {
        super(null);
    }
    
    public DirectionalLight() {
        super(null);
    }
}