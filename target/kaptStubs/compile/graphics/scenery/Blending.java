package graphics.scenery;

import java.lang.System;

/**
 * * Class providing different blend modes, transparency and blend factor settings.
 * * Blending options are modeled after the standard OpenGL and Vulkan blending modes.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u000289BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\nH\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\t\u0010.\u001a\u00020\nH\u00c6\u0003JY\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nH\u00c6\u0001J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u000203H\u00d6\u0001J\u0006\u00104\u001a\u000205J\t\u00106\u001a\u000207H\u00d6\u0001R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006:"}, d2 = {"Lgraphics/scenery/Blending;", "", "transparent", "", "opacity", "", "colorBlending", "Lgraphics/scenery/Blending$BlendOp;", "alphaBlending", "sourceColorBlendFactor", "Lgraphics/scenery/Blending$BlendFactor;", "destinationColorBlendFactor", "sourceAlphaBlendFactor", "destinationAlphaBlendFactor", "(ZFLgraphics/scenery/Blending$BlendOp;Lgraphics/scenery/Blending$BlendOp;Lgraphics/scenery/Blending$BlendFactor;Lgraphics/scenery/Blending$BlendFactor;Lgraphics/scenery/Blending$BlendFactor;Lgraphics/scenery/Blending$BlendFactor;)V", "getAlphaBlending", "()Lgraphics/scenery/Blending$BlendOp;", "setAlphaBlending", "(Lgraphics/scenery/Blending$BlendOp;)V", "getColorBlending", "setColorBlending", "getDestinationAlphaBlendFactor", "()Lgraphics/scenery/Blending$BlendFactor;", "setDestinationAlphaBlendFactor", "(Lgraphics/scenery/Blending$BlendFactor;)V", "getDestinationColorBlendFactor", "setDestinationColorBlendFactor", "getOpacity", "()F", "setOpacity", "(F)V", "getSourceAlphaBlendFactor", "setSourceAlphaBlendFactor", "getSourceColorBlendFactor", "setSourceColorBlendFactor", "getTransparent", "()Z", "setTransparent", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "setOverlayBlending", "", "toString", "", "BlendFactor", "BlendOp", "scenery"})
public final class Blending {
    
    /**
     * Turns on and off transparency. 
     */
    private boolean transparent;
    
    /**
     * How transparent the object should be. 
     */
    private float opacity;
    
    /**
     * Color blending operation, see [BlendOp]. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Blending.BlendOp colorBlending;
    
    /**
     * Alpha blending operation, see [BlendOp]. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Blending.BlendOp alphaBlending;
    
    /**
     * Source color blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Blending.BlendFactor sourceColorBlendFactor;
    
    /**
     * Destination color blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Blending.BlendFactor destinationColorBlendFactor;
    
    /**
     * Source Alpha blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Blending.BlendFactor sourceAlphaBlendFactor;
    
    /**
     * Destination Alpha blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Blending.BlendFactor destinationAlphaBlendFactor;
    
    /**
     * * Sets Photoshop overlay-like blending options.
     */
    public final void setOverlayBlending() {
    }
    
    /**
     * Turns on and off transparency. 
     */
    public final boolean getTransparent() {
        return false;
    }
    
    /**
     * Turns on and off transparency. 
     */
    public final void setTransparent(boolean p0) {
    }
    
    /**
     * How transparent the object should be. 
     */
    public final float getOpacity() {
        return 0.0F;
    }
    
    /**
     * How transparent the object should be. 
     */
    public final void setOpacity(float p0) {
    }
    
    /**
     * Color blending operation, see [BlendOp]. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendOp getColorBlending() {
        return null;
    }
    
    /**
     * Color blending operation, see [BlendOp]. 
     */
    public final void setColorBlending(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendOp p0) {
    }
    
    /**
     * Alpha blending operation, see [BlendOp]. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendOp getAlphaBlending() {
        return null;
    }
    
    /**
     * Alpha blending operation, see [BlendOp]. 
     */
    public final void setAlphaBlending(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendOp p0) {
    }
    
    /**
     * Source color blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendFactor getSourceColorBlendFactor() {
        return null;
    }
    
    /**
     * Source color blend factor. 
     */
    public final void setSourceColorBlendFactor(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor p0) {
    }
    
    /**
     * Destination color blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendFactor getDestinationColorBlendFactor() {
        return null;
    }
    
    /**
     * Destination color blend factor. 
     */
    public final void setDestinationColorBlendFactor(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor p0) {
    }
    
    /**
     * Source Alpha blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendFactor getSourceAlphaBlendFactor() {
        return null;
    }
    
    /**
     * Source Alpha blend factor. 
     */
    public final void setSourceAlphaBlendFactor(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor p0) {
    }
    
    /**
     * Destination Alpha blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendFactor getDestinationAlphaBlendFactor() {
        return null;
    }
    
    /**
     * Destination Alpha blend factor. 
     */
    public final void setDestinationAlphaBlendFactor(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor p0) {
    }
    
    public Blending(boolean transparent, float opacity, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendOp colorBlending, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendOp alphaBlending, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor sourceColorBlendFactor, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor destinationColorBlendFactor, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor sourceAlphaBlendFactor, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor destinationAlphaBlendFactor) {
        super();
    }
    
    public Blending() {
        super();
    }
    
    /**
     * Turns on and off transparency. 
     */
    public final boolean component1() {
        return false;
    }
    
    /**
     * How transparent the object should be. 
     */
    public final float component2() {
        return 0.0F;
    }
    
    /**
     * Color blending operation, see [BlendOp]. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendOp component3() {
        return null;
    }
    
    /**
     * Alpha blending operation, see [BlendOp]. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendOp component4() {
        return null;
    }
    
    /**
     * Source color blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendFactor component5() {
        return null;
    }
    
    /**
     * Destination color blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendFactor component6() {
        return null;
    }
    
    /**
     * Source Alpha blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendFactor component7() {
        return null;
    }
    
    /**
     * Destination Alpha blend factor. 
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending.BlendFactor component8() {
        return null;
    }
    
    /**
     * * Class providing different blend modes, transparency and blend factor settings.
     * * Blending options are modeled after the standard OpenGL and Vulkan blending modes.
     * *
     * * @author Ulrik Guenther <hello@ulrik.is>
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Blending copy(boolean transparent, float opacity, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendOp colorBlending, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendOp alphaBlending, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor sourceColorBlendFactor, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor destinationColorBlendFactor, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor sourceAlphaBlendFactor, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Blending.BlendFactor destinationAlphaBlendFactor) {
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
    
    /**
     * Blending operations. 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/Blending$BlendOp;", "", "(Ljava/lang/String;I)V", "add", "subtract", "reverse_subtract", "min", "max", "scenery"})
    public static enum BlendOp {
        /*public static final*/ add /* = new add() */,
        /*public static final*/ subtract /* = new subtract() */,
        /*public static final*/ reverse_subtract /* = new reverse_subtract() */,
        /*public static final*/ min /* = new min() */,
        /*public static final*/ max /* = new max() */;
        
        BlendOp() {
        }
    }
    
    /**
     * Blend factors. 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Lgraphics/scenery/Blending$BlendFactor;", "", "(Ljava/lang/String;I)V", "Zero", "One", "SrcColor", "OneMinusSrcColor", "DstColor", "OneMinusDstColor", "SrcAlpha", "OneMinusSrcAlpha", "DstAlpha", "OneMinusDstAlpha", "ConstantColor", "OneMinusConstantColor", "ConstantAlpha", "OneMinusConstantAlpha", "Src1Color", "OneMinusSrc1Color", "Src1Alpha", "OneMinusSrc1Alpha", "SrcAlphaSaturate", "scenery"})
    public static enum BlendFactor {
        /*public static final*/ Zero /* = new Zero() */,
        /*public static final*/ One /* = new One() */,
        /*public static final*/ SrcColor /* = new SrcColor() */,
        /*public static final*/ OneMinusSrcColor /* = new OneMinusSrcColor() */,
        /*public static final*/ DstColor /* = new DstColor() */,
        /*public static final*/ OneMinusDstColor /* = new OneMinusDstColor() */,
        /*public static final*/ SrcAlpha /* = new SrcAlpha() */,
        /*public static final*/ OneMinusSrcAlpha /* = new OneMinusSrcAlpha() */,
        /*public static final*/ DstAlpha /* = new DstAlpha() */,
        /*public static final*/ OneMinusDstAlpha /* = new OneMinusDstAlpha() */,
        /*public static final*/ ConstantColor /* = new ConstantColor() */,
        /*public static final*/ OneMinusConstantColor /* = new OneMinusConstantColor() */,
        /*public static final*/ ConstantAlpha /* = new ConstantAlpha() */,
        /*public static final*/ OneMinusConstantAlpha /* = new OneMinusConstantAlpha() */,
        /*public static final*/ Src1Color /* = new Src1Color() */,
        /*public static final*/ OneMinusSrc1Color /* = new OneMinusSrc1Color() */,
        /*public static final*/ Src1Alpha /* = new Src1Alpha() */,
        /*public static final*/ OneMinusSrc1Alpha /* = new OneMinusSrc1Alpha() */,
        /*public static final*/ SrcAlphaSaturate /* = new SrcAlphaSaturate() */;
        
        BlendFactor() {
        }
    }
}