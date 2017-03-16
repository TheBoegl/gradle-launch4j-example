package com.me.myapp

import groovy.util.logging.Slf4j

@Slf4j
class Driver {
  static void main(String[] args) {
      new Driver().run()
  }

  void run() {
      log.info("Running the driver from inside a native executable!")
  }
}
