package graphics.scenery.backends.opengl;

/**
 * * Class to handle OpenGL shader programs, for a context [gl], consisting of [OpenGLShaderModule] [modules].
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0,J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\fJ\u000e\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020\fJ\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u0003J\f\u00105\u001a\u000206*\u00020\u0006H\u0002R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u00067"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLShaderProgram;", "", "gl", "Lcom/jogamp/opengl/GL4;", "modules", "Ljava/util/HashMap;", "Lgraphics/scenery/backends/ShaderType;", "Lgraphics/scenery/backends/opengl/OpenGLShaderModule;", "Lkotlin/collections/HashMap;", "(Lcom/jogamp/opengl/GL4;Ljava/util/HashMap;)V", "blockIndices", "Lgnu/trove/map/hash/THashMap;", "", "", "getGl", "()Lcom/jogamp/opengl/GL4;", "setGl", "(Lcom/jogamp/opengl/GL4;)V", "<set-?>", "id", "getId", "()I", "setId", "(I)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getModules", "()Ljava/util/HashMap;", "program", "Lcleargl/GLProgram;", "getProgram", "()Lcleargl/GLProgram;", "setProgram", "(Lcleargl/GLProgram;)V", "uboSpecs", "Ljava/util/LinkedHashMap;", "Lgraphics/scenery/backends/opengl/OpenGLShaderModule$UBOSpec;", "getUboSpecs", "()Ljava/util/LinkedHashMap;", "getShaderPropertyOrder", "", "getUniform", "Lcleargl/GLUniform;", "name", "getUniformBlockIndex", "isValid", "", "use", "", "toClearGLShaderType", "Lcleargl/GLShaderType;", "scenery"})
public class OpenGLShaderProgram {
    private final kotlin.Lazy logger$delegate = null;
    /**
     * UBO specifications defined by the compiled shader modules.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLShaderModule.UBOSpec> uboSpecs = null;
    private final gnu.trove.map.hash.THashMap<java.lang.String, java.lang.Integer> blockIndices = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<graphics.scenery.backends.ShaderType, graphics.scenery.backends.opengl.OpenGLShaderModule> modules = null;
    /**
     * The ClearGL program object
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLProgram program;
    /**
     * THe OpenGL-internal id of this shader program
     */
    private int id;
    @org.jetbrains.annotations.NotNull()
    private com.jogamp.opengl.GL4 gl;

    public OpenGLShaderProgram(@org.jetbrains.annotations.NotNull()
                                   com.jogamp.opengl.GL4 gl, @org.jetbrains.annotations.NotNull()
                                   java.util.HashMap<graphics.scenery.backends.ShaderType, graphics.scenery.backends.opengl.OpenGLShaderModule> modules) {
        super();
    }

    private final org.slf4j.Logger getLogger() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLProgram getProgram() {
        return null;
    }

    public final void setProgram(@org.jetbrains.annotations.NotNull()
                                     cleargl.GLProgram p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLShaderModule.UBOSpec> getUboSpecs() {
        return null;
    }

    public final int getId() {
        return 0;
    }

    protected final void setId(int p0) {
    }

    /**
     * * Returns true if this shader program has an id > 0, which means
     * * linking was successful, and the program is ready for use.
     */
    public final boolean isValid() {
        return false;
    }

    /**
     * * Attaches this shader program for usage.
     */
    public final void use(@org.jetbrains.annotations.NotNull()
                              com.jogamp.opengl.GL4 gl) {
    }

    /**
     * .
     * * Returns the [GLUniform] associated with [name].
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLUniform getUniform(@org.jetbrains.annotations.NotNull()
                                                  java.lang.String name) {
        return null;
    }

    /**
     * * Returns the [graphics.scenery.ShaderProperty]s of this program in the order required by
     * * the shader/the uniform buffer.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Integer> getShaderPropertyOrder() {
        return null;
    }

    /**
     * * Caches and returns the uniform block index associated with [name].
     * * This information needs to be cached, because especially on macOS, the OpenGL API
     * * call is horribly slow.
     */
    public final int getUniformBlockIndex(@org.jetbrains.annotations.NotNull()
                                              java.lang.String name) {
        return 0;
    }

    private final cleargl.GLShaderType toClearGLShaderType(@org.jetbrains.annotations.NotNull()
                                                               graphics.scenery.backends.ShaderType $receiver) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final com.jogamp.opengl.GL4 getGl() {
        return null;
    }

    public final void setGl(@org.jetbrains.annotations.NotNull()
                                com.jogamp.opengl.GL4 p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<graphics.scenery.backends.ShaderType, graphics.scenery.backends.opengl.OpenGLShaderModule> getModules() {
        return null;
    }
}
