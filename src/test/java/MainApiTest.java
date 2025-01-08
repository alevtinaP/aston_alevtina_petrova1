import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import static com.google.common.base.Predicates.equalTo;
import static io.restassured.RestAssured.given;

public class MainApiTest {

    private static final Logger log = LoggerFactory.getLogger(MainApiTest.class);

    @Test
    public void getEchoTest() {
        given()
                .baseUri("https://postman-echo.com")
                .when()
                .get("/get")
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();


    }

    @Test
    public void postRawTest() {
        given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json")
                .body("{\"test2\": \"value\"}")

                .when()
                .post("/post")

                .then()
                .log().all()
                .assertThat()
                .statusCode(200)

                .body("data.test2", equalTo("value"));


    }

    @Test
    public void postFormDataTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")

                .when()
                .post("/post")

                .then()
                .assertThat()
                .statusCode(200)
                .log().all()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    public void putRequestTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType(ContentType.TEXT)
                .body("This is expected to be sent back as part of response body.")

                .when()
                .put("/put")

                .then()
                .assertThat()
                .statusCode(200)
                .log().all()

                .body("data", equalTo("This is expected to be sent back as part of response body."));

    }

    @Test
    public void patchTest() {
        given()
                .contentType(ContentType.TEXT)
                .body("This is expected to be sent back as part of response body.")
                .patch("https://postman-echo.com/patch")
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));

    }


    @Test
    public void deleteTest() {
        given()
                .contentType(ContentType.TEXT)
                .body("This is expected to be sent back as part of response body.")
                .delete("https://postman-echo.com/delete")
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }
}

