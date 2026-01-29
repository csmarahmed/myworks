package Assignm2;



import java.util.PriorityQueue;

public class Ass4{

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(5);
        pq.offer(2);
        pq.offer(8);

        System.out.println("Dequeue elements in ascending order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
