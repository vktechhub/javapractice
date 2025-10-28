// A palindrome is a word, number, phrase, or sequence of characters that reads the same backward as forward.
// Examples: "racecar", "madam", "12321" are palindromes.

public class DSA_STR_PalindromeCheck {

    public static void main(String[] args) {
        DSA_STR_PalindromeCheck main;
        main = new DSA_STR_PalindromeCheck();

        String[] testStrings = {"racecar", "madam", "hello", "12321", "abcd", "a"};

        for (String s : testStrings) {
            boolean result = main.isPalindrome(s);
            System.out.println("Is \"" + s + "\" a palindrome? " + result);
        }
    }

    // Method to check if a given string is a palindrome
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
