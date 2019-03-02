package graphics.scenery;

import java.lang.System;

/**
 * * TextBoard is a possibly billboarded display of a string of text,
 * * rendered using signed-distance fields.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[font]  Name of the font to use for this text board
 * * @property[isBillboard] Whether the board should be billboarded or not
 * *
 * * @constructor Returns a TextBoard instance, with [fontFamily] and a declared [ShaderMaterial]
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 32\u00020\u0001:\u00013B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0010\u00a2\u0006\u0002\b1J\b\u00102\u001a\u00020\u0003H\u0016R$\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR$\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR$\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010!\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR$\u0010$\u001a\u00020%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\n\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u00064"}, d2 = {"Lgraphics/scenery/TextBoard;", "Lgraphics/scenery/Mesh;", "font", "", "isBillboard", "", "(Ljava/lang/String;Z)V", "atlasSize", "Lcleargl/GLVector;", "atlasSize$annotations", "()V", "getAtlasSize", "()Lcleargl/GLVector;", "setAtlasSize", "(Lcleargl/GLVector;)V", "backgroundColor", "backgroundColor$annotations", "getBackgroundColor", "setBackgroundColor", "fontColor", "fontColor$annotations", "getFontColor", "setFontColor", "value", "fontFamily", "getFontFamily", "()Ljava/lang/String;", "setFontFamily", "(Ljava/lang/String;)V", "()Z", "setBillboard", "(Z)V", "needsPreUpdate", "text", "getText", "setText", "transparent", "", "transparent$annotations", "getTransparent", "()I", "setTransparent", "(I)V", "preUpdate", "", "renderer", "Lgraphics/scenery/backends/Renderer;", "hub", "Lgraphics/scenery/Hub;", "preUpdate$scenery", "toString", "Companion", "scenery"})
public final class TextBoard extends graphics.scenery.Mesh {
    
    /**
     * The text displayed on this font board 
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String text;
    
    /**
     * The font family of this font board. If reset, this will set the [dirty] flag,
     *     * such that the renderer can recreate the signed-distance fields used for displaying.
     *     *
     *     * If the name contains a dot (e.g. as in "Helvetica.ttf"), scenery will attempt to load
     *     * the font as a file from the class path.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fontFamily;
    
    /**
     * The [ShaderProperty] storing whether the font board should be renderer transparently. 
     */
    private int transparent;
    
    /**
     * [ShaderProperty] to store the size of the used texture atlas storing the font's signed distance field 
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector atlasSize;
    
    /**
     * The [ShaderProperty] storing the font's color. 
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector fontColor;
    
    /**
     * The [ShaderProperty] storing the background color of the font board,
     *     * used only if [transparent] is 0. 
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector backgroundColor;
    
    /**
     * Flag to indicate whether the update routine should be called by the renderer 
     */
    private boolean needsPreUpdate;
    private boolean isBillboard;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.lang.String, graphics.scenery.fonts.SDFFontAtlas> sdfCache = null;
    public static final graphics.scenery.TextBoard.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFontFamily() {
        return null;
    }
    
    public final void setFontFamily(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @ShaderProperty()
    public static void transparent$annotations() {
    }
    
    public final int getTransparent() {
        return 0;
    }
    
    public final void setTransparent(int p0) {
    }
    
    @ShaderProperty()
    public static void atlasSize$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getAtlasSize() {
        return null;
    }
    
    public final void setAtlasSize(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0) {
    }
    
    @ShaderProperty()
    public static void fontColor$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getFontColor() {
        return null;
    }
    
    public final void setFontColor(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0) {
    }
    
    @ShaderProperty()
    public static void backgroundColor$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getBackgroundColor() {
        return null;
    }
    
    public final void setBackgroundColor(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0) {
    }
    
    @java.lang.Override()
    public void preUpdate$scenery(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.Renderer renderer, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Hub hub) {
    }
    
    /**
     * Stringify the font board. Returns [fontFamily] used as well as the [text]. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isBillboard() {
        return false;
    }
    
    @java.lang.Override()
    public void setBillboard(boolean p0) {
    }
    
    public TextBoard(@org.jetbrains.annotations.NotNull()
    java.lang.String font, boolean isBillboard) {
        super(null);
    }
    
    public TextBoard() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lgraphics/scenery/TextBoard$Companion;", "", "()V", "sdfCache", "Ljava/util/HashMap;", "", "Lgraphics/scenery/fonts/SDFFontAtlas;", "getSdfCache", "()Ljava/util/HashMap;", "scenery"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<java.lang.String, graphics.scenery.fonts.SDFFontAtlas> getSdfCache() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}