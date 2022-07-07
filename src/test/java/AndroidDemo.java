import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDemo {
    @Test
    public void demoApkFile(){
        DesiredCapabilities caps = new DesiredCapabilities();

        File apkAppFile = new File("src/test/java/apps/ApiDemos.apk");

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_4_28");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        caps.setCapability(MobileCapabilityType.APP, apkAppFile.getAbsolutePath());

        URL appiumURL;
        AndroidDriver<AndroidElement> androidDriver;
        try {
            appiumURL = new URL("http://127.0.0.1:4723/wd/hub/");
            androidDriver = new AndroidDriver<AndroidElement>(appiumURL, caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
