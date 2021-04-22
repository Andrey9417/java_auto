package task5;

import java.util.Arrays;
import java.util.Random;

//4) Write program which create an array from 20 integers with random values, write method with sort them
// in increase order, use Selection sort type

public class HW4 {

    public static void main(String[] args) {

        Random rand = new Random();

        int length = 20;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = rand.nextInt();

        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\n" + Arrays.toString(arr));
        arr = arraySortSelection(arr);
        System.out.println("\n" + Arrays.toString(arr));

    }

    private static int[] arraySortSelection(int[] arr) {

        int indexOfMin;
        for (int i = 0; i < arr.length; i++) {
            indexOfMin = i;
            for (int j = i; j < arr.length; j++)
                if (arr[j] < arr[indexOfMin]) indexOfMin = j;
            if (i != indexOfMin) {
                int forSwap = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = forSwap;
            }
        }
        return arr;
    }
}
