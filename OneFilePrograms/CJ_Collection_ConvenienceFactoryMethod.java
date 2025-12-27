import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CJ_Collection_ConvenienceFactoryMethod {
    
    public static void main(String[] args) {
        System.out.println("Convenience Factory Method - of()");
        
        Set<String> mutableSet = new HashSet<>();
        mutableSet.add("Apple");
        mutableSet.add("Banana");
        System.out.println("Mutable Set: " + mutableSet);
        mutableSet.add("Cherry");
        System.out.println("After adding Cherry to Mutable Set: " + mutableSet);

        // In Java, the "convenience factor method" refers to static factory methods,
        // particularly those introduced in Java 9 and later, that provide a more
        // concise and convenient way to create instances of collections (Lists, Sets,
        // and Maps).
        
        // Obtain an unmodifiable view of the set
        Set<String> unmodifiableSet = Collections.unmodifiableSet(mutableSet);
        System.out.println("Unmodifiable Set: " + unmodifiableSet);

        // simillar to unmodifiableSet, for other collections we have:
        // Collections.unmodifiableList, Collections.unmodifiableMap, Collections.unmodifiableSortedSet, etc.
        try {
            unmodifiableSet.add("Date");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught Exception while adding to Unmodifiable Set: " + e);
        }

        System.out.println(
                "After attempting to add Date to Unmodifiable Set: " + unmodifiableSet);
            
        // Using convenience factory method to create an unmodifiable set
        Set<String> factorySet = Set.of("Red", "Green", "Blue");
        System.out.println("Factory Set: " + factorySet);
        try {
            factorySet.add("Yellow");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught Exception while adding to Factory Set: " + e);
        }

        System.out.println(
                "After attempting to add Yellow to Factory Set: " + factorySet);
    }
}
