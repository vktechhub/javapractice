@FunctionalInterface
interface i1 {
    void method1();
}

class i1Impl implements i1 {

    public void method1() {
        System.out.println("Method 1 implementation in class");
    }
}

public class c1_a_Functional_interface {

    public static void main(String[] args) {
        i1 obj = new i1Impl();
        obj.method1();
    }
}
    