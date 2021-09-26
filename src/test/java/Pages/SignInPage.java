package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public static WebElement emailFld;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement passwordFld;

    @FindBy(xpath = "//button[contains(@title,'Grinfer')]")
    public static WebElement logIn;
}
