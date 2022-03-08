package com.github.thechenderson.advancednetworksecuritycoursework.plugins

import com.github.thechenderson.advancednetworksecuritycoursework.Logger
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
  // Starting point for a Ktor app:
  routing {
    get("/search/{query}") {
      val query = call.parameters["query"] ?: "(empty request)"
      println(query)
      Logger.log(query)
    }

    static {
      resource("/", "static/index.html")
      resource("*", "static/index.html")
      resources("static")
    }
  }
}
