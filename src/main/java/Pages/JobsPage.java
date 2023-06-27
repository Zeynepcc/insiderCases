package Pages;

import TestMethods.TestMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static ConstantValue.CareerElements.clickCareer;
import static ConstantValue.CareerElements.clickMore;


public class JobsPage extends TestMethods {


    public JobsPage(WebDriver driver) {
        super(driver);
    }
    
    public void openPositionPrepare() throws InterruptedException {

        clickElement(clickMore);
        clickElement(clickCareer);
        scrollPage(2600);
        Thread.sleep(2000);
        clickElement(By.cssSelector("#career-find-our-calling > div > div > a"));
        scrollPage(2000);
        clickElement(By.cssSelector("div:nth-child(23) > .mt-0> a"));
        clickElement(By.cssSelector(".col-lg-7  a"));
        clickElement(By.id("select2-filter-by-location-container"));
        Thread.sleep(2000);
        clickElement(By.xpath("//span[2]/ul/li[2]"));
        scrollPage(400);
        Thread.sleep(2000);
        //scrollUntilElement(By.id("career-our-location")); //--> elementi bu şekilde bulduramadım buton sürekli altta yada üste kalıyor

    }

    public int jobsIsPresence() {

        String number = findElement(By.id("deneme")).getText();
        return Integer.parseInt(number);

    }

    public ArrayList<Boolean> JobsPositionIsNull() {
        ArrayList<Boolean> position = new ArrayList<>();
        for (int i = 1; i <= listSizeCssSelector("#jobs-list > div"); i++) {
            position.add(getElementsSelector("#jobs-list > div:nth-child(" + i + ") > div > p").get(0).isDisplayed());

        }
        return position;

    }

    public ArrayList<Boolean> JobsDepartmentIsNull() {
        ArrayList<Boolean> department = new ArrayList<>();
        for (int i = 1; i <= listSizeCssSelector("#jobs-list > div"); i++) {
            department.add(getElementsSelector("#jobs-list > div:nth-child(" + i + ") > div > span").get(0).isDisplayed());

        }
        return department;

    }

    public ArrayList<Boolean> JobsLocationIsNull() {
        ArrayList<Boolean> location = new ArrayList<>();
        for (int i = 1; i <= listSizeCssSelector("#jobs-list > div"); i++) {
            location.add(getElementsSelector("#jobs-list > div:nth-child(" + i + ") > div > div").get(0).isDisplayed());

        }
        return location;

    }
    public boolean applyButtonIsNull() {

        scrollPage(200);
        for (int i = 1; i <= listSizeCssSelector("#jobs-list > div"); i++) {


            getElementsSelector("#jobs-list > div:nth-child(" + i + ") > div > p").get(0);
            hoverElement(By.cssSelector("#jobs-list > div:nth-child(" + i + ") > div "));
            if (!getElementsSelector("#jobs-list > div:nth-child(" + i + ") > div > a").get(0).isDisplayed()) {
                return false;

            }
        }
        return true;
    }
    public boolean leverNavigate()
    {
        scrollPage(200);
        hoverElement(By.cssSelector("#jobs-list > div:nth-child(3) > div"));
        clickElement(By.cssSelector("#jobs-list > div:nth-child(3) a"));
        return secondWindow();
    }
}
