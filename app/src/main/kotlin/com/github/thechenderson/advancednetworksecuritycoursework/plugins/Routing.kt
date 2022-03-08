package com.github.thechenderson.advancednetworksecuritycoursework.plugins

import com.github.thechenderson.advancednetworksecuritycoursework.Logger
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import kotlin.io.path.Path
import kotlin.io.path.toPath

fun Application.configureRouting() {
  // Starting point for a Ktor app:
  routing {
    get("/search/{query}") {
      val query = call.parameters["query"] ?: "(empty request)"
      Logger.log(query)
    }

    get("/restore") {
      restoreProductsCopy()
      println("File replaced")
    }

    static {
      resource("/", "static/index.html")
      resource("*", "static/index.html")
      resources("static")
    }
  }
}

private fun restoreProductsCopy() {
  val copyPath = ClassLoader.getSystemResource("static/files/products_copy.json").toURI().toPath()
  val originalPath = Path(copyPath.toString().replace("products_copy.json", "products.json"))
  Files.copy(copyPath, originalPath, StandardCopyOption.REPLACE_EXISTING)
}
