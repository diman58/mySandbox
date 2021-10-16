package Tests;

import Pages.IndexPage;
import org.testng.annotations.*;

import static Pages.IndexPage.*;
import static Services.StringManager.*;
import static Utils.CommonConditions.expectedTopics;
import static Utils.Steps.*;
import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CheckNumberOfTopicsTests extends BaseTest{


    @Test(groups = {"cleanBrowser"})
    public void checkNumberOfTopicsOnTheLeftSideAfterLogIng() {
        logIn()
                .click(menu)
                .switchToActiveElement()
                .waitForPresence(xOnTheLeftMenu);

        assertThat(convertListOfElementsInListOfValues(listOfTopicsOnTheLeftMenu),is(equalTo(expectedTopics)));
    }

    @Test
    public void checkNumberOfTopicsOnTheLeftSideBeforeLogIng() {
        new IndexPage(driver).openIndex()
                .click(menu)
                .switchToActiveElement()
                .waitForPresence(xOnTheLeftMenu);

        assertThat(convertListOfElementsInListOfValues(listOfTopicsOnTheLeftMenu),is(equalTo(expectedTopics)));
    }

    @Test
    public void checkNumberOfTopicsInTheMidBeforeLogIng() {
        new IndexPage(driver).openIndex();

        assertThat(convertListOfElementsInListOfAttrValues(listOfTopicsInTheMid),is(equalTo(expectedTopics)));

    }

    @Test(groups = {"cleanBrowser"})
    public void checkNumberOfTopicsInTheMidAfterLogIng() {
       logIn();

        assertThat(convertListOfElementsInListOfAttrValues(listOfTopicsInTheMid),is(equalTo(expectedTopics)));

    }

}
