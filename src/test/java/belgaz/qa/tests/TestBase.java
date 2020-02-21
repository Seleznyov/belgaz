package belgaz.qa.tests;

import belgaz.qa.appmanager.ApplicationManager;
import org.testng.annotations.BeforeClass;

public class TestBase {
    public final ApplicationManager application = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        application.init();
    }

    //    @AfterClass(alwaysRun = true)
//  public void tearDown() throws Exception {
//      application.stop();
//  }

}
