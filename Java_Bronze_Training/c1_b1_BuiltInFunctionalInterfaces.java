

public class c1_b1_BuiltInFunctionalInterfaces {
    public static void main(String[] args) {

        // Predicate is a boolean-valued functional interface of one argument.
        // Argument can be of any reference type.
        // test method is used to evaluate the predicate, which returns a boolean.
        Predicate<Integer> isEven = x -> x % 2 == 0;
        boolean result = isEven.test(4);

        // Function accepts one argument(of type) and returns an object.

    
    }
}
