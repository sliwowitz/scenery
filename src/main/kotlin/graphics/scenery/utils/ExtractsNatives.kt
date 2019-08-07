package graphics.scenery.utils;

import org.slf4j.LoggerFactory
import java.io.File
import java.io.FileOutputStream
import java.nio.file.Files


/**
 * Helper interface for classes which might need to extract native libraries.
 *
 * @author Ulrik Günther <hello@ulrik.is>
 */
interface ExtractsNatives {
    enum class Platform {
        UNKNOWN, WINDOWS, LINUX, MACOS
    }

    companion object {
    /**
     * Returns the platform based on the os.name system property.
     */
    fun getPlatform(): Platform {
        val os = System.getProperty("os.name").toLowerCase()

        when {
            os.contains("win") -> return Platform.WINDOWS
            os.contains("linux") -> return Platform.LINUX
            os.contains("mac") -> return Platform.MACOS
            else -> return Platform.UNKNOWN
        }

    }
    }

    /**
     * Cleans old temporary native libraries, e.g. all directories in the temporary directory,
     * which have "scenery-natives-tmp" in their name, and do not have a lock file present.
     */
    fun cleanTempFiles() {
        File(System.getProperty("java.io.tmpdir")).listFiles().forEach { file ->
            if (file.isDirectory && file.name.contains("scenery-natives-tmp")) {
                val lock = File(file, ".lock")

                // delete the temporary directory only if the lock does not exist
                if (!lock.exists()) {
                    file.deleteRecursively()
                }
            }
        }
    }

    /**
     * Utility function to search the current class path for JARs with native libraries
     *
     * @param[searchName] The string to match the JAR's name against
     * @param[hint] A file name to look for, for the ImageJ classpath hack
     * @return A list of JARs matching [searchName]
     */
    fun loadNativeFromJar(names: List<String>, setJInputPath: Boolean = false): Boolean {
        try {
            cleanTempFiles()
            val tmpDir = Files.createTempDirectory("scenery-natives-tmp").toFile()
            val lockfile = File(tmpDir, ".lock")
            lockfile.createNewFile()
            lockfile.deleteOnExit()

            if(setJInputPath) {
                System.setProperty("net.java.games.input.librarypath", tmpDir.canonicalPath)
            }

            names.forEach { name ->
                val res = Thread.currentThread().contextClassLoader.getResourceAsStream(name)

                if (res == null) {
                    LoggerFactory.getLogger(this.javaClass.simpleName).error("Could not find JAR with native libraries for $name")
                    return false
                }

                val nativeFile = File(tmpDir, name)
                val fos = FileOutputStream(nativeFile)
                res.copyTo(fos)
                fos.close()

                System.load(nativeFile.canonicalPath)
            }

            return true
        } catch (e: Exception) {
            LoggerFactory.getLogger(this.javaClass.simpleName).error("Failed to extract native libraries ${names.joinToString(",")} with exception $e")
            return false
        }
    }
}
