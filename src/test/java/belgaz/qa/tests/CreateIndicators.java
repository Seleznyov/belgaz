package belgaz.qa.tests;


import belgaz.qa.model.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;




public class CreateIndicators extends TestBase {

    @Test
    public void test2CreateIndicators() throws Exception {

        application.openClientsPage();
        application.clickOnSearch();
        application.inputSearchName("gs_name1116");

        application.clickOnEnter();
        application.openFoundClient("gs_name1116450517");
        application.tabIndicators();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();

        // Банкротство / ликвидация / прекращение деятельности - (1-й индикатор)
        application.chosenIndicator1();

        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Процедура банкротства - (1-й сигнал для 1-го индикатора)
        application.getSignalHelper().chosenSignal1Indicotor1();
        application.getSignalHelper().fillFromSignal1Indicotor1(new Signal1Indicotor1Data("Да", "Примечание"));
        application.getSignalHelper().addSignal();

        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Исключен из реестра - (2-й сигнал для 1-го индикатора)
        application.getSignalHelper().chosenSignal2Indicotor1();
        application.getSignalHelper().fillFromSignal2Indicotor1(new Signal2Indicotor1Data("Статус в ЕГР_2-й сигнал", "Примечание"));
        application.getSignalHelper().addSignal();

        //Утрата правоспособности - (3-й сигнал для 1-го индикатора)
        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        application.getSignalHelper().chosenSignal3Indicotor1();
        application.getSignalHelper().fillFromSignal3Indicotor1(new Signal3Indicotor1Data("Статус в ЕГР_3-й_сигнал", "Примечание"));
        application.getSignalHelper().addSignal();

        //Приостановлена деятельность - (4-й сигнал для 1-го индикатора)
        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        application.getSignalHelper().chosenSignal4Indicotor1();
        application.getSignalHelper().fillFromSignal4Indicotor1(new Signal4Indicotor1Data("Статус в ЕГР_4-й сигнал", "Примечание"));
        application.getSignalHelper().addSignal();

        //Прекращение деятельности в результате реорганизации - (5-й сигнал для 1-го индикатора)
        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        application.getSignalHelper().chosenSignal5Indicotor1();
        application.getSignalHelper().fillFromSignal5Indicotor1(new Signal5Indicotor1Data("Статус в ЕГР_5-й сигнал", "Примечание"));
        application.getSignalHelper().addSignal();

        //Запрет на отчуждение доли - (6-й сигнал для 1-го индикатора)
        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        WebElement elementS6= application.getSignalHelper().chosenSignal6();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", elementS6);
        elementS6.click();

        application.getSignalHelper().fillFromSignal6Indicotor1(new Signal6Indicotor1Data("Наличие запрета на отчуждения доли_6-й сигнал", "Примечание"));
        application.getSignalHelper().addSignal();

        //В процессе ликвидации - (7-й сигнал для 1-го индикатора)
        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        WebElement elementS7= application.getSignalHelper().chosenSignal7();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", elementS7);
        elementS7.click();

        application.getSignalHelper().fillFromSignal7Indicotor1(new Signal7Indicotor1Data("Наличие запрета на отчуждения доли_7-й сигнал", "Примечание"));
        application.getSignalHelper().addSignal();

        application.createIndicator();

//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        // Просроченная задолженность - (2-й индикатор)
        application.driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[2]//span[1]")).click();
        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Просроченная задолженность - (1-й сигнал для 2-го индикатора)
        application.driver.findElement(By.xpath("//*[1]/*[@class='select-option-item' and 1]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Дата закрытия в СРП");
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("№ договора");
        application.driver.findElement(By.xpath("(//input[@type='text'])[12]")).click();
        application.driver.findElement(By.xpath("//li[1]/span[@class='select-option-item' and 1]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("Сумма исполненного обязательства");
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("Примечание");
        application.getSignalHelper().addSignal();


        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Просроченная задолженность в Банке до 30 дней включительно  - (2-й сигнал для 2-го индикатора)
        application.driver.findElement(By.xpath("//*[2]/*[@class='select-option-item' and 1]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Дата закрытия в СРП");
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("№ договора/№ счета");
        application.driver.findElement(By.xpath("(//input[@type='text'])[12]")).click();
        //li[1-93] - код валюды сделать как параметр
        application.driver.findElement(By.xpath("//li[1]/span[@class='select-option-item' and 1]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("Сумма просрочки в номинале по ОД");
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("max длительность просрочки по ОД");
        application.driver.findElement(By.xpath("(//input[@type='text'])[15]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[15]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("Сумма просрочки по %");
        application.driver.findElement(By.xpath("(//input[@type='text'])[16]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[16]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[16]")).sendKeys("max длительность просрочки по %");
        application.driver.findElement(By.xpath("(//input[@type='text'])[17]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[17]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("Примечание");
        application.getSignalHelper().addSignal();


        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Просроченная задолженность в Банке свыше 30 дней  - (3-й сигнал для 2-го индикатора)
        application.driver.findElement(By.xpath("//*[3]/*[@class='select-option-item' and 1]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Дата закрытия в СРП");
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("№ договора/№ счета");
        application.driver.findElement(By.xpath("(//input[@type='text'])[12]")).click();
        application.driver.findElement(By.xpath("//li[1]/span[@class='select-option-item' and 1]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("Сумма просрочки в номинале по ОД");
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("max длительность просрочки по ОД");
        application.driver.findElement(By.xpath("(//input[@type='text'])[15]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[15]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("Сумма просрочки по %");
        application.driver.findElement(By.xpath("(//input[@type='text'])[16]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[16]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[16]")).sendKeys("max длительность просрочки по %");
        application.driver.findElement(By.xpath("(//input[@type='text'])[17]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[17]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("Примечание");
        application.getSignalHelper().addSignal();

        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Безнадежная задолженность в Банке - (4-й сигнал для 2-го индикатора)
        application.driver.findElement(By.xpath("//*[4]/*[@class='select-option-item' and 1]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Дата закрытия в СРП");
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("№ договора/№ счета");
        application.driver.findElement(By.xpath("(//input[@type='text'])[12]")).click();
        application.driver.findElement(By.xpath("//li[1]/span[@class='select-option-item' and 1]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("Сумма просрочки в номинале по ОД");
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("Сумма просрочки по %");
        application.driver.findElement(By.xpath("(//input[@type='text'])[15]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[15]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("Примечание");
        application.getSignalHelper().addSignal();

        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Просроченная задолженность в других банках до 30 дней включительно - (5-й сигнал для 2-го индикатора)
        application.driver.findElement(By.xpath("//*[5]/*[@class='select-option-item' and 1]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Примечание");
        application.getSignalHelper().addSignal();


        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Просроченная задолженность в других банках свыше 30 дней- (6-й сигнал для 2-го индикатора)
        WebElement elementS6I2= application.driver.findElement(By.xpath("//*[6]/*[@class='select-option-item' and 1]"));
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", elementS6I2);
        elementS6I2.click();

        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Примечание");
        application.getSignalHelper().addSignal();

        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Не предоставление (отказ в предоставлении) клиентом информации о просроченной задолженности в других банках- (7-й сигнал для 2-го индикатора)
        WebElement elementS7I2= application.driver.findElement(By.xpath("//*[7]/*[@class='select-option-item' and 1]"));
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", elementS7I2);
        elementS7I2.click();

        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Примечание");
        application.getSignalHelper().addSignal();

        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        // Арест / утрата / ненадлежащее использование, снижение стоимости заложенного имущества - (3-й индикатор)
        application.getSignalHelper().driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[3]//span[1]")).click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        // Привлечение к уголовной ответственности руководителей, учредителей, акционеров, бенефициарных собственников - (4-й индикатор)
        application.getSignalHelper().driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[4]//span[1]")).click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        //Поступление в Банк запросов из Государственных фискальных органов в отношении должника и связанных с ним лиц - (5-й индикатор)
        application.getSignalHelper().driver.findElement(By.xpath("//div[@class='cdk-overlay-container']//li[5]//span[1]")).click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        //Реструктуризация задолженности в Банке - (6-й индикатор)
        WebElement element6= application.chosenIndicator6();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", element6);
        element6.click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        //Наличие проблем у взаимосвязанных с должником лиц - (7-й индикатор)
        WebElement element7= application.chosenIndicator7();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", element7);
        element7.click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        //Картотека / арест текущих счетов - (8-й индикатор)
        WebElement element8 = application.chosenIndicator8();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", element8);
        element8.click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        //Ответчик в судебном разбирательстве, приказном производстве, наличие исполнительного производства - (9-й индикатор)
        WebElement element9= application.chosenIndicator9();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", element9);
        element9.click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        //Приостановление, прекращение действия, аннулирование (отзыв) специальных разрешений (лицензий) - (10-й индикатор)
        WebElement element10= application.chosenIndicator10();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", element10);
        element10.click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        //Снижение поступлений денежных средств на счета в Банке на 25 % и более - (11-й индикатор)
        WebElement element11= application.chosenIndicator11();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", element11);
        element11.click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        //Применение к клиенту расширенных процедур внутреннего контроля - (12-й индикатор)
        WebElement element12= application.chosenIndicator12();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", element12);
        element12.click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        // Изменение в составе / структуре собственников / руководителей - (13-й индикатор)
        WebElement element13= application.chosenIndicator13();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", element13);
        element13.click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        //Ухудшение финансового состояния- (14-й индикатор)
        WebElement element14= application.chosenIndicator14();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", element14);
        element14.click();
        application.createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.clickAddIndicator();
        //Иная негативная информация- (15-й индикатор)
        WebElement element15= application.chosenIndicator15();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", element15);
        element15.click();
        application.createIndicator();
    }
}
