Using ArrayDeque as a Queue (FIFO)
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeQueue {

    public static void main(String[] args) {

        Deque<Integer> q = new ArrayDeque<>();

        // Enqueue
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Queue: " + q);

        // Dequeue
        System.out.println("Removed: " + q.poll());

        // Peek
        System.out.println("Front: " + q.peek());
    }
}

🧪 Output
Queue: [10, 20, 30]
Removed: 10
Front: 20

✅ Using ArrayDeque as a Stack (LIFO)
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeStack {

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

🧪 Output
Stack: [C, Python, Java]
Pop: C
Peek: Python

✅ Add / Remove from Both Ends
Deque<Integer> dq = new ArrayDeque<>();

dq.addFirst(1);
dq.addLast(2);
dq.addFirst(0);
dq.addLast(3);

System.out.println(dq);  // [0, 1, 2, 3]
