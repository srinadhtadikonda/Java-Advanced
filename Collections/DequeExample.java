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

✅ Deque as a Stack (LIFO)
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackExample {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C");

        System.out.println("Stack: " + stack);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
    }
}

Output
Stack: [C, Python, Java]
Pop: C
Peek: Python

✅ Add / Remove from Both Ends
Deque<Integer> dq = new ArrayDeque<>();

dq.addFirst(1);
dq.addLast(2);
dq.addFirst(0);
dq.addLast(3);

System.out.println(dq);   // [0, 1, 2, 3]

dq.removeFirst();         // removes 0
dq.removeLast();          // removes 3

System.out.println(dq);   // [1, 2]
