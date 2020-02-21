
import java.util.ArrayList;

public class test1 {

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");


        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){

            System.out.println(person);
        }
    }
}