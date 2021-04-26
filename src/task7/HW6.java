package task7;

import java.util.Arrays;
import java.util.Scanner;

//6.Write a program which print out 2dimensional array depending on the size which user set via console:

public class HW6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int k = n - 1;
        int counter = 1;
        int raw = n - 1;
        int column = n - 1;

        while (counter <= n * n) {
            if (k == n - 1) {
                for (int i = 1; i <= k; i++) {
                    arr[raw][column] = counter;
                    counter++;
                    raw--;
                }
            }
            //
            for (int i = 1; i <= k; i++) {    // влево
                arr[raw][column] = counter;
                counter++;
                column--;
            }
            //
            for (int i = 1; i <= k; i++) {    // вниз
                arr[raw][column] = counter;
                counter++;
                raw++;
            }
            //
            if (k == 1) {
                arr[raw][column] = counter;
                break;
            } else k--;
            //
            for (int i = 1; i <= k; i++) {    //вправо
                arr[raw][column] = counter;
                counter++;
                column++;
            }
            //
            for (int i = 1; i <= k; i++) {    //вверх
                arr[raw][column] = counter;
                counter++;
                raw--;
            }
            //
            if (k == 1) {
                arr[raw][column] = counter;
                break;
            } else k--;

        }

        for (int i = 0; i < n; i++)
            System.out.println(Arrays.toString(arr[i]));
    }
}
