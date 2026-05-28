import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        // add() -> adds at end
        deque.add("PEN");
        deque.add("BOOK");
        deque.add("ERASER");

        System.out.println("Initial Deque: " + deque);

        // addFirst()
        deque.addFirst("PENCIL");

        // addLast()
        deque.addLast("SHARPENER");

        System.out.println("After addFirst & addLast: " + deque);

        // offerFirst()
        deque.offerFirst("SCALE");

        // offerLast()
        deque.offerLast("MARKER");

        System.out.println("After offerFirst & offerLast: " + deque);

        // peekFirst()
        System.out.println("peekFirst(): " + deque.peekFirst());

        // peekLast()
        System.out.println("peekLast(): " + deque.peekLast());

        // push() -> acts like stack push (adds at front)
        deque.push("COLOR BOX");

        System.out.println("After push(): " + deque);

        // pop() -> removes from front
        System.out.println("pop(): " + deque.pop());

        System.out.println("After pop(): " + deque);

        // pollFirst()
        System.out.println("pollFirst(): " + deque.pollFirst());

        // pollLast()
        System.out.println("pollLast(): " + deque.pollLast());

        System.out.println("After pollFirst & pollLast: " + deque);

        // removeFirst()
        System.out.println("removeFirst(): " + deque.removeFirst());

        // removeLast()
        System.out.println("removeLast(): " + deque.removeLast());

        System.out.println("After removeFirst & removeLast: " + deque);

        // contains()
        System.out.println("Contains BOOK? " + deque.contains("BOOK"));

        // size()
        System.out.println("Size: " + deque.size());

        // Iterating deque
        System.out.println("\nIterating Deque:");

        for (String item : deque) {
            System.out.println(item);
        }

        // clear()
        deque.clear();

        System.out.println("\nAfter clear(): " + deque);

        // isEmpty()
        System.out.println("Is Empty? " + deque.isEmpty());
    }
}
