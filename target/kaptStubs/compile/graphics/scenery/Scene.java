package graphics.scenery;

/**
 * * Scene class. A Scene is a special kind of [Node] that can only exist once per graph,
 * * as a root node.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001>B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00012\u0006\u0010\'\u001a\u00020\u0001J\u000e\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0000J<\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00010\nj\b\u0012\u0004\u0012\u00020\u0001`+2\u0006\u0010)\u001a\u00020\u00002\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020-0\u001c2\b\b\u0002\u0010.\u001a\u00020-J2\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0001002\u0006\u0010)\u001a\u00020\u00002\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020-0\u001c2\b\b\u0002\u0010.\u001a\u00020-J\u0010\u00101\u001a\u0004\u0018\u00010\u00012\u0006\u00102\u001a\u00020\u0011J\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u0001002\u0006\u00104\u001a\u00020\u0011J\b\u00105\u001a\u0004\u0018\u00010\u0004J:\u00106\u001a\b\u0012\u0004\u0012\u000207002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0010\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030<002\b\b\u0002\u0010=\u001a\u00020-H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR8\u0010\u000f\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R8\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R2\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00130\u001c0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\u00020 X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006?"}, d2 = {"Lgraphics/scenery/Scene;", "Lgraphics/scenery/Node;", "()V", "activeObserver", "Lgraphics/scenery/Camera;", "getActiveObserver", "()Lgraphics/scenery/Camera;", "setActiveObserver", "(Lgraphics/scenery/Camera;)V", "lights", "Ljava/util/ArrayList;", "getLights", "()Ljava/util/ArrayList;", "setLights", "(Ljava/util/ArrayList;)V", "onChildrenAdded", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlin/Function2;", "", "getOnChildrenAdded", "()Ljava/util/concurrent/ConcurrentHashMap;", "setOnChildrenAdded", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "onChildrenRemoved", "getOnChildrenRemoved", "setOnChildrenRemoved", "onNodePropertiesChanged", "Lkotlin/Function1;", "getOnNodePropertiesChanged", "setOnNodePropertiesChanged", "sceneSize", "Ljava/util/concurrent/atomic/AtomicLong;", "getSceneSize$scenery", "()Ljava/util/concurrent/atomic/AtomicLong;", "setSceneSize$scenery", "(Ljava/util/concurrent/atomic/AtomicLong;)V", "addNode", "n", "parent", "dfs", "s", "discover", "Lkotlin/collections/ArrayList;", "func", "", "useDiscoveryBarriers", "discoverParallel", "", "find", "name", "findByClassname", "className", "findObserver", "raycast", "Lgraphics/scenery/Scene$RaycastResult;", "position", "Lcleargl/GLVector;", "direction", "ignoredObjects", "Ljava/lang/Class;", "debug", "RaycastResult", "scenery"})
public class Scene extends graphics.scenery.Node {

    /**
     * Temporary storage of the active observer ([Camera]) of the Scene.
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Camera activeObserver;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.atomic.AtomicLong sceneSize;

    /**
     * Temporary storage for lights
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<graphics.scenery.Node> lights;

    /**
     * Callbacks to be called when a child is added to the scene
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function2<graphics.scenery.Node, graphics.scenery.Node, kotlin.Unit>> onChildrenAdded;

    /**
     * Callbacks to be called when a child is removed from the scene
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function2<graphics.scenery.Node, graphics.scenery.Node, kotlin.Unit>> onChildrenRemoved;

    /**
     * Callbacks to be called when a child is removed from the scene
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function1<graphics.scenery.Node, kotlin.Unit>> onNodePropertiesChanged;

    public Scene() {
        super(null);
    }

    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.Camera getActiveObserver() {
        return null;
    }

    public final void setActiveObserver(@org.jetbrains.annotations.Nullable()
                                            graphics.scenery.Camera p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.atomic.AtomicLong getSceneSize$scenery() {
        return null;
    }

    public final void setSceneSize$scenery(@org.jetbrains.annotations.NotNull()
                                               java.util.concurrent.atomic.AtomicLong p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<graphics.scenery.Node> getLights() {
        return null;
    }

    public final void setLights(@org.jetbrains.annotations.NotNull()
                                    java.util.ArrayList<graphics.scenery.Node> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function2<graphics.scenery.Node, graphics.scenery.Node, kotlin.Unit>> getOnChildrenAdded() {
        return null;
    }

    public final void setOnChildrenAdded(@org.jetbrains.annotations.NotNull()
                                             java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function2<graphics.scenery.Node, graphics.scenery.Node, kotlin.Unit>> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function2<graphics.scenery.Node, graphics.scenery.Node, kotlin.Unit>> getOnChildrenRemoved() {
        return null;
    }

    public final void setOnChildrenRemoved(@org.jetbrains.annotations.NotNull()
                                               java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function2<graphics.scenery.Node, graphics.scenery.Node, kotlin.Unit>> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function1<graphics.scenery.Node, kotlin.Unit>> getOnNodePropertiesChanged() {
        return null;
    }

    public final void setOnNodePropertiesChanged(@org.jetbrains.annotations.NotNull()
                                                     java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function1<graphics.scenery.Node, kotlin.Unit>> p0) {
    }

    /**
     * * Adds a [Node] to the Scene, at the position given by [parent]
     * *
     * * @param[n] The node to add.
     * * @param[parent] The node to attach [n] to.
     */
    @kotlin.Suppress(names = {"unused"})
    public final void addNode(@org.jetbrains.annotations.NotNull()
                                  graphics.scenery.Node n, @org.jetbrains.annotations.NotNull()
                                  graphics.scenery.Node parent) {
    }

    /**
     * * Find the currently active observer in the Scene.
     * *
     * * TODO: Store once-found camera in [activeObserver]
     * *
     * * @return The [Camera] that is currently active.
     */
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.Camera findObserver() {
        return null;
    }

    /**
     * * Depth-first search for elements in a Scene.
     * *
     * * @param[s] The Scene to search in
     * * @param[func] A lambda taking a [Node] and returning a Boolean for matching.
     * * @return A list of [Node]s that match [func].
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<graphics.scenery.Node> discover(@org.jetbrains.annotations.NotNull()
                                                                         graphics.scenery.Scene s, @org.jetbrains.annotations.NotNull()
                                                                         kotlin.jvm.functions.Function1<? super graphics.scenery.Node, java.lang.Boolean> func, boolean useDiscoveryBarriers) {
        return null;
    }

    /**
     * * Discovers [Node]s in a Scene [s] via [func] in a parallel manner, optionally stopping at discovery barriers,
     * * if [useDiscoveryBarriers] is true.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_VARIABLE", "unused"})
    public final java.util.List<graphics.scenery.Node> discoverParallel(@org.jetbrains.annotations.NotNull()
                                                                            graphics.scenery.Scene s, @org.jetbrains.annotations.NotNull()
                                                                            kotlin.jvm.functions.Function1<? super graphics.scenery.Node, java.lang.Boolean> func, boolean useDiscoveryBarriers) {
        return null;
    }

    /**
     * * Depth-first search routine for a Scene.
     */
    @kotlin.Suppress(names = {"unused"})
    public final void dfs(@org.jetbrains.annotations.NotNull()
                              graphics.scenery.Scene s) {
    }

    /**
     * * Find a [Node] by its name.
     * *
     * * @param[name] The name of the [Node] to find.
     * * @return The first [Node] matching [name].
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"unused"})
    public final graphics.scenery.Node find(@org.jetbrains.annotations.NotNull()
                                                java.lang.String name) {
        return null;
    }

    /**
     * * Find a [Node] by its class name.
     * *
     * * @param[className] The class name of the [Node] to find.
     * * @return A list of Nodes with class name [name].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    public final java.util.List<graphics.scenery.Node> findByClassname(@org.jetbrains.annotations.NotNull()
                                                                           java.lang.String className) {
        return null;
    }

    /**
     * * Performs a raycast to discover objects in this [Scene] that would be intersected
     * * by a ray originating from [position], shot in [direction]. This method can
     * * be given a list of classes as [ignoredObjects], which will then be ignored for
     * * the raycast. If [debug] is true, a set of spheres is placed along the cast ray.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<graphics.scenery.Scene.RaycastResult> raycast(@org.jetbrains.annotations.NotNull()
                                                                                  cleargl.GLVector position, @org.jetbrains.annotations.NotNull()
                                                                                  cleargl.GLVector direction, @org.jetbrains.annotations.NotNull()
                                                                                  java.util.List<? extends java.lang.Class<?>> ignoredObjects, boolean debug) {
        return null;
    }

    /**
     * * Performs a raycast to discover objects in this [Scene] that would be intersected
     * * by a ray originating from [position], shot in [direction]. This method can
     * * be given a list of classes as [ignoredObjects], which will then be ignored for
     * * the raycast. If [debug] is true, a set of spheres is placed along the cast ray.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<graphics.scenery.Scene.RaycastResult> raycast(@org.jetbrains.annotations.NotNull()
                                                                                  cleargl.GLVector position, @org.jetbrains.annotations.NotNull()
                                                                                  cleargl.GLVector direction, @org.jetbrains.annotations.NotNull()
                                                                                  java.util.List<? extends java.lang.Class<?>> ignoredObjects) {
        return null;
    }

    /**
     * * Data class for selection results, contains the [Node] as well as the distance
     * * from the observer to it.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lgraphics/scenery/Scene$RaycastResult;", "", "node", "Lgraphics/scenery/Node;", "distance", "", "(Lgraphics/scenery/Node;F)V", "getDistance", "()F", "getNode", "()Lgraphics/scenery/Node;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class RaycastResult {
        @org.jetbrains.annotations.NotNull()
        private final graphics.scenery.Node node = null;
        private final float distance = 0.0F;

        public RaycastResult(@org.jetbrains.annotations.NotNull()
                                 graphics.scenery.Node node, float distance) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Node getNode() {
            return null;
        }

        public final float getDistance() {
            return 0.0F;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Node component1() {
            return null;
        }

        public final float component2() {
            return 0.0F;
        }

        /**
         * * Data class for selection results, contains the [Node] as well as the distance
         * * from the observer to it.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Scene.RaycastResult copy(@org.jetbrains.annotations.NotNull()
                                                                   graphics.scenery.Node node, float distance) {
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
}
