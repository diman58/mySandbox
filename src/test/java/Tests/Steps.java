package Tests;

import Pages.BasePage;
import Pages.IndexPage;
import org.openqa.selenium.WebDriver;

import static Pages.IndexPage.logInBtn;
import static Pages.IndexPage.usersName;
import static Pages.SignInPage.*;
import static Tests.CommonConditions.*;

public class Steps {
    protected static BasePage logIn(WebDriver driver) {
        return new IndexPage(driver).openIndex()
                .click(logInBtn)
                .enterValue(emailFld,login)
                .enterValue(passwordFld,password)
                .click(logIn)
                .waitForPresence(driver,usersName);
    }
}
