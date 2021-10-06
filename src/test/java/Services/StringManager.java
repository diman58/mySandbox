package Services;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class StringManager {

    public static String getXpath(WebElement element) {

        int start = 0;
        String xPath = element.toString();
        char[] chars = xPath.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='/') {
                if(chars[i+1]=='/') {
                    start = i;
                }
            }
        }

        xPath = xPath.substring(start);

        if((xPath.charAt(xPath.length()-1)=='\'') || ((xPath.charAt(xPath.length()-1)==']') &&
                (xPath.charAt(xPath.length()-2)==']'))) {
            xPath = xPath.substring(0,xPath.length()-1);
        }

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

}
