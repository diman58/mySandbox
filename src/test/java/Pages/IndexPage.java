package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IndexPage extends BasePage {

    public IndexPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href,'sign-in')]")
    public static WebElement logInBtn;

    @FindBy(xpath = "//div[@class='sc-nst8f5-3 dJsUTm']")
    public static WebElement usersName;

    @FindBy(xpath = "//button[@title='Grinfer - Log out']")
    public static WebElement logOutBtn;

    @FindBy(xpath = "//button[contains(@class,'fOscpJ')]")
    public static WebElement createAccountBtn;

    @FindBy(xpath = "//button")
    public static WebElement menu;

    @FindBy(xpath = "//span[@class='sc-dTdPqK iCcvdp']")
    public static List<WebElement> listOfTopicsOnTheLeftMenu;

    @FindBy(xpath = "//a[@role='button']")
    public static List<WebElement> listOfTopicsInTheMid;

    @FindBy(xpath = "//div[text()='Start Teaching']")
    public static WebElement startTeachingBtn;

    @FindBy(xpath = "//a[@class='sc-8lxa00-9 iMNWlz']")
    public static List<WebElement> topics;

    @FindBy(xpath = "//span[text()='Logged in!']")
    public static WebElement loggedInPopUp;

}
