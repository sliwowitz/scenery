package graphics.scenery.compute;

/**
 * * OpenCL context creation and handling.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 H2\u00020\u0001:\u0001HB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0004J\u0016\u0010.\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010/\u001a\u000200J\u0016\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0005J\u0016\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002052\u0006\u00104\u001a\u00020\u0005J\u0016\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;J/\u0010<\u001a\u0002072\u0006\u00104\u001a\u00020\u00052\u0006\u0010=\u001a\u0002002\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0?\"\u00020-\u00a2\u0006\u0002\u0010@J\u0018\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020;2\b\b\u0002\u0010C\u001a\u00020DJ\u000e\u0010E\u001a\u0002092\u0006\u0010B\u001a\u00020;J%\u0010F\u001a\u000207*\u00020\u00192\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0?\"\u00020-H\u0004\u00a2\u0006\u0002\u0010GR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u0006I"}, d2 = {"Lgraphics/scenery/compute/OpenCLContext;", "Lgraphics/scenery/Hubable;", "hub", "Lgraphics/scenery/Hub;", "devicePreference", "", "(Lgraphics/scenery/Hub;Ljava/lang/String;)V", "context", "Lorg/jocl/cl_context;", "getContext", "()Lorg/jocl/cl_context;", "setContext", "(Lorg/jocl/cl_context;)V", "device", "Lorg/jocl/cl_device_id;", "getDevice", "()Lorg/jocl/cl_device_id;", "setDevice", "(Lorg/jocl/cl_device_id;)V", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "kernels", "Ljava/util/concurrent/ConcurrentHashMap;", "Lorg/jocl/cl_kernel;", "getKernels", "()Ljava/util/concurrent/ConcurrentHashMap;", "setKernels", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "queue", "Lorg/jocl/cl_command_queue;", "getQueue", "()Lorg/jocl/cl_command_queue;", "setQueue", "(Lorg/jocl/cl_command_queue;)V", "getSizeof", "", "obj", "", "getString", "paramName", "", "loadKernel", "source", "Ljava/io/File;", "name", "Ljava/net/URL;", "readBuffer", "", "memory", "Lorg/jocl/cl_mem;", "target", "Ljava/nio/Buffer;", "runKernel", "wavefronts", "arguments", "", "(Ljava/lang/String;I[Ljava/lang/Object;)V", "wrapInput", "buffer", "readonly", "", "wrapOutput", "setArgs", "(Lorg/jocl/cl_kernel;[Ljava/lang/Object;)V", "OpenCLUtils", "scenery"})
public final class OpenCLContext implements graphics.scenery.Hubable {
    public static final graphics.scenery.compute.OpenCLContext.OpenCLUtils OpenCLUtils = null;
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private org.jocl.cl_device_id device;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, org.jocl.cl_kernel> kernels;
    @org.jetbrains.annotations.NotNull()
    private org.jocl.cl_context context;
    @org.jetbrains.annotations.NotNull()
    private org.jocl.cl_command_queue queue;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;

    public OpenCLContext(@org.jetbrains.annotations.Nullable()
                             graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                             java.lang.String devicePreference) {
        super();
    }

    private final org.slf4j.Logger getLogger() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.jocl.cl_device_id getDevice() {
        return null;
    }

    public final void setDevice(@org.jetbrains.annotations.NotNull()
                                    org.jocl.cl_device_id p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.jocl.cl_kernel> getKernels() {
        return null;
    }

    public final void setKernels(@org.jetbrains.annotations.NotNull()
                                     java.util.concurrent.ConcurrentHashMap<java.lang.String, org.jocl.cl_kernel> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.jocl.cl_context getContext() {
        return null;
    }

    public final void setContext(@org.jetbrains.annotations.NotNull()
                                     org.jocl.cl_context p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final org.jocl.cl_command_queue getQueue() {
        return null;
    }

    public final void setQueue(@org.jetbrains.annotations.NotNull()
                                   org.jocl.cl_command_queue p0) {
    }

    /**
     * * Returns the device info for [device], specifically the parameter
     * * named [paramName].
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
                                                org.jocl.cl_device_id device, int paramName) {
        return null;
    }

    /**
     * * Loads an OpenCL kernel from a String [source], storing it under [name], and returning
     * * the compiled kernel.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    public final graphics.scenery.compute.OpenCLContext loadKernel(@org.jetbrains.annotations.NotNull()
                                                                       java.lang.String source, @org.jetbrains.annotations.NotNull()
                                                                       java.lang.String name) {
        return null;
    }

    /**
     * * Loads an OpenCL kernel from a file [source], storing it under [name], and returning
     * * the compiled kernel.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    public final graphics.scenery.compute.OpenCLContext loadKernel(@org.jetbrains.annotations.NotNull()
                                                                       java.io.File source, @org.jetbrains.annotations.NotNull()
                                                                       java.lang.String name) {
        return null;
    }

    /**
     * * Loads an OpenCL kernel from a URL [source], storing it under [name], and returning
     * * the compiled kernel.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    public final graphics.scenery.compute.OpenCLContext loadKernel(@org.jetbrains.annotations.NotNull()
                                                                       java.net.URL source, @org.jetbrains.annotations.NotNull()
                                                                       java.lang.String name) {
        return null;
    }

    /**
     * * Returns the OpenCL size of different JVM objects as Long.
     */
    protected final long getSizeof(@org.jetbrains.annotations.NotNull()
                                       java.lang.Object obj) {
        return 0L;
    }

    /**
     * * Sets arguments for a specific OpenCL kernel.
     */
    protected final void setArgs(@org.jetbrains.annotations.NotNull()
                                     org.jocl.cl_kernel $receiver, @org.jetbrains.annotations.NotNull()
                                     java.lang.Object... arguments) {
    }

    /**
     * * Runs the kernel specified by [name] with a number of [wavefronts], passing
     * * [arguments] to the kernel.
     */
    public final void runKernel(@org.jetbrains.annotations.NotNull()
                                    java.lang.String name, int wavefronts, @org.jetbrains.annotations.NotNull()
                                    java.lang.Object... arguments) {
    }

    /**
     * * Wraps a [buffer] for use with a kernel. The buffer can be defined as [readonly].
     */
    @org.jetbrains.annotations.NotNull()
    public final org.jocl.cl_mem wrapInput(@org.jetbrains.annotations.NotNull()
                                               java.nio.Buffer buffer, boolean readonly) {
        return null;
    }

    /**
     * * Wraps an output [buffer].
     */
    @org.jetbrains.annotations.NotNull()
    public final org.jocl.cl_mem wrapOutput(@org.jetbrains.annotations.NotNull()
                                                java.nio.Buffer buffer) {
        return null;
    }

    /**
     * * Reads from OpenCL memory specified by [memory] into the [Buffer] [target].
     */
    public final void readBuffer(@org.jetbrains.annotations.NotNull()
                                     org.jocl.cl_mem memory, @org.jetbrains.annotations.NotNull()
                                     java.nio.Buffer target) {
    }

    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.Hub getHub() {
        return null;
    }

    @java.lang.Override()
    public void setHub(@org.jetbrains.annotations.Nullable()
                           graphics.scenery.Hub p0) {
    }

    /**
     * * Convenience utils for [OpenCLContext].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\\\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012(\u0010\u0006\u001a$\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00072\u0014\b\b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00050\fH\u0086\b\u00a2\u0006\u0002\u0010\rJJ\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012*\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\b\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0007H\u0086\b\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lgraphics/scenery/compute/OpenCLContext$OpenCLUtils;", "", "()V", "query", "", "T", "fn", "Lkotlin/Function3;", "", "", "", "init", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function3;)[Ljava/lang/Object;", "scenery"})
    public static final class OpenCLUtils {

        private OpenCLUtils() {
            super();
        }

        /**
         * * Convenience wrapper for OpenCL functions that query arrays and are usually
         * * called twice, once for finding the number of elements required for the array
         * * and a second time for filling the array with values. For example:
         * * ```
         * *   val numDevicesArray = IntArray(1);
         * *   clGetDeviceIDs(platform, deviceType, 0, null, numDevicesArray);
         * *   val numDevices = numDevicesArray[0];
         * *   val devices = Array<cl_device_id>(numDevices, {i -> cl_device_id() })
         * *   clGetDeviceIDs(platform, deviceType, numDevices, devices, null);
         * * ```
         * *
         * * This can be replaced by
         * * ```
         * *   val devices = query<cl_device_id>(
         * *   { l, a, n -> clGetDeviceIDs(platform, deviceType, l, a, n) },
         * *   { cl_device_id() })
         * * ```
         * * @param fn
         * *      wraps the cl function to be called (twice),
         * *      taking the parameters num_array_entries, array, num_available_entries.
         * * @param init
         * *      T initializer for creating an Array<T>
         */
        private final <T extends java.lang.Object> T[] query(kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T[], ? super int[], kotlin.Unit> fn, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> init) {
            return null;
        }

        /**
         * * Variant of [query] without array initializer. It creates arrays with nullable entries, and returns Array<T?> instead of Array<T>.
         */
        private final <T extends java.lang.Object> T[] query(kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T[], ? super int[], kotlin.Unit> fn) {
            return null;
        }
    }
}
