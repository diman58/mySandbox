package Pages;

import Services.StringManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Services.StringManager.getXpath;
import static Services.UrlHandler.checkAndReturnPage;
import static Services.UrlHandler.getDefaultUrl;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BasePage openIndex() {
        driver.get("https://grinfer.com/");
        getDefaultUrl(driver);
        return new IndexPage(driver);
    }

    public BasePage click(WebElement element) {
        element.click();
        return checkAndReturnPage(driver, this);
    }

    public BasePage enterValue(WebElement element, String value) {
        element.sendKeys(value);
        return this;
    }

    public static String getTextValueOfElement(WebElement element) {
        return element.getText();
    }

    public String getLocator(WebElement element) {
        return getXpath(element);
    }

    public BasePage waitForPresence(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(getXpath(element))));
        return checkAndReturnPage(driver, this);
    }

    public BasePage switchToActiveElement() {
        driver.switchTo().activeElement();
        return this;
    }


}
