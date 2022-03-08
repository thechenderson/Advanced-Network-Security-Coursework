package com.github.thechenderson.advancednetworksecuritycoursework.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
  // Starting point for a Ktor app:
  routing {
    static {
      resource("/", "static/index.html")
      resource("*", "static/index.html")
      resources("static")
    }
  }
}
