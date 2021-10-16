package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IndexPage extends BasePage{

    public IndexPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(@href,'sign-in')]")
    public static WebElement logInBtn;

    @FindBy(xpath = "//span[text()='DemoName']")
    public static WebElement usersName;

    @FindBy(xpath = "//div[@class='title']")
    public static WebElement logOutBtn;

    @FindBy(xpath = "//div[@class='ant-popover popover__Popover-n045ja-0 sc-kkbgRg bCbFbw ant-popover-placement-bottomRight']")
    public static WebElement usersPopover;

    @FindBy(xpath = "//div[@class='ant-list-footer']")
    public static WebElement popoverFooter;

    @FindBy(xpath = "//div[@role='button']")
    public static WebElement myCourses;

    @FindBy(xpath = "//button[contains(@class,'fOscpJ')]")
    public static WebElement createAccountBtn;

    @FindBy(xpath = "//button")
    public static WebElement menu;

    @FindBy(xpath = "//span[@class='sc-dTdPqK iCcvdp']")
    public static List<WebElement> listOfTopicsOnTheLeftMenu;

    @FindBy(xpath = "//a[@role='button']")//span[@class='sc-jlyJG fFQcEb']
    public static List<WebElement> listOfTopicsInTheMid;

    @FindBy(xpath = "//button[@class='slick-arrow slick-next']")
    public static WebElement nextArrow;

    @FindBy(xpath = "//div[@class='sc-krDsej kqgXqB']")//span[@class='sc-dTdPqK iCcvdp' and text()='Technology']
    public static WebElement technologyBtnOnTheLeftMenu;

    @FindBy(xpath = "//button[@aria-label='Close']")
    public static WebElement closeLeftMenuBtn;

    @FindBy(xpath = "//div[@class='ant-drawer-body']")
    public static WebElement leftMenuBody;

    @FindBy(xpath = "//button[@class='sc-elNKlv boikXS']")
    public static WebElement messagesBtn;

    @FindBy(xpath = "//strong[text()='Messages']")
    public static WebElement chatMessages;

    @FindBy(xpath = "//button[@class='text-chat-headerstyled__ControlButton-u9v265-2 hNQTPA']")
    public static List<WebElement> chatBtns;

    @FindBy(xpath = "//aside[contains(@class,'messenger')]")
    public static WebElement chatWindow;

    @FindBy(xpath = "//a[@class='ant-btn sc-elJkPf lHuZJ sc-kQsIoO sc-hjRWVT gUIxhL']")
    public static WebElement showAllCourses;

    @FindBy(xpath = "//button[@class='ant-btn sc-elJkPf lHuZJ sc-ccSCjj tJlMN']")
    public static WebElement feedBtn;

    @FindBy(xpath = "//button[@class='ant-btn sc-elJkPf fOscpJ ant-btn-primary']")
    public static WebElement discoverBtn;

    @FindBy(xpath = "//i[contains(@aria-label,'icon: close')]")
    public static WebElement xOnTheLeftMenu;

    @FindBy(xpath = "//div[text()='Start Teaching']")
    public static WebElement startTeachingBtn;

}
