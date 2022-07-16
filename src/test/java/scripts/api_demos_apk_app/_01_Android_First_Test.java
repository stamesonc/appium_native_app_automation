package scripts.api_demos_apk_app;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.api_demos_pages.APIDemosLandingPage;
import pages.api_demos_pages.APIDemosPreferenceDependenciesPage;
import pages.api_demos_pages.APIDemosPreferencePage;
import utililities.ElementActions;


public class _01_Android_First_Test extends Base {

    @BeforeClass
    public void setPages(){
        apiDemosLandingPage = new APIDemosLandingPage();
        apiDemosPreferencePage = new APIDemosPreferencePage();
        apiDemosPreferenceDependenciesPage = new APIDemosPreferenceDependenciesPage();
    }

    @Test
    public void demoApkFile(){
        Assert.assertTrue(apiDemosLandingPage.APIDemosHeader.isDisplayed());
        ElementActions.clickOnElementInAList(apiDemosLandingPage.mainMenuItems, "Preference");
        ElementActions.clickOnElementInAList(apiDemosPreferencePage.preferencesMenuItems, "3. Preference dependencies");
        ElementActions.clickOnElement(apiDemosPreferenceDependenciesPage.WIFICheckBox);
        Assert.assertTrue(apiDemosPreferenceDependenciesPage.WIFISettings.isEnabled());
    }
}
