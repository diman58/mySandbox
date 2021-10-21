package Services;

import io.qameta.allure.Allure;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

import static Utils.CommonConditions.*;

public class StringManager {

    public static int randomCategory;
    public static int randomSubCategory;
    public static int randomHourlyRate;
    public static FileWriter writer;

    static {
        try {
            writer = new FileWriter("notes.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getXpath(WebElement element) {

        int start = 0;
        String xPath = element.toString();
        //System.out.println("1 "+xPath);
        char[] chars = xPath.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='/') {
                if(chars[i+1]=='/') {
                    start = i;
                }
            }
        }
        //System.out.println("2 "+xPath);
        xPath = xPath.substring(start);
        //System.out.println("# "+xPath);
        if((xPath.charAt(xPath.length()-1)=='\'') || ((xPath.charAt(xPath.length()-1)==']') &&
                (xPath.charAt(xPath.length()-2)==']'))) {
            xPath = xPath.substring(0,xPath.length()-1);
        }
        //System.out.println("4 "+xPath);
        return xPath;
    }

    public static List<String> convertListOfElementsInListOfValues(List<WebElement> list) {
        List<String> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i).getText());
        }

        return list1;
    }

    public static List<String> convertListOfElementsInListOfAttrValues(List<WebElement> list) {
        List<String> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i).getAttribute("href").substring(26));
        }

        return convertAttrsToValues(list1);
            }

    public static List<String> convertAttrsToValues(List<String> list) {
        List<String> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i).substring(0,1).toUpperCase()+list.get(i).substring(1));
        }

        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i).contains("-and-")) {
                String temp = list1.get(i);
                int begin = list1.get(i).indexOf('-');
                int end = list1.get(i).indexOf("d-")+2;
                temp = temp.substring(0,begin) + " & " + temp.substring(end,end+1).toUpperCase()+temp.substring(end+1);
                list1.set(i,temp);
            }

            if(list1.get(i).contains("-")) {
                String temp = list1.get(i);
                int begin = list1.get(i).indexOf('-');
                int end = begin+1;
                temp = temp.substring(0,begin) +" " + temp.substring(end,end+1).toUpperCase() + temp.substring(end+1);
                list1.set(i,temp);
            }
        }

        return list1;
    }

    public static List<String> excludeCategories(List<String> list) {
        List<String> temp = list.subList(11,list.size());
        return temp;
    }

    public static String getValueOfAttr(WebElement element, String attr) {
        return element.getAttribute(attr);
    }

    public static String getTextValueOfElement(WebElement element) {
        return element.getText();
    }

    public static int getRandomCategory() {
        randomCategory = new Random().nextInt(11);
        return randomCategory;
    }

    public static int getRandomSubCategory() {

        switch (randomCategory) {
            case 0: randomSubCategory = (new Random().nextInt(expectedSubsForAcademicsLanguages.size()))+1;
            break;
            case 1: randomSubCategory = (new Random().nextInt(expectedSubsForBusiness.size()))+1;
            break;
            case 2: randomSubCategory = (new Random().nextInt(expectedSubsForDesign.size()))+1;
            break;
            case 3: randomSubCategory = 1;
            break;
            case 4: randomSubCategory = (new Random().nextInt(expectedSubsForHealthFitness.size()))+1;
            break;
            case 5: randomSubCategory = (new Random().nextInt(expectedSubsForLifestyle.size()))+1;
            break;
            case 6: randomSubCategory = (new Random().nextInt(expectedSubsForMarketing.size()))+1;
            break;
            case 7: randomSubCategory = (new Random().nextInt(expectedSubsForMusic.size()))+1;
            break;
            case 8: randomSubCategory = (new Random().nextInt(expectedSubsForPersonalDevelopment.size()))+1;
            break;
            case 9: randomSubCategory = (new Random().nextInt(expectedSubsForPhotography.size()))+1;
            break;
            case 10: randomSubCategory = (new Random().nextInt(expectedSubsForTechnology.size()))+1;
            break;

            default: throw new RuntimeException("problem in switch with random category");
        }

        randomSubCategory = randomSubCategory+10;

        try {
            writer.write("cat "+randomCategory);
            writer.write("sub "+randomSubCategory);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return randomSubCategory;
    }

    public static int getRandomHourlyRate() {
        randomHourlyRate = new Random().nextInt(50);
        return randomHourlyRate;
    }

}
