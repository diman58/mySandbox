package Tests;

import Pages.BasePage;
import Pages.IndexPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Pages.IndexPage.logInBtn;
import static Pages.IndexPage.usersName;
import static Pages.SignInPage.*;

public class CommonConditions {
    protected static String login = "dcivicedge@gmail.com";
    protected static String password = "Diman3452";
    protected static String myUserName = "Dmitrii";

    protected static List<WebElement> expectedListOfTopics = new ArrayList(Arrays.asList("Design", "Health & Fitness"
              , "Technology", "Photography", "Lifestyle", "Marketing", "Personal Development", "Academics & Languages",
                   "Music", "Business", "Fine Art" ));


}
