Deque as a Queue (FIFO)
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueExample {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);

        System.out.println("Queue: " + dq);

        System.out.println("Removed: " + dq.pollFirst());
        System.out.println("Front: " + dq.peekFirst());
    }
}

Output
Queue: [10, 20, 30]
Removed: 10
Front: 20

