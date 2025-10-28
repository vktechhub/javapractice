// 4 types of Method References

// 1. Reference to a Static Method  
//        className::nameOfStaticMethod
// 2. Reference to an Instance Method of a Particular Object
//          instance::instanceMethod
// 3. Reference to an Instance Method of an Arbitrary Object
//          ClassName::instanceMethod
//          ContainingType::instanceMethod
// 4. Reference to a Constructor
//          ClassName::new

public class MethodReference {

    public static void main(String[] args) {
        // 1. Reference to a Static Method
        // using method reference 
        Runnable r1 = Person::AppInfoDisplay;
        r1.run();

        //2. Reference to an Instance Method of a Particular Object
        Person person = new Person("John", 30);
        Runnable r2 = person::DisplayName;
        r2.run();

        //3. Reference to an Instance Method of an Arbitrary Object
        Runnable r3 = Person::AppInfoDisplay;
        r3.run();

        //4. Reference to a Constructor
        Runnable r4 = Person::new;
        r4.run();

    }
}


class Person{
    String name;
    int age;

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
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