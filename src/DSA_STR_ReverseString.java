// Reverse a String

import java.util.Stack;

public class DSA_STR_ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseString(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }

    //Method 1:- Using StringBuilder Inbuilt function
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    //Method 2:- Using Character Array
    public static String reverseStringUsingArray(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    // Method 3:- Using Recursion
    public static String reverseStringUsingRecursion(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    // Method 4:- Using Stack
    public static String reverseStringUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    //Method 5:- Using String Concatenation
    public static String reverseStringUsingConcatenation(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    //Method 6:- Using Streams (Java 8+)
    public static String reverseStringUsingStreams(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
    }

    // Method 7:- Using StringBuffer
    public static String reverseStringUsingStringBuffer(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }

}
