package belgaz.qa.tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class DeletionIndicators extends TestBase {

    @Test
    public void test3DeleteIndicators() throws Exception {

        application.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        application.navigationHelper.openClientsPage();

        application.clickOnSearch();
        application.inputSearchName("gs_name19938");
        application.clickOnEnter();
        application.openFoundClient("gs_name1993884235");
        application.navigationHelper.tabIndicators();
        application.getIndicatorHelper().selectALLindicators();
        application.getIndicatorHelper().deleteSelectedIndicators();
    }
}




