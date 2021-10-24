package Tests;

import Services.DriverManager;
import Services.TestListener;
import io.qameta.allure.*;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.*;

import static Pages.IndexPage.createAccountBtn;
import static Pages.IndexPage.usersName;
import static Services.StringManager.getTextValueOfElement;
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

    @BeforeGroups(groups = {"xyz"})
    public void lllgggg(){
        System.out.println("1342534656");
    }

    @Test(description = "Log in certain account", priority = 0, groups = {"xyz"})
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
