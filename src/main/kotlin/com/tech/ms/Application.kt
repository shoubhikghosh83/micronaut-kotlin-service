package com.tech.ms

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
    info = Info(
            title = "micronaut-kotlin-service",
            version = "0.0"
    )
)
object Api {
}

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.tech.ms")
		.start()
}

