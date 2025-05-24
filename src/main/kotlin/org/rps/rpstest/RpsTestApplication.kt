package org.rps.rpstest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RpsTestApplication

fun main(args: Array<String>) {
	runApplication<RpsTestApplication>(*args)
}
