package task4;

import java.util.Arrays;
import java.util.Scanner;

//2. Write a program called Tribonacci to print the first 20 Tribonacci numbers

public class HW2_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов последовательности");
        int count = sc.nextInt();
        int arr[] = new int[count];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        for (int i = 3; i < count; i++)
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
        System.out.println(Arrays.toString(arr));
    }

}
