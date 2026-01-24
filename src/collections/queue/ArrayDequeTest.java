package collections.queue;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Ravi");
        deque.add("Ajay");
        deque.add("Vijay");
        deque.addFirst("Suresh");
        deque.addLast("rohit");

        System.out.println("ArrayDeque after adding: " + deque);

        deque.remove();
        System.out.println("ArrayDeque after removing: " + deque);

        System.out.println(deque.peek());  //returns head
    }
}
