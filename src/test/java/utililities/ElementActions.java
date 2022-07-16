package utililities;

import io.appium.java_client.MobileElement;

import java.util.List;

public class ElementActions {
    public static void clickOnElementInAList(List<MobileElement> elements, String text){
        for (MobileElement element : elements) {
            if(element.getText().equals(text)){
                element.click();
                break;
            }
        }
    }

    public static void clickOnElement(MobileElement element){
        element.click();
    }
}
