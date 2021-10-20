package Tests;

import Services.DriverManager;
import Services.TestListener;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;

import static Pages.IndexPage.*;
import static Pages.IndexPage.createAccountBtn;
import static Services.StringManager.getTextValueOfElement;
import static Utils.CommonConditions.myUserName;
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


    @Test(description = "logIn and check user's name matches login")
    @Description("проверка авторизации")
    @Severity(value = SeverityLevel.BLOCKER)
    public void logInTest() {
        logIn();

        assertThat(getTextValueOfElement(usersName), is(equalTo("123"/*myUserName*/)));
    }

    @Test(description = "logOut and check it")
    @Description("проверка деавторизации")
    @Severity(value = SeverityLevel.BLOCKER)
    public void logOutTest() {
        logIn();
        logOut();

        Assert.assertTrue(createAccountBtn.isDisplayed());
    }
}
