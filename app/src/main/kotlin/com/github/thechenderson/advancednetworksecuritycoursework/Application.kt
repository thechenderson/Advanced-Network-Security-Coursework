package com.github.thechenderson.advancednetworksecuritycoursework

import com.github.thechenderson.advancednetworksecuritycoursework.plugins.configureRouting
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.application.*
import io.ktor.server.thymeleaf.*
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver

fun main() {
  System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true")
  embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
    install(Thymeleaf) {
      setTemplateResolver(ClassLoaderTemplateResolver().apply {
        prefix = "templates/"
        suffix = ".html"
        characterEncoding = "utf-8"
      })
    }
    configureRouting()
  }.start(wait = true)
}