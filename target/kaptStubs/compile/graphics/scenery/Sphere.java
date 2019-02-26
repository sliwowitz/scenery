package graphics.scenery;

/**
 * * Constructs a sphere with the given [radius] and number of [segments].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @param[radius] The radius of the sphere
 * * @param[segments] Number of segments in latitude and longitude.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J!\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040)H\u0002\u00a2\u0006\u0002\u0010+J+\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040)2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010/R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u001a\u0010%\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b\'\u0010\u0019\u00a8\u00060"}, d2 = {"Lgraphics/scenery/Sphere;", "Lgraphics/scenery/Node;", "Lgraphics/scenery/HasGeometry;", "radius", "", "segments", "", "(FI)V", "geometryType", "Lgraphics/scenery/GeometryType;", "getGeometryType", "()Lgraphics/scenery/GeometryType;", "setGeometryType", "(Lgraphics/scenery/GeometryType;)V", "indices", "Ljava/nio/IntBuffer;", "getIndices", "()Ljava/nio/IntBuffer;", "setIndices", "(Ljava/nio/IntBuffer;)V", "normals", "Ljava/nio/FloatBuffer;", "getNormals", "()Ljava/nio/FloatBuffer;", "setNormals", "(Ljava/nio/FloatBuffer;)V", "getRadius", "()F", "getSegments", "()I", "texcoordSize", "getTexcoordSize", "texcoords", "getTexcoords", "setTexcoords", "vertexSize", "getVertexSize", "vertices", "getVertices", "setVertices", "uvOnSphere", "", "normal", "([Ljava/lang/Float;)[Ljava/lang/Float;", "vertexOnSphere", "theta", "phi", "(FFF)[Ljava/lang/Float;", "scenery"})
public class Sphere extends graphics.scenery.Node implements graphics.scenery.HasGeometry {
    private final int vertexSize = 3;
    private final int texcoordSize = 2;
    private final float radius = 0.0F;
    private final int segments = 0;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.GeometryType geometryType;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer vertices;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer normals;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer texcoords;
    @org.jetbrains.annotations.NotNull()
    private java.nio.IntBuffer indices;

    public Sphere(float radius, int segments) {
        super(null);
    }

    @java.lang.Override()
    public int getVertexSize() {
        return 0;
    }

    @java.lang.Override()
    public int getTexcoordSize() {
        return 0;
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
    @java.lang.Override()
    public final java.nio.FloatBuffer getVertices() {
        return null;
    }

    @java.lang.Override()
    public final void setVertices(@org.jetbrains.annotations.NotNull()
                                      java.nio.FloatBuffer p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final java.nio.FloatBuffer getNormals() {
        return null;
    }

    @java.lang.Override()
    public final void setNormals(@org.jetbrains.annotations.NotNull()
                                     java.nio.FloatBuffer p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final java.nio.FloatBuffer getTexcoords() {
        return null;
    }

    @java.lang.Override()
    public final void setTexcoords(@org.jetbrains.annotations.NotNull()
                                       java.nio.FloatBuffer p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final java.nio.IntBuffer getIndices() {
        return null;
    }

    @java.lang.Override()
    public final void setIndices(@org.jetbrains.annotations.NotNull()
                                     java.nio.IntBuffer p0) {
    }

    /**
     * * Creates a vertex on a sphere with radius [radius], and angles [theta] and [phi].
     * *
     * * @param[radius] The radius of the sphere
     * * @param[theta] Theta coordinate, in interval [0, PI]
     * * @param[phi] Phi coordinate, in interval [0, 2PI]
     * *
     * * @return Vertex on a sphere, in cartesian coordinates
     */
    private final java.lang.Float[] vertexOnSphere(float radius, float theta, float phi) {
        return null;
    }

    /**
     * * Creates UV coordinates for a given surface normal that is assumed to be
     * * on a sphere.
     * *
     * * @param[normal] Normal vector on a sphere.
     * *
     * * @return UV coordinates in [0.0, 1.0] range.
     */
    private final java.lang.Float[] uvOnSphere(java.lang.Float[] normal) {
        return null;
    }

    public final float getRadius() {
        return 0.0F;
    }

    public final int getSegments() {
        return 0;
    }

    /**
     * * Reads geometry from a file given by [filename]. The extension of [filename] will determine
     * * whether the file will be read by [readFromOBJ] or [readFromSTL].
     * *
     * * Materials will be automatically used, if present.
     */
    public void readFrom(@org.jetbrains.annotations.NotNull()
                             java.lang.String filename) {
    }

    /**
     * * Reads geometry from a file given by [filename]. The extension of [filename] will determine
     * * whether the file will be read by [readFromOBJ] or [readFromSTL].
     * *
     * * Materials will be used, if present and [useMaterial] is true.
     */
    public void readFrom(@org.jetbrains.annotations.NotNull()
                             java.lang.String filename, boolean useMaterial) {
    }

    /**
     * * Reads an OBJ file's material properties from the corresponding MTL file
     * *
     * * @param[filename] The filename of the MTL file, stored in the OBJ usually
     * * @return A HashMap storing material name and [Material].
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.HashMap<java.lang.String, graphics.scenery.Material> readFromMTL(@org.jetbrains.annotations.NotNull()
                                                                                          java.lang.String filename) {
        return null;
    }

    /**
     * * Read the [Node]'s geometry from an OBJ file, including materials
     * *
     * * @param[filename] The filename to read from.
     */
    public void readFromOBJ(@org.jetbrains.annotations.NotNull()
                                java.lang.String filename) {
    }

    /**
     * * Read the [Node]'s geometry from an OBJ file, and choose whether the OBJ-defined materials shall be imported.
     * *
     * * @param[filename] The filename to read from.
     * * @param[importMaterials] Whether a accompanying MTL file shall be used, defaults to true.
     */
    public void readFromOBJ(@org.jetbrains.annotations.NotNull()
                                java.lang.String filename, boolean importMaterials) {
    }

    /**
     * * Read the [Node]'s geometry from an OBJ file, possible including materials
     * *
     * * @param[filename] The filename to read from.
     * * @param[importMaterials] Whether a accompanying MTL file shall be used, defaults to true.
     * * @param[flipNormals] Whether to flip the normals after reading them.
     */
    public void readFromOBJ(@org.jetbrains.annotations.NotNull()
                                java.lang.String filename, boolean importMaterials, boolean flipNormals) {
    }

    /**
     * * Read the [Node]'s geometry from an STL file
     * *
     * * @param[filename] The filename to read from.
     */
    public void readFromSTL(@org.jetbrains.annotations.NotNull()
                                java.lang.String filename) {
    }

    /**
     * * Recalculates normals, assuming CCW winding order and taking
     * * STL's facet storage format into account.
     */
    public void recalculateNormals() {
    }
}
