package task7;

import java.util.Scanner;

//1.Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown:

public class HW1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нечетное число");
        int n = sc.nextInt();
        if (n < 0 || n % 2 == 0) throw new RuntimeException("Некорректное n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                if (j > Math.abs((n + 1) / 2 - i) + 1 && j < n - Math.abs((n + 1) / 2 - i))
                    System.out.print("  ");
                else System.out.print("# ");
            System.out.println();
        }

    }
}
