import java.util.*;

public class CJ_Collection_Types {
    public static void main(String[] args) {

        // Collection
        Collection<String> c = new ArrayList<>();
        c.add("One");
        c.add("Two");
        System.out.println("Collection:- " + c);

        //List
        List<String> li = new ArrayList<>();
        li.add("Mango");
        li.add("Apple");
        li.add("Orange");
        System.out.println("List:- " + li);
        System.out.println("List of Elements are:- ");
        for(String s : li){
            System.out.println(s);
        }

        //ArrayList
        ArrayList<String> a = new ArrayList<>();
        a.add("Test5");
        a.add("Test3");
        a.add("Test4");
        System.out.println("ArrayList:- " + a);
        Collections.sort(a); // Sort the ArrayList
        System.out.println("Sorted ArrayList:- " + a);

        //Array list can be also defined as
        ArrayList<String> a1 = new ArrayList<String>();
        Collections.addAll(a1, "apple", "banana", "orange", "grape");
        System.out.println("ArrayList<String>:- " + a1);

        // The var Keyword
        // From Java 10, you can use the var keyword to declare an ArrayList variable without writing the type twice.
        var a2 = new ArrayList<String>();
        a2.add("Test1");
        a2.add("Test2");
        System.out.println("Var ArrayList:- " + a2);

        //LinkedList
        LinkedList<String> lli = new LinkedList<>();
        lli.addFirst("Link1");
        lli.addFirst("Link2");
        lli.addLast("Link3");
        System.out.println("LinkedList:- " + lli);

        //Set
        Set<String> st = new HashSet<>();
        Collections.addAll(st,"A","B","C","D","E","F");
        System.out.println("Set:- " + st);

    }
}