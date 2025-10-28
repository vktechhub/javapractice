import java.util.Arrays; // Add this line

// What is Anagram? 
// An anagram is a word or phrase formed by rearranging the letters of a 
// different word or phrase, typically using all the original letters exactly once.
// check two Strings were Anagrams or not

public class DSA_STR_AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "silenr";
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
        boolean result1 = areAnagrams(str1, str3);
        System.out.println("Are the two strings anagrams? " + result1);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort the characters of both strings
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}