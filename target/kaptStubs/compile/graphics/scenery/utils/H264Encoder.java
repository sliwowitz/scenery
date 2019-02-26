package graphics.scenery.utils;

/**
 * * H264 encoder class
 * *
 * * Experimental class for enabling movie recordings and streaming from within scenery, based on ffmpeg.
 * *
 * * @param[frameWidth] The width of the rendered picture. Will be rounded to the nearest multiple of 2 in the movie.
 * * @param[frameHeight] The height of the rendered picture. Will be rounded to the nearest multiple of 2 in the movie.
 * * @param[filename] The file name under which to save the movie. In case the system property `scenery.StreamVideo` is true,
 * *      the frames are streamed via UDP multicast on the local IP, on port 3337 as MPEG transport stream.
 * * @param[fps] The target frame rate for the movie.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001UB\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OJ\u0010\u0010P\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0003H\u0002J\u0006\u0010R\u001a\u00020MJ\u0014\u0010S\u001a\u00020\u0003*\u00020\u00032\u0006\u0010T\u001a\u00020\u0003H\u0002R\u0014\u0010\t\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0003X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020 X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000bR\u001c\u0010&\u001a\n (*\u0004\u0018\u00010\'0\'X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001b\u0010+\u001a\u00020,8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u000202\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u000206X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020EX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001c\u0010H\u001a\n (*\u0004\u0018\u00010\'0\'X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010*R\u0014\u0010J\u001a\u00020\u0017X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0019\u00a8\u0006V"}, d2 = {"Lgraphics/scenery/utils/H264Encoder;", "", "frameWidth", "", "frameHeight", "filename", "", "fps", "(IILjava/lang/String;I)V", "actualFrameHeight", "getActualFrameHeight", "()I", "actualFrameWidth", "getActualFrameWidth", "codec", "Lorg/bytedeco/javacpp/avcodec$AVCodec;", "getCodec", "()Lorg/bytedeco/javacpp/avcodec$AVCodec;", "codecContext", "Lorg/bytedeco/javacpp/avcodec$AVCodecContext;", "getCodecContext", "()Lorg/bytedeco/javacpp/avcodec$AVCodecContext;", "frame", "Lorg/bytedeco/javacpp/avutil$AVFrame;", "getFrame", "()Lorg/bytedeco/javacpp/avutil$AVFrame;", "frameEncodingFailure", "getFrameEncodingFailure", "setFrameEncodingFailure", "(I)V", "getFrameHeight", "frameNum", "", "getFrameNum", "()J", "setFrameNum", "(J)V", "getFrameWidth", "framerate", "Lorg/bytedeco/javacpp/avutil$AVRational;", "kotlin.jvm.PlatformType", "getFramerate", "()Lorg/bytedeco/javacpp/avutil$AVRational;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "networked", "", "getNetworked", "()Z", "outputContext", "Lorg/bytedeco/javacpp/avformat$AVFormatContext;", "getOutputContext", "()Lorg/bytedeco/javacpp/avformat$AVFormatContext;", "outputFile", "getOutputFile", "()Ljava/lang/String;", "setOutputFile", "(Ljava/lang/String;)V", "scalingContext", "Lorg/bytedeco/javacpp/swscale$SwsContext;", "getScalingContext", "()Lorg/bytedeco/javacpp/swscale$SwsContext;", "setScalingContext", "(Lorg/bytedeco/javacpp/swscale$SwsContext;)V", "stream", "Lorg/bytedeco/javacpp/avformat$AVStream;", "getStream", "()Lorg/bytedeco/javacpp/avformat$AVStream;", "timebase", "getTimebase", "tmpframe", "getTmpframe", "encodeFrame", "", "data", "Ljava/nio/ByteBuffer;", "ffmpegErrorString", "returnCode", "finish", "nearestWholeMultipleOf", "divisor", "Companion", "scenery"})
public final class H264Encoder {
    public static final graphics.scenery.utils.H264Encoder.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.bytedeco.javacpp.avutil.AVFrame frame = null;
    @org.jetbrains.annotations.NotNull()
    private final org.bytedeco.javacpp.avutil.AVFrame tmpframe = null;
    @org.jetbrains.annotations.NotNull()
    private final org.bytedeco.javacpp.avcodec.AVCodec codec = null;
    @org.jetbrains.annotations.NotNull()
    private final org.bytedeco.javacpp.avcodec.AVCodecContext codecContext = null;
    @org.jetbrains.annotations.NotNull()
    private final org.bytedeco.javacpp.avformat.AVFormatContext outputContext = null;
    @org.jetbrains.annotations.NotNull()
    private final org.bytedeco.javacpp.avformat.AVStream stream = null;
    private final org.bytedeco.javacpp.avutil.AVRational timebase = null;
    private final org.bytedeco.javacpp.avutil.AVRational framerate = null;
    private final int actualFrameWidth = 0;
    private final int actualFrameHeight = 0;
    private final boolean networked = false;
    private final int frameWidth = 0;
    private final int frameHeight = 0;
    private long frameNum;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String outputFile;
    @org.jetbrains.annotations.Nullable()
    private org.bytedeco.javacpp.swscale.SwsContext scalingContext;
    private int frameEncodingFailure;

    public H264Encoder(int frameWidth, int frameHeight, @org.jetbrains.annotations.NotNull()
        java.lang.String filename, int fps) {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.bytedeco.javacpp.avutil.AVFrame getFrame() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.bytedeco.javacpp.avutil.AVFrame getTmpframe() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.bytedeco.javacpp.avcodec.AVCodec getCodec() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.bytedeco.javacpp.avcodec.AVCodecContext getCodecContext() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.bytedeco.javacpp.avformat.AVFormatContext getOutputContext() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.bytedeco.javacpp.avformat.AVStream getStream() {
        return null;
    }

    protected final long getFrameNum() {
        return 0L;
    }

    protected final void setFrameNum(long p0) {
    }

    protected final org.bytedeco.javacpp.avutil.AVRational getTimebase() {
        return null;
    }

    protected final org.bytedeco.javacpp.avutil.AVRational getFramerate() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getOutputFile() {
        return null;
    }

    protected final void setOutputFile(@org.jetbrains.annotations.NotNull()
                                           java.lang.String p0) {
    }

    protected final int getActualFrameWidth() {
        return 0;
    }

    protected final int getActualFrameHeight() {
        return 0;
    }

    public final boolean getNetworked() {
        return false;
    }

    private final int nearestWholeMultipleOf(int $receiver, int divisor) {
        return 0;
    }

    @org.jetbrains.annotations.Nullable()
    protected final org.bytedeco.javacpp.swscale.SwsContext getScalingContext() {
        return null;
    }

    protected final void setScalingContext(@org.jetbrains.annotations.Nullable()
                                               org.bytedeco.javacpp.swscale.SwsContext p0) {
    }

    protected final int getFrameEncodingFailure() {
        return 0;
    }

    protected final void setFrameEncodingFailure(int p0) {
    }

    public final void encodeFrame(@org.jetbrains.annotations.Nullable()
                                      java.nio.ByteBuffer data) {
    }

    public final void finish() {
    }

    private final java.lang.String ffmpegErrorString(int returnCode) {
        return null;
    }

    public final int getFrameWidth() {
        return 0;
    }

    public final int getFrameHeight() {
        return 0;
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lgraphics/scenery/utils/H264Encoder$Companion;", "", "()V", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }
    }
}
