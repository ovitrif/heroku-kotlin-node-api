external fun require(module: String): dynamic

fun main(args: Array<String>) {
    val express = require("express")
    val app = express()
    val PORT = 3000;

    app.get("/", { req, res ->
        val response = object {
            val status = "running";
        }

        res.type("application/json")
        res.send(response)
    })

    app.listen(PORT, {
        println("App started on http://localhost:$PORT")
    })
}
