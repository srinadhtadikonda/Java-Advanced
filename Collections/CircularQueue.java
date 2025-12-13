import java.util.ArrayDeque;
import java.util.Deque;

public class CircularQueueDemo {

    static class CircularQueue {
        private Deque<Integer> deque;
        private int capacity;

        CircularQueue(int capacity) {
            this.capacity = capacity;
            deque = new ArrayDeque<>(capacity);
        }

        // Enqueue
        public void enqueue(int data) {
            if (deque.size() == capacity) {
                System.out.println("Queue is FULL");
                return;
            }
            deque.addLast(data);
            System.out.println(data + " inserted");
        }

        // Dequeue
        public void dequeue() {
            if (deque.isEmpty()) {
                System.out.println("Queue is EMPTY");
                return;
            }
            int removed = deque.removeFirst();
            System.out.println(removed + " removed");
        }

        // Display
        public void display() {
            System.out.println(deque);
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);   // Full

        cq.display();

        cq.dequeue();
        cq.enqueue(40);   // Wraps around

        cq.display();
    }
}
