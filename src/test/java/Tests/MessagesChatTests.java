package Tests;

import Services.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Pages.IndexPage.*;
import static Utils.Steps.logIn;
import static org.testng.Assert.assertTrue;

public class MessagesChatTests {
    private WebDriver driver;

    @BeforeMethod
    public void browserSetUp() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void checkMessageBth() {
        logIn(driver)
                .click(messagesBtn)
                .switchToActiveElement()
                .waitForPresence(driver, chatBtns.get(0));

        Assert.assertTrue(showAllCourses.isEnabled());

    }

    /*@Test
    public void checkXBtnOnTheChat() {
        logIn(driver)
                .click(messagesBtn)
                .switchToActiveElement()
                .waitForPresence(driver, chatBtns.get(0))
                .clickByOffSet(driver, chatBtns.get(1));

        Assert.assertFalse(chatWindow.isSelected());
    }*/
}
