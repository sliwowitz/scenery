package graphics.scenery.tests.examples.basic

import graphics.scenery.Box
import graphics.scenery.Material.Factory.DefaultMaterial
import org.joml.Vector3f

class AOPTestKotlin {

    fun testNew() {

        val box = Box()
        box.name = "mybox"

        box.spatial {
            position = Vector3f(10f, 20f, 30f)
            scale = Vector3f(0.5f, 0.5f, 0.5f)
        }

        box.renderable {
            material = DefaultMaterial()
            isBillboard = true
        }

        // add custom property

        box.addProperties(MySpecialProperties::class.java, MySpecialProperties())

        // access custom property

        box.getProperties(MySpecialProperties::class.java) {
            a = 3
            b = 4
        }
    }
}


class MySpecialProperties {
    var a: Int = 0
    var b: Int = 0
}
