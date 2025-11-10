// Java program to demonstrate working of instanceof Keyword

interface i1 {
    static void dummy() {
        System.out.println("dummy method");
    }
}

interface i2 {
    static void dummy1() {
        System.out.println("dummy1 method");
    }
}

// Class 
// Parent class
class Parent implements i1{
    
}

// Class 2
// Child class
class Child extends Parent {
}

// Class 3
// Main class
public class CJ_Instanceof {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of child class
        Child cobj = new Child();

        // A simple case
        if (cobj instanceof Child)
            System.out.println("cobj is instance of Child");
        else
            System.out.println(
                "cobj is NOT instance of Child");

        // instanceof returning true for Parent class also
        if (cobj instanceof Parent)
            System.out.println(
                "cobj is instance of Parent");
        else
            System.out.println(
                "cobj is NOT instance of Parent");

        // instanceof returns true for all ancestors

        // Note : Object is ancestor of all classes in Java
        if (cobj instanceof Object)
            System.out.println(
                "cobj is instance of Object");
        else
            System.out.println(
                    "cobj is NOT instance of Object");
                
        if (cobj instanceof i1)
            System.out.println("cobj is instance of i1");
        else
            System.out.println("cobj is NOT instance of i1");

        if (cobj instanceof i2)
            System.out.println("cobj is instance of i2");
        else
            System.out.println("cobj is NOT instance of i2");
    }
}