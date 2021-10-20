package Services;

import Pages.*;
import org.openqa.selenium.WebDriver;

public class PagesCreater {

    public static BasePage createPage(WebDriver driver, String Url) {
        switch (Url) {
            case "https://grinfer.com/": return new IndexPage(driver);
            case "https://grinfer.com/sign-in": return new SignInPage(driver);
            case "https://grinfer.com/become-a-specialist": return new StartTeachingPage(driver);
            default: throw new RuntimeException("problem in switch with pages");
        }
    }
}
