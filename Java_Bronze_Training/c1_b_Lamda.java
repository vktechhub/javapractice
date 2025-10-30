import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.*;

interface i0 {
    void method0(); // abstract method, hence this interface is functional interface
}

interface i1 {
    void method1(String s); // abstract method, hence this interface is functional interface
}

interface i2 {
    int method2(int a, int b); // abstract method, hence this interface is functional interface
}

@FunctionalInterface
interface Processor {
        void process(String data);
}

public class c1_b_Lamda {

    public static void performAction(Processor p, String message) {
        p.process(message);
    }

    public static void main(String[] args) {

        // 1. No arguments
        // When the functional interface method takes no arguments, the lambda expression is defined with empty parentheses.

        // Built-in interface
        Runnable obj = () -> System.out.println("No arguments implementation of Runnable using lambda");
        obj.run();
        // User-defined interface
        i0 obj2 = () -> System.out.println("No arguments implementation of i0 using lambda");
        obj2.method0();

        // 2. Single argument
        // When the functional interface method takes a single argument, the lambda expression is defined with one parameter.
        
        // Built-in interface
        Consumer<String> obj3 = (s) -> System.out.println("Single argument implementation of Consumer using lambda: " + s);
        obj3.accept("Hello");

        // User-defined interface
        i1 obj4 = (s) -> System.out.println("Single argument implementation of i1 using lambda: " + s);
        obj4.method1("Hello");

        // 3. Multiple arguments
        // When the functional interface method takes multiple arguments, the lambda expression is defined with multiple parameters.

        // Built-in interface
        BiFunction<Integer, Integer, Integer> obj5 = (a, b) -> a + b;
        System.out.println("Multiple arguments implementation of Function using lambda: " + obj5.apply(3, 4));

        // User-defined interface
        i2 obj6 = (a, b) -> a + b;
        System.out.println("Multiple arguments implementation of i2 using lambda: " + obj6.method2(3, 4));

        // Multiple lines in lambda body

        // Built-in interface
        BiFunction<Integer, Integer, Integer> obj7 = (a, b) -> {
            int sum = a + b;
            System.out.println("Calculating sum in multiple lines lambda");
            return sum;
        };
        System.out.println("Before executing multiple lines lambda of in-Built Function");
        System.out.println("Multiple lines lambda implementation of Function: " + obj7.apply(5, 6));

        // User-defined interface
        i2 obj8 = (a, b) -> {
            int sum = a + b;
            System.out.println("Calculating sum in multiple lines lambda");
            return sum;
        };
        System.out.println("Before executing multiple lines lambda of User-defined Function");
        System.out.println("Multiple lines lambda implementation of i2: " + obj8.method2(5, 6));

        // Lambda passed to method argument
        System.out.println("Before executing lambda passed to method argument");
        performAction(s -> System.out.println("Processing: " + s), "Some data");

        // Lambda with Explicit Type Declaration.
        // type inference often makes explicit type declarations unnecessary for lambda parameters, they can be included for clarity.
        System.out.println("Before executing lambda with explicit type declaration");
        Predicate<String> isLong = (String s) -> s.length() > 5;
        System.out.println("Is 'Java' long? " + isLong.test("Java"));

        // Lambda with var 
        // From Java 11, the var keyword can be used for lambda parameter types, allowing local variable type inference for lambda parameters.
        System.out.println("Before executing lambda with var");
        Function<String, String> toUpperCase = (var input) -> input.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.apply("hello"));

        // Lambda with Method References.
        // When a lambda expression simply calls an existing method, a method reference can be used as a more concise alternative.
        System.out.println("Before executing lambda with method reference");
        List<String> names = Arrays.asList("Alice", "Bob");
        names.forEach(System.out::println); // Method reference for s -> System.out.println(s)
    }
}
