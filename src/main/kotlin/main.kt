import javafx.scene.paint.Color
import tornadofx.*

class TrafficLights : View("Traffic Lights") {
    override val root = stackpane {
        group {
            rectangle {
                width = 180.0
                height = 480.0
            }

            val circleRadius = 60.0
            val x = 90.0

            circle {
                radius = circleRadius

                centerX = x
                centerY = 90.0

                fill = Color.RED
            }

            circle {
                radius = circleRadius

                centerX = x
                centerY = 240.0

                fill = Color.YELLOW
            }

            circle {
                radius = circleRadius

                centerX = x
                centerY = 390.0

                fill = Color.GREEN
            }
        }
    }
}

class TrafficLightsApp : App(TrafficLights::class)

fun main(args: Array<String>): Unit = launch<TrafficLightsApp>(args)
