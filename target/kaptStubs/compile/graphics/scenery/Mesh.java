package graphics.scenery;

import java.lang.System;

/**
 * * Simple Mesh class to store geometry, inherits from [HasGeometry].
 * * Can also be used for grouping objects easily.
 * *
 * * Also see [HasGeomerty]  for more interface details.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\'\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001a\u00a8\u0006*"}, d2 = {"Lgraphics/scenery/Mesh;", "Lgraphics/scenery/Node;", "Lgraphics/scenery/HasGeometry;", "name", "", "(Ljava/lang/String;)V", "geometryType", "Lgraphics/scenery/GeometryType;", "getGeometryType", "()Lgraphics/scenery/GeometryType;", "setGeometryType", "(Lgraphics/scenery/GeometryType;)V", "indices", "Ljava/nio/IntBuffer;", "getIndices", "()Ljava/nio/IntBuffer;", "setIndices", "(Ljava/nio/IntBuffer;)V", "getName", "()Ljava/lang/String;", "setName", "normals", "Ljava/nio/FloatBuffer;", "getNormals", "()Ljava/nio/FloatBuffer;", "setNormals", "(Ljava/nio/FloatBuffer;)V", "texcoordSize", "", "getTexcoordSize", "()I", "setTexcoordSize", "(I)V", "texcoords", "getTexcoords", "setTexcoords", "vertexSize", "getVertexSize", "setVertexSize", "vertices", "getVertices", "setVertices", "scenery"})
public class Mesh extends graphics.scenery.Node implements graphics.scenery.HasGeometry {
    
    /**
     * Vertex storage array. Also see [HasGeometry] 
     */
    @org.jetbrains.annotations.NotNull()
    private transient java.nio.FloatBuffer vertices;
    
    /**
     * Normal storage array. Also see [HasGeometry] 
     */
    @org.jetbrains.annotations.NotNull()
    private transient java.nio.FloatBuffer normals;
    
    /**
     * Texcoord storage array. Also see [HasGeometry] 
     */
    @org.jetbrains.annotations.NotNull()
    private transient java.nio.FloatBuffer texcoords;
    
    /**
     * Index storage array. Also see [HasGeometry] 
     */
    @org.jetbrains.annotations.NotNull()
    private transient java.nio.IntBuffer indices;
    
    /**
     * Vertex element size. Also see [HasGeometry] 
     */
    private int vertexSize;
    
    /**
     * Texcoord element size. Also see [HasGeometry] 
     */
    private int texcoordSize;
    
    /**
     * Geometry type of the Mesh. Also see [HasGeometry] and [GeometryType] 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.GeometryType geometryType;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Mesh(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super(null);
    }
    
    public Mesh() {
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