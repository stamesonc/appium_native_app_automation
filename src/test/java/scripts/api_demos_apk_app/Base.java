package scripts.api_demos_apk_app;

import core.Driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.api_demos_pages.*;


public class Base {
    public static AppiumDriver<MobileElement> driver = null;

    APIDemosLandingPage apiDemosLandingPage;
    APIDemosPreferencePage apiDemosPreferencePage;
    APIDemosPreferenceDependenciesPage apiDemosPreferenceDependenciesPage;
    APIDemosAccessibilityPage apiDemosAccessibilityPage;
    APIDemosViewsPage apiDemosViewsPage;
    APIDemosAnimationPage apiDemosAnimationPage;
    APIDemosShakePage apiDemosShakePage;


    @BeforeMethod
    public void setDriver(){
        driver = Driver.getDriver();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}
