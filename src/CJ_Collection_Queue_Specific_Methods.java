import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CJ_Collection_Queue_Specific_Methods {
    public static void main(String[] args) {
        //Queue Methods - Overview (In addition to Collection methods)
        // offer() - Adds an element to the end of the queue
        // poll() - Removes and returns the head of the queue
        // peek() - Returns the head of the queue without removing it
        Queue<String> fruitsQueue = new LinkedList<>();

        //Deque Methods - Overview (In addition to Collection and Queue methods)
        // addFirst() - Adds an element at the front of the deque
        // addLast() - Adds an element at the end of the deque
        // removeFirst() - Removes and returns the first element of the deque
        // removeLast() - Removes and returns the last element of the deque
        // peekFirst() - Returns the first element of the deque without removing it
        // peekLast() - Returns the last element of the deque without removing it
        Deque<String> fruitsDeque = new LinkedList<>();

        //ArrayDeque Methods - Overview (In addition to Collection and Deque methods)
        // offerFirst() - Adds an element at the front of the deque
        // offerLast() - Adds an element at the end of the deque
        // pollFirst() - Removes and returns the first element of the deque
        // pollLast() - Removes and returns the last element of the deque
        // peekFirst() - Returns the first element of the deque without removing it
        // peekLast() - Returns the last element of the deque without removing it
        ArrayDeque<String> fruitsArrayDeque = new ArrayDeque<>();
}
}
