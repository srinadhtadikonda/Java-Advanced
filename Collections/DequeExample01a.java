import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<String>();

        deque.add("PEN");
        deque.add("BOOK");
        deque.add("ERASER");

        System.out.println(deque);
    }
}
