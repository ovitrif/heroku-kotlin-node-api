package controller

import PORT

object StatusController {

    const val ROUTE = "/status/:statusCode";

    fun get(req: dynamic, res: dynamic) {
        val statusCode = req.params.statusCode;
        val response = object {
            val statusCode = statusCode;
            val rootRoute = "http://localhost:$PORT/";
        }

        res.type("application/json")
        res.status(statusCode)
        res.send(response)
    }
}
