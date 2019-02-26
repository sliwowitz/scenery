package graphics.scenery.controls;

/**
 * * Support class for Pupil Labs eye trackers -- pupil-labs.com
 * *
 * * [calibrationType] can be set to screen space or world space, and [host] is the host where
 * * the Pupil service is running on, and [port] its port.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 T2\u00020\u0001:\u0003STUB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ,\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020\n2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010LJ\b\u0010M\u001a\u00020\u0018H\u0004J\u001c\u0010N\u001a\u00020\u00052\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0015H\u0004J\u0010\u0010P\u001a\u00020-2\u0006\u0010Q\u001a\u00020\u0005H\u0002J\u0010\u0010R\u001a\u00020-2\u0006\u0010Q\u001a\u00020\u0005H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b%\u0010&R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R(\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020-\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010=\u001a\n ?*\u0004\u0018\u00010>0>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020A0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006V"}, d2 = {"Lgraphics/scenery/controls/PupilEyeTracker;", "", "calibrationType", "Lgraphics/scenery/controls/PupilEyeTracker$CalibrationType;", "host", "", "port", "", "(Lgraphics/scenery/controls/PupilEyeTracker$CalibrationType;Ljava/lang/String;I)V", "calibrating", "", "getCalibrationType", "()Lgraphics/scenery/controls/PupilEyeTracker$CalibrationType;", "<set-?>", "Lgraphics/scenery/controls/PupilEyeTracker$Gaze;", "currentGaze", "getCurrentGaze", "()Lgraphics/scenery/controls/PupilEyeTracker$Gaze;", "setCurrentGaze", "(Lgraphics/scenery/controls/PupilEyeTracker$Gaze;)V", "currentPupilDatumLeft", "Ljava/util/HashMap;", "currentPupilDatumRight", "gazeConfidenceThreshold", "", "getGazeConfidenceThreshold", "()F", "setGazeConfidenceThreshold", "(F)V", "getHost", "()Ljava/lang/String;", "isCalibrated", "()Z", "setCalibrated", "(Z)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "onCalibrationFailed", "Lkotlin/Function0;", "", "getOnCalibrationFailed", "()Lkotlin/jvm/functions/Function0;", "setOnCalibrationFailed", "(Lkotlin/jvm/functions/Function0;)V", "onCalibrationSuccess", "getOnCalibrationSuccess", "setOnCalibrationSuccess", "onGazeReceived", "Lkotlin/Function1;", "getOnGazeReceived", "()Lkotlin/jvm/functions/Function1;", "setOnGazeReceived", "(Lkotlin/jvm/functions/Function1;)V", "getPort", "()I", "req", "Lorg/zeromq/ZMQ$Socket;", "kotlin.jvm.PlatformType", "subscriberSockets", "Lkotlinx/coroutines/Job;", "subscriptionPort", "zmqContext", "Lorg/zeromq/ZContext;", "calibrate", "cam", "Lgraphics/scenery/Camera;", "hmd", "Lgraphics/scenery/backends/Display;", "generateReferenceData", "calibrationTarget", "Lgraphics/scenery/Node;", "getPupilTimestamp", "notify", "dict", "subscribe", "topic", "unsubscribe", "CalibrationType", "Companion", "Gaze", "scenery"})
public final class PupilEyeTracker {
    public static final graphics.scenery.controls.PupilEyeTracker.Companion Companion = null;
    /**
     * Point generator for circular calibration points.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.jvm.functions.Function3<graphics.scenery.Camera, java.lang.Integer, java.lang.Integer, kotlin.Pair<cleargl.GLVector, cleargl.GLVector>> CircularScreenSpaceCalibrationPointGenerator = null;
    /**
     * Point generator for equidistributed calibration points.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.jvm.functions.Function3<graphics.scenery.Camera, java.lang.Integer, java.lang.Integer, kotlin.Pair<cleargl.GLVector, cleargl.GLVector>> EquidistributedScreenSpaceCalibrationPointGenerator = null;
    /**
     * Point generator for random world-space points.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.jvm.functions.Function3<graphics.scenery.Camera, java.lang.Integer, java.lang.Integer, kotlin.Pair<cleargl.GLVector, cleargl.GLVector>> DefaultWorldSpaceCalibrationPointGenerator = null;
    private final kotlin.Lazy logger$delegate = null;
    private final org.zeromq.ZContext zmqContext = null;
    private final org.zeromq.ZMQ.Socket req = null;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    private final int subscriptionPort = 0;
    private final java.util.HashMap<java.lang.String, kotlinx.coroutines.Job> subscriberSockets = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.controls.PupilEyeTracker.CalibrationType calibrationType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String host = null;
    private final int port = 0;
    private boolean isCalibrated;
    private boolean calibrating;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super graphics.scenery.controls.PupilEyeTracker.Gaze, kotlin.Unit> onGazeReceived;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onCalibrationFailed;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onCalibrationSuccess;
    private float gazeConfidenceThreshold;
    private java.util.HashMap<java.lang.Object, java.lang.Object> currentPupilDatumLeft;
    private java.util.HashMap<java.lang.Object, java.lang.Object> currentPupilDatumRight;
    /**
     * Stores the current gaze data point.
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.controls.PupilEyeTracker.Gaze currentGaze;

    public PupilEyeTracker(@org.jetbrains.annotations.NotNull()
                               graphics.scenery.controls.PupilEyeTracker.CalibrationType calibrationType, @org.jetbrains.annotations.NotNull()
                               java.lang.String host, int port) {
        super();
    }

    private final org.slf4j.Logger getLogger() {
        return null;
    }

    public final boolean isCalibrated() {
        return false;
    }

    private final void setCalibrated(boolean p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<graphics.scenery.controls.PupilEyeTracker.Gaze, kotlin.Unit> getOnGazeReceived() {
        return null;
    }

    public final void setOnGazeReceived(@org.jetbrains.annotations.Nullable()
                                            kotlin.jvm.functions.Function1<? super graphics.scenery.controls.PupilEyeTracker.Gaze, kotlin.Unit> p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCalibrationFailed() {
        return null;
    }

    public final void setOnCalibrationFailed(@org.jetbrains.annotations.Nullable()
                                                 kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCalibrationSuccess() {
        return null;
    }

    public final void setOnCalibrationSuccess(@org.jetbrains.annotations.Nullable()
                                                  kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }

    public final float getGazeConfidenceThreshold() {
        return 0.0F;
    }

    public final void setGazeConfidenceThreshold(float p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.controls.PupilEyeTracker.Gaze getCurrentGaze() {
        return null;
    }

    private final void setCurrentGaze(graphics.scenery.controls.PupilEyeTracker.Gaze p0) {
    }

    protected final float getPupilTimestamp() {
        return 0.0F;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String notify(@org.jetbrains.annotations.NotNull()
                                                java.util.HashMap<java.lang.String, java.lang.Object> dict) {
        return null;
    }

    private final void subscribe(java.lang.String topic) {
    }

    private final void unsubscribe(java.lang.String topic) {
    }

    /**
     * * Runs a gaze calibration, using [cam] as origin to display the calibration points.
     * * Requires a [hmd], and a [calibrationTarget] can be given to be moved around for gaze calibration.
     */
    public final boolean calibrate(@org.jetbrains.annotations.NotNull()
                                       graphics.scenery.Camera cam, @org.jetbrains.annotations.NotNull()
                                       graphics.scenery.backends.Display hmd, boolean generateReferenceData, @org.jetbrains.annotations.Nullable()
                                       graphics.scenery.Node calibrationTarget) {
        return false;
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.controls.PupilEyeTracker.CalibrationType getCalibrationType() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHost() {
        return null;
    }

    public final int getPort() {
        return 0;
    }

    /**
     * Shall we do a screen-space or world-space calibration?
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lgraphics/scenery/controls/PupilEyeTracker$CalibrationType;", "", "(Ljava/lang/String;I)V", "ScreenSpace", "WorldSpace", "scenery"})
    public static enum CalibrationType {
        /*public static final*/ ScreenSpace /* = new ScreenSpace() */,
        /*public static final*/ WorldSpace /* = new WorldSpace() */;

        CalibrationType() {
        }
    }

    /**
     * * Stores gaze data, and retrieves various properties
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u00c6\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u00c6\u0003Jc\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020\nH\u0016J\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020*J\u0006\u00100\u001a\u00020*J\t\u00101\u001a\u000202H\u00d6\u0001J\u000e\u00103\u001a\u00020**\u0004\u0018\u00010\u0006H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010\u00a8\u00064"}, d2 = {"Lgraphics/scenery/controls/PupilEyeTracker$Gaze;", "", "confidence", "", "timestamp", "norm_pos", "", "gaze_point_3d", "eye_centers_3d", "Ljava/util/HashMap;", "", "gaze_normals_3d", "(FF[F[FLjava/util/HashMap;Ljava/util/HashMap;)V", "getConfidence", "()F", "setConfidence", "(F)V", "getEye_centers_3d", "()Ljava/util/HashMap;", "setEye_centers_3d", "(Ljava/util/HashMap;)V", "getGaze_normals_3d", "setGaze_normals_3d", "getGaze_point_3d", "()[F", "setGaze_point_3d", "([F)V", "getNorm_pos", "setNorm_pos", "getTimestamp", "setTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "gazePoint", "Lcleargl/GLVector;", "hashCode", "leftEyeCenter", "leftGazeNormal", "normalizedPosition", "rightEyeCenter", "rightGazeNormal", "toString", "", "toGLVector", "scenery"})
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Gaze {
        private float confidence;
        private float timestamp;
        @org.jetbrains.annotations.NotNull()
        private float[] norm_pos;
        @org.jetbrains.annotations.Nullable()
        private float[] gaze_point_3d;
        @org.jetbrains.annotations.Nullable()
        private java.util.HashMap<java.lang.Integer, float[]> eye_centers_3d;
        @org.jetbrains.annotations.Nullable()
        private java.util.HashMap<java.lang.Integer, float[]> gaze_normals_3d;

        public Gaze(float confidence, float timestamp, @org.jetbrains.annotations.NotNull()
            float[] norm_pos, @org.jetbrains.annotations.Nullable()
                        float[] gaze_point_3d, @org.jetbrains.annotations.Nullable()
                        java.util.HashMap<java.lang.Integer, float[]> eye_centers_3d, @org.jetbrains.annotations.Nullable()
                        java.util.HashMap<java.lang.Integer, float[]> gaze_normals_3d) {
            super();
        }

        public Gaze() {
            super();
        }

        /**
         * Returns the normalized gaze position.
         */
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector normalizedPosition() {
            return null;
        }

        /**
         * Returns the point the user is gazing at.
         */
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector gazePoint() {
            return null;
        }

        /**
         * Returns the center of the left eye.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"unused"})
        public final cleargl.GLVector leftEyeCenter() {
            return null;
        }

        /**
         * Returns the center of the right eye.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"unused"})
        public final cleargl.GLVector rightEyeCenter() {
            return null;
        }

        /**
         * Returns the normal orientation of the left eye.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"unused"})
        public final cleargl.GLVector leftGazeNormal() {
            return null;
        }

        /**
         * Returns the normal orientation of the right eye.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"unused"})
        public final cleargl.GLVector rightGazeNormal() {
            return null;
        }

        private final cleargl.GLVector toGLVector(@org.jetbrains.annotations.Nullable()
                                                      float[] $receiver) {
            return null;
        }

        /**
         * * Compares two gaze data points with each other, returning true
         * * only if they match in all aspects.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
                                  java.lang.Object other) {
            return false;
        }

        /**
         * * Returns the hash code of this gaze data point.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }

        public final float getConfidence() {
            return 0.0F;
        }

        public final void setConfidence(float p0) {
        }

        public final float getTimestamp() {
            return 0.0F;
        }

        public final void setTimestamp(float p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final float[] getNorm_pos() {
            return null;
        }

        public final void setNorm_pos(@org.jetbrains.annotations.NotNull()
                                          float[] p0) {
        }

        @org.jetbrains.annotations.Nullable()
        public final float[] getGaze_point_3d() {
            return null;
        }

        public final void setGaze_point_3d(@org.jetbrains.annotations.Nullable()
                                               float[] p0) {
        }

        @org.jetbrains.annotations.Nullable()
        public final java.util.HashMap<java.lang.Integer, float[]> getEye_centers_3d() {
            return null;
        }

        public final void setEye_centers_3d(@org.jetbrains.annotations.Nullable()
                                                java.util.HashMap<java.lang.Integer, float[]> p0) {
        }

        @org.jetbrains.annotations.Nullable()
        public final java.util.HashMap<java.lang.Integer, float[]> getGaze_normals_3d() {
            return null;
        }

        public final void setGaze_normals_3d(@org.jetbrains.annotations.Nullable()
                                                 java.util.HashMap<java.lang.Integer, float[]> p0) {
        }

        public final float component1() {
            return 0.0F;
        }

        public final float component2() {
            return 0.0F;
        }

        @org.jetbrains.annotations.NotNull()
        public final float[] component3() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final float[] component4() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final java.util.HashMap<java.lang.Integer, float[]> component5() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final java.util.HashMap<java.lang.Integer, float[]> component6() {
            return null;
        }

        /**
         * * Stores gaze data, and retrieves various properties
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.controls.PupilEyeTracker.Gaze copy(float confidence, float timestamp, @org.jetbrains.annotations.NotNull()
            float[] norm_pos, @org.jetbrains.annotations.Nullable()
                                                                             float[] gaze_point_3d, @org.jetbrains.annotations.Nullable()
                                                                             java.util.HashMap<java.lang.Integer, float[]> eye_centers_3d, @org.jetbrains.annotations.Nullable()
                                                                             java.util.HashMap<java.lang.Integer, float[]> gaze_normals_3d) {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }

    /**
     * * Utilities for eye tracking.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R;\u0010\u0003\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000bR;\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000bR;\u0010\u000f\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lgraphics/scenery/controls/PupilEyeTracker$Companion;", "", "()V", "CircularScreenSpaceCalibrationPointGenerator", "Lkotlin/Function3;", "Lgraphics/scenery/Camera;", "", "Lkotlin/Pair;", "Lcleargl/GLVector;", "CircularScreenSpaceCalibrationPointGenerator$annotations", "getCircularScreenSpaceCalibrationPointGenerator", "()Lkotlin/jvm/functions/Function3;", "DefaultWorldSpaceCalibrationPointGenerator", "DefaultWorldSpaceCalibrationPointGenerator$annotations", "getDefaultWorldSpaceCalibrationPointGenerator", "EquidistributedScreenSpaceCalibrationPointGenerator", "EquidistributedScreenSpaceCalibrationPointGenerator$annotations", "getEquidistributedScreenSpaceCalibrationPointGenerator", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }

        @kotlin.Suppress(names = {"unused"})
        public static void CircularScreenSpaceCalibrationPointGenerator$annotations() {
        }

        @kotlin.Suppress(names = {"unused"})
        public static void EquidistributedScreenSpaceCalibrationPointGenerator$annotations() {
        }

        @kotlin.Suppress(names = {"unused"})
        public static void DefaultWorldSpaceCalibrationPointGenerator$annotations() {
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function3<graphics.scenery.Camera, java.lang.Integer, java.lang.Integer, kotlin.Pair<cleargl.GLVector, cleargl.GLVector>> getCircularScreenSpaceCalibrationPointGenerator() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function3<graphics.scenery.Camera, java.lang.Integer, java.lang.Integer, kotlin.Pair<cleargl.GLVector, cleargl.GLVector>> getEquidistributedScreenSpaceCalibrationPointGenerator() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function3<graphics.scenery.Camera, java.lang.Integer, java.lang.Integer, kotlin.Pair<cleargl.GLVector, cleargl.GLVector>> getDefaultWorldSpaceCalibrationPointGenerator() {
            return null;
        }
    }
}
