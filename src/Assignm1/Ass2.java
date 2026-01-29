package Assignm1;


import java.util.Random;

// Question 2: Remove random element
public class Ass2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Random rand = new Random();
        int index = rand.nextInt(arr.length);

        int[] newArr = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        for (int x : newArr)
            System.out.print(x + " ");
    }
}
