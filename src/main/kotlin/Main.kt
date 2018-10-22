import PORT
import controller.RootController
import controller.StatusController

external fun require(module: String): dynamic

fun main(args: Array<String>) {
    val express = require("express")
    val app = express()

    app.get(RootController.ROUTE, RootController::get)
    app.get(StatusController.ROUTE, StatusController::get)

    app.listen(PORT) {
        println("App started on http://localhost:$PORT")
    }
}
