package org.archeon;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when()
                .get("hello")
          .then()
             .statusCode(200)
             .body(is("hello world"));
    }

    @Test
    public void testOtherHelloEndpoint() {
        given()
                .when().get("/dude/hello")
                .then()
                .statusCode(200)
                .body(is("hello world dude"));
    }

    @Test
    public void testHelloNameEndpoint() {
        given()
                .when().get("/hello/sebastien")
                .then()
                .statusCode(200)
                .body(is("hello sebastien"));
    }
}