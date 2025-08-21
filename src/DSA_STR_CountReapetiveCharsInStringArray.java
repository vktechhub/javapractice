import java.util.LinkedHashMap;
import java.util.Map;

public class DSA_STR_CountReapetiveCharsInStringArray {
    public static void main(String[] args) {
        String str[] = {"swiss", "swimswim", "hello", "aabbccddeeffgghh"};  // Example input
        for (String s : str) {
            int count = countRepeatingChars(s);
            System.out.println("Number of repeating characters in \"" + s + "\": " + count);
        }
    }

    public static int countRepeatingChars(String str) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Step 1: Count frequency of each char
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Count characters that repeat
        int count = 0;
        for (int value : freqMap.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count; // Return the count of repeating characters
    }
}