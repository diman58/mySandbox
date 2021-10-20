package Services;

import Tests.BaseTest;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.apache.groovy.json.internal.IO;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Time;
import java.sql.Timestamp;

public class TestListener extends BaseTest implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Allure.getLifecycle().addAttachment(
                String.valueOf(new Timestamp(System.currentTimeMillis())).replace(":", "-"),
                "image/png", "png",
                ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
    }

}
