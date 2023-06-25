package TestMethods;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static Config.BaseConfig.getDriver;

public class TestMethods {

    static private WebDriver driver;
    WebDriverWait wait;

    public TestMethods(WebDriver driver)
    {
        this.driver = driver;
    }
    public HomePage callHomePage()
    {
        driver.get("");
        return new HomePage(driver);
    }
    public WebElement findElement(By by)
    {
        untilElementLocated(by);
        return getDriver().findElement(by);
    }
    public void sendKeysValue(By by, String text) {

        findElement(by).clear();
        findElement(by).sendKeys(text);
    }
    public void untilElementLocated(By by)
    {
        new WebDriverWait(getDriver(), 30).
                until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void untilElementClickable(By by)
    {
        new WebDriverWait(getDriver(), 30).
                until(ExpectedConditions.elementToBeClickable(by));
    }
    public void hoverElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public void selectOptionByValue(By by, String value) {
        Select select = new Select(findElement(by));
        select.selectByValue(value);
    }
    public String getAttribute(By by, String name) {

        return findElement(by).getAttribute(name);
    }
    public void FindBySelector(String element)
    {
        untilElementLocated(By.cssSelector(element));
        findElement(By.cssSelector(element));

    }
    public void FindByXPath(String element)
    {
        untilElementLocated(By.xpath(element));
        findElement(By.cssSelector(element));
    }
    public List<WebElement> getElementsByXpath(String s)
    {
        untilElementLocated(By.xpath(s));
        return getDriver().findElements(By.xpath(s));
    }
    public List<WebElement> getElementsSelector(String s)
    {
        untilElementLocated(By.cssSelector(s));
        return getDriver().findElements(By.cssSelector(s));
    }
    public void KeyBoardClick(By by)
    {
        untilElementLocated(by);
        findElement(by).sendKeys(Keys.ENTER);
    }
    public String getPageTitle()
    {
       return getDriver().getTitle();

    }


}
