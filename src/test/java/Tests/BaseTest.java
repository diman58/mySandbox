package Tests;

import Services.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod()
    public void browserSetUp() {
        driver = DriverManager.getDriver();
    }

    @BeforeMethod(alwaysRun = true, onlyForGroups = {"cleanBrowser"})
    public void before() {
        driver = DriverManager.getDriver();
        driver.close();
        driver = DriverManager.getnextDriver();
    }
}
