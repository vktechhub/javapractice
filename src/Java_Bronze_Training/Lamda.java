public class Lamda {

    public static void main(String[] args) {
        i1 obj = () -> System.out.println("Method 1 implementation using lambda");
        obj.method1();

        obj.method2();
        i1 obj2 = () -> System.out.println("Method 2 implementation using lambda");
        obj2.method2();
    }
}
