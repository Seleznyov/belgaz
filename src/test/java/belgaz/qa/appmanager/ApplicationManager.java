package belgaz.qa.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class ApplicationManager {
    public WebDriver driver;
    public NavigationHelper navigationHelper;
    public SessionHelper sessionHelper;
    public IndicatorHelper indicatorHelper;
    public SignalHelper signalHelper;
    public String baseUrl;
    public String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)) {
            driver = new InternetExplorerDriver();
        }
//        System.setProperty("webdriver.chrome.driver", "D:\\Qa\\test\\tests\\web\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
        driver.manage().window().maximize();

        baseUrl = "https://www.katalon.com/";
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        driver.get("http://dev.bgpb.pstlabs.by/login");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(6, TimeUnit.SECONDS);


        signalHelper = new SignalHelper(driver);
        indicatorHelper = new IndicatorHelper(driver);
        sessionHelper = new SessionHelper(driver);
        navigationHelper = new NavigationHelper(driver);

        sessionHelper.login("Stas", "Stas");
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

    public void openModalWindow() {
        boolean staleElement = true;
        while (staleElement) {
            try {
                driver.findElement(By.xpath("//button[3]/span[@class='mat-button-wrapper' and 1]")).click();
                staleElement = false;
            } catch (StaleElementReferenceException e) {
                staleElement = true;
            }
        }
    }

    public void sendNotification() {
        driver.findElement(By.xpath("//button[@class='button-yellow mat-button mat-button-base _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")).click();
    }


    public void stop() {
        driver.quit();
    }

    public SignalHelper getSignalHelper() {
        return signalHelper;
    }

    public IndicatorHelper getIndicatorHelper() {
        return indicatorHelper;
    }

}
