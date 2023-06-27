package Pages;

import TestMethods.TestMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Config.BaseConfig.getDriver;
import static ConstantValue.WebSite.websiteLink;

public class HomePage extends TestMethods {


    public HomePage(WebDriver driver) {

        super(driver);
        getDriver().get(websiteLink);
        clickElement(By.id("wt-cli-accept-all-btn"));
    }
}
