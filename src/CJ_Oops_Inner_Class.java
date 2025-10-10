public class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class CJ_Oops_Inner_Class {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
