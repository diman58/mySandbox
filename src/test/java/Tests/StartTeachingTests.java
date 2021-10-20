package Tests;

import Services.DataProviderClass;
import Services.DriverManager;
import Services.TestListener;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

import static Pages.StartTeachingPage.*;
import static Services.StringManager.*;
import static Utils.CommonConditions.*;
import static Utils.Steps.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@Listeners(TestListener.class)
@Feature("DemoFeature2")
@Story("DemoStory2")
public class StartTeachingTests extends BaseTest {

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        logIn();
    }

    @AfterClass
    public void closeBrowser() {
        DriverManager.killDriver();
    }

    @Test(description = "open start teaching page")
    public void clickStartTeaching() {
        clickStartTeachingBtn();

        Assert.assertTrue(startTeachingLogo.isDisplayed());
    }

    @Test(description = "check list of categories")
    @Description("проверка списка списка категорий для обучения")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkCategories() {
        clickStartTeachingBtn()
                .click(placeHolders.get(0))
                .switchToActiveElement()
                .waitForVisibility(options.get(10));

        assertThat(convertListOfElementsInListOfValues(options), is(equalTo(expectedCategories)));
    }


    @Test(dataProvider = "categoryAndSubsDataProvider", dataProviderClass = DataProviderClass.class,
            description = "check list of subs for each category")
    @Description("проверка списка списка подкатегорий для каждой категории для обучения")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkSubsForEachCategory(int category, List<String> expectedSubs) {
        clickStartTeachingBtn()
                .click(placeHolders.get(0))
                .switchToActiveElement()
                .waitForClickability(options.get(category))
                .click(options.get(category))
                .switchToActiveElement()
                .click(placeHolders.get(1))
                .switchToActiveElement();

        assertThat(excludeCategories(convertListOfElementsInListOfValues(options)), is(equalTo(expectedSubs)));
    }

    @Test(description = "enter a value in job title and check it")
    @Description("проверка поля для ввода названия обучения")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterJobtitle() {
        clickStartTeachingBtn()
                .enterValue(jobTitleFld, myUserName);

        assertThat(getValueOfAttr(jobTitleFld, "value"), is(equalTo(myUserName)));
    }

    @Test(description = "enter a value in biography and check it")
    @Description("проверка поля для ввода биографии об авторе")
    @Severity(value = SeverityLevel.NORMAL)
    public void enterBiography() {
        clickStartTeachingBtn()
                .enterValue(biographyFld, biography);

        assertThat(getTextValueOfElement(biographyFld), is(equalTo(biography)));
    }

    @Test(description = "open second start teaching page")
    @Description("проверка перехода на 2ую страницу анкеты")
    @Severity(value = SeverityLevel.BLOCKER)
    public void clickNextBtn() {
        clickStartTeachingBtn();
                fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn);

        Assert.assertTrue(hourlyRateLbl.isDisplayed());
    }

    @Test(description = "check switcher is present and active")
    @Description("проверка наличия свитчера о консультациях")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkSwitcher() {
        clickStartTeachingBtn();
        fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForClickability(switcher);

        assertThat(getValueOfAttr(switcher, "aria-checked"), is(equalTo("true")));
    }

    @Test(description = "turn switcher off and check it")
    @Description("проверка деактивации свитчера")
    @Severity(value = SeverityLevel.BLOCKER)
    public void clickSwitcher() {
        clickStartTeachingBtn();
                fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForClickability(switcher)
                .click(switcher);

        assertThat(getValueOfAttr(switcher, "aria-checked"), is(equalTo("false")));

    }

    @Test(description = "turn switcher off and check hourly rate is blocked")
    @Description("проверка блокирования поля стоимость часа при деактивации свитчера")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkHorulyRatesBlockedIfSwitcherisOff() {
        clickStartTeachingBtn();
        fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForClickability(switcher)
                .click(switcher)
                .fluentWait(hourlyRate);

        assertThat(getValueOfAttr(hourlyRate, "tabindex"), is(equalTo("-1")));
    }

    @Test(description = "turn switcher off and check time zone is blocked")
    @Description("проверка блокирования поля часовые пояса при деактивации свитчера")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkTimeZonesBlockedIfSwitcherisOff() {
        clickStartTeachingBtn();
        fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForClickability(switcher)
                .click(switcher)
                .fluentWait(timeZoneAndSchedule.get(0));

        assertThat(getValueOfAttr(timeZoneAndSchedule.get(0), "tabindex"), is(equalTo("-1")));
    }

    @Test(description = "check list of hourly rates")
    @Description("проверка списка стоимости часа")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkHourlyRates() {
        clickStartTeachingBtn();
                fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForClickability(hourlyRate)
                .click(hourlyRate)
                .switchToActiveElement();

        assertThat(convertListOfElementsInListOfValues(options), is(equalTo(expectedHourlyRates)));
    }

    @Test(description = "check list of time zones")
    @Description("проверка списка ")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkTimeZones() {
        clickStartTeachingBtn();
                fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForClickability(timeZones)
                .click(timeZones)
                .switchToActiveElement()
                .waitForVisibility(options.get(options.size() - 1));

        assertThat(convertListOfElementsInListOfValues(options), is(equalTo(expectedTimeZones)));
    }

}
