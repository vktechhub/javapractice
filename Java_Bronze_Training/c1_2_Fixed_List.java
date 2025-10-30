import java.util.*;

public class c1_2_Fixed_List {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");    
        fruits.add("Banana");

        List<String> fruitsList = Arrays.asList("Apple", "Banana");

        fruits.add("Orange"); // This works fine
        //fruitsList.add("Orange"); // This will throw UnsupportedOperationException

        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.forEach(System.out::println);
        fruitsList.forEach(x -> System.out.println(x));
    }
}
