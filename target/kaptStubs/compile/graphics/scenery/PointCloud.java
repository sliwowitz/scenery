package graphics.scenery;

import java.lang.System;

/**
 * * Constructs a point cloud, with a given base [pointRadius].
 * *
 * * @author Kyle Harrington <kharrington@uidaho.edu>
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0006J\u0006\u00109\u001a\u000207R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u001eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\u001a\u00100\u001a\u00020(X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001a\u00103\u001a\u00020\u001eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"\u00a8\u0006:"}, d2 = {"Lgraphics/scenery/PointCloud;", "Lgraphics/scenery/Node;", "Lgraphics/scenery/HasGeometry;", "pointRadius", "", "name", "", "(FLjava/lang/String;)V", "geometryType", "Lgraphics/scenery/GeometryType;", "getGeometryType", "()Lgraphics/scenery/GeometryType;", "setGeometryType", "(Lgraphics/scenery/GeometryType;)V", "indices", "Ljava/nio/IntBuffer;", "getIndices", "()Ljava/nio/IntBuffer;", "setIndices", "(Ljava/nio/IntBuffer;)V", "isBillboard", "", "()Z", "setBillboard", "(Z)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "normals", "Ljava/nio/FloatBuffer;", "getNormals", "()Ljava/nio/FloatBuffer;", "setNormals", "(Ljava/nio/FloatBuffer;)V", "getPointRadius", "()F", "setPointRadius", "(F)V", "texcoordSize", "", "getTexcoordSize", "()I", "setTexcoordSize", "(I)V", "texcoords", "getTexcoords", "setTexcoords", "vertexSize", "getVertexSize", "setVertexSize", "vertices", "getVertices", "setVertices", "readFromPALM", "", "filename", "setupPointCloud", "scenery"})
public class PointCloud extends graphics.scenery.Node implements graphics.scenery.HasGeometry {
    
    /**
     * Array for the stored localisations. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer vertices;
    
    /**
     * Normal buffer, here (ab)used to store size and sigmas. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer normals;
    
    /**
     * Texcoords buffer, unused at the moment. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer texcoords;
    
    /**
     * Indices, not used for PointClouds. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.nio.IntBuffer indices;
    
    /**
     * Vertex size, 3 in our case. 
     */
    private int vertexSize;
    
    /**
     * Texcoord size, 2 in our case. 
     */
    private int texcoordSize;
    
    /**
     * [PointCloud]s are rendered as point geometry. 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.GeometryType geometryType;
    
    /**
     * [PointClouds] do not get billboarded. 
     */
    private boolean isBillboard;
    private float pointRadius;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    
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
    
    public void setVertexSize(int p0) {
    }
    
    @java.lang.Override()
    public int getTexcoordSize() {
        return 0;
    }
    
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
    
    @java.lang.Override()
    public boolean isBillboard() {
        return false;
    }
    
    @java.lang.Override()
    public void setBillboard(boolean p0) {
    }
    
    /**
     * * Sets up normal and texcoord buffers from the vertex buffers.
     */
    public final void setupPointCloud() {
    }
    
    /**
     * * Reads the [PointCloud] from [filename], assuming the ThunderSTORM format.
     *     * See http://www.neurocytolab.org/tscolumns/ for format documentation.
     *     *
     *     * This function automatically determines the used separator char, and supports
     *     * comma (,), semicolon (;), and tab as separators.
     */
    public final void readFromPALM(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
    }
    
    public final float getPointRadius() {
        return 0.0F;
    }
    
    public final void setPointRadius(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public PointCloud(float pointRadius, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super(null);
    }
    
    public PointCloud() {
        super(null);
    }
    
    /**
     * * Reads geometry from a file given by [filename]. The extension of [filename] will determine
     *     * whether the file will be read by [readFromOBJ] or [readFromSTL].
     *     *
     *     * Materials will be automatically used, if present.
     */
    public void readFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
    }
    
    /**
     * * Reads geometry from a file given by [filename]. The extension of [filename] will determine
     *     * whether the file will be read by [readFromOBJ] or [readFromSTL].
     *     *
     *     * Materials will be used, if present and [useMaterial] is true.
     */
    public void readFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String filename, boolean useMaterial) {
    }
    
    /**
     * * Reads an OBJ file's material properties from the corresponding MTL file
     *     *
     *     * @param[filename] The filename of the MTL file, stored in the OBJ usually
     *     * @return A HashMap storing material name and [Material].
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.HashMap<java.lang.String, graphics.scenery.Material> readFromMTL(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
        return null;
    }
    
    /**
     * * Read the [Node]'s geometry from an OBJ file, including materials
     *     *
     *     * @param[filename] The filename to read from.
     */
    public void readFromOBJ(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
    }
    
    /**
     * * Read the [Node]'s geometry from an OBJ file, and choose whether the OBJ-defined materials shall be imported.
     *     *
     *     * @param[filename] The filename to read from.
     *     * @param[importMaterials] Whether a accompanying MTL file shall be used, defaults to true.
     */
    public void readFromOBJ(@org.jetbrains.annotations.NotNull()
    java.lang.String filename, boolean importMaterials) {
    }
    
    /**
     * * Read the [Node]'s geometry from an OBJ file, possible including materials
     *     *
     *     * @param[filename] The filename to read from.
     *     * @param[importMaterials] Whether a accompanying MTL file shall be used, defaults to true.
     *     * @param[flipNormals] Whether to flip the normals after reading them.
     */
    public void readFromOBJ(@org.jetbrains.annotations.NotNull()
    java.lang.String filename, boolean importMaterials, boolean flipNormals) {
    }
    
    /**
     * * Read the [Node]'s geometry from an STL file
     *     *
     *     * @param[filename] The filename to read from.
     */
    public void readFromSTL(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
    }
    
    /**
     * * Recalculates normals, assuming CCW winding order and taking
     *     * STL's facet storage format into account.
     */
    public void recalculateNormals() {
    }
}