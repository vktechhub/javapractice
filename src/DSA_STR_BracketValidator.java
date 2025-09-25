import java.util.Stack;

public class BracketValidator {

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '(': case '{': case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                default:
                    // Ignore other characters
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";     // Valid
        String test2 = "{[(])}";     // Invalid
        String test3 = "((()))";     // Valid
        String test4 = "({[)]}";     // Invalid

        System.out.println(test1 + " -> " + isValid(test1));
        System.out.println(test2 + " -> " + isValid(test2));
        System.out.println(test3 + " -> " + isValid(test3));
        System.out.println(test4 + " -> " + isValid(test4));
        
        }
}
// How it works:
// - It uses a `Stack` to keep track of opening brackets.
// - For each closing bracket, it checks if the top of the stack matches the corresponding opening bracket.
// - If the stack is empty at the end, the brackets are properly closed.
