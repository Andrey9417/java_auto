package task5;

import java.util.Scanner;

//2) Print out first 20 Fibonachi numbers using recursion

public class HW2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество чисел");
        int number = sc.nextInt();
        fiboPrint(1, 0, number);
    }

    private static void fiboPrint(int a, int b, int number) {

        if (number > 0) {
            System.out.print(b + " ");
            b = a + b;
            a = b - a;
            number--;
            fiboPrint(a, b, number);
        }

    }
}
