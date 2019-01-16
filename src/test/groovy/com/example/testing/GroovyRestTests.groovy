package com.example.testing

/*import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner*/

import io.restassured.RestAssured
import io.restassured.response.Response
import groovy.json.JsonSlurper
import static org.junit.Assert.assertNotNull
import static org.junit.Assert.assertEquals

//@RunWith(SpringRunner)
//@SpringBootTest
class GroovyRestTests {

    /**
     * Proof-of-concept testing method to GET some JSON from a REST API endpoint and test some assumptions.
     */
    //@Test
    static def "Testing Rest Api With Groovy"() {  // more readable method names with Groovy's 'def'
        Response response =
            RestAssured.given()
                .get("http://echo.jsontest.com/framework/robot-framework/api/rest")

        assertNotNull(response)
        assertEquals("Status code not 200; error: " + response.header("x-error-message")+";", 200, response.statusCode())

        def json = new JsonSlurper().parse(response.body().asByteArray())
        assertEquals("Response not as expected;", "rest", json.api)
    }

}

