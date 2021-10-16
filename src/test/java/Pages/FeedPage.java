package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedPage extends BasePage {

    public FeedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='sc-cFlXAS daTjXZ']")
    public static WebElement findInstructorMsg;

    @FindBy(xpath = "//button[@class='ant-btn sc-elJkPf fOscpJ ant-btn-primary']")
    public static WebElement discoverBtn;

    @FindBy(xpath = "//div[@class='sc-jxGEyO XMVDI']")
    public static WebElement ballet;

    @FindBy(xpath = "//div[@class='sc-chAAoq dvVTEp']")
    public static WebElement suggestionsForYou;

    @FindBy(xpath = "//div[@class='sc-cBdUnI kuJZKs']")
    public static WebElement topicBtn;

}
