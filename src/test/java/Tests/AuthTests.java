package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.BasePage.getTextValueOfElement;
import static Pages.IndexPage.*;
import static Pages.IndexPage.createAccountBtn;
import static Pages.SignInPage.logIn;
import static Utils.CommonConditions.getUsersLogin;
import static Utils.CommonConditions.myUserName;
import static Utils.Steps.logIn;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class AuthTests extends BaseTest{

    @Test
    public void logInTest() {
        logIn(driver);

        assertThat(getTextValueOfElement(usersName),is(equalTo(myUserName)));
    }

    @Test(groups = {"cleanBrowser"})
    public void logOutTest() {
        logIn(driver)
                .click(usersName)
                .switchToActiveElement()
                .click(logOutBtn)
                .waitForPresence(driver,logInBtn);

        Assert.assertTrue(createAccountBtn.isDisplayed());

    }
}
