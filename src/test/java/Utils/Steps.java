package Utils;

import Pages.BasePage;
import Pages.IndexPage;
import Pages.StartTeachingPage;
import Tests.BaseTest;
import io.qameta.allure.Step;

import static Pages.IndexPage.*;
import static Pages.SignInPage.*;
import static Pages.StartTeachingPage.*;
import static Services.StringManager.*;
import static Utils.CommonConditions.*;

public class Steps extends BaseTest {

    @Step("logIn test account")
    public static BasePage logIn() {
        return new IndexPage(driver).openIndex()
                .click(logInBtn)
                .waitForVisibility(emailFld)
                .enterValue(emailFld,login)
                .enterValue(passwordFld,password)
                .click(logIn)
                .waitForPresence(usersName);
    }

    @Step("logOut test account")
    public static BasePage logOut() {
        return new IndexPage(driver).click(usersName)
                .switchToActiveElement()
                .click(logOutBtn)
                .waitForPresence(logInBtn);
    }

    @Step("click Start Teaching on the main page")
    public static BasePage clickStartTeachingBtn() {
        return new IndexPage(driver)
                .openIndex()
                .waitForClickability(startTeachingBtn)
                .click(startTeachingBtn)
                .updatePage()
                .updatePage()
                .waitForVisibility(startTeachingLogo);
    }

    @Step("fill in Category and Sub")
    public static BasePage fillInCategoryAndSub() {
          return  new StartTeachingPage(driver).click(placeHolders.get(0))
                .switchToActiveElement()
                .waitForClickability(options.get(getRandomCategory()))
                .click(options.get(randomCategory))
                .click(placeHolders.get(1))
                .switchToActiveElement()
                //.waitForClickability(options.get(getRandomSubCategory())) //падает
                .fluentWait(options.get(getRandomSubCategory()))
                .click(options.get(randomSubCategory));
    }
}
