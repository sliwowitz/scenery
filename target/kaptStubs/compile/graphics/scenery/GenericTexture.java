package graphics.scenery;

import java.lang.System;

/**
 * * Data class for storing renderer-agnostic textures
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u0000 X2\u00020\u0001:\u0001XB\u0095\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u00020BJ\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\rH\u00c6\u0003J\t\u0010F\u001a\u00020\rH\u00c6\u0003J\t\u0010G\u001a\u00020\rH\u00c6\u0003J\u0019\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0007H\u00c6\u0003J\t\u0010K\u001a\u00020\tH\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010M\u001a\u00020\rH\u00c6\u0003J\t\u0010N\u001a\u00020\rH\u00c6\u0003J\t\u0010O\u001a\u00020\rH\u00c6\u0003J\t\u0010P\u001a\u00020\rH\u00c6\u0003J\u009d\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017H\u00c6\u0001J\u0013\u0010R\u001a\u00020\r2\b\u0010S\u001a\u0004\u0018\u00010TH\u00d6\u0003J\u0006\u0010U\u001a\u00020\rJ\t\u0010V\u001a\u00020\u0007H\u00d6\u0001J\t\u0010W\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u00a8\u0006Y"}, d2 = {"Lgraphics/scenery/GenericTexture;", "Ljava/io/Serializable;", "name", "", "dimensions", "Lcleargl/GLVector;", "channels", "", "type", "Lcleargl/GLTypeEnum;", "contents", "Ljava/nio/ByteBuffer;", "repeatS", "", "repeatT", "repeatU", "normalized", "mipmap", "minFilterLinear", "maxFilterLinear", "updates", "Ljava/util/ArrayList;", "Lgraphics/scenery/TextureUpdate;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Lcleargl/GLVector;ILcleargl/GLTypeEnum;Ljava/nio/ByteBuffer;ZZZZZZZLjava/util/ArrayList;)V", "getChannels", "()I", "setChannels", "(I)V", "getContents", "()Ljava/nio/ByteBuffer;", "setContents", "(Ljava/nio/ByteBuffer;)V", "getDimensions", "()Lcleargl/GLVector;", "setDimensions", "(Lcleargl/GLVector;)V", "getMaxFilterLinear", "()Z", "setMaxFilterLinear", "(Z)V", "getMinFilterLinear", "setMinFilterLinear", "getMipmap", "setMipmap", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNormalized", "setNormalized", "getRepeatS", "setRepeatS", "getRepeatT", "setRepeatT", "getRepeatU", "setRepeatU", "getType", "()Lcleargl/GLTypeEnum;", "setType", "(Lcleargl/GLTypeEnum;)V", "getUpdates", "()Ljava/util/ArrayList;", "setUpdates", "(Ljava/util/ArrayList;)V", "clearConsumedUpdates", "", "clearUpdates", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hasConsumableUpdates", "hashCode", "toString", "Companion", "scenery"})
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
     * [GLTypeEnum] declaring the data type stored in [contents] 
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLTypeEnum type;
    
    /**
     * Byte contents of the texture 
     */
    @org.jetbrains.annotations.Nullable()
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
     * Shall the texture be repeated on the W/U coordinate? 
     */
    private boolean repeatU;
    
    /**
     * Should the texture data be interpreted as normalized? Default is true, non-normalisation is better for volume data, though 
     */
    private boolean normalized;
    
    /**
     * Should mipmaps be generated? 
     */
    private boolean mipmap;
    
    /**
     * Linear or nearest neighbor filtering for scaling down. 
     */
    private boolean minFilterLinear;
    
    /**
     * Linear or nearest neighbor filtering for scaling up. 
     */
    private boolean maxFilterLinear;
    
    /**
     * List of [TextureUpdate]s for the currently active texture. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<graphics.scenery.TextureUpdate> updates;
    
    /**
     * The textures to be contained in the ObjectTextures texture array 
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> objectTextures = null;
    
    /**
     * The ObjectTextures that should be mipmapped 
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> mipmappedObjectTextures = null;
    public static final graphics.scenery.GenericTexture.Companion Companion = null;
    
    /**
     * Returns true if the generic texture does have any non-consumed updates 
     */
    public final boolean hasConsumableUpdates() {
        return false;
    }
    
    /**
     * Clears all consumed updates 
     */
    public final void clearConsumedUpdates() {
    }
    
    /**
     * Clears all updates 
     */
    public final void clearUpdates() {
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
     * [GLTypeEnum] declaring the data type stored in [contents] 
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLTypeEnum getType() {
        return null;
    }
    
    /**
     * [GLTypeEnum] declaring the data type stored in [contents] 
     */
    public final void setType(@org.jetbrains.annotations.NotNull()
    cleargl.GLTypeEnum p0) {
    }
    
    /**
     * Byte contents of the texture 
     */
    @org.jetbrains.annotations.Nullable()
    public final java.nio.ByteBuffer getContents() {
        return null;
    }
    
    /**
     * Byte contents of the texture 
     */
    public final void setContents(@org.jetbrains.annotations.Nullable()
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
     * Shall the texture be repeated on the W/U coordinate? 
     */
    public final boolean getRepeatU() {
        return false;
    }
    
    /**
     * Shall the texture be repeated on the W/U coordinate? 
     */
    public final void setRepeatU(boolean p0) {
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
     * Linear or nearest neighbor filtering for scaling down. 
     */
    public final boolean getMinFilterLinear() {
        return false;
    }
    
    /**
     * Linear or nearest neighbor filtering for scaling down. 
     */
    public final void setMinFilterLinear(boolean p0) {
    }
    
    /**
     * Linear or nearest neighbor filtering for scaling up. 
     */
    public final boolean getMaxFilterLinear() {
        return false;
    }
    
    /**
     * Linear or nearest neighbor filtering for scaling up. 
     */
    public final void setMaxFilterLinear(boolean p0) {
    }
    
    /**
     * List of [TextureUpdate]s for the currently active texture. 
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<graphics.scenery.TextureUpdate> getUpdates() {
        return null;
    }
    
    /**
     * List of [TextureUpdate]s for the currently active texture. 
     */
    public final void setUpdates(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<graphics.scenery.TextureUpdate> p0) {
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
    cleargl.GLTypeEnum type, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT, boolean repeatU, boolean normalized, boolean mipmap, boolean minFilterLinear, boolean maxFilterLinear, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<graphics.scenery.TextureUpdate> updates) {
        super();
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
    cleargl.GLTypeEnum type, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT, boolean repeatU, boolean normalized, boolean mipmap, boolean minFilterLinear, boolean maxFilterLinear) {
        super();
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
    cleargl.GLTypeEnum type, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT, boolean repeatU, boolean normalized, boolean mipmap, boolean minFilterLinear) {
        super();
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
    cleargl.GLTypeEnum type, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT, boolean repeatU, boolean normalized, boolean mipmap) {
        super();
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
    cleargl.GLTypeEnum type, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT, boolean repeatU, boolean normalized) {
        super();
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
    cleargl.GLTypeEnum type, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT, boolean repeatU) {
        super();
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
    cleargl.GLTypeEnum type, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT) {
        super();
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
    cleargl.GLTypeEnum type, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents, boolean repeatS) {
        super();
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.NotNull()
    cleargl.GLTypeEnum type, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents) {
        super();
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, int channels, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents) {
        super();
    }
    
    public GenericTexture(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dimensions, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents) {
        super();
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
     * [GLTypeEnum] declaring the data type stored in [contents] 
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLTypeEnum component4() {
        return null;
    }
    
    /**
     * Byte contents of the texture 
     */
    @org.jetbrains.annotations.Nullable()
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
     * Shall the texture be repeated on the W/U coordinate? 
     */
    public final boolean component8() {
        return false;
    }
    
    /**
     * Should the texture data be interpreted as normalized? Default is true, non-normalisation is better for volume data, though 
     */
    public final boolean component9() {
        return false;
    }
    
    /**
     * Should mipmaps be generated? 
     */
    public final boolean component10() {
        return false;
    }
    
    /**
     * Linear or nearest neighbor filtering for scaling down. 
     */
    public final boolean component11() {
        return false;
    }
    
    /**
     * Linear or nearest neighbor filtering for scaling up. 
     */
    public final boolean component12() {
        return false;
    }
    
    /**
     * List of [TextureUpdate]s for the currently active texture. 
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<graphics.scenery.TextureUpdate> component13() {
        return null;
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
    cleargl.GLTypeEnum type, @org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer contents, boolean repeatS, boolean repeatT, boolean repeatU, boolean normalized, boolean mipmap, boolean minFilterLinear, boolean maxFilterLinear, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<graphics.scenery.TextureUpdate> updates) {
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
     * Companion object of [GenericTexture], containing mainly constant defines 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lgraphics/scenery/GenericTexture$Companion;", "", "()V", "mipmappedObjectTextures", "", "", "getMipmappedObjectTextures", "()Ljava/util/List;", "objectTextures", "getObjectTextures", "scenery"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getObjectTextures() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getMipmappedObjectTextures() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}