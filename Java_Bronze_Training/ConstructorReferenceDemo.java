import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Person {
    private String name;
    private int age;

    // Constructor with no arguments
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one argument
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two arguments
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        // --- No arguments ---
        // Functional interface: Supplier (takes no args, returns a Person)
        Supplier<Person> personSupplier = Person::new;
        Person p1 = personSupplier.get(); // Arguments are "passed" (none) when .get() is called
        System.out.println("P1: " + p1);

        // --- One argument ---
        // Functional interface: Function (takes String arg, returns a Person)
        Function<String, Person> personFunction = Person::new;
        Person p2 = personFunction.apply("Alice"); // Arguments passed when .apply() is called
        System.out.println("P2: " + p2);

        // --- Two arguments ---
        // Functional interface: BiFunction (takes String and Integer args, returns a Person)
        BiFunction<String, Integer, Person> personBiFunction = Person::new;
        Person p3 = personBiFunction.apply("Bob", 30); // Arguments passed when .apply() is called
        System.out.println("P3: " + p3);
    }
}
