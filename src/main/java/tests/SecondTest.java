package tests;

import io.restassured.RestAssured;
import lombok.extern.java.Log;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Log
public class SecondTest {

    private static final String ENV = System.getProperty("env");

    @BeforeClass
    private void before() {
    }

    @AfterClass
    private void after() {
    }

    @Test(priority = 1, description = "Second Test")
    public void test() {
        log.info("Running at: " + ENV + " Test id: " + Thread.currentThread().getId());
        RestAssured.get("https://www.google.com/").then().assertThat().statusCode(200).and().log().status();
    }
}
