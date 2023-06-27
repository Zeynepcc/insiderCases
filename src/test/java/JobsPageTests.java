import Config.BaseConfig;
import Pages.HomePage;
import Pages.JobsPage;
import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JobsPageTests extends BaseConfig {

    @Before
    public void PrepareTest() throws InterruptedException {
        new HomePage(getDriver()).callJobsPage().openPositionPrepare();
    }

    @Test
    @Description("Job List Presence Control")
    public void jobsIsPresenceTest() {
        int value = new JobsPage(getDriver()).jobsIsPresence();
        if (value > 0) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

    }

    @Test
    @Description("Job List Position Control")
    public void JobsPositionIsQATest() {
        int listSize = new JobsPage(getDriver()).JobsPositionIsNull().size();
        for (int i = 0; i < listSize; i++) {
            if (new JobsPage(getDriver()).JobsPositionIsNull().get(i) == false) {
                Assert.assertTrue(false);
                break;
            } else
                Assert.assertTrue(true);

        }

    }

    @Test
    @Description("Job List Department Control")
    public void JobsDepartmanIsQATest() {
        int listSize = new JobsPage(getDriver()).JobsDepartmentIsNull().size();
        for (int i = 0; i < listSize; i++) {
            if (new JobsPage(getDriver()).JobsDepartmentIsNull().get(i) == false) {
                Assert.assertTrue(false);
                break;
            } else
                Assert.assertTrue(true);

        }

    }
    @Test
    @Description("Job List Location Control")
    public void JobsLocationIsQATest() {

        int listSize = new JobsPage(getDriver()).JobsLocationIsNull().size();
        for (int i = 0; i < listSize; i++) {
            if (new JobsPage(getDriver()).JobsLocationIsNull().get(i) == false) {
                Assert.assertTrue(false);
                break;
            } else
                Assert.assertTrue(true);

        }

    }
    @Test
    @Description("Job List Apply Button Control")
    public void applyButtonIsNull() {

        new JobsPage(getDriver()).applyButtonIsNull();
        Assert.assertTrue(new JobsPage(getDriver()).applyButtonIsNull());
    }
    @Test
    @Description("Lever Navigate Control")
    public void leverNavigateTest()
    {
       Assert.assertFalse(new JobsPage(getDriver()).leverNavigate());

    }
}
