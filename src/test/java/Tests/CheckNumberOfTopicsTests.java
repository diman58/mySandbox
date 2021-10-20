package Tests;

import Pages.IndexPage;
import Services.DriverManager;
import Services.TestListener;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import org.testng.annotations.*;

import static Pages.IndexPage.*;
import static Services.StringManager.*;
import static Utils.CommonConditions.expectedTopics;
import static Utils.Steps.*;
import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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

    @Test(description = "check list of topics on the left menu after logging")
    @Description("проверка списка топиков на левом меню для авторизованного пользователя")
    @Severity(value = SeverityLevel.NORMAL)
    public void checkNumberOfTopicsOnTheLeftSideAfterLogIng() {
        logIn()
                .click(menu)
                .switchToActiveElement()
                .waitForVisibility(topics.get(0))
                .waitForVisibility(topics.get(topics.size()-1));

        assertThat(convertListOfElementsInListOfValues(listOfTopicsOnTheLeftMenu),is(equalTo(expectedTopics)));
    }

    @Test(description = "check list of topics on the left menu before logging")
    @Description("проверка списка топиков на левом меню для неавторизованного пользователя")
    @Severity(value = SeverityLevel.NORMAL)
    public void checkNumberOfTopicsOnTheLeftSideBeforeLogIng() {
        new IndexPage(driver).openIndex()
                .click(menu)
                .switchToActiveElement()
                .waitForVisibility(topics.get(0))
                .waitForVisibility(topics.get(topics.size()-1));

        assertThat(convertListOfElementsInListOfValues(listOfTopicsOnTheLeftMenu),is(equalTo(expectedTopics)));
    }


    @Test(description = "check list of topics in the mid before logging")
    @Description("проверка списка топиков в центре для неавторизованного пользователя")
    @Severity(value = SeverityLevel.NORMAL)
    public void checkNumberOfTopicsInTheMidBeforeLogIng() {
        new IndexPage(driver).openIndex();

        assertThat(convertListOfElementsInListOfAttrValues(listOfTopicsInTheMid),is(equalTo(expectedTopics)));

    }

    @Test(description = "check list of topics in the mid after logging")
    @Description("проверка списка топиков в центре для авторизованного пользователя")
    @Severity(value = SeverityLevel.NORMAL)
    public void checkNumberOfTopicsInTheMidAfterLogIng() {
       logIn();

        assertThat(convertListOfElementsInListOfAttrValues(listOfTopicsInTheMid),is(equalTo(expectedTopics)));

    }

}
