package pages.api_demos_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class APIDemosAnimationPage {

    public APIDemosAnimationPage(){
        super();
    }

    @AndroidFindBy(accessibility = "Shake")
    public MobileElement shakeOption;
}
