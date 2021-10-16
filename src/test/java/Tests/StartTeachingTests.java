package Tests;

import Services.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static Pages.StartTeachingPage.*;
import static Services.StringManager.*;
import static Utils.CommonConditions.*;
import static Utils.Steps.clickStartTeachingBtn;
import static Utils.Steps.fillInCategoryAndSub;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class StartTeachingTests extends BaseTest {

    @Test
    public void clickStartTeaching() {
        clickStartTeachingBtn();

        Assert.assertTrue(startTeachingLogo.isDisplayed());
    }

    @Test
    public void checkCategories() {
        clickStartTeachingBtn()
                .click(placeHolders.get(0))
                .switchToActiveElement()
                .waitForVisibility(options.get(10));

        assertThat(convertListOfElementsInListOfValues(options), is(equalTo(expectedCategories)));
    }


    @Test(dataProvider = "categoryAndSubsDataProvider", dataProviderClass = DataProviderClass.class)
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

    @Test
    public void enterJobtitle() {
        clickStartTeachingBtn()
                .enterValue(jobTitleFld, myUserName);

        assertThat(getValueOfAttr(jobTitleFld, "value"), is(equalTo(myUserName)));
    }

    @Test
    public void enterBiography() {
        clickStartTeachingBtn()
                .enterValue(biographyFld, biography);

        assertThat(getTextValueOfElement(biographyFld), is(equalTo(biography)));
    }

    @Test()
    public void clickNextBtn() {
        clickStartTeachingBtn();
                fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn);

        Assert.assertTrue(hourlyRateLbl.isDisplayed());
    }

    @Test()
    public void checkSwitcher() {
        clickStartTeachingBtn();
        fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForClickability(switcher);

        assertThat(getValueOfAttr(switcher, "aria-checked"), is(equalTo("true")));
    }

    @Test()
    public void clickSwitcher() {
        clickStartTeachingBtn();
                fillInCategoryAndSub()
                .enterValue(jobTitleFld, myUserName)
                .click(nextBtn)
                .waitForClickability(switcher)
                .click(switcher);

        assertThat(getValueOfAttr(switcher, "aria-checked"), is(equalTo("false")));

    }

    @Test()
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

    @Test()
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

    @Test()
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

    @Test()
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
