package Tests;

import Pages.IndexPage;
import Services.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static Pages.IndexPage.*;
import static Services.StringManager.*;
import static Utils.CommonConditions.expectedListOfTopics;
import static Utils.Steps.*;
import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CheckNumberOfTopicsTests extends BaseTest{

   @Test(groups = {"cleanBrowser"})
    public void checkNumberOfTopicsOnTheLeftSideAfterLogIng() {
        logIn(driver)
                .click(menu)
                .switchToActiveElement();

        assertThat(convertListOfElementsInListOfValues(listOfTopicsOnTheLeftMenu),is(equalTo(expectedListOfTopics)));
    }

    @Test
    public void checkNumberOfTopicsOnTheLeftSideBeforeLogIng() {
        new IndexPage(driver).openIndex()
                .click(menu)
                .switchToActiveElement();

        assertThat(convertListOfElementsInListOfValues(listOfTopicsOnTheLeftMenu),is(equalTo(expectedListOfTopics)));
    }

    @Test
    public void checkNumberOfTopicsInTheMidBeforeLogIng() {
        new IndexPage(driver).openIndex();

        assertThat(convertListOfElementsInListOfAttrValues(listOfTopicsInTheMid),is(equalTo(expectedListOfTopics)));

    }

    @Test(groups = {"cleanBrowser"})
    public void checkNumberOfTopicsInTheMidAfterLogIng() {
       logIn(driver);

        assertThat(convertListOfElementsInListOfAttrValues(listOfTopicsInTheMid),is(equalTo(expectedListOfTopics)));

    }

    // feed, messages, start teaching, report
}
