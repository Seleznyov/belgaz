package belgaz.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void openClientsPage() {
       // click(By.xpath("//a[@href='/clients']"));

        boolean staleElement = true;
        while(staleElement){
            try{
                driver.findElement(By.xpath("//a[@href='/clients']")).click();
                staleElement = false;
    } catch(StaleElementReferenceException e){
        staleElement = true;
    }
}

    }
    public void openIndicatorsPage() {
        click(By.xpath("//a[@href='/indicators']"));
    }

    public void tabIndicators() {
        click(By.xpath("//app-tab-links[@class='ng-star-inserted']//div[3]"));
    }
}
