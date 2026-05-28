import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        // Add elements
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.offerFirst("Mango");
        deque.offerLast("Orange");

        System.out.println(deque);

        // Access elements
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // Remove elements
        System.out.println("Removed First: " + deque.pollFirst());
        System.out.println("Removed Last: " + deque.pollLast());

        System.out.println(deque);
    }
}
