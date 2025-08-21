import java.util.HashMap;
import java.util.Map;

public class DSA_STR_LongSubStringWithoutRepeatedChar {
    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = longestSubstringWithoutRepeating(input);
        System.out.println("Length of the longest substring without repeating characters: " + result.length());
        System.out.println("Longest substring without repeating characters: " + result);
    }

    public static String longestSubstringWithoutRepeating(String s) {
        int maxLength = 0;
        int start = 0;
        int maxStart = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, end);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }
        String longestSubstring = s.substring(maxStart, maxStart + maxLength);
        return longestSubstring;
    }
}