package org.rps.rpstest

import org.springframework.boot.fromApplication
import org.springframework.boot.with

fun main(args: Array<String>) {
    fromApplication<RpsTestApplication>()
        .with(TestcontainersConfiguration::class)
        .run(*args)
}
