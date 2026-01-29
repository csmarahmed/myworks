package Assignm1;
import java.util.PriorityQueue;

// Question 4: Priority Queue where smallest element is dequeued first
public class Ass4 {

    public static void main(String[] args) {

        // إنشاء Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // إدخال عناصر
        pq.add(25);
        pq.add(10);
        pq.add(40);
        pq.add(5);
        pq.add(30);

        System.out.println("Dequeuing elements (smallest first):");

        // إزالة العناصر (dequeue)
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}

