public class CJ_InitializationTypes {

    // Field variables
    int x = 10;
    String y = "Hello World";
    
    static {
        int z = 20;
        System.out.println("Static block executed.");

    }
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.Mymethod();
        ;
        System.out.println("Main block executed");
    }
}

class Myclass {

    {
        int a = 30;
        System.out.println("Instance block executed.");
    }

    public Myclass() // Constructor
    {
        System.out.println("Constructor called");
    }

    public void Mymethod() {
        System.out.println("Mymethod called");
    }
    
}