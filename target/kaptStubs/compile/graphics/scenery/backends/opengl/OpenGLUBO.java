package graphics.scenery.backends.opengl;

import java.lang.System;

/**
 * * UBO class for OpenGL
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\r\u001a\u00020\u0017JF\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u00172.\u0010\u001b\u001a*\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001cj\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e` J\u0006\u0010!\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f\u00a8\u0006\""}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLUBO;", "Lgraphics/scenery/backends/UBO;", "backingBuffer", "Lgraphics/scenery/backends/opengl/OpenGLRenderer$OpenGLBuffer;", "(Lgraphics/scenery/backends/opengl/OpenGLRenderer$OpenGLBuffer;)V", "getBackingBuffer", "()Lgraphics/scenery/backends/opengl/OpenGLRenderer$OpenGLBuffer;", "binding", "", "getBinding", "()I", "setBinding", "(I)V", "offset", "getOffset", "setOffset", "advanceBackingBuffer", "fromInstance", "", "node", "Lgraphics/scenery/Node;", "populate", "", "", "populateParallel", "bufferView", "Ljava/nio/ByteBuffer;", "elements", "Ljava/util/LinkedHashMap;", "", "Lkotlin/Function0;", "", "Lkotlin/collections/LinkedHashMap;", "setOffsetFromBackingBuffer", "scenery"})
public final class OpenGLUBO extends graphics.scenery.backends.UBO {
    private int offset;
    private int binding;
    @org.jetbrains.annotations.Nullable()
    private final graphics.scenery.backends.opengl.OpenGLRenderer.OpenGLBuffer backingBuffer = null;
    
    public final int getOffset() {
        return 0;
    }
    
    public final void setOffset(int p0) {
    }
    
    public final int getBinding() {
        return 0;
    }
    
    public final void setBinding(int p0) {
    }
    
    /**
     * * Populates the [backingBuffer] with the members of this UBO, subject to the determined
     *     * sizes and alignments. A buffer [offset] can be given. This routine checks via it's super
     *     * if an actual buffer update is required, and if not, will just set the buffer to the
     *     * cached position. Otherwise it will serialise all the members into [backingBuffer].
     *     *
     *     * Returns true if [backingBuffer] has been updated, and false if not.
     */
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final boolean populate(long offset) {
        return false;
    }
    
    /**
     * * Populates the [bufferView] with the members of this UBO, subject to the determined
     *     * sizes and alignments in a parallelized manner. A buffer [offset] can be given, as well as
     *     * a list of [elements], overriding the UBO's members. This routine checks via it's super
     *     * if an actual buffer update is required, and if not, will just set the buffer to the
     *     * cached position. Otherwise it will serialise all the members into [bufferView].
     *     *
     *     * Returns true if [bufferView] has been updated, and false if not.
     */
    public final boolean populateParallel(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer bufferView, long offset, @org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> elements) {
        return false;
    }
    
    /**
     * * Creates this UBO's members from the instancedProperties of [node].
     */
    public final void fromInstance(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Node node) {
    }
    
    /**
     * * Sets the [offset] of this UBO to the one from the [backingBuffer].
     */
    public final void setOffsetFromBackingBuffer() {
    }
    
    public final int advanceBackingBuffer() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.backends.opengl.OpenGLRenderer.OpenGLBuffer getBackingBuffer() {
        return null;
    }
    
    public OpenGLUBO(@org.jetbrains.annotations.Nullable()
    graphics.scenery.backends.opengl.OpenGLRenderer.OpenGLBuffer backingBuffer) {
        super();
    }
    
    public OpenGLUBO() {
        super();
    }
}