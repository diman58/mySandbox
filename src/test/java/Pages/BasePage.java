package Pages;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static Services.StringManager.getXpath;
import static Services.UrlHandler.checkAndReturnPage;
import static Services.UrlHandler.getDefaultUrl;

public abstract class BasePage {
    protected static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BasePage openIndex() {
        driver.get("https://grinfer.com/");
        getDefaultUrl(BasePage.driver);
        return new IndexPage(BasePage.driver);
    }

    public BasePage click(WebElement element) {
        element.click();
        updatePage();
        return checkAndReturnPage(driver, this);
    }

    public BasePage enterValue(WebElement element, String value) {
        element.sendKeys(value);
        return this;
    }


    public String getLocator(WebElement element) {
        return getXpath(element);
    }

    public BasePage waitForPresence(WebElement element) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(getXpath(element))));
        return checkAndReturnPage(driver, this);
    }


    public BasePage waitForVisibility(WebElement element) {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getXpath(element))));
        return checkAndReturnPage(driver, this);
    }

    public BasePage waitForClickability(WebElement element) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(getXpath(element))));
        return checkAndReturnPage(driver, this);
    }

    public BasePage waitForPageLoad() {
        new WebDriverWait(driver, 10).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        return checkAndReturnPage(driver, this);
    }

    public BasePage waitForStaleness(WebElement element) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.stalenessOf(element));
        return checkAndReturnPage(driver, this);
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

    public BasePage switchTo(WebElement element) {
        driver.switchTo().frame(element);
        return checkAndReturnPage(driver, this);
    }

    public BasePage swithToWindow(String window) {
        driver.switchTo().window(window);
        return this;
    }

    public BasePage clickByOffSet(WebElement element) {
        Point s = driver.findElement(By.xpath(getXpath(element))).getLocation();
        int x = s.getX();
        int y = s.getY();
        new Actions(driver).moveByOffset(x, y).click().build().perform();
        /*
        JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("$(document.elementFromPoint(x, y)).click();");
         */
        return checkAndReturnPage(driver, this);
    }

    public BasePage updatePage() {
        return checkAndReturnPage(driver, this);
    }


    public BasePage fluentWait(WebElement element) {
        Wait<WebDriver> webDriverWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(ElementClickInterceptedException.class, NoSuchElementException.class);

        /*Function<WebDriver, Boolean> function =
                new Function<WebDriver, Boolean>()
                {
                    @Override
                    public @Nullable Boolean apply(@Nullable WebDriver driver) {
                        if(driver.findElements(By.xpath(getXpath(element))).size()!=0) {
                            return true;
                        }
                        return false;
                    }
                };*/
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(getXpath(element))));
        return checkAndReturnPage(driver, this);
    }

    public BasePage openNewTab() {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return new IndexPage(driver);
    }

    public BasePage refreshTab() {
        driver.navigate().refresh();
        return checkAndReturnPage(driver, this);
    }

    public BasePage jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        return checkAndReturnPage(driver, this);
    }

}
