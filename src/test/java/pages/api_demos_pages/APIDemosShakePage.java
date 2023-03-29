package pages.api_demos_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class APIDemosShakePage {
    public APIDemosShakePage(){
        super();
    }

    @AndroidFindBy(id = "io.appium.android.apis:id/pw")
    public MobileElement inputBox;
}
