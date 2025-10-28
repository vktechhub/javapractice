import java.util.LinkedHashMap;
import java.util.Map;

public class DSA_STR_SecondNonRepetiveChar {
public static void main(String[] args) {
        String str[] = {"swiss", "swimswim", "hello", "aabbccddeeffgghh"};  // Example input
        for (String s : str) {
            Character result = findSecondNonRepeating(s);
            if (result != null) {
                System.out.println("Second non-repeating character in \"" + s + "\": " + result);
            } else {
                System.out.println("No second non-repeating character found in \"" + s + "\".");
            }
        }
    }

    public static Character findSecondNonRepeating(String str) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Step 1: Count frequency of each char
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Iterate to find the second non-repeating
        int count = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
                if (count == 2) {
                    return entry.getKey();
                }
            }
        }
        return null; // If not found
    }
}