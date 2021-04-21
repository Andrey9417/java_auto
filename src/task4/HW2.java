package task4;

import java.util.Scanner;

//2. Write a program called Tribonacci to print the first 20 Tribonacci numbers

public class HW2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов последовательности");
        int count = sc.nextInt();
        int a = 0;
        System.out.print(a + " ");
        int b = 0;
        System.out.print(b + " ");
        int c = 1;
        System.out.print(c + " ");

        int i = 3;
        while (true) {
            a = a + b + c;
            System.out.print(a + " ");
            i++;
            if (i == count) break;

            b = a + b + c;
            System.out.print(b + " ");
            i++;
            if (i == count) break;

            c = a + b + c;
            System.out.print(c + " ");
            i++;
            if (i == count) break;

        }
    }
}
