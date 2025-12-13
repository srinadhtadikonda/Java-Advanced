import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        System.out.println("Priority Queue: " + pq);

        System.out.println("Peek: " + pq.peek());
        }
    }
}
