package Utils;

import Pages.BasePage;
import Pages.IndexPage;
import org.openqa.selenium.WebDriver;

import static Pages.IndexPage.*;
import static Pages.SignInPage.*;
import static Utils.CommonConditions.*;

public class Steps{
    public static BasePage logIn(WebDriver driver) {
        return new IndexPage(driver).openIndex()
                .click(logInBtn)
                .enterValue(emailFld,login)
                .enterValue(passwordFld,password)
                .click(logIn)
                .waitForPresence(driver,usersName);
    }

    protected static BasePage logOut(WebDriver driver) {
        return new IndexPage(driver).click(usersName)
                .switchToActiveElement()
                .click(logOutBtn)
                .waitForPresence(driver,logInBtn);
    }

}
