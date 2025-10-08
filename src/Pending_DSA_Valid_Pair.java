import java.util.HashMap;

public class Pending_DSA_Valid_Pair {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int count =0 ;
        int n = arr.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i] - i;
            // A valid pair is any two indices i < j where
            // arr[j] - arr[i] = j - i.
            count += map.getOrDefault(key, 0);
            System.out.println(map.getOrDefault(key, 0));
            map.put(key, map.getOrDefault(key, 0) + 1);
            
        }

        System.out.println(count);;

}
}
