import Config.BaseConfig;
import Pages.HomePage;
import Pages.JobsPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JobsPageTests extends BaseConfig {

    @Before
    public void PrepareTest() throws InterruptedException {
        new HomePage(getDriver()).callJobsPage().openPositionPrepare();
    }

    @Test
    public void jobsIsPresenceTest() {
        int value = new JobsPage(getDriver()).jobsIsPresence();
        if (value > 0) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

    }

    @Test
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
}
