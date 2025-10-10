import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CJ_EmptyStackAndQueue {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            stack.add(i);
        }

        System.out.println("Stack size:- " + stack.size());

        for (int i = 0; i < stack.size(); i++) {
            System.out.println("i = " + i);
            stack.remove(i);
            i = i-1;
            System.out.println("Stack size after removal: " + stack.size());
            queue.add(i);
        }

        System.out.println("Queue size:- " + queue.size());

        for (int i = 0; i < queue.size(); i++) {
            System.out.println("queue - i = " + i);
            queue.remove();
            i =i -1;
            System.out.println("Queue size after removal: " + queue.size());
        }

        System.out.println(queue);

    }
}
