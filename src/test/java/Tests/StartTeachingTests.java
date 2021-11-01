package Tests;

import Pages.BasePage;
import Pages.IndexPage;
import Pages.StartTeachingPage;
import Services.DataProviderClass;
import Services.DriverManager;
import Services.TestListener;
import io.qameta.allure.*;
import org.testng.annotations.*;

import java.util.List;

import static Pages.IndexPage.startTeachingBtn;
import static Pages.StartTeachingPage.*;
import static Services.StringManager.*;
import static Utils.CommonConditions.*;
import static Utils.Steps.*;
import static org.hamcrest.MatcherAssert.assertThat;
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

    @Test(description = "Go to startTeachingPage", priority = 0)
    @Description("Check startTeachingLogo on startTeachingPage is displayed")
    @Severity(value = SeverityLevel.BLOCKER)
    public void clickStartTeaching() {
        clickStartTeachingBtn();

        checkStartTeachingLogoIsDisplayed();
    }

    @Test(description = "List of categories on startTeachingPage", priority = 1)
    @Description("Check list of categories in startTeachingPage is equal to expected")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkCategories() {
        clickStartTeachingBtn()
                .click(placeHolders.get(0))
                .switchToActiveElement()
                .waitForVisibility(options.get(10));

        checkListOfCategoriesIsEqualExpectedCategories();
    }

    @Test(dataProvider = "categoryAndSubsDataProvider", dataProviderClass = DataProviderClass.class,
            description = "List of subs for each category", priority = 1)
    @Description("Check list of subs for each category is equal to expected")
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

        checkListOfSubsIsEqualExpectedSubsForEachCategory(expectedSubs);
    }


    @Test(description = "Go to second part of startTeachingPage", priority = 0)
    @Description("Check that user can go to second part of startTeachinPage and hourlyRateLbl is displayed")
    @Severity(value = SeverityLevel.BLOCKER)
    public void clickNextBtn() {
        clickStartTeachingBtn();
                fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn);

        checkHourlyRateLblIsDisplayed();
    }

    @Test(description = "Switcher is on", priority = 1)
    @Description("Check switcher on second part of startTeachingPage is on")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkSwitcher() {
        clickStartTeachingBtn();
        fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForPresence(switcher);

        checkSwitcherIsOn();
    }

    @Test(description = "Turn switcher off", priority = 1)
    @Description("Check switcher on second part of startTeachingPage is possible to off")
    @Severity(value = SeverityLevel.BLOCKER)
    public void clickSwitcher() {
        clickStartTeachingBtn();
                fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForPresence(switcher)
                .jsClick(switcher);

        checkSwitcherIsOffAfterClick();

    }

    @Test(description = "Enter a value in jobTitleFld", priority = 2)
    @Description("Check jobTitleFld accepts values and they are equal to entered")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterJobtitle() {
        clickStartTeachingBtn()
                .enterValue(jobTitleFld, myUserName);

        checkJobTitleFldAcceptsStringValueAndValidateIt();
    }

    @Test(description = "Enter a value in biographyFld", priority = 2)
    @Description("Check biographyFld accepts values and they are equal to entered")
    @Severity(value = SeverityLevel.NORMAL)
    public void enterBiography() {
        clickStartTeachingBtn()
                .enterValue(biographyFld, biography);

        checkBiographyFldAcceptsStringValueAndValidateIt();
    }

    @Test(description = "hourlyRate is blocked when switcher is off", priority = 1)
    @Description("Check hourlyRate is blocked when switcher is off")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkHorulyRatesBlockedIfSwitcherisOff() {
        clickStartTeachingBtn();
        fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForPresence(switcher)
                .jsClick(switcher)
                .waitForPresence(hourlyRate);

        checkHourlyRateIsBlockedAfterSwitcherIsOff();
    }

    @Test(description = "timeZoneAndSchedule is blocked when switcher is off", priority = 1)
    @Description("Check timeZoneAndSchedule is blocked when switcher is off")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkTimeZonesBlockedIfSwitcherisOff() {
        clickStartTeachingBtn();
        fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForPresence(switcher)
                .jsClick(switcher)
                .waitForPresence(timeZoneAndSchedule.get(0));

        checkTimeZoneAndScheduleIsBlockedAfterSwitcherIsOff();
    }

    @Test(description = "List of hourly rates", priority = 2)
    @Description("Check list of Hourly rates is equal to expected")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkHourlyRates() {
        clickStartTeachingBtn();
                fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForClickability(hourlyRate)
                .click(hourlyRate)
                .switchToActiveElement()
                .fluentWaitClick(options.get(options.size()-1));


        checkListOfHourlyRatesIsEqualExpectedHourlyRates();
    }

    /*@Test(description = "List of time zones", priority = 2)
    @Description("Check list of Time zones is equal to expected")
    @Severity(value = SeverityLevel.BLOCKER)
    public void checkTimeZones() {
        clickStartTeachingBtn();
                fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForClickability(timeZones)
                .click(timeZones)
                .switchToActiveElement()
                .scrollInto(options.get(options.size() - 1));

        checkListOfTimeZonesIsEqualExpectedTimeZones();
    }*/

}



