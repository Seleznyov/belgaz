package belgaz.qa.tests;

import belgaz.qa.appmanager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeClass;

import java.time.LocalDate;
import java.util.List;

public class TestBase  {
    public final ApplicationManager application = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        application.init();
    }

    //    @AfterClass(alwaysRun = true)
//  public void tearDown() throws Exception {
//      application.stop();
//  }
}
