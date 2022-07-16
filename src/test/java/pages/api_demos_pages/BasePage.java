package pages.api_demos_pages;

import core.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }
}
