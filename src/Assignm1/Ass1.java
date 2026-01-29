package Assignm1;

// Question 1: Clone an array
public class Ass1 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};

        int[] clone = original.clone();

        for (int i : clone) {
            System.out.print(i + " ");
        }
    }
}
