import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class c1_b1_BuiltInFunctionalInterfaces {
    public static void main(String[] args) {

        // Function is a functional interface that takes one argument and produces a result.
        Function<String, Integer> stringToLength1 = s -> s.length();
        System.out.println("Lambda - Length of Hello is - " + stringToLength1.apply("Hello"));

        Function<String, Integer> stringToLength = String::length; // Syntax 
        System.out.println("MethodRef - Length of Hello is - " + stringToLength.apply("Hello"));

        // 
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Lambda - sum of 2,3 = " + sum.apply(2, 3));

        BiFunction<Integer, Integer, Integer> sum1 = Integer::sum;
        System.out.println("MethodRef - sum of 2,3 = " + sum1.apply(2, 3));

        // Supplier 
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Lambda - Random number is - " + randomNumber.get());

        Supplier<Double> randomNumber1 = Math::random;
        System.out.println("MethodRef - Random number is - " + randomNumber1.get());

        // Predicate is a boolean-valued functional interface of one argument.
        // Argument can be of any reference type.
        // test method is used to evaluate the predicate, which returns a boolean.
        Predicate<Integer> isEven = x -> x % 2 == 0;
        boolean result = isEven.test(4);
        System.out.println("Lambda - Is 4 Even number:- " + result);

        Predicate<Integer> isEvenNumber = MathUtils::isEvenNumber;
        boolean result1 = isEvenNumber.test(4);
        System.out.println("MethodRef - Is 4 Even:- " + result1);

        // Consumer
        Consumer<String> printUpperCase = s -> System.out.println("Lambda - Uppercase:- " + s.toUpperCase());
        printUpperCase.accept("HelloWorld");

        Consumer<String> printUpperCase1 = Printer::printUpperCase;
        printUpperCase1.accept("HelloWorld");

        UnaryOperator<Integer> multiplyBy2 = x -> x * 2;
        System.out.println("Lambda: 5 * 2 = " + multiplyBy2.apply(5));

        UnaryOperator<Integer> multiplyBy = Multiplier::multiplyByTwo;
        System.out.println("MethodRef: 5 * 2= " + multiplyBy.apply(5));

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Lambda: 4 + 6 = " + add.apply(4, 6));
        
        BinaryOperator<Integer> add1 = Integer::sum;
        System.out.println("MethodRef: 4 + 6 = " + add1.apply(4, 6));

        //Runnable
        Runnable task = () -> {
            System.out.println("Lambda - Task is started");
            System.out.println("Lambda - Task is completed");
        };
        task.run();

        Runnable task1 = TaskRunner::runTask;
        task1.run();
        
        //Callable<V>

        //Comparator<T>
    
    }
}

    class MathUtils {
        public static boolean isEvenNumber(Integer number) {
            return number % 2 == 0;
        }
    }

    class Printer {
        public static void printUpperCase(String s) {
            System.out.println("Lambda - Uppercase:- " + s.toUpperCase());
        }
    }

    class Multiplier {
    public static Integer multiplyByTwo(Integer x) {
        return x * 2;
    }
}

class TaskRunner {
        public static void runTask() {
            System.out.println("MethodRef - Task is started");
            System.out.println("MethodRef - Task is completed");
        }
    }