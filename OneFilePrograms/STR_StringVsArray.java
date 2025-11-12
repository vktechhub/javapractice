import java.util.Arrays;

public class STR_StringVsArray {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        System.out.println(s1);
        char[] c1 = s1.toCharArray();
        System.out.println(c1);
        String s2 = Arrays.toString(c1);
        System.out.println("s2:- " + s2);
        System.out.println(c1.toString());;

        String s3 = new String(c1);
        System.out.println(s3);

        System.out.println(Arrays.equals(c1, s3.toCharArray()));
        System.out.println(s1.equals(s3));  

    }
}
