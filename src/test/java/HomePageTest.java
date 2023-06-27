import Config.BaseConfig;
import Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends BaseConfig {


    //Senaryo sayısı az olduğu için bdd de kullanmayacağım için tek bir class'ta yazıyorum case'leri
    @Test
    public void homePageVisibleControl()
    {
        Assert.assertEquals("https://useinsider.com/",getDriver().getCurrentUrl()) ;
    }
}
