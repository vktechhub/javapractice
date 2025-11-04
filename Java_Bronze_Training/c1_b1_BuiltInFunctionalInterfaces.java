import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class c1_b1_BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        
        // Function accepts one argument and returns.
        // apply method is used to execute the function.
        
        Function<Integer, Integer> sq1 = x -> x * x;
        System.out.println("Square of 5: " + sq1.apply(5));

        // IntFunction accepts 
        // apply method 
        IntFunction<Integer> sq2 = x -> x * x;
        System.out.println("Square of 5: " + sq2.apply(5));

        ToIntFunction<Integer> sq3 = x -> x * x;
        System.out.println("Square of 5: " + sq3.applyAsInt(5));

        UnaryOperator<Integer> sq4 = x -> x * x;
        System.out.println("Square of 5: " + sq4.apply(5));

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 3 and 4: " + add.apply(3, 4));

        BiFunction<Integer, Integer, Integer> add2 = (a, b) -> a + b;
        System.out.println("Sum of 3 and 4: " + add2.apply(3, 4));


    }
}
