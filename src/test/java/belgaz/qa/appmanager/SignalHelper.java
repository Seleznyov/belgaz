package belgaz.qa.appmanager;

import belgaz.qa.model.Indicator1.*;
import belgaz.qa.model.Indicator15.Signal1Indicotor15Data;
import belgaz.qa.model.Indicator2.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignalHelper extends HelperBase  {

    public SignalHelper(WebDriver driver) {
        super(driver);
    }

    public void fillFromSignal7Indicotor1(Signal7Indicotor1Data signal7Indicotor1Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal7Indicotor1Data.getProhibition());
        type(By.xpath("(//input[@type='text'])[11]"), signal7Indicotor1Data.getNote());
    }
    public void fillFromSignal6Indicotor1(Signal6Indicotor1Data signal6Indicotor1Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal6Indicotor1Data.getProhibition());
        type(By.xpath("(//input[@type='text'])[11]"), signal6Indicotor1Data.getNote());
    }
    public void fillFromSignal5Indicotor1(Signal5Indicotor1Data signal5Indicotor1Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal5Indicotor1Data.getStatusEGR());
        type(By.xpath("(//input[@type='text'])[11]"), signal5Indicotor1Data.getNote());
    }
    public void fillFromSignal4Indicotor1(Signal4Indicotor1Data signal4Indicotor1Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal4Indicotor1Data.getStatusEGR());
        type(By.xpath("(//input[@type='text'])[11]"), signal4Indicotor1Data.getNote());
    }
    public void fillFromSignal3Indicotor1(Signal3Indicotor1Data signal3Indicotor1Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal3Indicotor1Data.getStatusEGR());
        type(By.xpath("(//input[@type='text'])[11]"), signal3Indicotor1Data.getNote());
    }
    public void fillFromSignal2Indicotor1(Signal2Indicotor1Data signal2Indicotor1Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal2Indicotor1Data.getStatusEGR());
        type(By.xpath("(//input[@type='text'])[11]"), signal2Indicotor1Data.getNote());
    }
    public void fillFromSignal1Indicotor1(Signal1Indicotor1Data signal1Indicotor1Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal1Indicotor1Data.getStatusEGR());
        type(By.xpath("(//input[@type='text'])[11]"), signal1Indicotor1Data.getNote());
    }
    //--------------------------------------------------------------------------------------------------------

    public void fillFromSignal7Indicotor2(Signal7Indicotor2Data signal7Indicotor2Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal7Indicotor2Data.getNote());
    }
    public void fillFromSignal6Indicotor2(Signal6Indicotor2Data signal6Indicotor2Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal6Indicotor2Data.getNote());
    }
    public void fillFromSignal5Indicotor2(Signal5Indicotor2Data signal5Indicotor2Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal5Indicotor2Data.getNote());
    }
    public void fillFromSignal4Indicotor2(Signal4Indicotor2Data signal4Indicotor2Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal4Indicotor2Data.getDataCRP());
        type(By.xpath("(//input[@type='text'])[11]"), signal4Indicotor2Data.getContract());
        click(By.xpath("(//input[@type='text'])[12]"));
        click(By.xpath("//li[1]/span[@class='select-option-item' and 1]"));
        type(By.xpath("(//input[@type='text'])[13]"), signal4Indicotor2Data.getSummOD());
        type(By.xpath("(//input[@type='text'])[14]"), signal4Indicotor2Data.getSumm());
        type(By.xpath("(//input[@type='text'])[15]"), signal4Indicotor2Data.getNote());
    }
    public  void fillFromSignal3Indicotor2(Signal3Indicotor2Data signal3Indicotor2Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal3Indicotor2Data.getDataCRP());
        type(By.xpath("(//input[@type='text'])[11]"), signal3Indicotor2Data.getContract());
        click(By.xpath("(//input[@type='text'])[12]"));
        click(By.xpath("//li[1]/span[@class='select-option-item' and 1]"));
        type(By.xpath("(//input[@type='text'])[13]"), signal3Indicotor2Data.getSummOD());
        type(By.xpath("(//input[@type='text'])[14]"), signal3Indicotor2Data.getMaxsummOD());
        type(By.xpath("(//input[@type='text'])[15]"), signal3Indicotor2Data.getSumm());
        type(By.xpath("(//input[@type='text'])[16]"), signal3Indicotor2Data.getMaxdelay());
        type(By.xpath("(//input[@type='text'])[17]"), signal3Indicotor2Data.getNote());
    }
    public void fillFromSignal2Indicotor2(Signal2Indicotor2Data signal2Indicotor2Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal2Indicotor2Data.getDataCRP());
        type(By.xpath("(//input[@type='text'])[11]"), signal2Indicotor2Data.getContract());
        click(By.xpath("(//input[@type='text'])[12]"));
        click(By.xpath("//li[1]/span[@class='select-option-item' and 1]"));
        type(By.xpath("(//input[@type='text'])[13]"), signal2Indicotor2Data.getSummOD());
        type(By.xpath("(//input[@type='text'])[14]"), signal2Indicotor2Data.getMaxsummOD());
        type(By.xpath("(//input[@type='text'])[15]"), signal2Indicotor2Data.getOverdue());
        type(By.xpath("(//input[@type='text'])[16]"), signal2Indicotor2Data.getMaxdelay());
        type(By.xpath("(//input[@type='text'])[17]"), signal2Indicotor2Data.getNote());
    }
    public  void fillFromSignal1Indicotor2(Signal1Indicotor2Data signal1Indicotor2Data) {
        type(By.xpath("(//input[@type='text'])[10]"), signal1Indicotor2Data.getDataCRP());
        type(By.xpath("(//input[@type='text'])[11]"), signal1Indicotor2Data.getContract());
        click(By.xpath("(//input[@type='text'])[12]"));
        click(By.xpath("//li[1]/span[@class='select-option-item' and 1]"));
        type(By.xpath("(//input[@type='text'])[13]"), signal1Indicotor2Data.getSumm());
        type(By.xpath("(//input[@type='text'])[14]"), signal1Indicotor2Data.getNote());
    }
    //--------------------------------------------------------------------------------------------------------
    public void fillFromSignal1Indicotor15(Signal1Indicotor15Data signal1Indicotor15Data) {
       type(By.xpath("(//input[@type='text'])[10]"), signal1Indicotor15Data.getNote());}
    //--------------------------------------------------------------------------------------------------------

    public void chosenSignal5Indicotor1() {
        click(By.xpath("//div[@class='cdk-overlay-container']//li[5]"));
    }
    public void chosenSignal4Indicotor1() {
        click(By.xpath("//div[@class='cdk-overlay-container']//li[4]"));
    }
    public void chosenSignal3Indicotor1() {
        click(By.xpath("//div[@class='cdk-overlay-container']//li[3]"));
    }
    public void chosenSignal2Indicotor1() {
        click(By.xpath("//div[@class='cdk-overlay-container']//li[2]"));
    }
    public void chosenSignal1Indicotor1() {
        click(By.xpath("//div[@class='cdk-overlay-container']//li[1]"));
    }


    public WebElement chosenSignal7() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[7]"));
    }
    public WebElement chosenSignal6() {
        return driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[6]"));
    }

    //--------------------------------------------------------------------------------------------------------
    public WebElement chosenSignal7Indicotor2() {
        return driver.findElement(By.xpath("//*[7]/*[@class='select-option-item' and 1]"));
    }
    public WebElement chosenSignal6Indicotor2() {
        return driver.findElement(By.xpath("//*[6]/*[@class='select-option-item' and 1]"));
    }
    public  void chosenSignal5Indicotor2() {
        click(By.xpath("//*[5]/*[@class='select-option-item' and 1]"));
    }
    public void chosenSignal4Indicotor2() {
        click(By.xpath("//*[4]/*[@class='select-option-item' and 1]"));
    }
    public  void chosenSignal3Indicotor2() {
        click(By.xpath("//*[3]/*[@class='select-option-item' and 1]"));
    }
    public  void chosenSignal2Indicotor2() { click(By.xpath("//*[2]/*[@class='select-option-item' and 1]")); }
    public  void chosenSignal1Indicotor2() {
        click(By.xpath("//*[1]/*[@class='select-option-item' and 1]"));
    }
    //--------------------------------------------------------------------------------------------------------
    public  void chosenSignal1Indicotor15() {
        click(By.xpath("//li[1]/span[@class='select-option-item' and 1]"));
    }
    //--------------------------------------------------------------------------------------------------------
    public void clickOnSearchSignal() {
        click(By.xpath("//*[@title='undefined']"));
        //div/div[1]/form[1]/div[1]/div[1]/app-select[1]/div[1]/input[1]
    }
    public void addSignal() {
        click(By.xpath("//*[text()=' Добавить']"));
    }
    public void clickAddSignal() {
        click(By.xpath("//*[text()=' Добавить сигнал']"));
    }
}
