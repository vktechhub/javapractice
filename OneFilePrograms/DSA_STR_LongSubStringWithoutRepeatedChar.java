import java.util.HashSet;
import java.util.Set;

public class DSA_STR_LongSubStringWithoutRepeatedChar {
    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = longestSubstringWithoutRepeating(input);
        System.out.println("Length of the longest substring without repeating characters: " + result.length());
        System.out.println("Longest substring without repeating characters: " + result);
    }

    public static String longestSubstringWithoutRepeating(String s) {
        Set<Character> window = new HashSet<>();  // to check duplicates quickly
        int start = 0, end = 0;
        int maxLen = 0, maxStart = 0;

        // Expand the window by moving the end pointer
        while (end < s.length()) {
            char c = s.charAt(end); // Current character to consider

            // If duplicate, shrink from left until it's removed
            while (window.contains(c)) {
                window.remove(s.charAt(start));
                start++;
            }

            // Add current character to moving window
            window.add(c);

            // Update max length if needed
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
            end++;
        }

        return s.substring(maxStart, maxStart + maxLen);
    }

}