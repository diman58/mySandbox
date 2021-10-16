package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.IndexPage.*;
import static Pages.IndexPage.createAccountBtn;
import static Services.StringManager.getTextValueOfElement;
import static Utils.CommonConditions.myUserName;
import static Utils.Steps.logIn;
import static Utils.Steps.logOut;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class AuthTests {

    private static WebDriver driver;

    @Test
    public void logInTest() {
        logIn();

        assertThat(getTextValueOfElement(usersName),is(equalTo(myUserName)));
    }

    @Test(groups = {"cleanBrowser"})
    public void logOutTest() {
        logIn();
        logOut();

        Assert.assertTrue(createAccountBtn.isDisplayed());
    }
}
