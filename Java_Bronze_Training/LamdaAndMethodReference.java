public class LamdaAndMethodReference {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Lambda Expression
        MyInterface m1 = () -> System.out.println("My Abstract Method Implementation");
        m1.myAbstractMethod();

        // Method Reference
        MyInterface2 m2 = () -> System.out::println("My Abstract Method Implementation");
        m2.myAbstractMethod();
    }
}


@FunctionalInterface
interface MyInterface {
    default void myDefaultMethod() {}
    void myAbstractMethod();
}

@FunctionalInterface
interface MyInterface2 {
    default void myDefaultMethod() {}
    void myAbstractMethod();
}