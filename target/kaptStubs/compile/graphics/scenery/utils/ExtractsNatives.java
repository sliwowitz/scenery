package graphics.scenery.utils;

import java.lang.System;

/**
 * * Helper interface for classes which might need to extract native libraries.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eJ\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0016\u00a8\u0006\u000f"}, d2 = {"Lgraphics/scenery/utils/ExtractsNatives;", "", "cleanTempFiles", "", "extractLibrariesFromJar", "paths", "", "", "replace", "", "getNativeJars", "searchName", "hint", "Companion", "Platform", "scenery"})
public abstract interface ExtractsNatives {
    public static final graphics.scenery.utils.ExtractsNatives.Companion Companion = null;
    
    /**
     * * Cleans old temporary native libraries, e.g. all directories in the temporary directory,
     *     * which have "scenery-natives-tmp" in their name, and do not have a lock file present.
     */
    public abstract void cleanTempFiles();
    
    /**
     * * Utility function to extract native libraries from a given JAR, store them in a
     *     * temporary directory and modify the JRE's library path such that it can find
     *     * these libraries.
     *     *
     *     * @param[paths] A list of JAR paths to extract natives from.
     *     * @param[replace] Whether or not the java.library.path should be replaced.
     */
    public abstract void extractLibrariesFromJar(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> paths, boolean replace);
    
    /**
     * * Utility function to search the current class path for JARs with native libraries
     *     *
     *     * @param[searchName] The string to match the JAR's name against
     *     * @param[hint] A file name to look for, for the ImageJ classpath hack
     *     * @return A list of JARs matching [searchName]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getNativeJars(@org.jetbrains.annotations.NotNull()
    java.lang.String searchName, @org.jetbrains.annotations.NotNull()
    java.lang.String hint);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/utils/ExtractsNatives$Platform;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "WINDOWS", "LINUX", "MACOS", "scenery"})
    public static enum Platform {
        /*public static final*/ UNKNOWN /* = new UNKNOWN() */,
        /*public static final*/ WINDOWS /* = new WINDOWS() */,
        /*public static final*/ LINUX /* = new LINUX() */,
        /*public static final*/ MACOS /* = new MACOS() */;
        
        Platform() {
        }
    }
    
    /**
     * * Helper interface for classes which might need to extract native libraries.
     * *
     * * @author Ulrik Günther <hello@ulrik.is>
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        /**
         * * Cleans old temporary native libraries, e.g. all directories in the temporary directory,
         *     * which have "scenery-natives-tmp" in their name, and do not have a lock file present.
         */
        public static void cleanTempFiles(graphics.scenery.utils.ExtractsNatives $this) {
        }
        
        /**
         * * Utility function to extract native libraries from a given JAR, store them in a
         *     * temporary directory and modify the JRE's library path such that it can find
         *     * these libraries.
         *     *
         *     * @param[paths] A list of JAR paths to extract natives from.
         *     * @param[replace] Whether or not the java.library.path should be replaced.
         */
        public static void extractLibrariesFromJar(graphics.scenery.utils.ExtractsNatives $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> paths, boolean replace) {
        }
        
        /**
         * * Utility function to search the current class path for JARs with native libraries
         *     *
         *     * @param[searchName] The string to match the JAR's name against
         *     * @param[hint] A file name to look for, for the ImageJ classpath hack
         *     * @return A list of JARs matching [searchName]
         */
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<java.lang.String> getNativeJars(graphics.scenery.utils.ExtractsNatives $this, @org.jetbrains.annotations.NotNull()
        java.lang.String searchName, @org.jetbrains.annotations.NotNull()
        java.lang.String hint) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lgraphics/scenery/utils/ExtractsNatives$Companion;", "", "()V", "getPlatform", "Lgraphics/scenery/utils/ExtractsNatives$Platform;", "scenery"})
    public static final class Companion {
        
        /**
         * * Returns the platform based on the os.name system property.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.utils.ExtractsNatives.Platform getPlatform() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}