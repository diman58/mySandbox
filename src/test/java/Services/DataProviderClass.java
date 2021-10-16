package Services;

import org.testng.annotations.DataProvider;

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

    @DataProvider(name = "123")
    public static Object[][] asd() {
        return new Object[][] {
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
                {7},
                {8}
        };
    }
}
