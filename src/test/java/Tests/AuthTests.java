package Tests;

import Pages.BasePage;
import Pages.IndexPage;
import Pages.SignInPage;
import Services.DriverManager;
import Services.TestListener;
import io.qameta.allure.*;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import static Pages.IndexPage.*;
import static Pages.IndexPage.loggedInPopUp;
import static Pages.SignInPage.*;
import static Services.StringManager.getTextValueOfElement;
import static Services.StringManager.getXpath;
import static Utils.CommonConditions.login;
import static Utils.CommonConditions.password;
import static Utils.Steps.logIn;
import static Utils.Steps.logOut;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@Listeners(TestListener.class)
@Feature("DemoFeature")
@Story("DemoStory")
public class AuthTests extends BaseTest {

    @BeforeMethod
    public void browsersetUp() {
        driver = DriverManager.getDriver();
    }

    @AfterMethod
    public void browserTearDown() {
        driver = DriverManager.getNextDriver();
    }

    @AfterClass
    public void closeBrowser() {
        DriverManager.killDriver();
    }

    @Test(description = "Log in certain account", priority = 0)
    @Description("Check user's name is equal user's account name")
    @Severity(value = SeverityLevel.BLOCKER)
    public void logInTest() {
        logIn();

        checkUsersNameIsEqualUserAccName();
    }

    @Test(description = "Log out", priority = 0)
    @Description("Check createAccountBtn is displayed")
    @Severity(value = SeverityLevel.CRITICAL)
    public void logOutTest() {
        logIn();
        logOut();

        checkCreateAccountBtnIsDisplayed();
    }

}
