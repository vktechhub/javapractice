public class CJ_LoopFor {
    public static void main(String[] args) {

        // Example of a simple for loop
        System.out.println("For Loop of Numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Current value of i: " + i);
        }

        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Example of a for loop with an array
        System.out.println("For Loop of an Array:");
        for (int j = 0; j < fruits.length; j++) {
            System.out.println("Fruit at index " + j + ": " + fruits[j]);
        }

        // Example of a for each loop
        System.out.println("ForEach Loop:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}