import java.util.*;

public class CJ_Collection_6_Set_Specific_Methods {
    
    public static void main(String[] args) {
        //Set Methods - Overview (In addition to Collection methods)
        // Set doesnot provide any additional methods apart from Collection methods

        // HashSet Methods - Overview (not in Collection and Set methods)
        System.out.println("--------------------------------");
        System.out.println("HashSet Methods Overview:");
        HashSet<String> fruitsSet = new HashSet<>();
        Collections.addAll(fruitsSet, "Apple", "Banana", "Mango", "Orange");
        System.out.println("HashSet: " + fruitsSet);

        @SuppressWarnings("unchecked")
        HashSet<String> anotherSet = (HashSet<String>) fruitsSet.clone();
        System.out.println("Cloned HashSet: " + anotherSet);

        System.out.println("--------------------------------");
        System.out.println("LinkedHashSet Methods Overview:");
        // LinkedHashSet Methods - Overview (not in Collection and Set Methods)
        LinkedHashSet<String> linkedFruitsSet = new LinkedHashSet<>();
        Collections.addAll(linkedFruitsSet, "Apple", "Banana", "Mango", "Orange");
        System.out.println("LinkedHashSet: " + linkedFruitsSet);    

        @SuppressWarnings("unchecked")
        LinkedHashSet<String> anotherLinkedSet = (LinkedHashSet<String>) linkedFruitsSet.clone();
        System.out.println("Cloned LinkedHashSet: " + anotherLinkedSet);

        System.out.println("--------------------------------");
        
        // TreeSet Methods - Overview (not in Collection and Set Methods)
        // first() - returns the first (lowest) element in this set, or null if the set is empty.
        // last() - returns the last (highest) element in this set, or null if the set is empty.
        // headSet(E toElement) - returns a view of the portion of this set whose elements are strictly less than toElement.
        // tailSet(E fromElement) - returns a view of the portion of this set whose elements are greater than or equal to fromElement.
        // subSet(E fromElement, E toElement) - returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
        // lower(E e) - returns the greatest element in this set strictly less than the given element, or null if there is no such element.
        // higher(E e) - returns the least element in this set strictly greater than the given element, or null if there is no such element.
        // floor(E e) - returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
        // ceiling(E e) - returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        // pollFirst() - retrieves and removes the first (lowest) element, or returns null if this set is empty.
        // pollLast() - retrieves and removes the last (highest) element, or returns null if this set is empty.
        // comparator() - returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements.

        System.out.println("TreeSet Methods Overview:");
        TreeSet<String> treeFruitsSet = new TreeSet<>();
        Collections.addAll(treeFruitsSet, "Apple", "Banana", "Mango ", "Orange", "Avocado", "Grapes, Pineapple", "Blueberry", "Strawberry", "Watermelon");
        System.out.println("TreeSet: " + treeFruitsSet);    
        System.out.println("First Element: " + treeFruitsSet.first());
        System.out.println("Last Element: " + treeFruitsSet.last());
        System.out.println("HeadSet (elements less than 'Mango'): " + treeFruitsSet.headSet("Mango"));
        System.out.println("TailSet (elements greater than or equal to 'Mango'): " + treeFruitsSet.tailSet("Mango"));
        System.out.println("SubSet (elements from 'Banana' to 'Orange'): " + treeFruitsSet.subSet("Banana", "Orange"));

        // clone
        @SuppressWarnings("unchecked")
        TreeSet<String> anotherTreeSet = (TreeSet<String>) treeFruitsSet.clone();
        System.out.println("Cloned TreeSet: " + anotherTreeSet);

        // comparator
        System.out.println("Comparator (null means natural ordering): " + treeFruitsSet.comparator());

        TreeSet<Double> numberSet = new TreeSet<>();
        Collections.addAll(numberSet, 10.0, 30.4, 20.0, 30.0, 40.0, 50.0);
        System.out.println("Number TreeSet: " + numberSet);
        System.out.println("Lower than 30.0: " + numberSet.lower(30.0));
        System.out.println("Higher than 30.0: " + numberSet.higher(30.0));
        System.out.println("Floor of 30.4: " + numberSet.floor(30.4));
        System.out.println("Ceiling of 30.4: " + numberSet.ceiling(30.4));
        System.out.println("Poll First (removes and returns the first element): " + numberSet.pollFirst());
        System.out.println("Poll Last (removes and returns the last element): " + numberSet.pollLast());
        System.out.println("Number TreeSet after polling: " + numberSet);


}
}
