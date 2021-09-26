package Services;

import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

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

        if(xPath.charAt(xPath.length()-1)=='\'') {
            xPath = xPath.substring(0,xPath.length()-1);
        }

        return xPath;
    }
}
