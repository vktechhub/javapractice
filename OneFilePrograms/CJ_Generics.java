// A class can be created as Generic class like
// public class Generic<T> { ... }
// That’s a generic class, where T is the type parameter.
// even normal classes can have generic methods(refer below).
public class CJ_Generics {

    // Generic method to print any type of item.
    // Here <T> before the return type means it’s a generic method.
    public static <T> void print(T item) {
        System.out.println(item);
    }

    public static void main(String[] args) {
        print("Hello, Generics!");
        print(123);
        print(45.67);
        print(true);
    }
    
}
