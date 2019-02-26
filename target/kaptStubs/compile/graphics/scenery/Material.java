package graphics.scenery;

/**
 * * Material class, storing material colors, textures, opacity properties, etc.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 B2\u00020\u0001:\u0003@ABB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R\u001a\u00103\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR&\u00106\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%07X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020=07X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00109\"\u0004\b?\u0010;\u00a8\u0006C"}, d2 = {"Lgraphics/scenery/Material;", "Ljava/io/Serializable;", "()V", "ambient", "Lcleargl/GLVector;", "getAmbient", "()Lcleargl/GLVector;", "setAmbient", "(Lcleargl/GLVector;)V", "blending", "Lgraphics/scenery/Blending;", "getBlending", "()Lgraphics/scenery/Blending;", "setBlending", "(Lgraphics/scenery/Blending;)V", "cullingMode", "Lgraphics/scenery/Material$CullingMode;", "getCullingMode", "()Lgraphics/scenery/Material$CullingMode;", "setCullingMode", "(Lgraphics/scenery/Material$CullingMode;)V", "depthTest", "Lgraphics/scenery/Material$DepthTest;", "getDepthTest", "()Lgraphics/scenery/Material$DepthTest;", "setDepthTest", "(Lgraphics/scenery/Material$DepthTest;)V", "diffuse", "getDiffuse", "setDiffuse", "metallic", "", "getMetallic", "()F", "setMetallic", "(F)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "needsTextureReload", "", "getNeedsTextureReload", "()Z", "setNeedsTextureReload", "(Z)V", "roughness", "getRoughness", "setRoughness", "specular", "getSpecular", "setSpecular", "textures", "Ljava/util/concurrent/ConcurrentHashMap;", "getTextures", "()Ljava/util/concurrent/ConcurrentHashMap;", "setTextures", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "transferTextures", "Lgraphics/scenery/GenericTexture;", "getTransferTextures", "setTransferTextures", "CullingMode", "DepthTest", "Factory", "scenery"})
public class Material implements java.io.Serializable {

    public static final graphics.scenery.Material.Factory Factory = null;
    /**
     * Name of the material.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    /**
     * Diffuse color of the material.
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector diffuse;
    /**
     * Specular color of the material.
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector specular;
    /**
     * Ambient color of the material.
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector ambient;
    /**
     * Specular exponent
     */
    private float roughness;
    /**
     * Metallicity, 0.0 is non-metal, 1.0 is full metal
     */
    private float metallic;
    /**
     * Blending settings for this material. See [Blending].
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Blending blending;
    /**
     * Hash map storing the type and origin of the material's textures. Key is the
     * * type, e.g. ("diffuse", "normal", "displacement"...), value can be a file path or
     * * via "fromBuffer:[transferTextureName], a named [GenericTexture] in [transferTextures].
     */
    @org.jetbrains.annotations.NotNull()
    private volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> textures;
    /**
     * Storage for textures to be transfered to a concrete texture by the renderer. [GenericTexture]
     * * stores the data and settings of the texture, a renderer will consume them later.
     */
    @org.jetbrains.annotations.NotNull()
    private volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.GenericTexture> transferTextures;
    /**
     * Culling mode of the material. @see[CullingMode]
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Material.CullingMode cullingMode;
    /**
     * depth testing mode for this material
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Material.DepthTest depthTest;
    /**
     * Flag to check whether the [transferTextures] need reloading
     */
    private boolean needsTextureReload;

    public Material() {
        super();
    }

    /**
     * * Factory method returning the default material
     * *
     * * @return Material with default properties
     */
    @org.jetbrains.annotations.NotNull()
    public static final graphics.scenery.Material DefaultMaterial() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }

    public final void setName(@org.jetbrains.annotations.NotNull()
                                  java.lang.String p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getDiffuse() {
        return null;
    }

    public final void setDiffuse(@org.jetbrains.annotations.NotNull()
                                     cleargl.GLVector p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getSpecular() {
        return null;
    }

    public final void setSpecular(@org.jetbrains.annotations.NotNull()
                                      cleargl.GLVector p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getAmbient() {
        return null;
    }

    public final void setAmbient(@org.jetbrains.annotations.NotNull()
                                     cleargl.GLVector p0) {
    }

    public final float getRoughness() {
        return 0.0F;
    }

    public final void setRoughness(float p0) {
    }

    public final float getMetallic() {
        return 0.0F;
    }

    public final void setMetallic(float p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending getBlending() {
        return null;
    }

    public final void setBlending(@org.jetbrains.annotations.NotNull()
                                      graphics.scenery.Blending p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> getTextures() {
        return null;
    }

    public final void setTextures(@org.jetbrains.annotations.NotNull()
                                      java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.GenericTexture> getTransferTextures() {
        return null;
    }

    public final void setTransferTextures(@org.jetbrains.annotations.NotNull()
                                              java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.GenericTexture> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Material.CullingMode getCullingMode() {
        return null;
    }

    public final void setCullingMode(@org.jetbrains.annotations.NotNull()
                                         graphics.scenery.Material.CullingMode p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Material.DepthTest getDepthTest() {
        return null;
    }

    public final void setDepthTest(@org.jetbrains.annotations.NotNull()
                                       graphics.scenery.Material.DepthTest p0) {
    }

    public final boolean getNeedsTextureReload() {
        return false;
    }

    public final void setNeedsTextureReload(boolean p0) {
    }

    /**
     * * Culling Mode enum, to determine which faces are culling when assuming CCW order
     * * [Front] - front faces culled
     * * [Back] - back faces culled
     * * [FrontAndBack] - all faces culled
     * * [None] - no faces culled
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/Material$CullingMode;", "", "(Ljava/lang/String;I)V", "None", "Front", "Back", "FrontAndBack", "scenery"})
    public static enum CullingMode {
        /*public static final*/ None /* = new None() */,
        /*public static final*/ Front /* = new Front() */,
        /*public static final*/ Back /* = new Back() */,
        /*public static final*/ FrontAndBack /* = new FrontAndBack() */;

        CullingMode() {
        }
    }

    /**
     * Depth test enum, determines which operation on the depth buffer values results in a pass.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lgraphics/scenery/Material$DepthTest;", "", "(Ljava/lang/String;I)V", "Less", "Greater", "LessEqual", "GreaterEqual", "Always", "Never", "Equal", "scenery"})
    public static enum DepthTest {
        /*public static final*/ Less /* = new Less() */,
        /*public static final*/ Greater /* = new Greater() */,
        /*public static final*/ LessEqual /* = new LessEqual() */,
        /*public static final*/ GreaterEqual /* = new GreaterEqual() */,
        /*public static final*/ Always /* = new Always() */,
        /*public static final*/ Never /* = new Never() */,
        /*public static final*/ Equal /* = new Equal() */;

        DepthTest() {
        }
    }

    /**
     * Companion object for Material, emulating static methods
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lgraphics/scenery/Material$Factory;", "", "()V", "DefaultMaterial", "Lgraphics/scenery/Material;", "scenery"})
    public static final class Factory {

        private Factory() {
            super();
        }

        /**
         * * Factory method returning the default material
         * *
         * * @return Material with default properties
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Material DefaultMaterial() {
            return null;
        }
    }
}
