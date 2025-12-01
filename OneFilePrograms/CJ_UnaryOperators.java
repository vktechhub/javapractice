public class CJ_UnaryOperators {
    public static void main(String[] args) {
        int a = -5;
        a = +5; // Unary plus operator
        System.out.println("Value of a after unary plus: " + a);
        int b = -a; // Unary minus operator
        boolean c = true;
        boolean d = !c; // Logical NOT operator

        System.out.println("Value of b (unary minus of a): " + b);
        System.out.println("Original value of c: " + c);
        System.out.println("Value of d (logical NOT of c): " + d);

        a++; // Postfix increment operator
        System.out.println("Value of a after postfix increment: " + a);
        ++a; // Prefix increment operator
        System.out.println("Value of a after prefix increment: " + a);
        a--; // Postfix decrement operator
        System.out.println("Value of a after postfix decrement: " + a);
        --a; // Prefix decrement operator
        System.out.println("Value of a after prefix decrement: " + a);

        int num = 7; // Binary: 0000 0111
        int complement = ~num; // Binary: 1111 1000 (which is -8 in 2's complement)
        System.out.println("Original value of num: " + num);
        System.out.println("Bitwise complement of num: " + complement);
    }
}
