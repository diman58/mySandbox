package Services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver==null) {
            setDriver();
        }
        return driver;
    }

    public static WebDriver setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getnextDriver() {
        driver = null;
        return DriverManager.getDriver();
    }
}
