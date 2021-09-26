package Services;

import Pages.BasePage;
import Pages.IndexPage;
import Pages.SignInPage;
import org.openqa.selenium.WebDriver;

public class PagesCreater {
    private WebDriver driver;

    public static BasePage createPage(WebDriver driver, String Url) {
        switch (Url) {
            case "https://grinfer.com/": return new IndexPage(driver);
            case "https://grinfer.com/sign-in": return new SignInPage(driver);
            default: throw new RuntimeException("problem in switch");
        }
    }
}
