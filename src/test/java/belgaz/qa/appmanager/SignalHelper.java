package belgaz.qa.appmanager;

import belgaz.qa.model.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignalHelper {
    public WebDriver driver;

    public SignalHelper(WebDriver driver) {
        this.driver=driver;
    }

    public void fillFromSignal7Indicotor1(Signal7Indicotor1Data signal7Indicotor1Data) {
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys(signal7Indicotor1Data.getProhibition());
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(signal7Indicotor1Data.getNote());
    }

    public void fillFromSignal6Indicotor1(Signal6Indicotor1Data signal6Indicotor1Data) {
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys(signal6Indicotor1Data.getProhibition());
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(signal6Indicotor1Data.getNote());
    }

    public void fillFromSignal5Indicotor1(Signal5Indicotor1Data signal5Indicotor1Data) {
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys(signal5Indicotor1Data.getStatusEGR());
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(signal5Indicotor1Data.getNote());
    }

    public void fillFromSignal4Indicotor1(Signal4Indicotor1Data signal4Indicotor1Data) {
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys(signal4Indicotor1Data.getStatusEGR());
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(signal4Indicotor1Data.getNote());
    }

    public void fillFromSignal3Indicotor1(Signal3Indicotor1Data signal3Indicotor1Data) {
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys(signal3Indicotor1Data.getStatusEGR());
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(signal3Indicotor1Data.getNote());
    }

    public void fillFromSignal2Indicotor1(Signal2Indicotor1Data signal2Indicotor1Data) {
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys(signal2Indicotor1Data.getStatusEGR());
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(signal2Indicotor1Data.getNote());
    }

    public void fillFromSignal1Indicotor1(Signal1Indicotor1Data signal1Indicotor1Data) {
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys(signal1Indicotor1Data.getStatusEGR());
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(signal1Indicotor1Data.getNote());
    }

    public void chosenSignal5Indicotor1() {
        driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[5]")).click();
    }

    public void chosenSignal4Indicotor1() {
        driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[4]")).click();
    }

    public void chosenSignal3Indicotor1() {
        driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[3]")).click();
    }

    public void chosenSignal2Indicotor1() {
        driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[2]")).click();
    }

    public WebElement chosenSignal7() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[7]"));
    }

    public WebElement chosenSignal6() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[6]"));
    }

    public void clickOnSearchSignal() {
        driver.findElement(By.xpath("//*[@title='undefined']")).click();
        //div/div[1]/form[1]/div[1]/div[1]/app-select[1]/div[1]/input[1]
    }

    public void addSignal() {
        driver.findElement(By.xpath("//app-create-indicator-signal-modal/app-modal-view[1]/app-wrap-loader[@class='ng-star-inserted' and 1]/div[@class='wrapper-container-body' and 1]/div[@class='m-container cdk-drag ng-star-inserted' and 1]/div[@class='m-controls' and 3]/div[@class='controls-body' and 2]/app-button[@class='action-button ng-star-inserted' and 1]/button[@class='mat-button mat-button-base button-yellow _mat-animation-noopable' and 1 and @type='undefined']/span[@class='mat-button-wrapper' and 1]/span[1]")).click();
    }

    public void chosenSignal1Indicotor1() {
        driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[1]")).click();
    }

    public void clickAddSignal() {
        driver.findElement(By.xpath("//*[text()=' Добавить сигнал']")).click();
    }
}
