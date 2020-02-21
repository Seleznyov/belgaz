package belgaz.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        type(By.xpath("//input"),username);
        type(By.xpath("//input[@type='password']"),password);
        click(By.xpath("//span/span"));
    }
}
