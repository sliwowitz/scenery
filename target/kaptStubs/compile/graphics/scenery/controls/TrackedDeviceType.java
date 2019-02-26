package graphics.scenery.controls;

/**
 * * Enum class for the types of devices that can be tracked.
 * * Includes HMDs, controllers, base stations, generic devices, and invalid ones for the moment.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/controls/TrackedDeviceType;", "", "(Ljava/lang/String;I)V", "Invalid", "HMD", "Controller", "BaseStation", "Generic", "scenery"})
public enum TrackedDeviceType {
    /*public static final*/ Invalid /* = new Invalid() */,
    /*public static final*/ HMD /* = new HMD() */,
    /*public static final*/ Controller /* = new Controller() */,
    /*public static final*/ BaseStation /* = new BaseStation() */,
    /*public static final*/ Generic /* = new Generic() */;

    TrackedDeviceType() {
    }
}
