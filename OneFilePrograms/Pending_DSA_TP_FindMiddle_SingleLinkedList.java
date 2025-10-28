import java.util.*;

// find middle using Single Linked list
public class Pending_DSA_TP_FindMiddle_SingleLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);
        list.addLast(90);
        list.addLast(100);
        list.display();
        Integer mid = list.findMiddle();
        System.out.println("Middle element is: " + (mid != null ? mid : "none"));
    }
}

class SinglyLinkedList<T> {
    private static class Node<E> {
        E val;
        Node<E> next;

        Node(E v) { val = v; }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public void addLast(T val) {
        Node<T> node = new Node<>(val);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // Display the list
    public void display() {
        Node<T> cur = head;
        System.out.print("List: ");
        while (cur != null) {
            System.out.print(cur.val + (cur.next != null ? " -> " : ""));
            cur = cur.next;
        }
        System.out.println();
    }

    // Return middle element. For even length lists, returns the second of the two middle nodes (upper middle)
    public T findMiddle() {
        if (head == null) return null;
        Node<T> slow = head;
        Node<T> fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    public int size() { return size; }
}