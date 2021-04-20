package task3;

import java.util.Scanner;

//1. Write a Java program to get a number from the user and print whether it is positive or negative
public class Training1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        double a = sc.nextDouble();
        if (a == 0) System.out.println("number = 0");
        else if (a < 0) System.out.println("number is negative");
        else System.out.println("number is positive");
    }
}
