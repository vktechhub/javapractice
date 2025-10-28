// The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones.
// It starts with 0 and 1. The sequence goes: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

public class CJ_Fibanocci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        int next = a + b;
        while (next <= 25) {
            System.out.print(" " + next);
            a = b;
            b = next;
            next = a + b;
        }
    }
}