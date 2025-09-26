import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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

        //HashSet
        HashSet<String> h = new HashSet<>();
        Collections.addAll(h,"A","C","B","A");
        System.out.println("HashSet:- " + h);

        //LinkedHashSet
        LinkedHashSet<String> lh = new LinkedHashSet<>();
        Collections.addAll(lh,"Link1","Link3","Link2","Link1");
        System.out.println("LinkedHashSet:- " + lh);

        //populate from another collection
        LinkedHashSet<String> lh1 = new LinkedHashSet<>(h);
        System.out.println("LinkedHashSet from another Collection:- " + lh1);

        //TreeSet
        TreeSet<String> t = new TreeSet<>();
        Collections.addAll(t,"Geek", "For", "Geeks", "Geek");
        System.out.println("TreeSet:- " + t);

        //ArrayDeque
        Queue<Integer> ad = new ArrayDeque<>();
        Collections.addAll(ad,10,30,20,10,25);
        System.out.println("Queue:- " + ad);

        //ArrayDeque
        Deque<Integer> ad1 = new ArrayDeque<>();
        Collections.addAll(ad1,10,30,20,10,25);
        System.out.println("Deque:- " + ad1);

        //ArrayDeque
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        Collections.addAll(ad2,10,30,20,10,25);
        System.out.println("ArrayDeque:- " + ad2);

        //Priority Queue
        PriorityQueue<Integer> p = new PriorityQueue<>();
        Collections.addAll(p,3,10,5,7,2);
        System.out.println("PriorityQueue:- " + p);

        //Map
        Map<String, Integer> m1 = new HashMap<>();
        // Add elements to the HashMap
        m1.put("John", 25);
        m1.put("Jane", 30);
        m1.put("Jim", 35);
        System.out.println("Map:- " + m1);

        //HashMap
        HashMap<String, Integer> m2 = new HashMap<>(m1);
        System.out.println("HashMap:- " + m2);

        //LinkedHashMap
        LinkedHashMap<String, Integer> m3 = new LinkedHashMap<>(m1);
        System.out.println("LinkedHashMap:- " + m3);

        //TreeMap
        TreeMap<String, Integer> m4 = new TreeMap<>(m1);
        System.out.println("TreeMap:- " + m4);

        //Hashtable
        Hashtable<String, Integer> m5 = new Hashtable<>(m1);
        System.out.println("Hashtable:- " + m5);

        //ConcurrentHashMap
        ConcurrentHashMap<String,Integer> cchm = new ConcurrentHashMap<>();
        cchm.put("A", 1);
        cchm.put("B", 2);
        cchm.put("C", 3);
        System.out.println("ConcurrentHashMap:- " + cchm);

    }
}