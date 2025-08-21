package simpleJava;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class RestAPITest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        Response response = RestAssured.given()
                .when().get("/posts/1");

        Assert.assertEquals(response.statusCode(),200);
        System.out.println("Response code is : " + response.statusCode());
        Assert.assertTrue(response.getBody().asString().contains("sunt aut facere"));
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeaders());
        System.out.println(response.getCookies());
        System.out.println(response.getSessionId());
        System.out.println(response.getTime());

    }

}
