// Function to find all substrings output in Array

import java.util.ArrayList;

public class DSA_STR_AllSubString {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(str.substring(i, j));
            }
        }
        //for each output
        for (String s : substrings) {
            System.out.println(s + ",");
        }
    }
}