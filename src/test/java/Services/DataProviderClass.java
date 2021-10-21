package Services;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Utils.CommonConditions.*;

public class DataProviderClass {

    @DataProvider(name = "categoryAndSubsDataProvider")
    public static Object[][] categoryAndSubCategoriesDataProvider() {
        return new Object[][]{
                {0, expectedSubsForAcademicsLanguages},
                {1, expectedSubsForBusiness},
                {2, expectedSubsForDesign},
                {3, expectedSubsForFineArt},
                {4, expectedSubsForHealthFitness},
                {5, expectedSubsForLifestyle},
                {6, expectedSubsForMarketing},
                {7, expectedSubsForMusic},
                {8, expectedSubsForPersonalDevelopment},
                {9, expectedSubsForPhotography},
                {10, expectedSubsForTechnology}
        };
    }

    @DataProvider(name = "hourlyRatesDataProvider")
    public static Object[][] tensOfHourlyRatesDataProvider() {
        return new Object[][] {
                {0,10, expectedHourlyRates.subList(0,10)},
                {10,20, expectedHourlyRates.subList(10,20)},
                {20,30, expectedHourlyRates.subList(20,30)},
                {30,40, expectedHourlyRates.subList(30,40)},
                {40,50, expectedHourlyRates.subList(40,50)},

        };
    }
}
