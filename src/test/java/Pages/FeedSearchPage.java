package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class FeedSearchPage extends BasePage {

    public FeedSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='sc-cBdUnI kuJZKs']")
    public static WebElement topicBtn;
}
