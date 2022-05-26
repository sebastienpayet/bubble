package org.archeon.bubble.infrastructure.controller

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import org.hamcrest.CoreMatchers
import org.junit.jupiter.api.Test

@QuarkusTest
internal class GreetingControllerTest {

    @Test
    fun greeting() {
        RestAssured.given()
            .`when`()["/hello"]
            .then()
            .statusCode(200)
            .body(CoreMatchers.`is`("hello world"))
    }

    @Test
    fun namedGreeting() {
        RestAssured.given()
            .`when`()["/hello/sebastien"]
            .then()
            .statusCode(200)
            .body(CoreMatchers.`is`("hello sebastien"))
    }
}
