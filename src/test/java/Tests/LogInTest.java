package Tests;

import Services.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Pages.IndexPage.usersName;
import static Pages.SignInPage.*;
import static Tests.CommonConditions.*;
import static Tests.Steps.logIn;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LogInTest {
    private WebDriver driver;

    @BeforeMethod
    public void browserSetUp() {
    driver = DriverManager.getDriver();
    }

    @Test
    public void logInTest() {
        logIn(driver);

        assertThat(getTextValueOfElement(usersName),is(equalTo(myUserName)));
    }
}
