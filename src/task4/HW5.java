package task4;

import java.util.Scanner;

//5. Write program which print out next image using loops

public class HW5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите n");
        int n = sc.nextInt();
        String[][] arr = new String[n][2 * n - 1];
        for (int i = 0; i < 2 * n - 1; i++)      //заполняем нулевую строку
            if (i != n - 1) arr[0][i] = " ";
            else arr[0][i] = "*";

        for (int i = 1; i < n; i++) {          //заполняем строки от 1 до n-1
            for (int j = 0; j < n * 2 - 1; j++) {
                if (j < n && arr[i - 1][j + 1].equals("*")) arr[i][j] = "*";
                else arr[i][j] = " ";
                if (j >= n && arr[i - 1][j - 1].equals("*")) arr[i][j] = "*";
            }
        }

        for (int i = 0; i < n; i++) {          //выводим массив на экран
            for (int j = 0; j < 2 * n - 1; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
