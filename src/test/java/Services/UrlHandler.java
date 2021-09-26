package Services;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;

public class UrlHandler {
    private static String isUrl;
    private static String wasUrl;

    public static BasePage checkAndReturnPage(WebDriver driver, BasePage basePage) {
        isUrl = driver.getCurrentUrl();
        if (!isUrl.equals(wasUrl)) {
            wasUrl = isUrl;
            return new PagesCreater().createPage(driver, isUrl);
        }
        return basePage;
    }

    public static void getDefaultUrl(WebDriver driver) {
        wasUrl = driver.getCurrentUrl();
    }
}
