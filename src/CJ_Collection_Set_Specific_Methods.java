import java.util.HashSet;
import java.util.Set;

public class CJ_Collection_Set_Specific_Methods {
    public static void main(String[] args) {
        //Set Methods - Overview (In addition to Collection methods)
        // first() - Returns the first (lowest) element currently in the set
        // last() - Returns the last (highest) element currently in the set
        // headSet() - Returns a view of the portion of the set whose elements are strictly less than a specified element
        // tailSet() - Returns a view of the portion of the set whose elements are greater than or equal to a specified element
        // subSet() - Returns a view of the portion of the set whose elements range from a specified fromElement to a specified toElement
        // lower() - Returns the greatest element in the set strictly less than a specified element
        // floor() - Returns the greatest element in the set less than or equal to a specified element
        // higher() - Returns the least element in the set strictly greater than a specified element
        // ceiling() - Returns the least element in the set greater than or equal to a specified element
        // pollFirst() - Retrieves and removes the first (lowest) element, or returns null if the set is empty
        // pollLast() - Retrieves and removes the last (highest) element, or returns null if the set is empty
        // NavigableSet - An interface that extends SortedSet and provides navigation methods
        // SortedSet - An interface that extends Set and provides methods for maintaining a sorted order of elements
        // 
        Set<String> fruits = new HashSet<>();
       
        // HashSet Methods - Overview (not in Collection and Set methods)
        // hashCode() - Returns the hash code value for the set
        // equals() - Compares the specified object with the set for equality
        //
        Set<String> fruitsSet = new HashSet<>();

        //TreeSet Methods - Overview (not in Collection and Set Methods)
        // comparator() - Returns the comparator used to order the elements in the set, or null if the set uses the natural ordering of its elements
        // descendingSet() - Returns a reverse order view of the elements in the set
        // navigableIterator() - Returns an iterator over the elements in the set in descending order
}
}
