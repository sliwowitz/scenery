package graphics.scenery;

/**
 * * Class for creating 3D lines, derived from [Node] and using [HasGeometry]
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0016J\u0006\u0010H\u001a\u00020FR$\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0005R$\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R$\u0010(\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\b\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010,\u001a\u00020-X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b3\u0010\b\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001bR\u0014\u00106\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\nR\u001a\u00108\u001a\u00020-X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010/\"\u0004\b:\u00101R,\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00048\u0006@BX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b=\u0010\b\u001a\u0004\b>\u0010\n\"\u0004\b?\u0010\u0005R\u0014\u0010@\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\nR\u001a\u0010B\u001a\u00020-X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010/\"\u0004\bD\u00101\u00a8\u0006I"}, d2 = {"Lgraphics/scenery/Line;", "Lgraphics/scenery/Node;", "Lgraphics/scenery/HasGeometry;", "capacity", "", "(I)V", "capLength", "capLength$annotations", "()V", "getCapLength", "()I", "setCapLength", "getCapacity", "setCapacity", "edgeWidth", "", "edgeWidth$annotations", "getEdgeWidth", "()F", "setEdgeWidth", "(F)V", "endColor", "Lcleargl/GLVector;", "endColor$annotations", "getEndColor", "()Lcleargl/GLVector;", "setEndColor", "(Lcleargl/GLVector;)V", "geometryType", "Lgraphics/scenery/GeometryType;", "getGeometryType", "()Lgraphics/scenery/GeometryType;", "setGeometryType", "(Lgraphics/scenery/GeometryType;)V", "indices", "Ljava/nio/IntBuffer;", "getIndices", "()Ljava/nio/IntBuffer;", "setIndices", "(Ljava/nio/IntBuffer;)V", "lineColor", "lineColor$annotations", "getLineColor", "setLineColor", "normals", "Ljava/nio/FloatBuffer;", "getNormals", "()Ljava/nio/FloatBuffer;", "setNormals", "(Ljava/nio/FloatBuffer;)V", "startColor", "startColor$annotations", "getStartColor", "setStartColor", "texcoordSize", "getTexcoordSize", "texcoords", "getTexcoords", "setTexcoords", "<set-?>", "vertexCount", "vertexCount$annotations", "getVertexCount", "setVertexCount", "vertexSize", "getVertexSize", "vertices", "getVertices", "setVertices", "addPoint", "", "p", "clearPoints", "scenery"})
public final class Line extends graphics.scenery.Node implements graphics.scenery.HasGeometry {

    /**
     * Size of one vertex (e.g. 3 in 3D)
     */
    private final int vertexSize = 3;

    /**
     * Size of one texcoord (e.g. 2 in 3D)
     */
    private final int texcoordSize = 2;

    /**
     * Geometry type -- Default for Line is [GeometryType.LINE]
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.GeometryType geometryType;

    /**
     * Vertex buffer
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer vertices;

    /**
     * Normal buffer
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer normals;

    /**
     * Texcoord buffer
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer texcoords;

    /**
     * Index buffer
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.IntBuffer indices;

    /**
     * Shader property for the line's starting segment color. Consumed by the renderer.
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector startColor;

    /**
     * Shader property for the line's color. Consumed by the renderer.
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector lineColor;

    /**
     * Shader property for the line's end segment color. Consumed by the renderer.
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector endColor;

    /**
     * Shader property for the line's cap length (start and end caps). Consumed by the renderer.
     */
    private int capLength;

    /**
     * Shader property to keep track of the current number of vertices. Consumed by the renderer.
     */
    private int vertexCount;

    /**
     * Shader property for the line's edge width. Consumed by the renderer.
     */
    private float edgeWidth;
    private int capacity;

    public Line(int capacity) {
        super(null);
    }

    public Line() {
        super(null);
    }

    @ShaderProperty()
    public static void startColor$annotations() {
    }

    @ShaderProperty()
    public static void lineColor$annotations() {
    }

    @ShaderProperty()
    public static void endColor$annotations() {
    }

    @ShaderProperty()
    public static void capLength$annotations() {
    }

    @ShaderProperty()
    public static void vertexCount$annotations() {
    }

    @ShaderProperty()
    public static void edgeWidth$annotations() {
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

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getStartColor() {
        return null;
    }

    public final void setStartColor(@org.jetbrains.annotations.NotNull()
                                        cleargl.GLVector p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getLineColor() {
        return null;
    }

    public final void setLineColor(@org.jetbrains.annotations.NotNull()
                                       cleargl.GLVector p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getEndColor() {
        return null;
    }

    public final void setEndColor(@org.jetbrains.annotations.NotNull()
                                      cleargl.GLVector p0) {
    }

    public final int getCapLength() {
        return 0;
    }

    public final void setCapLength(int p0) {
    }

    public final int getVertexCount() {
        return 0;
    }

    private final void setVertexCount(int p0) {
    }

    public final float getEdgeWidth() {
        return 0.0F;
    }

    public final void setEdgeWidth(float p0) {
    }

    /**
     * * Adds a line point to the line.
     * *
     * * @param p     The vector containing the vertex data
     */
    public final void addPoint(@org.jetbrains.annotations.NotNull()
                                   cleargl.GLVector p) {
    }

    /**
     * * Fully clears the line.
     */
    public final void clearPoints() {
    }

    public final int getCapacity() {
        return 0;
    }

    public final void setCapacity(int p0) {
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
