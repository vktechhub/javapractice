import java.util.Arrays;

public class Num_LoopVsStream {
    public static void main(String[] args) {
        int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int sum = 0;
        int sum1 = 0;
        for (int element : intArray) {
            sum += element;
            sum1 = +element;
        }
        System.out.println("sum = " + sum);
        System.out.println("=+ mistake sum1 = " + sum1);

        int sum2 = Arrays.stream(intArray).sum();
        System.out.println("sum2 = " + sum2);

        int min = Arrays.stream(intArray).min().getAsInt();
        System.out.println("Min:- " + min);
        int max = Arrays.stream(intArray).max().getAsInt();
        System.out.println("Max:- " + max);
        double average = Arrays.stream(intArray).average().orElseThrow();
        System.out.println("Average:- " + average);
    }
    

}
