// 4 types of Method References

// 1. Reference to a Static Method  
//        className::nameOfStaticMethod
// 2. Reference to an Instance Method of a Particular Object
//          instance::instanceMethod
// 3. Reference to an Instance Method of an Arbitrary Object
//          ClassName::instanceMethod
//          ContainingType::instanceMethod - ? ContainingType can be interface also
// 4. Reference to a Constructor
//          ClassName::new

import java.util.function.Function;

class Person{
    String name;
    int age;

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor created");
    }

    static void AppInfoDisplay (){
        System.out.println("Application Name: MyApp");
        System.out.println("Version: 1.0");
    }

    void DisplayName(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface MyInterface{
    void show();
    static void display(){
        System.out.println("MyInterface Show method called");
    }
}

public class c1_c_MethodReference {

    public static void main(String[] args) {
        // 1. Reference to a Static Method
        // using method reference 
        System.out.println("Static Method:");
        Runnable r1 = Person::AppInfoDisplay;   // Syntax :- ClassName :: staticMethodName
        r1.run();

        Function<Integer, Double> squareRoot = Math::sqrt;
        System.out.println("Sqrt of 5:- " + squareRoot.apply(5));

        System.out.println("Instance Method of a Particular Object");
        //2. Reference to an Instance Method of a Particular Object
        Person person = new Person("John", 30);
        Runnable r2 = person::DisplayName;  // Syntax :- ObjectName :: instanceMethodName
        r2.run();

        System.out.println("Instance Method of an Arbitary object");
        //3. Reference to an Instance Method of an Arbitrary Object
        Runnable r3 = Person::AppInfoDisplay;   // Syntax :- ClassName :: instanceMethodName
        r3.run();

        System.out.println("Instance Method of an Arbitrary Object of an Interface");
        MyInterface myInterface = () -> System.out.println("Show method implementation");
        myInterface.show(); // Lambda passed to method
        MyInterface.display();  // Static method of interface called directly

        System.out.println("Constructor calling");
        //4. Reference to a Constructor
        Runnable r4 = Person::new;  // Syntax :- ClassName :: new
        r4.run();

    }
}


