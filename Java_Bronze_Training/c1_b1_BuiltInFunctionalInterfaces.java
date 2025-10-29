import java.util.function.*;

public class c1_b1_BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        Function<Integer, Integer> sq1 = x -> x * x;
        System.out.println("Square of 5: " + sq1.apply(5));

        IntFunction<Integer> sq2 = x -> x * x;
        System.out.println("Square of 5: " + sq2.apply(5));

        ToIntFunction<Integer> sq3 = x -> x * x;
        System.out.println("Square of 5: " + sq3.applyAsInt(5));

        UnaryOperator<Integer> sq4 = x -> x * x;
        System.out.println("Square of 5: " + sq4.apply(5));

        
    }
}
