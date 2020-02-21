package belgaz.qa.tests;

import belgaz.qa.model.Indicator1.Signal1Indicotor1Data;
import belgaz.qa.model.Indicator15.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class CreateIndicatorID15 extends TestBase {
    @Test
    public void testCreateIndicatorID15() throws IOException {

        File file = new File("D:\\Qa\\test\\tests\\test1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            application.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
            application.navigationHelper.openClientsPage();
            application.driver.findElement(By.xpath("//form/div/div[2]")).click();

            application.clickOnSearch();
            application.inputSearchName(st);
            application.clickOnEnter();
            application.openFoundClient(st);
            application.navigationHelper.tabIndicators();

            application.openModalWindow();
            application.getIndicatorHelper().clickAddIndicator();

            //Иная негативная информация- (15-й индикатор)
            //---------------мой   1-й  для тестов
            //application.getIndicatorHelper().chosenIndicator1();
            WebElement element15= application.getIndicatorHelper().chosenIndicator15();
            ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element15);
            element15.click();

            application.getSignalHelper().clickAddSignal();
            application.getSignalHelper().clickOnSearchSignal();

            //Процедура банкротства - (1-й сигнал для 15-го индикатора)
            //---------------мой   1-й  для тестов
            //application.getSignalHelper().chosenSignal1Indicotor1();
            application.getSignalHelper().chosenSignal1Indicotor15();

            //---------------мой   1-й  для тестов
            //application.getSignalHelper().fillFromSignal1Indicotor1(new Signal1Indicotor1Data("Да", "Примечание"));
            application.getSignalHelper().fillFromSignal1Indicotor15(new Signal1Indicotor15Data("Примечание"));

            application.getSignalHelper().addSignal();
            application.getIndicatorHelper().createIndicator();

            application.sendNotification();
        }
    }
}

