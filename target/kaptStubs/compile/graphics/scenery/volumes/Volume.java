package graphics.scenery.volumes;

/**
 * * Volume Rendering Node for scenery.
 * * If [autosetProperties] is true, the node will automatically determine
 * * the volumes' transfer function range.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @author Martin Weigert <mweigert@mpi-cbg.de>
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00cd\u00012\u00020\u0001:\b\u00cc\u0001\u00cd\u0001\u00ce\u0001\u00cf\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0002J\'\u0010\u009e\u0001\u001a\u00030\u009d\u00012\b\u0010\u009f\u0001\u001a\u00030\u00a0\u00012\b\u0010\u00a1\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u00a2\u0001\u001a\u00020\u0003H\u0002J\u0011\u0010\u00a3\u0001\u001a\n\u0018\u00010\u00a4\u0001R\u00030\u00a5\u0001H\u0016J\n\u0010\u00a6\u0001\u001a\u00030\u009d\u0001H\u0016J\u0012\u0010\u00a7\u0001\u001a\u00030\u009d\u00012\b\u0010\u00a8\u0001\u001a\u00030\u00a9\u0001J\u001c\u0010\u00aa\u0001\u001a\u00020+2\b\u0010\u00a8\u0001\u001a\u00030\u00a9\u00012\t\b\u0002\u0010\u00a2\u0001\u001a\u00020\u0003Jw\u0010\u00ab\u0001\u001a\u00030\u009d\u00012\u0007\u0010\u00ac\u0001\u001a\u00020+2\u0007\u0010\u00ad\u0001\u001a\u00020I2\b\u0010\u00ae\u0001\u001a\u00030\u00af\u00012\b\u0010\u00b0\u0001\u001a\u00030\u00af\u00012\b\u0010\u00b1\u0001\u001a\u00030\u00af\u00012\u0007\u0010\u00b2\u0001\u001a\u00020\u00062\u0007\u0010\u00b3\u0001\u001a\u00020\u00062\u0007\u0010\u00b4\u0001\u001a\u00020\u00062\n\b\u0002\u0010\u00b5\u0001\u001a\u00030\u00b6\u00012\t\b\u0002\u0010\u00b7\u0001\u001a\u00020=2\t\b\u0002\u0010\u00b8\u0001\u001a\u00020\u0003H\u0007J2\u0010\u00b9\u0001\u001a\u00020+2\b\u0010\u00a8\u0001\u001a\u00030\u00a9\u00012\t\b\u0002\u0010\u00a2\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u00ba\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u00bb\u0001\u001a\u00020\u0003J%\u0010\u00bc\u0001\u001a\u00030\u009d\u00012\u0007\u0010\u00bd\u0001\u001a\u00020\u00062\u0007\u0010\u00be\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u00bf\u0001\u001a\u00020\u0003J\u0014\u0010\u00c0\u0001\u001a\u00030\u00c1\u00012\b\u0010\u00c2\u0001\u001a\u00030\u00c1\u0001H\u0002J9\u0010\u00c3\u0001\u001a\u00030\u009d\u0001\"\u0005\b\u0000\u0010\u00c4\u00012\f\u0010\u00c5\u0001\u001a\u0007\u0012\u0002\b\u00030\u00c6\u00012\b\u0010\u00c7\u0001\u001a\u0003H\u00c4\u00012\b\u0010\u00c8\u0001\u001a\u0003H\u00c4\u0001H\u0004\u00a2\u0006\u0003\u0010\u00c9\u0001J\u000f\u0010\u00ca\u0001\u001a\u00030\u00cb\u0001*\u00030\u00b6\u0001H\u0002R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R$\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR$\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR$\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\b\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR$\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\fR$\u0010 \u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\b\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\fR$\u0010$\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b%\u0010\b\u001a\u0004\b&\u0010\n\"\u0004\b\'\u0010\fR\u0014\u0010(\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\nR$\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020+@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020302X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00109\u001a\u00020+2\u0006\u00108\u001a\u00020+@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010.\"\u0004\b;\u00100R$\u0010<\u001a\u00020=8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b>\u0010\b\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u00020=8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bD\u0010\b\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010J\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bK\u0010\b\u001a\u0004\bL\u0010\n\"\u0004\bM\u0010\fR$\u0010N\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bO\u0010\b\u001a\u0004\bP\u0010\n\"\u0004\bQ\u0010\fR\u001a\u0010R\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u000e\"\u0004\bT\u0010\u0004R$\u0010U\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bV\u0010\b\u001a\u0004\bW\u0010\n\"\u0004\bX\u0010\fR$\u0010Y\u001a\u00020=8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bZ\u0010\b\u001a\u0004\b[\u0010@\"\u0004\b\\\u0010BR$\u0010]\u001a\u00020=8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b^\u0010\b\u001a\u0004\b_\u0010@\"\u0004\b`\u0010BR1\u0010b\u001a\u00020=2\u0006\u0010a\u001a\u00020=8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bc\u0010\b\u001a\u0004\bd\u0010@\"\u0004\be\u0010BR1\u0010h\u001a\u00020=2\u0006\u0010a\u001a\u00020=8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\bl\u0010g\u0012\u0004\bi\u0010\b\u001a\u0004\bj\u0010@\"\u0004\bk\u0010BR1\u0010m\u001a\u00020=2\u0006\u0010a\u001a\u00020=8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\bq\u0010g\u0012\u0004\bn\u0010\b\u001a\u0004\bo\u0010@\"\u0004\bp\u0010BR$\u0010r\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bs\u0010\b\u001a\u0004\bt\u0010\n\"\u0004\bu\u0010\fR$\u0010v\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bw\u0010\b\u001a\u0004\bx\u0010\n\"\u0004\by\u0010\fR,\u0010z\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00068\u0006@FX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b{\u0010\b\u001a\u0004\b|\u0010\n\"\u0004\b}\u0010\fR.\u0010~\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00068\u0006@FX\u0087\u000e\u00a2\u0006\u0016\n\u0000\u0012\u0004\b\u007f\u0010\b\u001a\u0005\b\u0080\u0001\u0010\n\"\u0005\b\u0081\u0001\u0010\fR \u0010\u0082\u0001\u001a\u00030\u0083\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R%\u0010\u0088\u0001\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u0001X\u0084\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R6\u0010\u008d\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u00068F@FX\u0087\u008e\u0002\u00a2\u0006\u001c\n\u0005\b\u0091\u0001\u0010g\u0012\u0005\b\u008e\u0001\u0010\b\u001a\u0005\b\u008f\u0001\u0010\n\"\u0005\b\u0090\u0001\u0010\fR6\u0010\u0092\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u00068F@FX\u0087\u008e\u0002\u00a2\u0006\u001c\n\u0005\b\u0096\u0001\u0010g\u0012\u0005\b\u0093\u0001\u0010\b\u001a\u0005\b\u0094\u0001\u0010\n\"\u0005\b\u0095\u0001\u0010\fR6\u0010\u0097\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u00068F@FX\u0087\u008e\u0002\u00a2\u0006\u001c\n\u0005\b\u009b\u0001\u0010g\u0012\u0005\b\u0098\u0001\u0010\b\u001a\u0005\b\u0099\u0001\u0010\n\"\u0005\b\u009a\u0001\u0010\f\u00a8\u0006\u00d0\u0001"}, d2 = {"Lgraphics/scenery/volumes/Volume;", "Lgraphics/scenery/Mesh;", "autosetProperties", "", "(Z)V", "alphaBlending", "", "alphaBlending$annotations", "()V", "getAlphaBlending", "()F", "setAlphaBlending", "(F)V", "getAutosetProperties", "()Z", "setAutosetProperties", "boxMax_x", "boxMax_x$annotations", "getBoxMax_x", "setBoxMax_x", "boxMax_y", "boxMax_y$annotations", "getBoxMax_y", "setBoxMax_y", "boxMax_z", "boxMax_z$annotations", "getBoxMax_z", "setBoxMax_z", "boxMin_x", "boxMin_x$annotations", "getBoxMin_x", "setBoxMin_x", "boxMin_y", "boxMin_y$annotations", "getBoxMin_y", "setBoxMin_y", "boxMin_z", "boxMin_z$annotations", "getBoxMin_z", "setBoxMin_z", "boxwidth", "getBoxwidth", "name", "", "colormap", "getColormap", "()Ljava/lang/String;", "setColormap", "(Ljava/lang/String;)V", "colormaps", "Ljava/util/HashMap;", "Lgraphics/scenery/volumes/Volume$Colormap;", "getColormaps", "()Ljava/util/HashMap;", "setColormaps", "(Ljava/util/HashMap;)V", "value", "currentVolume", "getCurrentVolume", "setCurrentVolume", "dataRangeMax", "", "dataRangeMax$annotations", "getDataRangeMax", "()I", "setDataRangeMax", "(I)V", "dataRangeMin", "dataRangeMin$annotations", "getDataRangeMin", "setDataRangeMin", "deallocations", "Ljava/util/ArrayDeque;", "Ljava/nio/ByteBuffer;", "gamma", "gamma$annotations", "getGamma", "setGamma", "kernelSize", "kernelSize$annotations", "getKernelSize", "setKernelSize", "lockTransferRange", "getLockTransferRange", "setLockTransferRange", "maxOcclusionDistance", "maxOcclusionDistance$annotations", "getMaxOcclusionDistance", "setMaxOcclusionDistance", "occlusionSteps", "occlusionSteps$annotations", "getOcclusionSteps", "setOcclusionSteps", "renderingMethod", "renderingMethod$annotations", "getRenderingMethod", "setRenderingMethod", "<set-?>", "sizeX", "sizeX$annotations", "getSizeX", "setSizeX", "sizeX$delegate", "Lkotlin/properties/ReadWriteProperty;", "sizeY", "sizeY$annotations", "getSizeY", "setSizeY", "sizeY$delegate", "sizeZ", "sizeZ$annotations", "getSizeZ", "setSizeZ", "sizeZ$delegate", "stepSize", "stepSize$annotations", "getStepSize", "setStepSize", "time", "time$annotations", "getTime", "setTime", "trangemax", "trangemax$annotations", "getTrangemax", "setTrangemax", "trangemin", "trangemin$annotations", "getTrangemin", "setTrangemin", "transferFunction", "Lgraphics/scenery/volumes/TransferFunction;", "getTransferFunction", "()Lgraphics/scenery/volumes/TransferFunction;", "setTransferFunction", "(Lgraphics/scenery/volumes/TransferFunction;)V", "volumes", "Ljava/util/concurrent/ConcurrentHashMap;", "Lgraphics/scenery/volumes/Volume$VolumeDescriptor;", "getVolumes", "()Ljava/util/concurrent/ConcurrentHashMap;", "voxelSizeX", "voxelSizeX$annotations", "getVoxelSizeX", "setVoxelSizeX", "voxelSizeX$delegate", "voxelSizeY", "voxelSizeY$annotations", "getVoxelSizeY", "setVoxelSizeY", "voxelSizeY$delegate", "voxelSizeZ", "voxelSizeZ$annotations", "getVoxelSizeZ", "setVoxelSizeZ", "voxelSizeZ$delegate", "assignEmptyVolumeTexture", "", "assignVolumeTexture", "dimensions", "", "descriptor", "replace", "generateBoundingBox", "Lgraphics/scenery/Node$OrientedBoundingBox;", "Lgraphics/scenery/Node;", "preDraw", "preloadRawFromPath", "file", "Ljava/nio/file/Path;", "readFrom", "readFromBuffer", "id", "buffer", "x", "", "y", "z", "voxelX", "voxelY", "voxelZ", "dataType", "Lcoremem/enums/NativeTypeEnum;", "bytesPerVoxel", "allowDeallocation", "readFromRaw", "autorange", "cache", "setTransfer", "min", "max", "lock", "swapEndianUnsafe", "", "bytes", "volumePropertyChanged", "R", "property", "Lkotlin/reflect/KProperty;", "old", "new", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "toGLType", "Lcleargl/GLTypeEnum;", "Colormap", "Companion", "Histogram", "VolumeDescriptor", "scenery"})
public class Volume extends graphics.scenery.Mesh {
    public static final graphics.scenery.volumes.Volume.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final io.scif.SCIFIO scifio = null;
    @org.jetbrains.annotations.NotNull()
    private static final sun.misc.Unsafe UNSAFE = null;
    private static final int BYTES_OFFSET = 0;
    private final float boxwidth = 1.0F;
    /**
     * Volume size in voxels along x direction
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty sizeX$delegate = null;
    /**
     * Volume size in voxels along y direction
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty sizeY$delegate = null;
    /**
     * Volume size in voxels along z direction
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty sizeZ$delegate = null;
    /**
     * Voxel size in x direction
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty voxelSizeX$delegate = null;
    /**
     * Voxel size in y direction
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty voxelSizeY$delegate = null;
    /**
     * Voxel size in z direction
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty voxelSizeZ$delegate = null;
    /**
     * Temporary storage for volume data
     */
    @org.jetbrains.annotations.NotNull()
    private final transient java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.volumes.Volume.VolumeDescriptor> volumes = null;
    private final java.util.ArrayDeque<java.nio.ByteBuffer> deallocations = null;
    /**
     * Whether to allow setting the transfer range or not
     */
    private boolean lockTransferRange;
    /**
     * *  The rendering method used in the shader, can be
     * *
     * *  0 -- Local Maximum Intensity Projection
     * *  1 -- Maximum Intensity Projection
     * *  2 -- Alpha compositing
     */
    private int renderingMethod;
    /**
     * Transfer function minimum
     */
    private float trangemin;
    /**
     * Transfer function maximum
     */
    private float trangemax;
    /**
     * Bounding box minimum in x direction
     */
    private float boxMin_x;
    /**
     * Bounding box minimum in y direction
     */
    private float boxMin_y;
    /**
     * Bounding box minimum in z direction
     */
    private float boxMin_z;
    /**
     * Bounding box maximum in x direction
     */
    private float boxMax_x;
    /**
     * Bounding box maximum in y direction
     */
    private float boxMax_y;
    /**
     * Bounding box maximum in z direction
     */
    private float boxMax_z;
    /**
     * Maximum steps to take along a single ray through the volume
     */
    private float stepSize;
    /**
     * Alpha blending factor
     */
    private float alphaBlending;
    /**
     * Gamma exponent
     */
    private float gamma;
    private int dataRangeMin;
    private int dataRangeMax;
    private float kernelSize;
    private float maxOcclusionDistance;
    private int occlusionSteps;
    private float time;
    /**
     * The transfer function to use for the volume. Flat by default.
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.volumes.TransferFunction transferFunction;
    /**
     * Stores the available colormaps for transfer functions
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.String, graphics.scenery.volumes.Volume.Colormap> colormaps;
    /**
     * The active colormap, setting this will automatically update the color map texture
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String colormap;
    /**
     * Stores the current volume's name. Can be set to the path of a new volume
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentVolume;
    private boolean autosetProperties;

    public Volume(boolean autosetProperties) {
        super(null);
    }

    public Volume() {
        super(null);
    }

    @graphics.scenery.ShaderProperty()
    public static void renderingMethod$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void trangemin$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void trangemax$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void boxMin_x$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void boxMin_y$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void boxMin_z$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void boxMax_x$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void boxMax_y$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void boxMax_z$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void stepSize$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void alphaBlending$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void gamma$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void sizeX$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void sizeY$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void sizeZ$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void voxelSizeX$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void voxelSizeY$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void voxelSizeZ$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    protected static void dataRangeMin$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    protected static void dataRangeMax$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void kernelSize$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void maxOcclusionDistance$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void occlusionSteps$annotations() {
    }

    @graphics.scenery.ShaderProperty()
    public static void time$annotations() {
    }

    /**
     * * Generates a procedural volume based on the open simplex noise algorithm, with [size]^3 voxels.
     * * [radius] sets the blob radius, while [shift] can be used to move through the continuous noise
     * * volume, essentially offsetting the volume by the value given. [intoBuffer] can be used to
     * * funnel the data into a pre-existing buffer, otherwise one will be allocated. [seed] can be
     * * used to choose a seed for the PRNG.
     * *
     * * Returns the newly-allocated [ByteBuffer], or the one given in [intoBuffer], set to position 0.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.nio.ByteBuffer generateProceduralVolume(long size, float radius, long seed, @org.jetbrains.annotations.NotNull()
        cleargl.GLVector shift, @org.jetbrains.annotations.Nullable()
                                                                         java.nio.ByteBuffer intoBuffer, boolean use16bit) {
        return null;
    }

    public final float getBoxwidth() {
        return 0.0F;
    }

    public final boolean getLockTransferRange() {
        return false;
    }

    public final void setLockTransferRange(boolean p0) {
    }

    public final int getRenderingMethod() {
        return 0;
    }

    public final void setRenderingMethod(int p0) {
    }

    public final float getTrangemin() {
        return 0.0F;
    }

    public final void setTrangemin(float value) {
    }

    public final float getTrangemax() {
        return 0.0F;
    }

    public final void setTrangemax(float value) {
    }

    public final float getBoxMin_x() {
        return 0.0F;
    }

    public final void setBoxMin_x(float p0) {
    }

    public final float getBoxMin_y() {
        return 0.0F;
    }

    public final void setBoxMin_y(float p0) {
    }

    public final float getBoxMin_z() {
        return 0.0F;
    }

    public final void setBoxMin_z(float p0) {
    }

    public final float getBoxMax_x() {
        return 0.0F;
    }

    public final void setBoxMax_x(float p0) {
    }

    public final float getBoxMax_y() {
        return 0.0F;
    }

    public final void setBoxMax_y(float p0) {
    }

    public final float getBoxMax_z() {
        return 0.0F;
    }

    public final void setBoxMax_z(float p0) {
    }

    public final float getStepSize() {
        return 0.0F;
    }

    public final void setStepSize(float p0) {
    }

    public final float getAlphaBlending() {
        return 0.0F;
    }

    public final void setAlphaBlending(float p0) {
    }

    public final float getGamma() {
        return 0.0F;
    }

    public final void setGamma(float p0) {
    }

    /**
     * Volume size in voxels along x direction
     */
    public final int getSizeX() {
        return 0;
    }

    /**
     * Volume size in voxels along x direction
     */
    public final void setSizeX(int p0) {
    }

    /**
     * Volume size in voxels along y direction
     */
    public final int getSizeY() {
        return 0;
    }

    /**
     * Volume size in voxels along y direction
     */
    public final void setSizeY(int p0) {
    }

    /**
     * Volume size in voxels along z direction
     */
    public final int getSizeZ() {
        return 0;
    }

    /**
     * Volume size in voxels along z direction
     */
    public final void setSizeZ(int p0) {
    }

    /**
     * Voxel size in x direction
     */
    public final float getVoxelSizeX() {
        return 0.0F;
    }

    /**
     * Voxel size in x direction
     */
    public final void setVoxelSizeX(float p0) {
    }

    /**
     * Voxel size in y direction
     */
    public final float getVoxelSizeY() {
        return 0.0F;
    }

    /**
     * Voxel size in y direction
     */
    public final void setVoxelSizeY(float p0) {
    }

    /**
     * Voxel size in z direction
     */
    public final float getVoxelSizeZ() {
        return 0.0F;
    }

    /**
     * Voxel size in z direction
     */
    public final void setVoxelSizeZ(float p0) {
    }

    protected final int getDataRangeMin() {
        return 0;
    }

    protected final void setDataRangeMin(int p0) {
    }

    protected final int getDataRangeMax() {
        return 0;
    }

    protected final void setDataRangeMax(int p0) {
    }

    public final float getKernelSize() {
        return 0.0F;
    }

    public final void setKernelSize(float p0) {
    }

    public final float getMaxOcclusionDistance() {
        return 0.0F;
    }

    public final void setMaxOcclusionDistance(float p0) {
    }

    public final int getOcclusionSteps() {
        return 0;
    }

    public final void setOcclusionSteps(int p0) {
    }

    public final float getTime() {
        return 0.0F;
    }

    public final void setTime(float p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.volumes.TransferFunction getTransferFunction() {
        return null;
    }

    public final void setTransferFunction(@org.jetbrains.annotations.NotNull()
                                              graphics.scenery.volumes.TransferFunction p0) {
    }

    /**
     * * Regenerates the [boundingBox] in case any relevant properties have changed.
     */
    protected final <R extends java.lang.Object> void volumePropertyChanged(@org.jetbrains.annotations.NotNull()
                                                                                kotlin.reflect.KProperty<?> property, R old, R p2_54480) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, graphics.scenery.volumes.Volume.Colormap> getColormaps() {
        return null;
    }

    public final void setColormaps(@org.jetbrains.annotations.NotNull()
                                       java.util.HashMap<java.lang.String, graphics.scenery.volumes.Volume.Colormap> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getColormap() {
        return null;
    }

    public final void setColormap(@org.jetbrains.annotations.NotNull()
                                      java.lang.String name) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.volumes.Volume.VolumeDescriptor> getVolumes() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentVolume() {
        return null;
    }

    public final void setCurrentVolume(@org.jetbrains.annotations.NotNull()
                                           java.lang.String value) {
    }

    /**
     * * Preloads all volumes found in the path indicated by [file].
     * * The folder is assumed to contain a `stacks.info` file containing volume metadata.
     */
    public final void preloadRawFromPath(@org.jetbrains.annotations.NotNull()
                                             java.nio.file.Path file) {
    }

    /**
     * * Reads volumetric data from a [buffer]. The volume will be given the name [id], and the
     * * [buffer] is assumed to contain [x]*[y]*[z]*[bytesPerVoxel] bytes and be of the type
     * * [dataType]. For anisotropic volumes, [voxelX], [voxelY] and [voxelZ] can be set appropriately.
     */
    public final void readFromBuffer(@org.jetbrains.annotations.NotNull()
                                         java.lang.String id, @org.jetbrains.annotations.NotNull()
                                         java.nio.ByteBuffer buffer, long x, long y, long z, float voxelX, float voxelY, float voxelZ, @org.jetbrains.annotations.NotNull()
                                         coremem.enums.NativeTypeEnum dataType, int bytesPerVoxel, boolean allowDeallocation) {
    }

    /**
     * * Reads volumetric data from a [buffer]. The volume will be given the name [id], and the
     * * [buffer] is assumed to contain [x]*[y]*[z]*[bytesPerVoxel] bytes and be of the type
     * * [dataType]. For anisotropic volumes, [voxelX], [voxelY] and [voxelZ] can be set appropriately.
     */
    public final void readFromBuffer(@org.jetbrains.annotations.NotNull()
                                         java.lang.String id, @org.jetbrains.annotations.NotNull()
                                         java.nio.ByteBuffer buffer, long x, long y, long z, float voxelX, float voxelY, float voxelZ, @org.jetbrains.annotations.NotNull()
                                         coremem.enums.NativeTypeEnum dataType, int bytesPerVoxel) {
    }

    /**
     * * Reads volumetric data from a [buffer]. The volume will be given the name [id], and the
     * * [buffer] is assumed to contain [x]*[y]*[z]*[bytesPerVoxel] bytes and be of the type
     * * [dataType]. For anisotropic volumes, [voxelX], [voxelY] and [voxelZ] can be set appropriately.
     */
    public final void readFromBuffer(@org.jetbrains.annotations.NotNull()
                                         java.lang.String id, @org.jetbrains.annotations.NotNull()
                                         java.nio.ByteBuffer buffer, long x, long y, long z, float voxelX, float voxelY, float voxelZ, @org.jetbrains.annotations.NotNull()
                                         coremem.enums.NativeTypeEnum dataType) {
    }

    /**
     * * Reads volumetric data from a [buffer]. The volume will be given the name [id], and the
     * * [buffer] is assumed to contain [x]*[y]*[z]*[bytesPerVoxel] bytes and be of the type
     * * [dataType]. For anisotropic volumes, [voxelX], [voxelY] and [voxelZ] can be set appropriately.
     */
    public final void readFromBuffer(@org.jetbrains.annotations.NotNull()
                                         java.lang.String id, @org.jetbrains.annotations.NotNull()
                                         java.nio.ByteBuffer buffer, long x, long y, long z, float voxelX, float voxelY, float voxelZ) {
    }

    private final byte[] swapEndianUnsafe(byte[] bytes) {
        return null;
    }

    /**
     * * Reads volumetric data from a [file] using scifio, and if [replace] is true, will
     * * replace the current volumes' buffer and mark it for deallocation.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String readFrom(@org.jetbrains.annotations.NotNull()
                                               java.nio.file.Path file, boolean replace) {
        return null;
    }

    /**
     * * Reads raw volumetric data from a [file]. If [autorange] is set, the transfer function range
     * * will be determined automatically, if [cache] is true, the volume's data will be stored in [volumes] for
     * * future use. If [replace] is set, the current volumes' buffer will be replace and marked for deallocation.
     * *
     * * Returns the new volumes' id.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String readFromRaw(@org.jetbrains.annotations.NotNull()
                                                  java.nio.file.Path file, boolean replace, boolean autorange, boolean cache) {
        return null;
    }

    @java.lang.Override()
    public void preDraw() {
    }

    private final cleargl.GLTypeEnum toGLType(@org.jetbrains.annotations.NotNull()
                                                  coremem.enums.NativeTypeEnum $receiver) {
        return null;
    }

    private final void assignEmptyVolumeTexture() {
    }

    private final void assignVolumeTexture(long[] dimensions, graphics.scenery.volumes.Volume.VolumeDescriptor descriptor, boolean replace) {
    }

    /**
     * * Sets the volume's transfer function range to [min] and [max].
     * * Optionally, the range can be locked by setting [lock].
     */
    public final void setTransfer(float min, float max, boolean lock) {
    }

    /**
     * * Creates this volume's [Node.OrientedBoundingBox], giving a slight bit of slack
     * * around all edges.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.Node.OrientedBoundingBox generateBoundingBox() {
        return null;
    }

    public final boolean getAutosetProperties() {
        return false;
    }

    public final void setAutosetProperties(boolean p0) {
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\t\u0010!\u001a\u00020\rH\u00c6\u0003JQ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016\u00a8\u0006)"}, d2 = {"Lgraphics/scenery/volumes/Volume$VolumeDescriptor;", "", "path", "Ljava/nio/file/Path;", "width", "", "height", "depth", "dataType", "Lcoremem/enums/NativeTypeEnum;", "bytesPerVoxel", "", "data", "Ljava/nio/ByteBuffer;", "(Ljava/nio/file/Path;JJJLcoremem/enums/NativeTypeEnum;ILjava/nio/ByteBuffer;)V", "getBytesPerVoxel", "()I", "getData", "()Ljava/nio/ByteBuffer;", "getDataType", "()Lcoremem/enums/NativeTypeEnum;", "getDepth", "()J", "getHeight", "getPath", "()Ljava/nio/file/Path;", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "scenery"})
    public static final class VolumeDescriptor {
        @org.jetbrains.annotations.Nullable()
        private final java.nio.file.Path path = null;
        private final long width = 0L;
        private final long height = 0L;
        private final long depth = 0L;
        @org.jetbrains.annotations.NotNull()
        private final coremem.enums.NativeTypeEnum dataType = null;
        private final int bytesPerVoxel = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.nio.ByteBuffer data = null;

        public VolumeDescriptor(@org.jetbrains.annotations.Nullable()
                                    java.nio.file.Path path, long width, long height, long depth, @org.jetbrains.annotations.NotNull()
                                    coremem.enums.NativeTypeEnum dataType, int bytesPerVoxel, @org.jetbrains.annotations.NotNull()
                                    java.nio.ByteBuffer data) {
            super();
        }

        @org.jetbrains.annotations.Nullable()
        public final java.nio.file.Path getPath() {
            return null;
        }

        public final long getWidth() {
            return 0L;
        }

        public final long getHeight() {
            return 0L;
        }

        public final long getDepth() {
            return 0L;
        }

        @org.jetbrains.annotations.NotNull()
        public final coremem.enums.NativeTypeEnum getDataType() {
            return null;
        }

        public final int getBytesPerVoxel() {
            return 0;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.nio.ByteBuffer getData() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final java.nio.file.Path component1() {
            return null;
        }

        public final long component2() {
            return 0L;
        }

        public final long component3() {
            return 0L;
        }

        public final long component4() {
            return 0L;
        }

        @org.jetbrains.annotations.NotNull()
        public final coremem.enums.NativeTypeEnum component5() {
            return null;
        }

        public final int component6() {
            return 0;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.nio.ByteBuffer component7() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.volumes.Volume.VolumeDescriptor copy(@org.jetbrains.annotations.Nullable()
                                                                               java.nio.file.Path path, long width, long height, long depth, @org.jetbrains.annotations.NotNull()
                                                                               coremem.enums.NativeTypeEnum dataType, int bytesPerVoxel, @org.jetbrains.annotations.NotNull()
                                                                               java.nio.ByteBuffer data) {
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
     * * Histogram class.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u0010\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\u0012\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0011R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lgraphics/scenery/volumes/Volume$Histogram;", "T", "", "", "histogramSize", "", "(I)V", "bins", "Ljava/util/HashMap;", "", "getBins", "()Ljava/util/HashMap;", "add", "", "value", "(Ljava/lang/Comparable;)V", "max", "()Ljava/lang/Comparable;", "min", "scenery"})
    public static final class Histogram<T extends java.lang.Comparable<? super T>> {

        /**
         * Bin storage for the histogram.
         */
        @org.jetbrains.annotations.NotNull()
        private final java.util.HashMap<T, java.lang.Long> bins = null;

        public Histogram(int histogramSize) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<T, java.lang.Long> getBins() {
            return null;
        }

        /**
         * Adds a new value, putting it in the corresponding bin.
         */
        public final void add(@org.jetbrains.annotations.NotNull()
                                  T value) {
        }

        /**
         * Returns the minimum value contained in the histogram.
         */
        @org.jetbrains.annotations.NotNull()
        public final T min() {
            return null;
        }

        /**
         * Returns the maximum value contained in the histogram.
         */
        @org.jetbrains.annotations.NotNull()
        public final T max() {
            return null;
        }
    }

    /**
     * * Color map class to contain lookup tables.
     * * These can be file-based ([ColormapFile]), or buffer-based ([ColormapBuffer]).
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/volumes/Volume$Colormap;", "", "()V", "ColormapBuffer", "ColormapFile", "Lgraphics/scenery/volumes/Volume$Colormap$ColormapFile;", "Lgraphics/scenery/volumes/Volume$Colormap$ColormapBuffer;", "scenery"})
    public static abstract class Colormap {

        private Colormap() {
            super();
        }

        /**
         * * File-based color map.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/volumes/Volume$Colormap$ColormapFile;", "Lgraphics/scenery/volumes/Volume$Colormap;", "filename", "", "(Ljava/lang/String;)V", "getFilename", "()Ljava/lang/String;", "scenery"})
        public static final class ColormapFile extends graphics.scenery.volumes.Volume.Colormap {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String filename = null;

            public ColormapFile(@org.jetbrains.annotations.NotNull()
                                    java.lang.String filename) {
                super();
            }

            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getFilename() {
                return null;
            }
        }

        /**
         * * Buffer-based color map.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/volumes/Volume$Colormap$ColormapBuffer;", "Lgraphics/scenery/volumes/Volume$Colormap;", "texture", "Lgraphics/scenery/GenericTexture;", "(Lgraphics/scenery/GenericTexture;)V", "getTexture", "()Lgraphics/scenery/GenericTexture;", "scenery"})
        public static final class ColormapBuffer extends graphics.scenery.volumes.Volume.Colormap {
            @org.jetbrains.annotations.NotNull()
            private final graphics.scenery.GenericTexture texture = null;

            public ColormapBuffer(@org.jetbrains.annotations.NotNull()
                                      graphics.scenery.GenericTexture texture) {
                super();
            }

            @org.jetbrains.annotations.NotNull()
            public final graphics.scenery.GenericTexture getTexture() {
                return null;
            }
        }
    }

    /**
     * * Volume node companion object for static functions.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JD\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lgraphics/scenery/volumes/Volume$Companion;", "", "()V", "BYTES_OFFSET", "", "getBYTES_OFFSET", "()I", "UNSAFE", "Lsun/misc/Unsafe;", "getUNSAFE", "()Lsun/misc/Unsafe;", "scifio", "Lio/scif/SCIFIO;", "getScifio", "()Lio/scif/SCIFIO;", "generateProceduralVolume", "Ljava/nio/ByteBuffer;", "size", "", "radius", "", "seed", "shift", "Lcleargl/GLVector;", "intoBuffer", "use16bit", "", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final io.scif.SCIFIO getScifio() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final sun.misc.Unsafe getUNSAFE() {
            return null;
        }

        public final int getBYTES_OFFSET() {
            return 0;
        }

        /**
         * * Generates a procedural volume based on the open simplex noise algorithm, with [size]^3 voxels.
         * * [radius] sets the blob radius, while [shift] can be used to move through the continuous noise
         * * volume, essentially offsetting the volume by the value given. [intoBuffer] can be used to
         * * funnel the data into a pre-existing buffer, otherwise one will be allocated. [seed] can be
         * * used to choose a seed for the PRNG.
         * *
         * * Returns the newly-allocated [ByteBuffer], or the one given in [intoBuffer], set to position 0.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.nio.ByteBuffer generateProceduralVolume(long size, float radius, long seed, @org.jetbrains.annotations.NotNull()
            cleargl.GLVector shift, @org.jetbrains.annotations.Nullable()
                                                                      java.nio.ByteBuffer intoBuffer, boolean use16bit) {
            return null;
        }
    }
}
