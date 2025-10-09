interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("First Interface - myMethod.");
  }
  public void myOtherMethod() {
    System.out.println("Second Interface - myOtherMethod.");
  }
}

public class CJ_OOPS_Interface {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}