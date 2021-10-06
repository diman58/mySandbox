package Pages;

import com.codeborne.selenide.impl.WebElementSelector;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
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

    public BasePage waitForVisibility(WebDriver driver, WebElement element) {
        new WebDriverWait(driver,5)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getXpath(element))));
        return checkAndReturnPage(driver,this);
    }

    public BasePage switchToActiveElement() {
        driver.switchTo().activeElement();
        return this;
    }

    /*public BasePage wait(int time) {
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }*/

    public BasePage switchTo(WebDriver driver, WebElement element) {
        driver.switchTo().frame(element);
        return checkAndReturnPage(driver,this);
    }

    public BasePage swithToWindow(WebDriver driver, String window) {
        driver.switchTo().window(window);
        return this;
    }

    public BasePage clickByOffSet(WebDriver driver, WebElement element) {
        /*Point s = driver.findElement(By.xpath(getXpath(element))).getLocation();
        int x = s.getX();
        int y = s.getY();*/
        new Actions(driver).moveToElement(element).click().build().perform();
        return checkAndReturnPage(driver,this);
    }

}
