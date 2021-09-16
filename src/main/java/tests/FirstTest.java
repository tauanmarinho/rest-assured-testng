package tests;

import lombok.extern.java.Log;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

@Log
public class FirstTest {

    private static final String ENV = System.getProperty("env");

    @BeforeClass
    private void before() {

    }

    @AfterClass
    private void after() {
    }

    @Test(priority = 1, description = "Test")
    public void test1() {
        log.info("Running at: " + ENV + " Test id: " + Thread.currentThread().getId());
        RestAssured.get("https://www.google.com/").then().assertThat().statusCode(200).and().log().status();
    }

    @Test(priority = 2, description = "Test")
    public void test2() {
        log.info("Running at: " + ENV + " Test id: " + Thread.currentThread().getId());
        RestAssured.get("https://www.google.com/").then().assertThat().statusCode(200).and().log().status();
    }

    @Test(priority = 3, description = "Test")
    public void test3() {
        log.info("Running at: " + ENV + " Test id: " + Thread.currentThread().getId());
        RestAssured.get("https://www.google.com/").then().assertThat().statusCode(200).and().log().status();
    }

    @Test(priority = 4, description = "Test")
    public void test4() {
        log.info("Running at: " + ENV + " Test id: " + Thread.currentThread().getId());
        RestAssured.get("https://www.google.com/").then().assertThat().statusCode(200).and().log().status();
    }

    @Test(priority = 5, description = "Test")
    public void test5() {
        log.info("Running at: " + ENV + " Test id: " + Thread.currentThread().getId());
        RestAssured.get("https://www.google.com/").then().assertThat().statusCode(200).and().log().status();
    }
}
