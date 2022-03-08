package com.github.thechenderson.advancednetworksecuritycoursework.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.*

fun Application.configureRouting() {
    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respond(ThymeleafContent("index", emptyMap()))
        }
    }
    routing {
    }
}
