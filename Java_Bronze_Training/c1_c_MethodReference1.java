import java.util.function.*;

// Functional Interfaces used in examples
@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

@FunctionalInterface
interface Printer {
    void print(String msg);
}

@FunctionalInterface
interface StringFunction {
    String convert(String s);
}

@FunctionalInterface
interface MessageCreator {
    Message create(String text);
}

// Helper class for constructor example
class Message {
    private String text;

    Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

public class c1_c_MethodReference1 {

    // ---------- 1️⃣ Static Method ----------
    public static int add(int x, int y) {
        return x + y;
    }

    // ---------- 2️⃣ Instance Method (specific object) ----------
    public void display(String msg) {
        System.out.println("Displaying: " + msg);
    }

    public static void main(String[] args) {

        MethodReference1 demo = new MethodReference1(); // for instance methods

        System.out.println("\n=== 1️⃣ Static Method Reference ===");

        // Lambda version
        Calculator c1 = (a, b) -> MethodReference1.add(a, b);  // Lambda Syntax : (parameters) -> ClassName.staticMethod(parameters)
        // Method reference version
        Calculator c2 = MethodReference1::add;      // MR Syntax : ClassName::staticMethod

        System.out.println("Lambda: " + c1.compute(5, 3));  
        System.out.println("Method Ref: " + c2.compute(5, 3));


        System.out.println("\n=== 2️⃣ Instance Method (specific object) ===");

        // Lambda version
        Printer p1 = (msg) -> demo.display(msg);    // Lambda Syntax : (parameters) -> objectInstance.instanceMethod(parameters)
        // Method reference version
        Printer p2 = demo::display;              // MR Syntax : objectInstance::instanceMethod

        p1.print("Lambda call");
        p2.print("Method reference call");


        System.out.println("\n=== 3️⃣ Instance Method (any object of a type) ===");

        // Lambda version
        StringFunction f1 = (str) -> str.toUpperCase(); // Lambda Syntax : (parameters) -> parameterInstance.instanceMethod()
        // Method reference version
        StringFunction f2 = String::toUpperCase;      // MR Syntax : ClassName::instanceMethod

        System.out.println("Lambda: " + f1.convert("lambda example"));
        System.out.println("Method Ref: " + f2.convert("method reference example"));


        System.out.println("\n=== 4️⃣ Constructor Reference ===");

        // Lambda version
        MessageCreator m1 = (text) -> new Message(text);    // Lambda Syntax : (parameters) -> new ClassName(parameters)
        // Method reference version
        MessageCreator m2 = Message::new;           // MR Syntax : ClassName::new

        System.out.println("Lambda: " + m1.create("Created via Lambda").getText());
        System.out.println("Method Ref: " + m2.create("Created via Method Reference").getText());
    }
}
