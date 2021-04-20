package package_1;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        if (!sc.hasNextInt() || sc.nextInt() < 0)
            System.out.println("Некорректный ввод n");
        else {

            int n = sc.nextInt();
            long f = factor(n);
            System.out.println("n! = " + f);
        }
    }

    private static long factor(int n) {

        if (n == 0) return 1;
        else return n * factor(n - 1);
    }
}
