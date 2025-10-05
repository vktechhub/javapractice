import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CJ_Collection_5_Queue_Specific_Methods {
    public static void main(String[] args) {
        //Queue Methods - Overview (In addition to Collection methods)
        // offer() - Adds an element to the end of the queue
        // peek() - Returns the head of the queue without removing it
        // element() - Returns the head of the queue without removing it (throws exception if the queue is empty)
        // poll() - Removes and returns the head of the queue (returns null if the queue is empty)
        // remove() - Removes and returns the head of the queue (throws exception if the queue is empty)
        // Note: Queue is a FIFO (First In First Out) data structure
        // Queue is an interface and can be implemented using various classes like LinkedList, PriorityQueue, ArrayDeque etc.
        System.out.println("Queue Interface Methods:");
        Queue<String> fruitsQueue = new LinkedList<>();
        fruitsQueue.offer("Apple");
        fruitsQueue.offer("Banana");
        fruitsQueue.offer("Cherry");
        fruitsQueue.offer("Date");
        fruitsQueue.offer("Elderberry");    
        fruitsQueue.offer("Fig");
        System.out.println("after offers: " + fruitsQueue);
        System.out.println("Peek: " + fruitsQueue.peek());
        System.out.println("after peek: " + fruitsQueue);
        System.out.println("Element: " + fruitsQueue.element());
        System.out.println("after element: " + fruitsQueue);
        System.out.println("Poll: " + fruitsQueue.poll());
        System.out.println("after poll: " + fruitsQueue);
        System.out.println("Remove: " + fruitsQueue.remove());
        System.out.println("after remove: " + fruitsQueue);
        System.out.println("--------------------------------");

        //Deque Methods - Overview (In addition to Collection and Queue methods)
        // addFirst() - Adds an element at the front of the deque
        // addLast() - Adds an element at the end of the deque
        // peekFirst() - Returns the first element of the deque without removing it
        // peekLast() - Returns the last element of the deque without removing it
        // elementFirst() - Returns the first element of the deque without removing it (throws exception if the deque is empty)
        // elementLast() - Returns the last element of the deque without removing it (throws exception
        // offerFirst() - Adds an element at the front of the deque
        // offerLast() - Adds an element at the end of the deque
        // pollFirst() - Removes and returns the first element of the deque
        // pollLast() - Removes and returns the last element of the deque
        // removeFirst() - Removes and returns the first element of the deque
        // removeLast() - Removes and returns the last element of the deque
        // push() - Adds an element at the front of the deque (as a stack)
        // pop() - Removes and returns the first element of the deque (as a stack)
        // Note: Deque stands for "double-ended queue" and supports element insertion and removal at both ends.
        // Deque is a subinterface of Queue.
        Deque<String> fruitsDeque = new LinkedList<>();
        System.out.println("Deque Interface Methods:");
        // Queue specific methods supported by Deque
        fruitsDeque.offer("Apple");
        fruitsDeque.offer("Banana");
        fruitsDeque.offer("Cherry");
        fruitsDeque.offer("Date");
        fruitsDeque.offer("Elderberry");
        fruitsDeque.offer("Fig");
        System.out.println("after offers: " + fruitsDeque);
        System.out.println("Peek: " + fruitsDeque.peek());
        System.out.println("after peek: " + fruitsDeque);
        System.out.println("Element: " + fruitsDeque.element());
        System.out.println("after element: " + fruitsDeque);
        System.out.println("Poll: " + fruitsDeque.poll());
        System.out.println("after poll: " + fruitsDeque);
        System.out.println("Remove: " + fruitsDeque.remove());
        System.out.println("after remove: " + fruitsDeque);
        //Deque specific methods
        fruitsDeque.addFirst("Mango");
        System.out.println("After addFirst(Mango): " + fruitsDeque);
        fruitsDeque.addLast("Orange");
        System.out.println("After addLast(Orange): " + fruitsDeque);
        fruitsDeque.offerFirst("Pineapple");
        System.out.println("After offerFirst(Pineapple): " + fruitsDeque);
        fruitsDeque.offerLast("Peach");
        System.out.println("After offerLast(Peach): " + fruitsDeque);
        System.out.println("After peekFirst(): " + fruitsDeque.peekFirst() + ", Deque: " + fruitsDeque);
        System.out.println("After peekLast(): " + fruitsDeque.peekLast() + ", Deque: " + fruitsDeque);
        System.out.println("After getFirst(): " + fruitsDeque.getFirst() + ", Deque: " + fruitsDeque);
        System.out.println("After getLast(): " + fruitsDeque.getLast() + ", Deque: " + fruitsDeque);
        System.out.println("After pollFirst(): " + fruitsDeque.pollFirst() + ", Deque: " + fruitsDeque);
        System.out.println("After pollLast(): " + fruitsDeque.pollLast() + ", Deque: " + fruitsDeque);
        System.out.println("After removeFirst(): " + fruitsDeque.removeFirst() + ", Deque: " + fruitsDeque);
        System.out.println("After removeLast(): " + fruitsDeque.removeLast() + ", Deque: " + fruitsDeque);

        //decending order traversal using descendingIterator()
        System.out.print("Deque in reverse order: ");
        var descIterator_deque = fruitsDeque.descendingIterator();
        while (descIterator_deque.hasNext()) {
            System.out.print(descIterator_deque.next() + " ");
        }
        System.out.println();
        
        // Stack methods supported by Deque
        fruitsDeque.push("Grapes");
        System.out.println("After push(Grapes): " + fruitsDeque);
        System.out.println("After pop(): " + fruitsDeque.pop() + ", Deque: " + fruitsDeque);
        System.out.println("--------------------------------");


        //ArrayDeque Methods - Overview (In addition to Collection and Deque methods)
        ArrayDeque<String> fruitsArrayDeque = new ArrayDeque<>();
        System.out.println("ArrayDeque Interface Methods:");
        // Queue specific methods supported by ArrayDeque
        fruitsArrayDeque.offer("Apple");
        fruitsArrayDeque.offer("Banana");
        fruitsArrayDeque.offer("Cherry");
        fruitsArrayDeque.offer("Date");
        fruitsArrayDeque.offer("Elderberry");    
        fruitsArrayDeque.offer("Fig");
        System.out.println("after offers: " + fruitsArrayDeque);
        System.out.println("Peek: " + fruitsArrayDeque.peek());
        System.out.println("after peek: " + fruitsArrayDeque);
        System.out.println("Element: " + fruitsArrayDeque.element());
        System.out.println("after element: " + fruitsArrayDeque);
        System.out.println("Poll: " + fruitsArrayDeque.poll());
        System.out.println("after poll: " + fruitsArrayDeque);
        System.out.println("Remove: " + fruitsArrayDeque.remove());
        System.out.println("after remove: " + fruitsArrayDeque);
        //Deque specific methods supported by ArrayDeque
        fruitsArrayDeque.addFirst("Mango");
        System.out.println("After addFirst(Mango): " + fruitsArrayDeque);
        fruitsArrayDeque.addLast("Orange");
        System.out.println("After addLast(Orange): " + fruitsArrayDeque);
        fruitsArrayDeque.offerFirst("Pineapple");
        System.out.println("After offerFirst(Pineapple): " + fruitsArrayDeque);
        fruitsArrayDeque.offerLast("Peach");
        System.out.println("After offerLast(Peach): " + fruitsArrayDeque);
        System.out.println("After peekFirst(): " + fruitsArrayDeque.peekFirst() + ", Deque: " + fruitsArrayDeque);
        System.out.println("After peekLast(): " + fruitsArrayDeque.peekLast() + ", Deque: " + fruitsArrayDeque);
        System.out.println("After getFirst(): " + fruitsArrayDeque.getFirst() + ", Deque: " + fruitsArrayDeque);
        System.out.println("After getLast(): " + fruitsArrayDeque.getLast() + ", Deque: " + fruitsArrayDeque);
        System.out.println("After pollFirst(): " + fruitsArrayDeque.pollFirst() + ", Deque: " + fruitsArrayDeque);
        System.out.println("After pollLast(): " + fruitsArrayDeque.pollLast() + ", Deque: " + fruitsArrayDeque);
        System.out.println("After removeFirst(): " + fruitsDeque.removeFirst() + ", Deque: " + fruitsDeque);
        System.out.println("After removeLast(): " + fruitsDeque.removeLast() + ", Deque: " + fruitsDeque);

        //decending order traversal using descendingIterator()
        System.out.print("Deque in reverse order: ");
        var descIterator_ArrayDeque = fruitsArrayDeque.descendingIterator();
        while (descIterator_ArrayDeque.hasNext()) {
            System.out.print(descIterator_ArrayDeque.next() + " ");
        }
        System.out.println();

        // Stack methods supported by ArrayDeque
        fruitsArrayDeque.push("Grapes");
        System.out.println("After push(Grapes): " + fruitsArrayDeque);
        System.out.println("After pop(): " + fruitsArrayDeque.pop() + ", Deque: " + fruitsArrayDeque);
        System.out.println("--------------------------------");

        //LinkedList Methods - Overview (In addition to Collection and Deque methods)
        LinkedList<String> fruitsLinkedList = new LinkedList<>();
        System.out.println("LinkedList Interface Methods:");
        // Queue specific methods supported by LinkedList
        fruitsLinkedList.offer("Apple");
        fruitsLinkedList.offer("Banana");
        fruitsLinkedList.offer("Cherry");
        fruitsLinkedList.offer("Date");
        fruitsLinkedList.offer("Elderberry");    
        fruitsLinkedList.offer("Fig");
        System.out.println("after offers: " + fruitsLinkedList);
        System.out.println("Peek: " + fruitsLinkedList.peek());
        System.out.println("after peek: " + fruitsLinkedList);
        System.out.println("Element: " + fruitsLinkedList.element());
        System.out.println("after element: " + fruitsLinkedList);
        System.out.println("Poll: " + fruitsLinkedList.poll());
        System.out.println("after poll: " + fruitsLinkedList);
        System.out.println("Remove: " + fruitsLinkedList.remove());
        System.out.println("after remove: " + fruitsLinkedList);
        //Deque specific methods supported by LinkedList
        fruitsLinkedList.addFirst("Mango");
        System.out.println("After addFirst(Mango): " + fruitsLinkedList);
        fruitsLinkedList.addLast("Orange");
        System.out.println("After addLast(Orange): " + fruitsLinkedList);
        fruitsLinkedList.offerFirst("Pineapple");
        System.out.println("After offerFirst(Pineapple): " + fruitsLinkedList);
        fruitsLinkedList.offerLast("Peach");
        System.out.println("After offerLast(Peach): " + fruitsLinkedList);
        System.out.println("After peekFirst(): " + fruitsLinkedList.peekFirst() + ", Deque: " + fruitsLinkedList);
        System.out.println("After peekLast(): " + fruitsLinkedList.peekLast() + ", Deque: " + fruitsLinkedList);
        System.out.println("After getFirst(): " + fruitsLinkedList.getFirst() + ", Deque: " + fruitsLinkedList);
        System.out.println("After getLast(): " + fruitsLinkedList.getLast() + ", Deque: " + fruitsLinkedList);
        System.out.println("After pollFirst(): " + fruitsLinkedList.pollFirst() + ", Deque: " + fruitsLinkedList);
        System.out.println("After pollLast(): " + fruitsLinkedList.pollLast() + ", Deque: " + fruitsLinkedList);
        System.out.println("After removeFirst(): " + fruitsLinkedList.removeFirst() + ", Deque: " + fruitsLinkedList);
        System.out.println("After removeLast(): " + fruitsLinkedList.removeLast() + ", Deque: " + fruitsLinkedList);

        //decending order traversal using descendingIterator()
        System.out.print("Deque in reverse order: ");
        var descIterator_LinkedList = fruitsLinkedList.descendingIterator();
        while (descIterator_LinkedList.hasNext()) {
            System.out.print(descIterator_LinkedList.next() + " ");
        }
        System.out.println();

        // Stack methods supported by LinkedList
        fruitsLinkedList.push("Grapes");
        System.out.println("After push(Grapes): " + fruitsLinkedList);
        System.out.println("After pop(): " + fruitsLinkedList.pop() + ", Deque: " + fruitsLinkedList);
        System.out.println("--------------------------------");
        
}
}
