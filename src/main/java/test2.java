import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;

public class test2 {
    @Test
    public void readFile() {
        String name;
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
                    name = record;
                    System.out.println(name);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void whenReadWithBufferedReader_thenCorrect()
            throws IOException {
        String file ="D:\\Qa\\Jmeter\\gaz\\test\\test1.txt";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        System.out.println(currentLine);
        reader.close();
    }

    @Test
    public static void main(String[] args)throws Exception
    {
        File file = new File("D:\\Qa\\Jmeter\\gaz\\test\\test1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
