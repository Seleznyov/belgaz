package belgaz.qa.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SearchClient extends TestBase {


    @Test
    public void test1SearchClient() throws IOException {
       /* String name;
        List<String> result = new ArrayList<>();
        try (Stream<Path> walk = Files.walk(Paths.get("D:\\Qa\\Jmeter\\gaz\\test"))) {

            result = walk.filter(Files::isRegularFile)
                    .map(x -> x.toString()).collect(Collectors.toList());

            //      result.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String filename : result) {
            List<String> records = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(";");
                    records.addAll(Arrays.asList(values));
                }
                // records.forEach(System.out::println);
                for (String record : records) {
                    application.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
                    application.navigationHelper.openClientsPage();
                    System.out.println("tets1");
                    application.clickOnSearch();
                    name = record;
                    application.inputSearchName(name);
                    application.clickOnEnter();
                    application.openFoundClient("gs_name1116450517");

                    System.out.println(name);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            // for (int i = 0; i < 7; i++) {

            //}
        }*/
        File file = new File("D:\\Qa\\test\\tests\\test1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        while ((st = br.readLine()) != null){

            application.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
            application.navigationHelper.openClientsPage();
            application.driver.findElement(By.xpath("//form/div/div[2]")).click();

            application.clickOnSearch();
            application.inputSearchName(st);
            application.clickOnEnter();
            application.openFoundClient("gs_name1116450517");

        }
    }
}
