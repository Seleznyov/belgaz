package belgaz.qa.tests;

import org.testng.annotations.Test;


public class DeletionIndicators extends TestBase {

    @Test
    public void test3DeleteIndicators() throws Exception {
        application.openClientsPage();

        application.clickOnSearch();
        application.inputSearchName("gs_name1116");
        application.clickOnEnter();
        application.openFoundClient("gs_name1116450517");
        application.tabIndicators();
        application.selectALLindicators();
        application.deleteSelectedIndicators();
    }
}




