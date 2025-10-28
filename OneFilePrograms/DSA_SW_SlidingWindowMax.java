public class DSA_SW_SlidingWindowMax {

// Sliding window Maximum
// Array deque method

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = maxSlidingWindow(arr, k);
        System.out.print("Sliding window maximums: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;

        java.util.Deque<Integer> deque = new java.util.ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove elements smaller than the current element from the deque
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current element at the back of the deque
            deque.offer(i);

            // The front of the deque is the largest element of the previous window
            if (i >= k - 1) {
                result[ri++] = nums[deque.peek()];
            }
        }
        return result;
    }   


}
