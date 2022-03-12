package com.example

import io.ktor.application.*
import io.ktor.auth.Authentication

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(Authentication) {

    }
}

