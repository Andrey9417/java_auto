package task3;

import java.util.Scanner;

//9. Write a Java program that takes a year from user and print whether that year is a leap year or not.

public class Training9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int year = sc.nextInt();
        if (year % 4 != 0 || year % 400 == 100 || year % 400 == 200 || year % 400 == 300)
            System.out.println("Год не високосный");
        else System.out.println("Год високосный");
    }
}
