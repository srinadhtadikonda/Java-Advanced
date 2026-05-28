import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAddExample {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);

        System.out.println(deque);
    }
}
