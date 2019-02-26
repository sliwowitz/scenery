package graphics.scenery;

/**
 * * Enum class storing the geometry type, e.g. of a [Node]
 * *
 * * [DeferredLightingRenderer] e.g. has extension functions to convert these types
 * * to OpenGL geometry types.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/GeometryType;", "", "(Ljava/lang/String;I)V", "TRIANGLES", "TRIANGLE_STRIP", "TRIANGLE_FAN", "POLYGON", "POINTS", "LINE", "LINES_ADJACENCY", "LINE_STRIP_ADJACENCY", "scenery"})
public enum GeometryType {
    /*public static final*/ TRIANGLES /* = new TRIANGLES() */,
    /*public static final*/ TRIANGLE_STRIP /* = new TRIANGLE_STRIP() */,
    /*public static final*/ TRIANGLE_FAN /* = new TRIANGLE_FAN() */,
    /*public static final*/ POLYGON /* = new POLYGON() */,
    /*public static final*/ POINTS /* = new POINTS() */,
    /*public static final*/ LINE /* = new LINE() */,
    /*public static final*/ LINES_ADJACENCY /* = new LINES_ADJACENCY() */,
    /*public static final*/ LINE_STRIP_ADJACENCY /* = new LINE_STRIP_ADJACENCY() */;

    GeometryType() {
    }
}
