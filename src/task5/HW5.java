package task5;

//5) Write program which create an array from 20 integers with random values, write method with sort them
// in increase order, use Insertion sort type

import java.util.Arrays;
import java.util.Random;

public class HW5 {
    public static void main(String[] args) {

        Random rand = new Random();

        int length = 20;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = rand.nextInt();

        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\n" + Arrays.toString(arr));
        arr = arraySortInsert(arr);
        System.out.println("\n" + Arrays.toString(arr));
    }

    private static int[] arraySortInsert(int[] arr) {
        int forSwap;
        for (int i = 1; i < arr.length; i++)
            for (int j = i - 1; j >= 0; j--)
                if (arr[j + 1] < arr[j]) {
                    forSwap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = forSwap;
                }
        return arr;
    }
}
