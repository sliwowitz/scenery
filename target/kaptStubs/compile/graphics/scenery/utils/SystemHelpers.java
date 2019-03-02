package graphics.scenery.utils;

import java.lang.System;

/**
 * * System helpers class with various utilities for paths,
 * * environment variables, etc.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lgraphics/scenery/utils/SystemHelpers;", "", "()V", "Companion", "scenery"})
public final class SystemHelpers {
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy logger$delegate = null;
    public static final graphics.scenery.utils.SystemHelpers.Companion Companion = null;
    
    public SystemHelpers() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0013J$\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u00172\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lgraphics/scenery/utils/SystemHelpers$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "addFileCounter", "Ljava/io/File;", "f", "overwrite", "", "getPath", "Ljava/nio/file/Path;", "path", "Ljava/net/URI;", "getPathFromString", "", "setEnvironmentVariable", "", "K", "V", "key", "value", "scenery"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.slf4j.Logger getLogger() {
            return null;
        }
        
        /**
         * * Sets environment variables during runtime of the process. This code is fractally nasty,
         *         * but works. Thanks to pushy and mangusbrother at https://stackoverflow.com/a/7201825
         *         *
         *         * @param[key] The name of the environment variable
         *         * @param[value] The value of the environment variable. Null to unset.
         */
        public final <K extends java.lang.Object, V extends java.lang.Object>void setEnvironmentVariable(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
        }
        
        /**
         * * Returns a [Path] from a given string, safely checking whether it's on a file or a jar,
         *         * or whatever filesystem.
         *         *
         *         * @param[path] The file to return a [Path] for.
         *         * @return The [Path] for [path]
         */
        @org.jetbrains.annotations.NotNull()
        public final java.nio.file.Path getPathFromString(@org.jetbrains.annotations.NotNull()
        java.lang.String path) {
            return null;
        }
        
        /**
         * * Returns a [Path] from a given [URI], safely checking whether it's on a file or a jar,
         *         * or whatever filesystem.
         *         *
         *         * @param[path] The URI to return a [Path] for.
         *         * @return The [Path] for [path]
         */
        @org.jetbrains.annotations.NotNull()
        public final java.nio.file.Path getPath(@org.jetbrains.annotations.NotNull()
        java.net.URI path) {
            return null;
        }
        
        /**
         * * Adds a counter to the file given in [f], if it already exists, and
         *         * returns the new file object.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.io.File addFileCounter(@org.jetbrains.annotations.NotNull()
        java.io.File f, boolean overwrite) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}