public class CJ_Static_Vs_NonStatic {
    static int a = 10; // Static variable

    static void display() { // Static method
        System.out.println("Static method called. Value of a: " + a);
    }

    public static void main(String[] args) {
        // Accessing static variable and method without creating an instance
        System.out.println("Accessing static variable a: " + CJ_Static_Vs_NonStatic.a);
        CJ_Static_Vs_NonStatic.display();

        Nested.display(); // Calling static method of nested class

        // to access non-static method, we need to create an instance of nested class
        Nested n = new Nested(); // Creating instance of nested class
        n.show(); 
    }

    static class Nested {
        void show() { System.out.println("Non-static method"); } 
        static void display() { System.out.println("Static method"); } 
    }



}