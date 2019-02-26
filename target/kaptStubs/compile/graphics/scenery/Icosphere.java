package graphics.scenery;

/**
 * * Constructs a Icosphere with the given [radius] and number of [subdivisions].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>, based on code by Andreas Kahler, http://blog.andreaskahler.com/2009/06/creating-icosphere-mesh-in-code.html
 * * @param[radius] The radius of the sphere
 * * @param[subdivisions] Number of subdivisions of the base icosahedron
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J6\u0010+\u001a\u00020,2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020.0-2\u001e\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060/0-H\u0004JV\u00100\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060/012\u0006\u00102\u001a\u00020\u00062\f\u0010(\u001a\b\u0012\u0004\u0012\u00020.0-2\u001e\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060/0-H\u0004J:\u00103\u001a\u00020,*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060/0-2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0006J\u001a\u00107\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020.0-2\u0006\u00108\u001a\u00020.H\u0004J\u001c\u00107\u001a\u00020,*\b\u0012\u0004\u0012\u00020.0-2\n\u00108\u001a\u000209\"\u00020\u0004J\"\u0010:\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0004R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u0018X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u0014\u0010&\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010 R\u001a\u0010(\u001a\u00020\u0018X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001c\u00a8\u0006="}, d2 = {"Lgraphics/scenery/Icosphere;", "Lgraphics/scenery/Node;", "Lgraphics/scenery/HasGeometry;", "radius", "", "subdivisions", "", "(FI)V", "geometryType", "Lgraphics/scenery/GeometryType;", "getGeometryType", "()Lgraphics/scenery/GeometryType;", "setGeometryType", "(Lgraphics/scenery/GeometryType;)V", "indices", "Ljava/nio/IntBuffer;", "getIndices", "()Ljava/nio/IntBuffer;", "setIndices", "(Ljava/nio/IntBuffer;)V", "middlePointIndexCache", "Ljava/util/HashMap;", "", "normals", "Ljava/nio/FloatBuffer;", "getNormals", "()Ljava/nio/FloatBuffer;", "setNormals", "(Ljava/nio/FloatBuffer;)V", "getRadius", "()F", "getSubdivisions", "()I", "texcoordSize", "getTexcoordSize", "texcoords", "getTexcoords", "setTexcoords", "vertexSize", "getVertexSize", "vertices", "getVertices", "setVertices", "createBaseVertices", "", "", "Lcleargl/GLVector;", "Lkotlin/Triple;", "refineTriangles", "", "recursionLevel", "addFace", "i", "j", "k", "addVertex", "v", "", "getMiddlePoint", "p1", "p2", "scenery"})
public class Icosphere extends graphics.scenery.Node implements graphics.scenery.HasGeometry {
    private final int vertexSize = 3;
    private final int texcoordSize = 2;
    private final java.util.HashMap<java.lang.Long, java.lang.Integer> middlePointIndexCache = null;
    private final float radius = 0.0F;
    private final int subdivisions = 0;
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

    public Icosphere(float radius, int subdivisions) {
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

    public final void addVertex(@org.jetbrains.annotations.NotNull()
                                    java.util.List<cleargl.GLVector> $receiver, @org.jetbrains.annotations.NotNull()
                                    float... v) {
    }

    public final void addFace(@org.jetbrains.annotations.NotNull()
                                  java.util.List<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> $receiver, int i, int j, int k) {
    }

    protected final void createBaseVertices(@org.jetbrains.annotations.NotNull()
                                                java.util.List<cleargl.GLVector> vertices, @org.jetbrains.annotations.NotNull()
                                                java.util.List<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> indices) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> refineTriangles(int recursionLevel, @org.jetbrains.annotations.NotNull()
        java.util.List<cleargl.GLVector> vertices, @org.jetbrains.annotations.NotNull()
                                                                                                                               java.util.List<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> indices) {
        return null;
    }

    protected final int addVertex(@org.jetbrains.annotations.NotNull()
                                      java.util.List<cleargl.GLVector> $receiver, @org.jetbrains.annotations.NotNull()
                                      cleargl.GLVector v) {
        return 0;
    }

    protected final int getMiddlePoint(@org.jetbrains.annotations.NotNull()
                                           java.util.List<cleargl.GLVector> $receiver, int p1, int p2) {
        return 0;
    }

    public final float getRadius() {
        return 0.0F;
    }

    public final int getSubdivisions() {
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
