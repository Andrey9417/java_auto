package task7;

//5.Write a program with method sum(int n) which receives one parameter and return sum of its digits using recursion

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Fill in a number");
        int number = sc.nextInt();
        int sumOfDigits = sum(Math.abs(number));
        System.out.printf("Sum of digits in \"%d\" is %d", number, sumOfDigits);

    }

    private static int sum(int number) {
        if (number / 10 == 0) return number % 10;
        else return number % 10 + sum(number / 10);
    }
}
