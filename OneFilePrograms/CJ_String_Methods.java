public class CJ_String_Methods {
    public static void main(String[] args) {
        String str  = "         Hello, World! abcefgabcdefgabcdefg        ";
        String str1 = "         Hello, World! abcefgabcdefgabcdefg        ";
        String str2 = "";
        String str3 = "   ";
        String str4 = "abcabcabc";
        String str5 = "abdabcdabcd";
        System.out.println("Original String - Str: '" + str + "'");
        System.out.println("Original String - Str1: '" + str1 + "'");
        System.out.println("Original String - Str2 (empty): '" + str2 + "'");
        System.out.println("Original String - Str3 (blank): '" + str3 + "'");       
        System.out.println("Original String - Str4: '" + str4 + "'");
        System.out.println("Original String - Str5: '" + str5 + "'");

        // Length of the string
        System.out.println("Length: " + str.length());

        // Is empty
        System.out.println("Is empty: " + str.isEmpty());
        System.out.println("Is str2 empty: " + str2.isEmpty());
        System.out.println("Is str2 blank: " + str2.isBlank());
        System.out.println("Is str3 empty: " + str3.isEmpty());
        System.out.println("Is str3 blank: " + str3.isBlank());

        // Character at a specific index
        System.out.println("Character at index 1 of 'Java':- " + "Java".charAt(1));
        System.out.println("Character at index 5: " + str.charAt(5));
        char[] strArray = str.toCharArray();
        for (char c : strArray) {
            System.out.println("Char: " + c);
        }
        System.out.println("");

        // Substring
        System.out.println("Substring: " + str.substring(7, 12));
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Subsequence: " + str.subSequence(7, 12));
        System.out.println("");

        // Index of a substring
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Index of 'l': " + str.indexOf("l"));
        System.out.println("Last index of 'l': " + str.lastIndexOf("l"));

        // Check if string contains a substring
        System.out.println("Contains 'World': " + str.contains("World"));

        // Check if string starts with a prefix
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // Check if string ends with a suffix
        System.out.println("Ends with '!': " + str.endsWith("!"));

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Trim (removes leading and trailing spaces)
        System.out.println("Trimmed: '" + str.trim() + "'");
        //strip
        System.out.println("Stripped: '" + str.strip() + "'");
        //stripLeading
        System.out.println("Strip Leading: '" + str.stripLeading() + "'");
        //stripTrailing
        System.out.println("Strip Trailing: '" + str.stripTrailing() + "'");
        System.out.println("");

        System.out.println("Concat str and str4: " + str.concat(str4));

        // Split
        String[] parts = str.split(", ");
        System.out.println("Split:");
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println("");

        // Join
        String joined = String.join(" - ", parts);
        System.out.println("Joined: " + joined);

        System.out.println("Equals: " + str.equals(str1));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str1.toUpperCase()));

        System.out.println("Compare To: " + str4.compareTo(str5));
        System.out.println("Compare To Ignore Case: " + str4.compareToIgnoreCase(str5.toUpperCase()));

        // Replace
        System.out.println("Replaced: " + str.replace("World", "Java"));
        System.out.println("Replaced (char): " + str.replace('l', 'L'));
        System.out.println("Replaced (String): " + str.replace("l", "L"));
        System.out.println("Replaced Char sequence: " + str.replace("hello", "HELLO"));
        // replaceAll (using regex)
        System.out.println("Replaced All (regex): " + str.replaceAll("l", "L"));
        // ReplaceFirst (using regex)
        System.out.println("Replaced First (regex): " + str.replaceFirst("l", "L"));

        //valueof
        int num = 100;
        System.out.println("Value Of int to String: " + String.valueOf(num));

        System.out.println("Repeat str4 3 times: " + str4.repeat(3));

        //intern
        System.out.println("Interned String: " + str4.intern());

        System.out.println("Hash Code of str: " + str.hashCode());
        System.out.println("To String: " + str.toString());
        System.out.println("Matches (regex): " + str.matches(".*World.*"));
        System.out.println("------------------------------------------");
        System.out.println("String Formatting:  ");
        //syntax
        // String formattedString = String.format("format string", args);
        System.out.println(String.format("My name is %s and I am %d years old.", "Alice", 30));
        System.out.println(String.format("Hi %s", "Tom"));
        int a = 10;
        float b = 20.5f;
        String name = "Java";
        System.out.printf("Integer: %d\n", a);
        System.out.printf("Float: %.2f\n", b);
        System.out.printf("String: %s\n", name);
        System.out.printf("Multiple: Int: %d, Float: %.1f, String: %s\n", a, b, name);

    }
}
