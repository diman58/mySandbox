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

    @FindBy(xpath = "//span[text()='Dmitrii']")
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
    public static List<WebElement> listOfTopics;
}
