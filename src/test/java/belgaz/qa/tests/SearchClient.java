package belgaz.qa.tests;

import org.testng.annotations.Test;

public class SearchClient extends TestBase {
    @Test
    public void test1SearchClient() throws Exception {
        // for (int i = 0; i < 7; i++) {
        application.openClientsPage();
        //driver.findElement(By.xpath("//a[@href='/indicators']")).click();
        application.clickOnSearch();
        application.inputSearchName("gs_name1116");
        application.clickOnEnter();
        application.openFoundClient("gs_name1116450517");
        //}
    }
}
