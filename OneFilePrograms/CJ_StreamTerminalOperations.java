import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CJ_StreamTerminalOperations {
    public static void main(String[] args) {
        // Sample data
        List<String> names = Arrays.asList(
            "Reflection", "Collection", "Stream",
            "Structure", "Sorting", "State"
        );

        System.out.println("Original Names:");
        names.forEach(System.out::println);
        // forEach: Print each name
        System.out.println("\nTerminal Operation - forEach:");
        names.stream().forEach(System.out::println);                                // For each - performs an action for each element

        System.out.println("Terminal Operation - collect:");
        // collect: Collect names starting with 'S' into a list
        List<String> sNames = names.stream()
                                   .filter(name -> name.startsWith("S"))
                                   .collect(Collectors.toList());                   // Collect - gathers the stream elements into a collection
        System.out.println("\ncollect (names starting with 'S'):");
        sNames.forEach(System.out::println);

        System.out.println("\nTerminal Operation - reduce:");
        // reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream().reduce(                           // reduce - combines elements of the stream into a single result
            "",
            (partialString, element) -> partialString + " " + element
        );
        System.out.println("\nreduce (concatenated names):");
        System.out.println(concatenatedNames.trim());

        System.out.println("\nTerminal Operation - count:");                      // count - returns the number of elements in the stream
        // count: Count the number of names
        long count = names.stream().count();
        System.out.println("\ncount:");
        System.out.println(count);

        System.out.println("\nTerminal Operation - findFirst:");
        // findFirst: Find the first name
        Optional<String> firstName = names.stream().findFirst();                    // findFirst - returns the first element in the stream  
        System.out.println("\nfindFirst:");
        firstName.ifPresent(System.out::println);

        System.out.println("\nTerminal Operation - allMatch:");
        // allMatch: Check if all names start with 'S'
    boolean allStartWithS = names.stream().allMatch(                                // allMatch - checks if all elements match a given predicate
            name -> name.startsWith("S")
        );
        System.out.println("\nallMatch (all start with 'S'):");
        System.out.println(allStartWithS);

        System.out.println("\nTerminal Operation - anyMatch:");
        // anyMatch: Check if any name starts with 'S'
        boolean anyStartWithS = names.stream().anyMatch(                            // anyMatch - checks if any element matches a given predicate
            name -> name.startsWith("S")
        );
        System.out.println("\nanyMatch (any start with 'S'):");
        System.out.println(anyStartWithS);
    }
}
