package controller

import Config.PORT

object RootController {

    const val ROUTE = "/";

    fun get(req: dynamic, res: dynamic) {
        val response = object {
            val statusRoute = "http://localhost:$PORT/status/200";
        }

        res.type("application/json")
        res.send(response)
    }
}
