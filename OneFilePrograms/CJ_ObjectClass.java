public class CJ_ObjectClass extends Object {

    // important functions of Object Class
    // toString() - 
    // hashCode() - 
    // 
    public static void main(String args[]) throws CloneNotSupportedException {
        CJ_ObjectClass current_class = new CJ_ObjectClass();
        CJ_ObjectClass current_class2 = new CJ_ObjectClass();
        System.out.println("Current Class:- " + current_class);
        System.out.println("To String    :- " + current_class.toString());
        System.out.println("Hash Code    :- " + current_class.hashCode());
        System.out.println("Equals       :- " + current_class.equals(current_class2));
        System.out.println("Class Name   :- " + current_class.getClass().getName());

        // CloneableClass original = new CloneableClass(5);
        // CloneableClass cloned = (CloneableClass) original.clone();
        // System.out.println(cloned.data);

    }

    @Override
    public String toString() {
        return "MyClass - CJ_ObjectClass here";
    }
}

        // // clone is not preferred to use
        // class CloneableClass implements Cloneable {
        //     int data;
        //     public CloneableClass(int data) {
        //         this.data = data;
        //     }

        //     @Override
        //     public Object clone() throws CloneNotSupportedException {
        //         return super.clone();
        //     }
        // }