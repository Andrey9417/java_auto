package task5;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

//3) Write program which create an array from 20 integers with random values, write method with shuffle
// elements of array in random order

public class HW3 {

    public static void main(String[] args) {

        Random rand = new Random();

        int length = 20;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = rand.nextInt();

        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\n" + Arrays.toString(arr));

        arr = arrayShuffle(arr);

        System.out.println("\n" + Arrays.toString(arr));

//        for (int i : arr)
//            arr[i]=rand.nextInt();
//        for (int i : arr)
//            System.out.print(arr[i]+" ");

//        for (int i : arr)
//            System.out.print((i+1) + " ");

    }

    private static int[] arrayShuffle(int @NotNull [] arr) {

        Random rand = new Random();
        int randIndex;
        int forSwap;
        for (int i = 0; i < arr.length; i++) {
            randIndex = rand.nextInt(arr.length);
            forSwap = arr[i];
            arr[i] = arr[randIndex];
            arr[randIndex] = forSwap;
        }
        return arr;

    }
}
