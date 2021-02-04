package graphics.scenery

/**
 * Delegation type class.
 *
 * Delegations can be handled either as [OncePerDelegate], meaning that even if many nodes refer to the same
 * delegate, that delegate will be drawn only once. If [ForEachNode] is chosen, the delegate will be drawn for
 * every node that refers to it.
 *
 * @author Ulrik Guenther <hello@ulrik.is>
 */
enum class DelegationType {
    /** Will render the node only once per target delegate. */
    OncePerDelegate,
    /** Will render for each node independent of referring to the same delegate. */
    ForEachNode
}

/**
 * Node type that enables delegation of rendering. For rendering, not the node itself will be drawn,
 * but the node referred as [delegateRendering]. A [delegationType] can be selected to choose whether the delegate
 * will be drawn for all nodes that refer to it, or only once.
 *
 * @author Ulrik Guenther <hello@ulrik.is>
 */
interface DelegatesRendering: Node {
    fun getDelegationType(): DelegationType
    fun getDelegateRendering(): Renderable?
    override fun renderable(block: Renderable.() -> Unit): Renderable? {
        val delegateRendering = getDelegateRendering()
        delegateRendering?.block()
        return delegateRendering
    }
}

interface DelegatesSpatial: Node {
    fun getDelegateSpatial(): SpaceAware?
    override fun spatial(block: SpaceAware.() -> Unit): SpaceAware? {
        val delegateSpatial = getDelegateSpatial()
        delegateSpatial?.block()
        return delegateSpatial
    }
}

interface DelegatesGeometry: Node {
    fun getDelegateGeometry(): Geometry?
    override fun geometry(block: Geometry.() -> Unit): Geometry? {
        val delegateGeometry = getDelegateGeometry()
        delegateGeometry?.block()
        return delegateGeometry
    }
}
