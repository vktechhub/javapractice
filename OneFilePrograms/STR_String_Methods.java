public class STR_String_Methods {
    public static void main(String[] args) {
        String s1 = "  HelloWorldThisisVigneshkanna";
        System.out.println("Original String:- " + s1);

        System.out.println("Length:- " + s1.length());
        System.out.println("Char at 5th position:- " + s1.charAt(4));
        System.out.println("trim and uppercase:- " + s1.trim().toUpperCase());
        System.out.println("uppercase:- " + s1.toUpperCase());
        System.out.println("Replace o with X:- " + s1.replace('o', 'X'));
        System.out.println("Last index of n:-" + s1.lastIndexOf('n'));
        System.out.println(s1.isEmpty());
        System.out.println(s1.startsWith("Hello"));
        System.out.println(s1.startsWith("  H"));
        System.out.println(s1.endsWith("kanna"));
        System.out.println(s1.contains("a"));

        System.out.println("");

    }
}
