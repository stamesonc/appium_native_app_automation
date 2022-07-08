import core.ConfigReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDemo {
    @Test
    public void demoApkFile(){
        DesiredCapabilities caps = new DesiredCapabilities();

        File apkAppFile = new File("src/test/java/apps/ApiDemos.apk");

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
        //caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        caps.setCapability(MobileCapabilityType.APP, apkAppFile.getAbsolutePath());

        URL appiumURL;
        AndroidDriver<AndroidElement> androidDriver = null;
        try {
            appiumURL = new URL("http://127.0.0.1:4723/wd/hub/");
            androidDriver = new AndroidDriver<AndroidElement>(appiumURL, caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        androidDriver.findElementByAccessibilityId("3. Preference dependencies").click();
        AndroidElement WIFICheckBox = androidDriver.findElementById("android:id/checkbox");
        AndroidElement WIFISettings = androidDriver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']");
        WIFICheckBox.click();
        Assert.assertTrue(WIFISettings.isEnabled());
    }
}
