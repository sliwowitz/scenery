package graphics.scenery.fonts;

import java.lang.System;

/**
 * * Creates renderer-agnostic signed-distance fields (SDF) of fonts
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[hub] The [Hub] to use
 * * @property[fontName] The font name to create a SDF for
 * * @property[distanceFieldSize] The size of the SDF in pixels
 * * @constructor Generates a SDF of the given font
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u000e\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0005JZ\u0010H\u001a\u00020I2>\u0010\"\u001a:\u0012\u0004\u0012\u00020$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010\u001d0%0#j\u001c\u0012\u0004\u0012\u00020$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010\u001d0%`J2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020100J\u000e\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020\u001dJ,\u0010N\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001d0%2\u0006\u0010O\u001a\u00020$2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0007H\u0004J\u0006\u0010S\u001a\u00020\u001dJ\u000e\u0010T\u001a\u0002012\u0006\u0010U\u001a\u00020$J\u0010\u0010V\u001a\u00020\u001d2\u0006\u0010W\u001a\u00020\u0005H\u0004J \u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u001dH\u0004Jd\u0010\\\u001a\u00020I2\u0006\u0010W\u001a\u00020\u00052>\u0010\"\u001a:\u0012\u0004\u0012\u00020$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010\u001d0%0#j\u001c\u0012\u0004\u0012\u00020$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010\u001d0%`J2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020100H\u0004J2\u0010^\u001a\u00020\u001d2 \u0010_\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010\u001d0%0`2\u0006\u0010a\u001a\u00020\u0007H\u0004R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u001dX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010\"\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010\u001d0%0#X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020&X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020100X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010:\u001a\u00020;8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b<\u0010=R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\fR\u0014\u0010A\u001a\u00020\u0007X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\fR\u0014\u0010C\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0014\u00a8\u0006b"}, d2 = {"Lgraphics/scenery/fonts/SDFFontAtlas;", "", "hub", "Lgraphics/scenery/Hub;", "fontName", "", "distanceFieldSize", "", "maxDistance", "(Lgraphics/scenery/Hub;Ljava/lang/String;II)V", "atlasHeight", "getAtlasHeight", "()I", "setAtlasHeight", "(I)V", "atlasWidth", "getAtlasWidth", "setAtlasWidth", "cacheDir", "getCacheDir", "()Ljava/lang/String;", "charset", "Lkotlin/ranges/IntRange;", "getCharset", "()Lkotlin/ranges/IntRange;", "setCharset", "(Lkotlin/ranges/IntRange;)V", "getDistanceFieldSize", "fontAtlasBacking", "Ljava/nio/ByteBuffer;", "getFontAtlasBacking", "()Ljava/nio/ByteBuffer;", "setFontAtlasBacking", "(Ljava/nio/ByteBuffer;)V", "fontMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/Pair;", "", "getFontMap", "()Ljava/util/LinkedHashMap;", "getFontName", "fontSize", "getFontSize", "()F", "setFontSize", "(F)V", "glyphTexcoords", "Ljava/util/HashMap;", "Lcleargl/GLVector;", "getGlyphTexcoords", "()Ljava/util/HashMap;", "setGlyphTexcoords", "(Ljava/util/HashMap;)V", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getMaxDistance", "sdfCacheFormatVersion", "getSdfCacheFormatVersion", "sdfFileName", "getSdfFileName", "createMeshForString", "Lgraphics/scenery/Mesh;", "text", "dumpMetricsToFile", "", "Lkotlin/collections/LinkedHashMap;", "glyphTexCoordMap", "dumpToFile", "buf", "genCharImage", "c", "font", "Ljava/awt/Font;", "size", "getAtlas", "getTexcoordsForGlyph", "glyph", "readAtlasFromFile", "filename", "readLineFromBuffer", "", "lineSize", "line", "readMetricsFromFile", "glyphMap", "toFontAtlas", "map", "Ljava/util/AbstractMap;", "charSize", "scenery"})
public class SDFFontAtlas {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    
    /**
     * default charset for the SDF font atlas, default is ASCII charset 
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.ranges.IntRange charset;
    
    /**
     * Hash map of the char linked to it's width and a byte buffer with the SDF of the char 
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.LinkedHashMap<java.lang.Character, kotlin.Pair<java.lang.Float, java.nio.ByteBuffer>> fontMap = null;
    
    /**
     * Font size for the SDF 
     */
    private float fontSize;
    
    /**
     * Texcoord storage for each glyph 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.Character, cleargl.GLVector> glyphTexcoords;
    
    /**
     * Font atlas width 
     */
    private int atlasWidth;
    
    /**
     * Font atlas height 
     */
    private int atlasHeight;
    
    /**
     * Backing store for the font atlas, will finally have a size of atlasWidth*atlasHeight. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.ByteBuffer fontAtlasBacking;
    private final int sdfCacheFormatVersion = 1;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cacheDir = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sdfFileName = null;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Hub hub;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fontName = null;
    private final int distanceFieldSize = 0;
    private final int maxDistance = 0;
    
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.ranges.IntRange getCharset() {
        return null;
    }
    
    public final void setCharset(@org.jetbrains.annotations.NotNull()
    kotlin.ranges.IntRange p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.LinkedHashMap<java.lang.Character, kotlin.Pair<java.lang.Float, java.nio.ByteBuffer>> getFontMap() {
        return null;
    }
    
    protected final float getFontSize() {
        return 0.0F;
    }
    
    protected final void setFontSize(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.HashMap<java.lang.Character, cleargl.GLVector> getGlyphTexcoords() {
        return null;
    }
    
    protected final void setGlyphTexcoords(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Character, cleargl.GLVector> p0) {
    }
    
    public final int getAtlasWidth() {
        return 0;
    }
    
    public final void setAtlasWidth(int p0) {
    }
    
    public final int getAtlasHeight() {
        return 0;
    }
    
    public final void setAtlasHeight(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.nio.ByteBuffer getFontAtlasBacking() {
        return null;
    }
    
    protected final void setFontAtlasBacking(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer p0) {
    }
    
    protected final int getSdfCacheFormatVersion() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getCacheDir() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getSdfFileName() {
        return null;
    }
    
    /**
     * * Dumps a given byte buffer to a file. Useful for debugging the SDF
     *     *
     *     * @param[buf] The ByteBuffer to dump.
     */
    public final void dumpToFile(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer buf) {
    }
    
    /**
     * * Dumps font metrics given in [fontMap] to a file.
     */
    public final void dumpMetricsToFile(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.Character, kotlin.Pair<java.lang.Float, java.nio.ByteBuffer>> fontMap, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Character, cleargl.GLVector> glyphTexCoordMap) {
    }
    
    /**
     * * Reads a font atlas from a file given by [filename].
     */
    @org.jetbrains.annotations.NotNull()
    protected final java.nio.ByteBuffer readAtlasFromFile(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
        return null;
    }
    
    /**
     * * Reads font metrics from a file given by [filename].
     */
    protected final void readMetricsFromFile(@org.jetbrains.annotations.NotNull()
    java.lang.String filename, @org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.Character, kotlin.Pair<java.lang.Float, java.nio.ByteBuffer>> fontMap, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Character, cleargl.GLVector> glyphMap) {
    }
    
    /**
     * * Generates an image of a given char with the Java font engine
     *     *
     *     * @param[c] The char to generate the image for
     *     * @param[font] The Java Font object of the font to use
     *     * @param[size] Size of the image
     *     * @returns A pair of char width and the image byte buffer
     */
    @org.jetbrains.annotations.NotNull()
    protected final kotlin.Pair<java.lang.Float, java.nio.ByteBuffer> genCharImage(char c, @org.jetbrains.annotations.NotNull()
    java.awt.Font font, int size) {
        return null;
    }
    
    /**
     * * Converts a map of chars and SDFs to a square texture that can be used
     *     * by a renderer.
     *     *
     *     * @param[map] map of a char to a pair of glyph width and the SDF byte buffer
     *     * @param[charSize] Pixel size of each glyph
     *     * @return A byte buffer containing the full font atlas texture
     */
    @org.jetbrains.annotations.NotNull()
    protected final java.nio.ByteBuffer toFontAtlas(@org.jetbrains.annotations.NotNull()
    java.util.AbstractMap<java.lang.Character, kotlin.Pair<java.lang.Float, java.nio.ByteBuffer>> map, int charSize) {
        return null;
    }
    
    /**
     * * Reads a single line from a given buffer and returns the line as float array
     *     *
     *     * @param[lineSize] The pixel size of one line
     *     * @param[line] The number of the line to read
     *     * @param[buf] The ByteBuffer to read the line from
     *     * @return FloatArray of the line pixels
     */
    @org.jetbrains.annotations.NotNull()
    protected final byte[] readLineFromBuffer(int lineSize, int line, @org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer buf) {
        return null;
    }
    
    /**
     * * Exposes the font atlas texture to the outside world
     */
    @org.jetbrains.annotations.NotNull()
    public final java.nio.ByteBuffer getAtlas() {
        return null;
    }
    
    /**
     * * Returns the texcoords for a given glyph
     *     *
     *     * @param[glyph] The char to get the texcoords for.
     *     * @return The char's texcoords.
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getTexcoordsForGlyph(char glyph) {
        return null;
    }
    
    /**
     * * Creates a mesh for a given string, correctly aligning the glyphs on the mesh.
     *     *
     *     * @param[text] The text to create a mesh for
     *     * @return A [Mesh] with the glyphs on it (via texcoords).
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final graphics.scenery.Mesh createMeshForString(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Hub getHub() {
        return null;
    }
    
    public final void setHub(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Hub p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFontName() {
        return null;
    }
    
    public final int getDistanceFieldSize() {
        return 0;
    }
    
    public final int getMaxDistance() {
        return 0;
    }
    
    public SDFFontAtlas(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
    java.lang.String fontName, int distanceFieldSize, int maxDistance) {
        super();
    }
}