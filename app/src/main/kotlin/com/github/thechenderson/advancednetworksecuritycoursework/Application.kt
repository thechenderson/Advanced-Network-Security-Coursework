package com.github.thechenderson.advancednetworksecuritycoursework

import com.github.thechenderson.advancednetworksecuritycoursework.plugins.configureRouting
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
  System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true")
  embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
    configureRouting()
  }.start(wait = true)
}