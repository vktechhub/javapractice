public class CJ_ExtendObjectClass  {
    public static void main(String[] args) {
        // Create an instance of the Object class
        ExtendObjectClass obj = new ExtendObjectClass();

        // Call the toString() method from the Object class
        String objString = obj.toString();
        System.out.println("Object toString(): " + objString);

        // Call the hashCode() method from the Object class
        int objHashCode = obj.hashCode();
        System.out.println("Object hashCode(): " + objHashCode);

        // Call the equals() method from the Object class
        Object anotherObj = new Object();
        boolean isEqual = obj.equals(anotherObj);
        System.out.println("Object equals(): " + isEqual);
    }
}


class ExtendObjectClass extends Object {
}
