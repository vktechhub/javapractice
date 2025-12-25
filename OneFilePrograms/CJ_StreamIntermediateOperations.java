import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CJ_StreamIntermediateOperations {
    public static void main(String[] args) {
        // Intermediate operations in Java Streams are operations that return a new stream.
        // They are lazy and do not process the data until a terminal operation is invoked.

        // List of lists of names
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Reflection", "Collection", "Stream"),
            Arrays.asList("Structure", "State", "Flow"),
            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        System.out.println("Original List of Lists:");
        listOfLists.forEach(System.out::println);

        // Create a set to hold intermediate results
        Set<String> intermediateResults = new HashSet<>();

        // Stream pipeline demonstrating various intermediate operations
        List<String> final_result = listOfLists.stream()
                .flatMap(List::stream) // Flatten the lists into a single stream     
                            // map  vs flatMap:
                            // map: takes a function that transforms each element into exactly one other element.
                            // flatMap: takes a function that transforms each element into a stream of elements, 
                            // and then flattens those streams into a single stream.        
            .filter(s -> s.startsWith("S"))   // Filter names starting with 'S'     
            .map(String::toUpperCase)                // Convert names to uppercase
            .distinct()                              // Remove duplicates
            .sorted()                                // Sort the names
            .peek(s -> intermediateResults.add(s))   // Collect intermediate results
            .collect(Collectors.toList());         // Terminal operation to collect results into a list

        // Print the intermediate results
        System.out.println("Intermediate Results:");
        intermediateResults.forEach(System.out::println);

        // Print the final result
        System.out.println("Final Result:");
        final_result.forEach(System.out::println);
    }
}
