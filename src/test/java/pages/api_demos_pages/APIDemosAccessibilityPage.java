package pages.api_demos_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class APIDemosAccessibilityPage extends BasePage{

    public APIDemosAccessibilityPage(){
        super();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1']")
    public List<MobileElement> accessibilityMenuItems;

}
