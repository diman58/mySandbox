package Tests;

import Services.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Pages.IndexPage.*;
import static Tests.Steps.logIn;


public class LogOutTest {
    private WebDriver driver;

    @BeforeMethod
    public void browserSetUp() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void logOutTest() {
        logIn(driver)
                .click(usersName)
                .switchToActiveElement()
                .click(logOutBtn)
                .waitForPresence(driver,logInBtn);

        Assert.assertTrue(createAccountBtn.isDisplayed());

    }
}
