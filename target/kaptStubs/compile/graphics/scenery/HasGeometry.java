package graphics.scenery;

/**
 * * Interface for any [Node] that stores geometry in the form of vertices,
 * * normals, texcoords, or indices.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002;<J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%H\u0016J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020(0\'2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0018\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010*\u001a\u00020%H\u0016J$\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010*\u001a\u00020%2\b\b\u0002\u0010+\u001a\u00020%H\u0016J\u0010\u0010,\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020!H\u0016J.\u0010.\u001a\u00020\u00152\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0015H\u0002J>\u00105\u001a\b\u0012\u0004\u0012\u00020#00*\u00020#2\u0006\u00106\u001a\u00020#2\b\b\u0002\u00107\u001a\u00020\u00152\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020#092\b\b\u0002\u0010:\u001a\u00020%H\u0002R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u0012\u0010\u001b\u001a\u00020\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\u001d\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013\u00a8\u0006="}, d2 = {"Lgraphics/scenery/HasGeometry;", "Ljava/io/Serializable;", "geometryType", "Lgraphics/scenery/GeometryType;", "getGeometryType", "()Lgraphics/scenery/GeometryType;", "setGeometryType", "(Lgraphics/scenery/GeometryType;)V", "indices", "Ljava/nio/IntBuffer;", "getIndices", "()Ljava/nio/IntBuffer;", "setIndices", "(Ljava/nio/IntBuffer;)V", "normals", "Ljava/nio/FloatBuffer;", "getNormals", "()Ljava/nio/FloatBuffer;", "setNormals", "(Ljava/nio/FloatBuffer;)V", "texcoordSize", "", "getTexcoordSize", "()I", "texcoords", "getTexcoords", "setTexcoords", "vertexSize", "getVertexSize", "vertices", "getVertices", "setVertices", "readFrom", "", "filename", "", "useMaterial", "", "readFromMTL", "Ljava/util/HashMap;", "Lgraphics/scenery/Material;", "readFromOBJ", "importMaterials", "flipNormals", "readFromSTL", "recalculateNormals", "toBufferIndex", "obj", "", "", "num", "vectorSize", "offset", "fastSplit", "delimiter", "limit", "list", "Ljava/util/ArrayList;", "skipEmpty", "TIndexedHashSet", "Vertex", "scenery"})
public abstract interface HasGeometry extends java.io.Serializable {

    /**
     * How many elements does a vertex store?
     */
    public abstract int getVertexSize();

    /**
     * How many elements does a texture coordinate store?
     */
    public abstract int getTexcoordSize();

    /**
     * The [GeometryType] of the [Node]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract graphics.scenery.GeometryType getGeometryType();

    /**
     * The [GeometryType] of the [Node]
     */
    public abstract void setGeometryType(@org.jetbrains.annotations.NotNull()
                                             graphics.scenery.GeometryType p0);

    /**
     * Array of the vertices. This buffer is _required_, but may empty.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.nio.FloatBuffer getVertices();

    /**
     * Array of the vertices. This buffer is _required_, but may empty.
     */
    public abstract void setVertices(@org.jetbrains.annotations.NotNull()
                                         java.nio.FloatBuffer p0);

    /**
     * Array of the normals. This buffer is _required_, and may _only_ be empty if [vertices] is empty as well.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.nio.FloatBuffer getNormals();

    /**
     * Array of the normals. This buffer is _required_, and may _only_ be empty if [vertices] is empty as well.
     */
    public abstract void setNormals(@org.jetbrains.annotations.NotNull()
                                        java.nio.FloatBuffer p0);

    /**
     * Array of the texture coordinates. Texture coordinates are optional.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.nio.FloatBuffer getTexcoords();

    /**
     * Array of the texture coordinates. Texture coordinates are optional.
     */
    public abstract void setTexcoords(@org.jetbrains.annotations.NotNull()
                                          java.nio.FloatBuffer p0);

    /**
     * Array of the indices to create an indexed mesh. Optional, but advisable to use to minimize the number of submitted vertices.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.nio.IntBuffer getIndices();

    /**
     * Array of the indices to create an indexed mesh. Optional, but advisable to use to minimize the number of submitted vertices.
     */
    public abstract void setIndices(@org.jetbrains.annotations.NotNull()
                                        java.nio.IntBuffer p0);

    /**
     * * Reads geometry from a file given by [filename]. The extension of [filename] will determine
     * * whether the file will be read by [readFromOBJ] or [readFromSTL].
     * *
     * * Materials will be automatically used, if present.
     */
    public abstract void readFrom(@org.jetbrains.annotations.NotNull()
                                      java.lang.String filename);

    /**
     * * Reads geometry from a file given by [filename]. The extension of [filename] will determine
     * * whether the file will be read by [readFromOBJ] or [readFromSTL].
     * *
     * * Materials will be used, if present and [useMaterial] is true.
     */
    public abstract void readFrom(@org.jetbrains.annotations.NotNull()
                                      java.lang.String filename, boolean useMaterial);

    /**
     * * Reads an OBJ file's material properties from the corresponding MTL file
     * *
     * * @param[filename] The filename of the MTL file, stored in the OBJ usually
     * * @return A HashMap storing material name and [Material].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.HashMap<java.lang.String, graphics.scenery.Material> readFromMTL(@org.jetbrains.annotations.NotNull()
                                                                                                   java.lang.String filename);

    /**
     * * Read the [Node]'s geometry from an OBJ file, including materials
     * *
     * * @param[filename] The filename to read from.
     */
    public abstract void readFromOBJ(@org.jetbrains.annotations.NotNull()
                                         java.lang.String filename);

    /**
     * * Read the [Node]'s geometry from an OBJ file, and choose whether the OBJ-defined materials shall be imported.
     * *
     * * @param[filename] The filename to read from.
     * * @param[importMaterials] Whether a accompanying MTL file shall be used, defaults to true.
     */
    public abstract void readFromOBJ(@org.jetbrains.annotations.NotNull()
                                         java.lang.String filename, boolean importMaterials);

    /**
     * * Read the [Node]'s geometry from an OBJ file, possible including materials
     * *
     * * @param[filename] The filename to read from.
     * * @param[importMaterials] Whether a accompanying MTL file shall be used, defaults to true.
     * * @param[flipNormals] Whether to flip the normals after reading them.
     */
    public abstract void readFromOBJ(@org.jetbrains.annotations.NotNull()
                                         java.lang.String filename, boolean importMaterials, boolean flipNormals);

    /**
     * * Read the [Node]'s geometry from an STL file
     * *
     * * @param[filename] The filename to read from.
     */
    public abstract void readFromSTL(@org.jetbrains.annotations.NotNull()
                                         java.lang.String filename);

    /**
     * * Recalculates normals, assuming CCW winding order and taking
     * * STL's facet storage format into account.
     */
    public abstract void recalculateNormals();

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lgraphics/scenery/HasGeometry$Vertex;", "", "vertex", "", "normal", "uv", "(III)V", "getNormal", "()I", "getUv", "getVertex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "scenery"})
    public static final class Vertex {
        private final int vertex = 0;
        private final int normal = 0;
        private final int uv = 0;

        public Vertex(int vertex, int normal, int uv) {
            super();
        }

        public final int getVertex() {
            return 0;
        }

        public final int getNormal() {
            return 0;
        }

        public final int getUv() {
            return 0;
        }

        public final int component1() {
            return 0;
        }

        public final int component2() {
            return 0;
        }

        public final int component3() {
            return 0;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.HasGeometry.Vertex copy(int vertex, int normal, int uv) {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }

        @java.lang.Override()
        public int hashCode() {
            return 0;
        }

        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
                                  java.lang.Object p0) {
            return false;
        }
    }

    /**
     * * Hash set class extending [TLinkedHashSet], providing an additional index for all entries.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lgraphics/scenery/HasGeometry$TIndexedHashSet;", "E", "", "Lgnu/trove/set/hash/TLinkedHashSet;", "initialCapacity", "", "(I)V", "index", "Lgnu/trove/map/hash/THashMap;", "add", "", "element", "(Ljava/lang/Object;)Z", "indexOf", "obj", "(Ljava/lang/Object;)I", "scenery"})
    public static final class TIndexedHashSet<E extends java.lang.Object> extends gnu.trove.set.hash.TLinkedHashSet<E> {
        private final gnu.trove.map.hash.THashMap<E, java.lang.Integer> index = null;

        public TIndexedHashSet(int initialCapacity) {
            super();
        }

        /**
         * * Adds [element] to the hash set. Returns true if the set was modified by the operation.
         */
        @java.lang.Override()
        public boolean add(@org.jetbrains.annotations.NotNull()
                               E element) {
            return false;
        }

        /**
         * * Returns the index in the set of the object [obj], or -1 if [obj] is not contained in the set.
         */
        public final int indexOf(@org.jetbrains.annotations.NotNull()
                                     E obj) {
            return 0;
        }

        @java.lang.Override()
        public int getSize() {
            return 0;
        }

        @java.lang.Override()
        public final int size() {
            return 0;
        }
    }

    /**
     * * Interface for any [Node] that stores geometry in the form of vertices,
     * * normals, texcoords, or indices.
     * *
     * * @author Ulrik Günther <hello@ulrik.is>
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {

        /**
         * * Reads geometry from a file given by [filename]. The extension of [filename] will determine
         * * whether the file will be read by [readFromOBJ] or [readFromSTL].
         * *
         * * Materials will be automatically used, if present.
         */
        public static void readFrom(graphics.scenery.HasGeometry $this, @org.jetbrains.annotations.NotNull()
            java.lang.String filename) {
        }

        /**
         * * Reads geometry from a file given by [filename]. The extension of [filename] will determine
         * * whether the file will be read by [readFromOBJ] or [readFromSTL].
         * *
         * * Materials will be used, if present and [useMaterial] is true.
         */
        public static void readFrom(graphics.scenery.HasGeometry $this, @org.jetbrains.annotations.NotNull()
            java.lang.String filename, boolean useMaterial) {
        }

        /**
         * * Reads an OBJ file's material properties from the corresponding MTL file
         * *
         * * @param[filename] The filename of the MTL file, stored in the OBJ usually
         * * @return A HashMap storing material name and [Material].
         */
        @org.jetbrains.annotations.NotNull()
        public static java.util.HashMap<java.lang.String, graphics.scenery.Material> readFromMTL(graphics.scenery.HasGeometry $this, @org.jetbrains.annotations.NotNull()
            java.lang.String filename) {
            return null;
        }

        /**
         * * Read the [Node]'s geometry from an OBJ file, including materials
         * *
         * * @param[filename] The filename to read from.
         */
        public static void readFromOBJ(graphics.scenery.HasGeometry $this, @org.jetbrains.annotations.NotNull()
            java.lang.String filename) {
        }

        /**
         * * Read the [Node]'s geometry from an OBJ file, and choose whether the OBJ-defined materials shall be imported.
         * *
         * * @param[filename] The filename to read from.
         * * @param[importMaterials] Whether a accompanying MTL file shall be used, defaults to true.
         */
        public static void readFromOBJ(graphics.scenery.HasGeometry $this, @org.jetbrains.annotations.NotNull()
            java.lang.String filename, boolean importMaterials) {
        }

        /**
         * * Read the [Node]'s geometry from an OBJ file, possible including materials
         * *
         * * @param[filename] The filename to read from.
         * * @param[importMaterials] Whether a accompanying MTL file shall be used, defaults to true.
         * * @param[flipNormals] Whether to flip the normals after reading them.
         */
        public static void readFromOBJ(graphics.scenery.HasGeometry $this, @org.jetbrains.annotations.NotNull()
            java.lang.String filename, boolean importMaterials, boolean flipNormals) {
        }

        private static int toBufferIndex(graphics.scenery.HasGeometry $this, java.util.List<? extends java.lang.Number> obj, int num, int vectorSize, int offset) {
            return 0;
        }

        private static java.util.List<java.lang.String> fastSplit(graphics.scenery.HasGeometry $this, @org.jetbrains.annotations.NotNull()
            java.lang.String $receiver, java.lang.String delimiter, int limit, java.util.ArrayList<java.lang.String> list, boolean skipEmpty) {
            return null;
        }

        /**
         * * Read the [Node]'s geometry from an STL file
         * *
         * * @param[filename] The filename to read from.
         */
        public static void readFromSTL(graphics.scenery.HasGeometry $this, @org.jetbrains.annotations.NotNull()
            java.lang.String filename) {
        }

        /**
         * * Recalculates normals, assuming CCW winding order and taking
         * * STL's facet storage format into account.
         */
        public static void recalculateNormals(graphics.scenery.HasGeometry $this) {
        }
    }
}
