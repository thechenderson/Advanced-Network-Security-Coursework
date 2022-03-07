package com.github.thechenderson.advancednetworksecuritycoursework

import org.apache.logging.log4j.LogManager

object Logger {
  private val logger = LogManager.getLogger()

  fun log(message: String) {
    logger.info(message)
  }
}