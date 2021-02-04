package graphics.scenery.effectors

import graphics.scenery.Node
import graphics.scenery.Plane
import org.joml.Vector3f

/**
 * Slicing volume effector
 *
 * @author Ulrik Guenther <hello@ulrik.is>
 */
class SlicingVolumeEffector : VolumeEffector() {
    /** Proxy plane for slicing */
    override var proxy: Node = Plane(Vector3f(1.0f, 1.0f, 1.0f))
}
