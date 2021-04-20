package task2;

import java.util.Scanner;

// 1. Write a program that multiplies 3 natural numbers and prints results to console

public class Training1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое натуральное число");
        int a = sc.nextInt();
        System.out.println("Введите второе натуральное число");
        int b = sc.nextInt();
        System.out.println("Введите третье натуральное число");
        int c = sc.nextInt();
        System.out.printf("Произведение чисел: %d", a * b * c);
    }
}
