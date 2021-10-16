package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StartTeachingPage extends BasePage{

    public StartTeachingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Start Teaching']")
    public static WebElement startTeachingLogo;

    @FindBy(xpath = "//div[@class='ant-select-selection__rendered']")
    public static List<WebElement> placeHolders;

    @FindBy(xpath = "//li[@role='option']")
    public static List<WebElement> options;

    @FindBy(xpath = "//input[contains(@placeholder,'3D Designer,')]")
    public static WebElement jobTitleFld;

    @FindBy(xpath = "//div[@data-contents='true']")
    public static WebElement biographyFld;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement nextBtn;

    @FindBy(xpath = "//span[@class='info']")
    public static WebElement info;

    @FindBy(xpath = "//label[@for='form_priceTierId']")
    public static WebElement hourlyRateLbl;

    @FindBy(xpath = "//div[@data-qa-description='undefinedundefinedprice-tier-select-input']")
    public static WebElement hourlyRate;

    @FindBy(xpath = "//div[@id='form_timezone']")
    public static WebElement timeZones;

    @FindBy(xpath = "//div[@title='09:00']")
    public static List<WebElement> timeZone;

    @FindBy(xpath = "//button[@role='switch']")
    public static WebElement switcher;

    @FindBy(xpath = "//div[@data-__meta='[object Object]' and @aria-haspopup='true']")
    public static List<WebElement> timeZoneAndSchedule;



}
