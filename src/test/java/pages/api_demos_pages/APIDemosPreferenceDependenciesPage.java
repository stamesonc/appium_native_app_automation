package pages.api_demos_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class APIDemosPreferenceDependenciesPage extends BasePage{
    public APIDemosPreferenceDependenciesPage(){
        super();
    }

    @AndroidFindBy(id = "android:id/checkbox")
    public MobileElement WIFICheckBox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    public MobileElement WIFISettings;
}
