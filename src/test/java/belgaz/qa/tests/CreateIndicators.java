package belgaz.qa.tests;

import belgaz.qa.model.Indicator1.*;
import belgaz.qa.model.Indicator2.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateIndicators extends TestBase {

    @Test
    public void test2CreateIndicators() throws Exception {
        application.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        application.navigationHelper.openClientsPage();

        application.clickOnSearch();
        application.inputSearchName("gs_name19938");

        application.clickOnEnter();
        application.openFoundClient("gs_name1993884235");
        application.navigationHelper.tabIndicators();
//---------------------------------------------------------------------------------------------------------------------
        application.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        // Банкротство / ликвидация / прекращение деятельности - (1-й индикатор)
        application.getIndicatorHelper().chosenIndicator1();

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

        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        // Просроченная задолженность - (2-й индикатор)
        application.getIndicatorHelper().chosenIndicator2();
        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Просроченная задолженность - (1-й сигнал для 2-го индикатора)
        application.getSignalHelper().chosenSignal1Indicotor2();
        application.getSignalHelper().fillFromSignal1Indicotor2(new Signal1Indicotor2Data("Примечание", "Дата закрытия в СРП", "№ договора", "Сумма исполненного обязательства"));
        application.getSignalHelper().addSignal();


        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Просроченная задолженность в Банке до 30 дней включительно  - (2-й сигнал для 2-го индикатора)
        application.getSignalHelper().chosenSignal2Indicotor2();
        application.getSignalHelper().fillFromSignal2Indicotor2(new Signal2Indicotor2Data("Примечание", "Дата закрытия в СРП", "№ договора/№ счета", "Сумма просрочки в номинале по ОД", "max длительность просрочки по ОД", "Сумма просрочки", "max длительность просрочки по %"));
        application.getSignalHelper().addSignal();


        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Просроченная задолженность в Банке свыше 30 дней  - (3-й сигнал для 2-го индикатора)
        application.getSignalHelper().chosenSignal3Indicotor2();
        application.getSignalHelper().fillFromSignal3Indicotor2(new Signal3Indicotor2Data("Примечание", "Дата закрытия в СРП", "Сумма просрочки в номинале по ОД", "max длительность просрочки по ОД", "№ договора/№ счета", "Сумма просрочки по %", "max длительность просрочки по %"));
        application.getSignalHelper().addSignal();

        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Безнадежная задолженность в Банке - (4-й сигнал для 2-го индикатора)
        application.getSignalHelper().chosenSignal4Indicotor2();
        application.getSignalHelper().fillFromSignal4Indicotor2(new Signal4Indicotor2Data("Примечание", "№ договора/№ счета", "Дата закрытия в СРП", "Сумма просрочки в номинале по ОД", "Сумма просрочки по %"));
        application.getSignalHelper().addSignal();

        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Просроченная задолженность в других банках до 30 дней включительно - (5-й сигнал для 2-го индикатора)
        application.getSignalHelper().chosenSignal5Indicotor2();
        application.getSignalHelper().fillFromSignal5Indicotor2(new Signal5Indicotor2Data("Примечание"));
        application.getSignalHelper().addSignal();

        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Просроченная задолженность в других банках свыше 30 дней- (6-й сигнал для 2-го индикатора)
        WebElement elementS6I2= application.getSignalHelper().chosenSignal6Indicotor2();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", elementS6I2);
        elementS6I2.click();

        application.getSignalHelper().fillFromSignal6Indicotor2(new Signal6Indicotor2Data("Примечание"));
        application.getSignalHelper().addSignal();

        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();
        //Не предоставление (отказ в предоставлении) клиентом информации о просроченной задолженности в других банках- (7-й сигнал для 2-го индикатора)
        WebElement elementS7I2= application.getSignalHelper().chosenSignal7Indicotor2();
        ((JavascriptExecutor) application.getSignalHelper().driver).executeScript("arguments[0].scrollIntoView(true);", elementS7I2);
        elementS7I2.click();

        application.getSignalHelper().fillFromSignal7Indicotor2(new Signal7Indicotor2Data("Примечание"));
        application.getSignalHelper().addSignal();

        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        // Арест / утрата / ненадлежащее использование, снижение стоимости заложенного имущества - (3-й индикатор)
        application.getIndicatorHelper().chosenIndicator3();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        // Привлечение к уголовной ответственности руководителей, учредителей, акционеров, бенефициарных собственников - (4-й индикатор)
        application.getIndicatorHelper().chosenIndicator4();
        application.getSignalHelper().clickAddSignal();
        application.getSignalHelper().clickOnSearchSignal();

        application.driver.findElement(By.xpath("//span[@class='select-option-item']")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("ФИО связанного лица");
//      application.driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
//      JavascriptExecutor js = (JavascriptExecutor) application.driver;
//      js.executeScript("document.getElementById('datepicker').value='27.01.2020'");
        application.driver.findElement(By.xpath("(//input[@type='text'])[12]")).click();
        application.driver.findElement(By.xpath("(//input[@type='text'])[12]")).clear();
        application.driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("Примечание");
        application.getSignalHelper().addSignal();

        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        //Поступление в Банк запросов из Государственных фискальных органов в отношении должника и связанных с ним лиц - (5-й индикатор)
        application.getIndicatorHelper().chosenIndicator5();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        //Реструктуризация задолженности в Банке - (6-й индикатор)
        WebElement element6= application.getIndicatorHelper().chosenIndicator6();
        ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element6);
        element6.click();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        //Наличие проблем у взаимосвязанных с должником лиц - (7-й индикатор)
        WebElement element7= application.getIndicatorHelper().chosenIndicator7();
        ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element7);
        element7.click();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        //Картотека / арест текущих счетов - (8-й индикатор)
        WebElement element8 = application.getIndicatorHelper().chosenIndicator8();
        ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element8);
        element8.click();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        //Ответчик в судебном разбирательстве, приказном производстве, наличие исполнительного производства - (9-й индикатор)
        WebElement element9= application.getIndicatorHelper().chosenIndicator9();
        ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element9);
        element9.click();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        //Приостановление, прекращение действия, аннулирование (отзыв) специальных разрешений (лицензий) - (10-й индикатор)
        WebElement element10= application.getIndicatorHelper().chosenIndicator10();
        ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element10);
        element10.click();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        //Снижение поступлений денежных средств на счета в Банке на 25 % и более - (11-й индикатор)
        WebElement element11= application.getIndicatorHelper().chosenIndicator11();
        ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element11);
        element11.click();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        //Применение к клиенту расширенных процедур внутреннего контроля - (12-й индикатор)
        WebElement element12= application.getIndicatorHelper().chosenIndicator12();
        ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element12);
        element12.click();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        // Изменение в составе / структуре собственников / руководителей - (13-й индикатор)
        WebElement element13= application.getIndicatorHelper().chosenIndicator13();
        ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element13);
        element13.click();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        //Ухудшение финансового состояния- (14-й индикатор)
        WebElement element14= application.getIndicatorHelper().chosenIndicator14();
        ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element14);
        element14.click();
        application.getIndicatorHelper().createIndicator();
//---------------------------------------------------------------------------------------------------------------------
        application.openModalWindow();
        application.getIndicatorHelper().clickAddIndicator();
        //Иная негативная информация- (15-й индикатор)
        WebElement element15= application.getIndicatorHelper().chosenIndicator15();
        ((JavascriptExecutor) application.driver).executeScript("arguments[0].scrollIntoView(true);", element15);
        element15.click();
        application.getIndicatorHelper().createIndicator();
    }
}
