package task3;

//1. Write a program which take four numbers from the user and print out just that few of them which divide
// by 3 or 5 without remainder

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        System.out.println("Введите c");
        int c = sc.nextInt();
        System.out.println("Введите d");
        int d = sc.nextInt();

        if (a % 3 == 0 && a % 5 == 0) System.out.print(a + " ");
        if (b % 3 == 0 && b % 5 == 0) System.out.print(b + " ");
        if (c % 3 == 0 && c % 5 == 0) System.out.print(c + " ");
        if (d % 3 == 0 && d % 5 == 0) System.out.print(d + " ");
    }
}
