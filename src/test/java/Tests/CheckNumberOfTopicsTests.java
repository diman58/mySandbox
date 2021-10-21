package Tests;

import Pages.IndexPage;
import Services.DriverManager;
import Services.TestListener;
import io.qameta.allure.*;
import org.testng.annotations.*;

import static Pages.IndexPage.*;
import static Utils.Steps.*;


@Listeners(TestListener.class)
@Feature("DemoFeature3")
@Story("DemoStory3")
public class CheckNumberOfTopicsTests extends BaseTest{

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

    @Test(description = "List of topics on the left menu after logging", priority = 2)
    @Description("Check list of topics on the left menu is equal to expected for authorized user")
    @Severity(value = SeverityLevel.NORMAL)
    public void checkNumberOfTopicsOnTheLeftSideAfterLogIng() {
        logIn()
                .click(menu)
                .switchToActiveElement()
                .waitForVisibility(topics.get(0))
                .waitForVisibility(topics.get(topics.size()-1));

        checkListOfTopicsOnTheLeftMenuIsEqualExpectedTopicsForAuthUser();
    }

    @Test(description = "List of topics on the left menu before logging", priority = 2)
    @Description("Check list of topics on the left menu is equal to expected for unauthorized user")
    @Severity(value = SeverityLevel.NORMAL)
    public void checkNumberOfTopicsOnTheLeftSideBeforeLogIng() {
        new IndexPage(driver).openIndex()
                .click(menu)
                .switchToActiveElement()
                .waitForVisibility(topics.get(0))
                .waitForVisibility(topics.get(topics.size()-1));

        checkListOfTopicsOnTheLeftMenuIsEqualExpectedTopicsForUnauthUser();
    }


    @Test(description = "List of topics in the mid before logging", priority = 2)
    @Description("Check list of topics in the mid is equal to expected for unauthorized user")
    @Severity(value = SeverityLevel.NORMAL)
    public void checkNumberOfTopicsInTheMidBeforeLogIng() {
        new IndexPage(driver).openIndex();

        checkListOfTopicInTheMidIsEqualExpectedTopicsForUnauthUser();

    }

    @Test(description = "List of topics in the mid after logging", priority = 2)
    @Description("Check list of topics in the mid is equal to expected for authorized user")
    @Severity(value = SeverityLevel.NORMAL)
    public void checkNumberOfTopicsInTheMidAfterLogIng() {
       logIn();

        checkListOfTopicsInTheMidIsEqualExpectedTopicsForAuthUser();

    }

}
