package TestMethods;

import Pages.CareerPage;
import Pages.HomePage;
import Pages.JobsPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static Config.BaseConfig.getDriver;
import static ConstantValue.WebSite.websiteLink;

public class TestMethods {

    static private WebDriver driver;
    WebDriverWait wait;

    public TestMethods(WebDriver driver)
    {
        this.driver = driver;
    }
    public HomePage callHomePage()
    {
        getDriver().get(websiteLink);
        return new HomePage(getDriver());
    }
    public JobsPage callJobsPage()
    {
        return new JobsPage(driver);
    }
    public CareerPage callCareerPage()
    {
        return new CareerPage(driver);
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
    public void clickElement(By by) {

        untilElementClickable(by);
        getDriver().findElement(by).click();
    }
    public void untilElementClickable(By by)
    {
        new WebDriverWait(getDriver(), 30).
                until(ExpectedConditions.elementToBeClickable(by));
    }
    public void scrollPage(int scrollValue)
    {
        JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("window.scrollBy(0,"+scrollValue+")");
    }
    public void scrollUntilElement(By by)
    {
        WebElement scroll = driver.findElement(by);
        scroll.sendKeys(Keys.PAGE_DOWN);
        /*WebElement element = new WebDriverWait(getDriver(), 30).
                until(ExpectedConditions.elementToBeClickable(by));*/
       // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void hoverElement(By by) {
        Actions actions = new Actions(getDriver());
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
    public List<WebElement> getElementsId(String s)
    {
        untilElementLocated(By.id(s));
        return getDriver().findElements(By.id(s));
    }
    public int listSizeCssSelector(String path)
    {
        return  getDriver().findElements(By.cssSelector(path)).size();
    }
    public void KeyBoardClick(By by)
    {
        untilElementLocated(by);
        findElement(by).sendKeys(Keys.ENTER);
    }

}
