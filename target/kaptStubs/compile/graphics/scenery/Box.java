package graphics.scenery;

/**
 * * Constructs a Box [Node] with the dimensions given in [sizes]
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[sizes] The x/y/z sizes of the box
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0017X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001a\u0010\'\u001a\u00020\u001fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010*\u001a\u00020\u0017X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001b\u00a8\u0006-"}, d2 = {"Lgraphics/scenery/Box;", "Lgraphics/scenery/Mesh;", "Lgraphics/scenery/HasGeometry;", "sizes", "Lcleargl/GLVector;", "insideNormals", "", "(Lcleargl/GLVector;Z)V", "geometryType", "Lgraphics/scenery/GeometryType;", "getGeometryType", "()Lgraphics/scenery/GeometryType;", "setGeometryType", "(Lgraphics/scenery/GeometryType;)V", "indices", "Ljava/nio/IntBuffer;", "getIndices", "()Ljava/nio/IntBuffer;", "setIndices", "(Ljava/nio/IntBuffer;)V", "getInsideNormals", "()Z", "normals", "Ljava/nio/FloatBuffer;", "getNormals", "()Ljava/nio/FloatBuffer;", "setNormals", "(Ljava/nio/FloatBuffer;)V", "getSizes", "()Lcleargl/GLVector;", "texcoordSize", "", "getTexcoordSize", "()I", "setTexcoordSize", "(I)V", "texcoords", "getTexcoords", "setTexcoords", "vertexSize", "getVertexSize", "setVertexSize", "vertices", "getVertices", "setVertices", "scenery"})
public class Box extends graphics.scenery.Mesh implements graphics.scenery.HasGeometry {
    @org.jetbrains.annotations.NotNull()
    private final cleargl.GLVector sizes = null;
    private final boolean insideNormals = false;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer vertices;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer normals;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer texcoords;
    @org.jetbrains.annotations.NotNull()
    private java.nio.IntBuffer indices;
    private int vertexSize;
    private int texcoordSize;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.GeometryType geometryType;

    public Box(@org.jetbrains.annotations.NotNull()
                   cleargl.GLVector sizes, boolean insideNormals) {
        super(null);
    }

    public Box(@org.jetbrains.annotations.NotNull()
                   cleargl.GLVector sizes) {
        super(null);
    }

    public Box() {
        super(null);
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.nio.FloatBuffer getVertices() {
        return null;
    }

    @java.lang.Override()
    public void setVertices(@org.jetbrains.annotations.NotNull()
                                java.nio.FloatBuffer p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.nio.FloatBuffer getNormals() {
        return null;
    }

    @java.lang.Override()
    public void setNormals(@org.jetbrains.annotations.NotNull()
                               java.nio.FloatBuffer p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.nio.FloatBuffer getTexcoords() {
        return null;
    }

    @java.lang.Override()
    public void setTexcoords(@org.jetbrains.annotations.NotNull()
                                 java.nio.FloatBuffer p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.nio.IntBuffer getIndices() {
        return null;
    }

    @java.lang.Override()
    public void setIndices(@org.jetbrains.annotations.NotNull()
                               java.nio.IntBuffer p0) {
    }

    @java.lang.Override()
    public int getVertexSize() {
        return 0;
    }

    @java.lang.Override()
    public void setVertexSize(int p0) {
    }

    @java.lang.Override()
    public int getTexcoordSize() {
        return 0;
    }

    @java.lang.Override()
    public void setTexcoordSize(int p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.GeometryType getGeometryType() {
        return null;
    }

    @java.lang.Override()
    public void setGeometryType(@org.jetbrains.annotations.NotNull()
                                    graphics.scenery.GeometryType p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getSizes() {
        return null;
    }

    public final boolean getInsideNormals() {
        return false;
    }
}
