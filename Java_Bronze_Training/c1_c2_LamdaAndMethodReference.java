import java.util.function.Consumer;

@FunctionalInterface
interface i1 {
    void method1();
}

class i1Impl implements i1 {

    public void method1() {
        System.out.println("Method 1 implementation in class");
    }
}

public class c1_c2_LamdaAndMethodReference {

    public static void main(String[] args) {

        // Normal way of implementing functional interface
        i1 obj = new i1Impl();
        obj.method1();

        // Using Lambda expression
        i1 obj2 = () -> System.out.println("Method 1 implementation using Lambda");
        obj2.method1();

        // Using Method Reference
        Consumer<String> obj3 = System.out::println;
        obj3.accept("Method 1 implementation using Method Reference");
    }
}
    