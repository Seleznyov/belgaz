package belgaz.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;
    public  SignalHelper signalHelper;
    public String baseUrl;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "D:\\Qa\\test\\tests\\web\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        baseUrl = "https://www.katalon.com/";
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

        signalHelper= new SignalHelper(driver);

        login("Stas", "admin");
    }

    public void login(String username, String password) {
        driver.get("http://dev.bgpb.pstlabs.by/login");
        driver.findElement(By.xpath("//input")).click();
        driver.findElement(By.xpath("//input")).clear();
        driver.findElement(By.xpath("//input")).sendKeys(username);
        driver.findElement(By.xpath("//div/div")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//span/span")).click();
    }

    public void openFoundClient(String clientName) {
        driver.findElement(By.xpath("//a[contains(text(),'" + clientName + "')]")).click();
    }

    public void clickOnEnter() {
        driver.findElement(By.xpath("//form/div/div[2]/button")).click();
    }

    public void inputSearchName(String searchName) {
        driver.findElement(By.xpath("//input")).sendKeys(searchName);
    }

    public void clickOnSearch() {
        driver.findElement(By.xpath("//input[@class='ng-pristine ng-valid ng-touched']")).click();
    }

    public void openClientsPage() {
        driver.findElement(By.xpath("//a[@href='/clients']")).click();
    }

    public WebElement chosenIndicator15() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[15]//span[1]"));
    }

    public WebElement chosenIndicator14() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[14]//span[1]"));
    }

    public WebElement chosenIndicator13() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[13]//span[1]"));
    }

    public WebElement chosenIndicator12() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[12]//span[1]"));
    }

    public WebElement chosenIndicator11() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[11]//span[1]"));
    }

    public WebElement chosenIndicator10() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[10]//span[1]"));
    }

    public WebElement chosenIndicator9() {
        return  driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[9]//span[1]"));
    }

    public WebElement chosenIndicator8() {
        return  driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[8]//span[1]"));
    }

    public WebElement chosenIndicator7() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[7]//span[1]"));
    }

    public WebElement chosenIndicator6() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[6]//span[1]"));
    }

    public void createIndicator() {
        driver.findElement(By.xpath("//app-button[@class='action-button ng-star-inserted']//button[@class='mat-button mat-button-base button-yellow _mat-animation-noopable']//span[@class='mat-button-wrapper']//span")).click();
    }

    public void chosenIndicator1() {
        driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[1]//span[1]")).click();
    }

    public void clickAddIndicator() {
        driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
    }

    public void tabIndicators() {
       driver.findElement(By.xpath("//app-tab-links[@class='ng-star-inserted']//div[3]")).click();
    }

    public void openModalWindow() {
        driver.findElement(By.xpath("//button/span")).click();
    }

    public void stop() {
        driver.quit();
    }

    public void deleteSelectedIndicators() {
        driver.findElement(By.xpath("//app-button[@class='ng-star-inserted']/button[@class='mat-button mat-button-base button-grey _mat-animation-noopable' and 1]/span[@class='mat-button-wrapper' and 1]/span[1]")).click();
    }

    public void selectALLindicators() {
        driver.findElement(By.xpath("//*[@class='credit-head-td checkbox-col ng-star-inserted']/*[@class='mat-checkbox mat-primary _mat-animation-noopable']/*[@class='mat-checkbox-layout']/*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
    }

    public SignalHelper getSignalHelper() {
        return signalHelper;
    }
}
