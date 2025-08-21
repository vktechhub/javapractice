public class CJ_ClassNameMain {

    public static void main(String[] args) {
        CJ_ClassNameMain main = new CJ_ClassNameMain(); // Create an instance to call the non-static method

        String[] testStrings = {"racecar", "madam", "hello", "12321", "abcd", "a"};

        for (String s : testStrings) {
            boolean result = main.isPalindrome(s);
            System.out.println("Is \"" + s + "\" a palindrome? " + result);
        }
    }

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
