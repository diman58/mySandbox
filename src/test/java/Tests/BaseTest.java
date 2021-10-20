package Tests;

import Services.DriverManager;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static Utils.Steps.logIn;

public class BaseTest{

    protected static WebDriver driver;

}
