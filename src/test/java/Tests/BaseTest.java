package Tests;

import Services.DriverManager;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.Severity;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static Pages.IndexPage.*;
import static Pages.StartTeachingPage.startTeachingLogo;
import static Services.StringManager.getTextValueOfElement;
import static Utils.CommonConditions.*;
import static Utils.Steps.logIn;
import static Pages.StartTeachingPage.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static Services.StringManager.*;

public class BaseTest{

    protected static WebDriver driver;

    @Step("Check that user's name is equal user's account name")
    public static void checkUsersNameIsEqualUserAccName() {
        assertThat(getTextValueOfElement(usersName), is(equalTo("ExpectedFail1")));
    }

    @Step("Check createAccountBtn is displayed")
    public static void checkCreateAccountBtnIsDisplayed() {
        Assert.assertTrue(createAccountBtn.isDisplayed());
    }

    @Step("Check listOfTopicsOnTheLeftMenu is equal expectedTopics for auth user")
    public static void checkListOfTopicsOnTheLeftMenuIsEqualExpectedTopicsForAuthUser() {
        assertThat(convertListOfElementsInListOfValues(listOfTopicsOnTheLeftMenu), is(equalTo(expectedTopics)));
    }

    @Step("Check listOfTopicsOnTheLeftMenu is equal expectedTopics for unauth user")
    public static void checkListOfTopicsOnTheLeftMenuIsEqualExpectedTopicsForUnauthUser() {
        assertThat(convertListOfElementsInListOfValues(listOfTopicsOnTheLeftMenu), is(equalTo(expectedTopics)));
    }

    @Step("Check listOfTopicsInTheMid is equal expectedTopics for unauth user")
    public static void checkListOfTopicInTheMidIsEqualExpectedTopicsForUnauthUser() {
        assertThat(convertListOfElementsInListOfAttrValues(listOfTopicsInTheMid),is(equalTo(expectedTopics)));
    }

    @Step("Check listOfTopicsInTheMid is equal expectedTopics for auth user")
    public static void checkListOfTopicsInTheMidIsEqualExpectedTopicsForAuthUser() {
        assertThat(convertListOfElementsInListOfAttrValues(listOfTopicsInTheMid),is(equalTo(expectedTopics)));
    }

    @Step("Check startTeachingLogo is displayed")
    public static void checkStartTeachingLogoIsDisplayed() {
        Assert.assertTrue(startTeachingLogo.isDisplayed());
    }

    @Step("Check listOfCategories is equal expectedCategories")
    public static void checkListOfCategoriesIsEqualExpectedCategories() {
        assertThat(convertListOfElementsInListOfValues(options), is(equalTo(expectedCategories)));
    }

    @Step("Check listOfSubs is equal expectedSubs for each category")
    public static void checkListOfSubsIsEqualExpectedSubsForEachCategory(List<String> expectedSubs) {
        assertThat(excludeCategories(convertListOfElementsInListOfValues(options)), is(equalTo(expectedSubs)));
    }

    @Step("Check hourlyRateLbl is displayed")
    public static void checkHourlyRateLblIsDisplayed() {
        Assert.assertTrue(hourlyRateLbl.isDisplayed());
    }

    @Step("Check switcher is on")
    public static void checkSwitcherIsOn() {
        assertThat(getValueOfAttr(switcher, "aria-checked"), is(equalTo("true")));
    }

    @Step("Check switcher is off after click")
    public static void checkSwitcherIsOffAfterClick() {
        assertThat(getValueOfAttr(switcher, "aria-checked"), is(equalTo("false")));
    }

    @Step("Check user can fill in jobTitleFld and validate it")
    public static void checkJobTitleFldAcceptsStringValueAndValidateIt() {
        assertThat(getValueOfAttr(jobTitleFld, "value"), is(equalTo(myUserName)));
    }

    @Step("Check user can fill in biographyFld and validate it")
    public static void checkBiographyFldAcceptsStringValueAndValidateIt() {
        assertThat(getTextValueOfElement(biographyFld), is(equalTo(biography)));
    }

    @Step("Check hourlyRate is blocked after switcher is off")
    public static void checkHourlyRateIsBlockedAfterSwitcherIsOff() {
        assertThat(getValueOfAttr(hourlyRate, "tabindex"), is(equalTo("-1")));
    }

    @Step("Check timeZoneAndSchedule is blocked after switcher is off")
    public static void checkTimeZoneAndScheduleIsBlockedAfterSwitcherIsOff() {
        assertThat(getValueOfAttr(timeZoneAndSchedule.get(0), "tabindex"), is(equalTo("-1")));
    }

    @Step("Check list of hourly Rates is equal expectedHourlyRates")
    public static void checkListOfHourlyRatesIsEqualExpectedHourlyRates() {
        assertThat(convertListOfElementsInListOfValues(options), is(equalTo(expectedHourlyRates)));
    }

    @Step("Check list of time zones is equal expectedTimeZones")
    public static void checkListOfTimeZonesIsEqualExpectedTimeZones() {
        assertThat(convertListOfElementsInListOfValues(options), is(equalTo(expectedTimeZones)));
    }

    }
