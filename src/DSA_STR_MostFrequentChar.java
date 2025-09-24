import java.util.HashMap;
import java.util.Map;

public class DSA_STR_MostFrequentChar {
    public static void main(String[] args) {
        String str = "abcccccccd";
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        char mostFrequent = str.charAt(0);
        int maxCount = freq.get(mostFrequent);
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Most frequent character: " + mostFrequent + " which occurs " + maxCount + " times.");
    }
}