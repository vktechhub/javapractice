import java.util.function.Consumer;

interface i1 {
    void method1();
}

public class Lamda {

    public static void main(String[] args) {
        i1 obj = () -> System.out.println("Method 1 implementation using lambda");
        
        int x = 10;
        int y = () -> x * 2;
        Consumer<Integer> consumer = (int z) -> System.out.println(z);
        consumer.accept(y);
        int y = () -> x * 2;
        (int y) -> System.out.println(y);
        
    }
}
