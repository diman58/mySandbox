package Tests;

import Services.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static Utils.Steps.logIn;

public class BaseTest{

    protected static WebDriver driver;


    @BeforeTest()
    public void browserSetUp() {
        driver = DriverManager.getDriver();
        logIn();
    }

    @BeforeMethod(firstTimeOnly = true,onlyForGroups = {"clickBack"})
    public void before() {
        driver = DriverManager.getDriver();
        logIn();
    }



    /*@BeforeMethod(alwaysRun = true, onlyForGroups = {"cleanBrowser"})
    public void before() {
        driver = DriverManager.getDriver();
        driver.close();
        driver = DriverManager.getnextDriver();
    }*/
}
