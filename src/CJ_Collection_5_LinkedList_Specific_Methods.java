import java.util.*;

public class CJ_Collection_5_LinkedList_Specific_Methods {
    public static void main(String[] args) {
        //LinkedList Methods - Overview (In addition to Collection and List methods)
        // LinkedList is a doubly linked list implementation of the List and Deque interfaces(Deque extends Queue).
        // Stack and Queue both can be implemented using LinkedList.
        // It allows for efficient insertions and deletions at both ends of the list.
        LinkedList<String> fruitsLinkedList = new LinkedList<>();
        Collections.addAll(fruitsLinkedList, "Fig", "Grape", "Honeydew", "Apple", "Banana", "Cherry", "Date", "Fig", "Grape");
        System.out.println("fruitsLinkedList: " + fruitsLinkedList);

    }
}
