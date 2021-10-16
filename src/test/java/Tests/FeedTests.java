package Tests;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static Pages.FeedPage.discoverBtn;
import static Pages.IndexPage.feedBtn;
import static Utils.Steps.logIn;

public class FeedTests {

    private static WebDriver driver;

    @Test//(groups = {"cleanBrowser"})
    public void clickFeedBtn() {

        BasePage a = logIn();
        System.out.println("1 "+driver.getCurrentUrl());
        a.click(feedBtn);
        System.out.println("2 "+driver.getCurrentUrl());
        a.fluentWait(discoverBtn);
        System.out.println("3 "+driver.getCurrentUrl());
        System.out.println(a.toString());
        //Assert.assertTrue(discoverBtn.isDisplayed());
    }

   /* @Test//(groups = {"cleanBrowser"})
    public void clickDiscoverBtn() {



    }*/
}
