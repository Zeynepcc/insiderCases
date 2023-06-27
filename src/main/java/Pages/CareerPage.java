package Pages;

import TestMethods.TestMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ConstantValue.CareerElements.clickCareer;
import static ConstantValue.CareerElements.clickMore;

public class CareerPage extends TestMethods {

    public CareerPage(WebDriver driver) {
        super(driver);
    }
    public void visibleIsLocationPrepare()
    {
        clickElement(clickMore);
        clickElement(clickCareer);
    }
    public boolean careerLocationSection()
    {
        return findElement(By.id("career-our-location")).isDisplayed();
    }
    public boolean careerTeamSection()
    {
       return findElement(By.id("career-find-our-calling")).isDisplayed();
    }
    public boolean careerLifeAtInsiderSection()
    {
        return findElement(By.cssSelector(" section.elementor-element-a8e7b90")).isDisplayed();
    }
}
