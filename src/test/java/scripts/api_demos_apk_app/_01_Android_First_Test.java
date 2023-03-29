package scripts.api_demos_apk_app;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.api_demos_pages.*;
import utililities.ElementActions;


public class _01_Android_First_Test extends Base {

    @BeforeMethod
    public void setPages(){
        apiDemosLandingPage = new APIDemosLandingPage();
        apiDemosPreferencePage = new APIDemosPreferencePage();
        apiDemosPreferenceDependenciesPage = new APIDemosPreferenceDependenciesPage();
        apiDemosAccessibilityPage = new APIDemosAccessibilityPage();
        apiDemosViewsPage = new APIDemosViewsPage();
        apiDemosAnimationPage = new APIDemosAnimationPage();
        apiDemosShakePage = new APIDemosShakePage();
    }

    /**
     * Test Case: Verify enabling Wi-Fi in API Demo app's Preference Dependencies
     * 1. Launch the API Demo app.
     * 2. Verify that the "API Demos" header is displayed.
     * 3. Tap on the "Preference" menu item.
     * 4. Tap on the "Preference dependencies" option.
     * 5. Tap on the "Wi-Fi" checkbox.
     * 6. Validate that the Wi-Fi checkbox is enabled.
     */

    @Test
    public void demoApkFile(){
        Assert.assertTrue(apiDemosLandingPage.APIDemosHeader.isDisplayed());
        ElementActions.clickOnElementInAList(apiDemosLandingPage.mainMenuItems, "Preference");
        ElementActions.clickOnElementInAList(apiDemosPreferencePage.preferencesMenuItems, "3. Preference dependencies");
        ElementActions.clickOnElement(apiDemosPreferenceDependenciesPage.WIFICheckBox);
        Assert.assertTrue(apiDemosPreferenceDependenciesPage.WIFISettings.isEnabled());
    }

    /**
     * Test Case: Verify "Custom View" in Accessibility menu is displayed
     * 1. Launch the API Demo app.
     * 2. Tap on the "Accessibility" menu item.
     * 3. Validate that the "Custom View" option is displayed.
     */

    @Test
    public void demoCustomView(){
        ElementActions.clickOnElementInAList(apiDemosLandingPage.mainMenuItems, "Accessibility");
        Assert.assertTrue(apiDemosAccessibilityPage.accessibilityMenuItems.get(3).isDisplayed());
    }

    /**
     * Test Case: Verify "Shake" input box
     * 1. Launch the API Demo app.
     * 2. Tap on the "Views" menu item.
     * 3. Tap on the "Animations" option.
     * 4. Tap on the "Shake" option.
     * 5. Validate that the input box is displayed.
     */

    @Test
    public void demoValidateInputBox(){
        ElementActions.clickOnElementInAList(apiDemosLandingPage.mainMenuItems,"Views");
        ElementActions.clickOnElementInAList(apiDemosViewsPage.viewMenuItems, "Animation");
        ElementActions.clickOnElement(apiDemosAnimationPage.shakeOption);
        Assert.assertTrue(apiDemosShakePage.inputBox.isDisplayed());
    }


}


