package graphics.scenery;

/**
 * * Data class for storing renderer-agnostic textures
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B[\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\t\u00103\u001a\u00020\tH\u00c6\u0003J\t\u00104\u001a\u00020\u000bH\u00c6\u0003J\t\u00105\u001a\u00020\rH\u00c6\u0003J\t\u00106\u001a\u00020\rH\u00c6\u0003J\t\u00107\u001a\u00020\rH\u00c6\u0003J\t\u00108\u001a\u00020\rH\u00c6\u0003Jc\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u00c6\u0001J\u0013\u0010:\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010<H\u00d6\u0003J\t\u0010=\u001a\u00020\u0007H\u00d6\u0001J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u0006?"}, d2 = {"Lgraphics/scenery/GenericTexture;", "Ljava/io/Serializable;", "name", "", "dimensions", "Lcleargl/GLVector;", "channels", "", "type", "Lcleargl/GLTypeEnum;", "contents", "Ljava/nio/ByteBuffer;", "repeatS", "", "repeatT", "normalized", "mipmap", "(Ljava/lang/String;Lcleargl/GLVector;ILcleargl/GLTypeEnum;Ljava/nio/ByteBuffer;ZZZZ)V", "getChannels", "()I", "setChannels", "(I)V", "getContents", "()Ljava/nio/ByteBuffer;", "setContents", "(Ljava/nio/ByteBuffer;)V", "getDimensions", "()Lcleargl/GLVector;", "setDimensions", "(Lcleargl/GLVector;)V", "getMipmap", "()Z", "setMipmap", "(Z)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNormalized", "setNormalized", "getRepeatS", "setRepeatS", "getRepeatT", "setRepeatT", "getType", "()Lcleargl/GLTypeEnum;", "setType", "(Lcleargl/GLTypeEnum;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "scenery"})
public final class GenericTexture implements java.io.Serializable {

    /**
     * Name of the texture, might e.g. be "diffuse"
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;

    /**
     * Dimensions of the texture in pixels
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector dimensions;

    /**
     * The texture's number of channels
     */
    private int channels;

    /**
     * [NativeTypeEnum] declaring the data type stored in [contents]
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLTypeEnum type;

    /**
     * Byte contents of the texture
     */
    @org.jetbrains.annotations.NotNull()
    private transient java.nio.ByteBuffer contents;

    /**
     * Shall the texture be repeated on the U/S coordinate?
     */
    private boolean repeatS;

    /**
     * Shall the texture be repeated on the V/T coordinate?
     */
    private boolean repeatT;

    /**
     * Should the texture data be interpreted as normalized? Default is true, non-normalisation is better for volume data, though
     */
    private boolean normalized;

    /**
     * Should mipmaps be generated?
     */
    private boolean mipmap;

    public GenericTexture(@org.jetbrains.annotations.NotNull()
                              java.lang.String name, @org.jetbrains.annotations.NotNull()
                              cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
                              cleargl.GLTypeEnum type, @org.jetbrains.annotations.NotNull()
                              java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT, boolean normalized, boolean mipmap) {
        super();
    }

    public GenericTexture(@org.jetbrains.annotations.NotNull()
                              java.lang.String name, @org.jetbrains.annotations.NotNull()
                              cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
                              cleargl.GLTypeEnum type, @org.jetbrains.annotations.NotNull()
                              java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT, boolean normalized) {
        super();
    }

    public GenericTexture(@org.jetbrains.annotations.NotNull()
                              java.lang.String name, @org.jetbrains.annotations.NotNull()
                              cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
                              cleargl.GLTypeEnum type, @org.jetbrains.annotations.NotNull()
                              java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT) {
        super();
    }

    public GenericTexture(@org.jetbrains.annotations.NotNull()
                              java.lang.String name, @org.jetbrains.annotations.NotNull()
                              cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
                              cleargl.GLTypeEnum type, @org.jetbrains.annotations.NotNull()
                              java.nio.ByteBuffer contents, boolean repeatS) {
        super();
    }

    public GenericTexture(@org.jetbrains.annotations.NotNull()
                              java.lang.String name, @org.jetbrains.annotations.NotNull()
                              cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
                              cleargl.GLTypeEnum type, @org.jetbrains.annotations.NotNull()
                              java.nio.ByteBuffer contents) {
        super();
    }

    public GenericTexture(@org.jetbrains.annotations.NotNull()
                              java.lang.String name, @org.jetbrains.annotations.NotNull()
                              cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
                              java.nio.ByteBuffer contents) {
        super();
    }

    public GenericTexture(@org.jetbrains.annotations.NotNull()
                              java.lang.String name, @org.jetbrains.annotations.NotNull()
                              cleargl.GLVector dimensions, @org.jetbrains.annotations.NotNull()
                              java.nio.ByteBuffer contents) {
        super();
    }

    /**
     * Name of the texture, might e.g. be "diffuse"
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }

    /**
     * Name of the texture, might e.g. be "diffuse"
     */
    public final void setName(@org.jetbrains.annotations.NotNull()
                                  java.lang.String p0) {
    }

    /**
     * Dimensions of the texture in pixels
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getDimensions() {
        return null;
    }

    /**
     * Dimensions of the texture in pixels
     */
    public final void setDimensions(@org.jetbrains.annotations.NotNull()
                                        cleargl.GLVector p0) {
    }

    /**
     * The texture's number of channels
     */
    public final int getChannels() {
        return 0;
    }

    /**
     * The texture's number of channels
     */
    public final void setChannels(int p0) {
    }

    /**
     * [NativeTypeEnum] declaring the data type stored in [contents]
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLTypeEnum getType() {
        return null;
    }

    /**
     * [NativeTypeEnum] declaring the data type stored in [contents]
     */
    public final void setType(@org.jetbrains.annotations.NotNull()
                                  cleargl.GLTypeEnum p0) {
    }

    /**
     * Byte contents of the texture
     */
    @org.jetbrains.annotations.NotNull()
    public final java.nio.ByteBuffer getContents() {
        return null;
    }

    /**
     * Byte contents of the texture
     */
    public final void setContents(@org.jetbrains.annotations.NotNull()
                                      java.nio.ByteBuffer p0) {
    }

    /**
     * Shall the texture be repeated on the U/S coordinate?
     */
    public final boolean getRepeatS() {
        return false;
    }

    /**
     * Shall the texture be repeated on the U/S coordinate?
     */
    public final void setRepeatS(boolean p0) {
    }

    /**
     * Shall the texture be repeated on the V/T coordinate?
     */
    public final boolean getRepeatT() {
        return false;
    }

    /**
     * Shall the texture be repeated on the V/T coordinate?
     */
    public final void setRepeatT(boolean p0) {
    }

    /**
     * Should the texture data be interpreted as normalized? Default is true, non-normalisation is better for volume data, though
     */
    public final boolean getNormalized() {
        return false;
    }

    /**
     * Should the texture data be interpreted as normalized? Default is true, non-normalisation is better for volume data, though
     */
    public final void setNormalized(boolean p0) {
    }

    /**
     * Should mipmaps be generated?
     */
    public final boolean getMipmap() {
        return false;
    }

    /**
     * Should mipmaps be generated?
     */
    public final void setMipmap(boolean p0) {
    }

    /**
     * Name of the texture, might e.g. be "diffuse"
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }

    /**
     * Dimensions of the texture in pixels
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector component2() {
        return null;
    }

    /**
     * The texture's number of channels
     */
    public final int component3() {
        return 0;
    }

    /**
     * [NativeTypeEnum] declaring the data type stored in [contents]
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLTypeEnum component4() {
        return null;
    }

    /**
     * Byte contents of the texture
     */
    @org.jetbrains.annotations.NotNull()
    public final java.nio.ByteBuffer component5() {
        return null;
    }

    /**
     * Shall the texture be repeated on the U/S coordinate?
     */
    public final boolean component6() {
        return false;
    }

    /**
     * Shall the texture be repeated on the V/T coordinate?
     */
    public final boolean component7() {
        return false;
    }

    /**
     * Should the texture data be interpreted as normalized? Default is true, non-normalisation is better for volume data, though
     */
    public final boolean component8() {
        return false;
    }

    /**
     * Should mipmaps be generated?
     */
    public final boolean component9() {
        return false;
    }

    /**
     * * Data class for storing renderer-agnostic textures
     * *
     * * @author Ulrik Günther <hello@ulrik.is>
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.GenericTexture copy(@org.jetbrains.annotations.NotNull()
                                                          java.lang.String name, @org.jetbrains.annotations.NotNull()
                                                          cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
                                                          cleargl.GLTypeEnum type, @org.jetbrains.annotations.NotNull()
                                                          java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT, boolean normalized, boolean mipmap) {
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
