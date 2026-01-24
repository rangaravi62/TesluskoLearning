package collections.queue;

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(List.of("Ravi", "Ajay", "Vijay", "Suresh"));
        queue.add("rohit");
        System.out.println("PriorityQueue after adding: " + queue);
        queue.remove();
        System.out.println("PriorityQueue after removing: " + queue);
        System.out.println(queue.peek());  //returns head
    }
}
