package pages.api_demos_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class APIDemosViewsPage {
    public APIDemosViewsPage(){
        super();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1']")
    public List<MobileElement> viewMenuItems;
}
