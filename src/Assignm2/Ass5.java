package Assignm2;



import java.util.Queue;
import java.util.LinkedList;

public class Ass5 {

    public static Queue<Integer> mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> merged = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                merged.offer(q1.poll());
            } else {
                merged.offer(q2.poll());
            }
        }

        // Add remaining elements
        while (!q1.isEmpty()) merged.offer(q1.poll());
        while (!q2.isEmpty()) merged.offer(q2.poll());

        return merged;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        q1.offer(1);
        q1.offer(3);
        q1.offer(5);

        q2.offer(2);
        q2.offer(4);
        q2.offer(6);

        System.out.println("Queue 1: " + q1);
        System.out.println("Queue 2: " + q2);

        Queue<Integer> mergedQueue = mergeQueues(q1, q2);
        System.out.println("Merged Sorted Queue: " + mergedQueue);
    }
}
