package Pages;

import TestMethods.TestMethods;
import org.openqa.selenium.WebDriver;

import static Config.BaseConfig.getDriver;

public class HomePage extends TestMethods {


    public HomePage(WebDriver driver) {

        super(driver);
        getDriver().get("https://useinsider.com/");
    }

    public  void PageControl()
    {
        getPageTitle();
    }
}
