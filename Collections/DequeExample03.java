//Using Deque as a Queue (FIFO)
import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingDeque {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);

        System.out.println("Removed: " + queue.poll());
        System.out.println(queue);
    }
}
