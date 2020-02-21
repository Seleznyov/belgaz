package belgaz.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndicatorHelper extends HelperBase{

    public IndicatorHelper(WebDriver driver) {
        super(driver);
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
        return  driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[6]//span[1]"));
    }

    public void chosenIndicator5() {
        click(By.xpath("//div[@class='cdk-overlay-container']//li[5]//span[1]"));
    }
    public void chosenIndicator4() {
        click(By.xpath("//div[@class='cdk-overlay-container']//li[4]//span[1]"));
    }
    public void chosenIndicator3() {
        click(By.xpath("//div[@class='cdk-overlay-container']//li[3]//span[1]"));
    }
    public void chosenIndicator2() {
        click(By.xpath("//div[@class='cdk-overlay-container']//li[2]//span[1]"));
    }
    public void chosenIndicator1() {
        click(By.xpath("//div[@class='cdk-overlay-container']//li[1]//span[1]"));
    }

    public void createIndicator() {
        click(By.xpath("//app-button[@class='action-button ng-star-inserted']//button[@class='mat-button mat-button-base button-yellow _mat-animation-noopable']//span[@class='mat-button-wrapper']//span"));
    }
    public void clickAddIndicator() {
        click(By.xpath("(//input[@type='text'])[8]"));
    }
    public void deleteSelectedIndicators() {
        click(By.xpath("//app-button[@class='ng-star-inserted']/button[@class='mat-button mat-button-base button-grey _mat-animation-noopable' and 1]/span[@class='mat-button-wrapper' and 1]/span[1]"));
    }
    public void selectALLindicators() {
        click(By.xpath("//*[@class='credit-head-td checkbox-col ng-star-inserted']/*[@class='mat-checkbox mat-primary _mat-animation-noopable']/*[@class='mat-checkbox-layout']/*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
    }
}
