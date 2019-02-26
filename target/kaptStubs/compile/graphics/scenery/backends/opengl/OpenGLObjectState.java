package graphics.scenery.backends.opengl;

/**
 * * OpenGLObjectState stores the OpenGL metadata that is needed for rendering a node
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @constructor Creates an empty OpenGLObjectState, with [OpenGLRenderer] as
 * *  default consumers.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u0011\u0010\'\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001a\u0010.\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u0011\u00101\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0011\u00103\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020=0<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020D0CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H\u00a8\u0006I"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLObjectState;", "Lgraphics/scenery/NodeMetadata;", "()V", "UBOs", "Ljava/util/LinkedHashMap;", "", "Lgraphics/scenery/backends/opengl/OpenGLUBO;", "getUBOs", "()Ljava/util/LinkedHashMap;", "setUBOs", "(Ljava/util/LinkedHashMap;)V", "additionalBufferIds", "Ljava/util/Hashtable;", "", "getAdditionalBufferIds", "()Ljava/util/Hashtable;", "consumers", "", "getConsumers", "()Ljava/util/List;", "defaultTexturesFor", "Ljava/util/HashSet;", "getDefaultTexturesFor", "()Ljava/util/HashSet;", "setDefaultTexturesFor", "(Ljava/util/HashSet;)V", "initialized", "", "getInitialized", "()Z", "setInitialized", "(Z)V", "instanceCount", "getInstanceCount", "()I", "setInstanceCount", "(I)V", "isDynamic", "setDynamic", "mIndexBuffer", "", "getMIndexBuffer", "()[I", "mStoredIndexCount", "getMStoredIndexCount", "setMStoredIndexCount", "mStoredPrimitiveCount", "getMStoredPrimitiveCount", "setMStoredPrimitiveCount", "mVertexArrayObject", "getMVertexArrayObject", "mVertexBuffers", "getMVertexBuffers", "shader", "Lgraphics/scenery/backends/opengl/OpenGLShaderProgram;", "getShader", "()Lgraphics/scenery/backends/opengl/OpenGLShaderProgram;", "setShader", "(Lgraphics/scenery/backends/opengl/OpenGLShaderProgram;)V", "textures", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcleargl/GLTexture;", "getTextures", "()Ljava/util/concurrent/ConcurrentHashMap;", "setTextures", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "vertexBuffers", "Ljava/util/HashMap;", "Ljava/nio/ByteBuffer;", "getVertexBuffers", "()Ljava/util/HashMap;", "setVertexBuffers", "(Ljava/util/HashMap;)V", "scenery"})
public final class OpenGLObjectState implements graphics.scenery.NodeMetadata {

    /**
     * List of consumers of this metadata, e.g. [OpenGLRenderer]
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> consumers = null;

    /**
     * IDs of buffers that may be additionally required.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Hashtable<java.lang.String, java.lang.Integer> additionalBufferIds = null;
    /**
     * VAO storage.
     */
    @org.jetbrains.annotations.NotNull()
    private final int[] mVertexArrayObject = null;
    /**
     * VBO storage.
     */
    @org.jetbrains.annotations.NotNull()
    private final int[] mVertexBuffers = null;
    /**
     * Index buffer storage.
     */
    @org.jetbrains.annotations.NotNull()
    private final int[] mIndexBuffer = null;
    /**
     * Hash map of GLTexture objects storing the OpenGL texture handles.
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, cleargl.GLTexture> textures;
    /**
     * Whether the object is dynamic, e.g. has its vertices regularly updated.
     */
    private boolean isDynamic;

    /**
     * Whether the object has been initialised yet.
     */
    private boolean initialized;

    /**
     * Number of stores indices.
     */
    private int mStoredIndexCount;

    /**
     * Number of stored vertex/normal/texcoord primitives.
     */
    private int mStoredPrimitiveCount;

    /**
     * OpenGL UBOs
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLUBO> UBOs;

    /**
     * are we missing textures?
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.HashSet<java.lang.String> defaultTexturesFor;

    /**
     * shader to use for the program
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.backends.opengl.OpenGLShaderProgram shader;

    /**
     * instance count
     */
    private int instanceCount;

    /**
     * buffer storage
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.String, java.nio.ByteBuffer> vertexBuffers;

    public OpenGLObjectState() {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getConsumers() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.Hashtable<java.lang.String, java.lang.Integer> getAdditionalBufferIds() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, cleargl.GLTexture> getTextures() {
        return null;
    }

    public final void setTextures(@org.jetbrains.annotations.NotNull()
                                      java.util.concurrent.ConcurrentHashMap<java.lang.String, cleargl.GLTexture> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final int[] getMVertexArrayObject() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final int[] getMVertexBuffers() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final int[] getMIndexBuffer() {
        return null;
    }

    public final boolean isDynamic() {
        return false;
    }

    public final void setDynamic(boolean p0) {
    }

    public final boolean getInitialized() {
        return false;
    }

    public final void setInitialized(boolean p0) {
    }

    public final int getMStoredIndexCount() {
        return 0;
    }

    public final void setMStoredIndexCount(int p0) {
    }

    public final int getMStoredPrimitiveCount() {
        return 0;
    }

    public final void setMStoredPrimitiveCount(int p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLUBO> getUBOs() {
        return null;
    }

    public final void setUBOs(@org.jetbrains.annotations.NotNull()
                                  java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLUBO> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.HashSet<java.lang.String> getDefaultTexturesFor() {
        return null;
    }

    public final void setDefaultTexturesFor(@org.jetbrains.annotations.NotNull()
                                                java.util.HashSet<java.lang.String> p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.backends.opengl.OpenGLShaderProgram getShader() {
        return null;
    }

    public final void setShader(@org.jetbrains.annotations.Nullable()
                                    graphics.scenery.backends.opengl.OpenGLShaderProgram p0) {
    }

    public final int getInstanceCount() {
        return 0;
    }

    public final void setInstanceCount(int p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.nio.ByteBuffer> getVertexBuffers() {
        return null;
    }

    public final void setVertexBuffers(@org.jetbrains.annotations.NotNull()
                                           java.util.HashMap<java.lang.String, java.nio.ByteBuffer> p0) {
    }
}
