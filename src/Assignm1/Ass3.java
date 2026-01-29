package Assignm1;



// Question 3: Remove specific element
public class Ass3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int remove = 3;

        int count = 0;
        for (int i : arr)
            if (i != remove) count++;

        int[] newArr = new int[count];
        int j = 0;

        for (int i : arr)
            if (i != remove) newArr[j++] = i;

        for (int x : newArr)
            System.out.print(x + " ");
    }
}

