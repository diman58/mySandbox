package Tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static Utils.CommonConditions.*;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class APIRestAssuredTests extends BaseTest{

    /*@BeforeMethod
    public void initTest() {
        RestAssured.baseURI = "https://grinfer.com/";
    }

    //@Test(groups = "APITests")
    @Test
    public void checkStatusCode() {
        Response response = RestAssured.when().get().andReturn();

    }

    @Test
    public void check() {

    }*/

}
