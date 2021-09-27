package Tests;

import Services.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static Pages.IndexPage.listOfTopics;
import static Pages.IndexPage.menu;
import static Services.StringManager.convertListOfElementsInListOfValues;
import static Tests.CommonConditions.expectedListOfTopics;
import static Tests.Steps.logIn;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CheckNumberOfTopicsTest {
    private WebDriver driver;

    @BeforeMethod
    public void browserSetUp() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void checkNumberOfTopicsOnTheLeftSide() {
        logIn(driver)
                .click(menu);

        assertThat(convertListOfElementsInListOfValues(listOfTopics),is(equalTo(expectedListOfTopics)));
    }

}
