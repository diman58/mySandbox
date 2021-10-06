package Utils;

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
    public static String login = "dcivicedge@gmail.com";
    public static String password = "Diman3452";
    public static String myUserName = "Dmitrii";

    public static String getUsersLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    public static String getMyUserName() {
        return myUserName;
    }

    public static List<String> getExpectedListOfTopics() {
        return expectedListOfTopics;
    }

    public static List<String> expectedListOfTopics = new ArrayList(Arrays.asList("Design", "Health & Fitness"
              , "Technology", "Photography", "Lifestyle", "Marketing", "Personal Development", "Academics & Languages",
                   "Music", "Business", "Fine Art" ));

}
