import Config.BaseConfig;
import Pages.CareerPage;
import Pages.HomePage;
import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CareerPageTests extends BaseConfig {

    @Before
    public void PrepareTest()
    {
        new HomePage(getDriver()).callCareerPage().visibleIsLocationPrepare();
    }
    @Test
    @Description("Career Page 'Location' Section is visible")
     public void sectionLocationVisibleTest()
    {
        boolean value = new CareerPage(getDriver()).careerLocationSection();
        Assert.assertTrue(value);
    }
    @Test
    @Description("Career Page 'Teams' Section is visible")
    public void sectionTeamVisibleTest()
    {
        boolean value = new CareerPage(getDriver()).careerTeamSection();
        Assert.assertTrue(value);
    }
    @Test
    @Description("Career Page 'Life at insider'  Section is visible")
    public void sectionLifeAtInsiderVisibleTest()
    {
       boolean value =  new CareerPage(getDriver()).careerLifeAtInsiderSection();
       Assert.assertTrue(value);

    }
}
