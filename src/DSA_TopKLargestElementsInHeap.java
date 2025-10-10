import java.util.Arrays;
import java.util.PriorityQueue;

public class DSA_TopKLargestElementsInHeap {
    public static void main(String[] args) {
        int[] x = {1,23,4,5,5,5,345,23,34,67};
        int k = 6;
        System.out.println(Arrays.toString(TopKElements(x,k)));
    }
    public static int[] TopKElements(int[] arr, int k) {
        // By default, PriorityQueue in Java implements a min-heap.
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // Iterate through each number in the input array.
        for (int num : arr) {
            heap.add(num);
            // If the heap size exceeds k, remove the smallest element.
            if (heap.size() > k) {
                heap.remove();
            }
        }

        // The heap now contains the k largest elements.
        // Transfer them to an array.
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.remove();
        }

        // To return the elements in descending order, you would need to reverse the array,
        // as the min-heap stores the elements in ascending order when extracted.
        // For example:
         for (int i = 0; i < k / 2; i++) {
             int temp = ans[i];
             ans[i] = ans[k - 1 - i];
             ans[k - 1 - i] = temp;
         }

        return ans;
    }
}