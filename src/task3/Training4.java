package task3;

//4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
// Otherwise, print "positive" or "negative".
// Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000

import java.util.Scanner;

public class Training4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        double a = sc.nextDouble();
        if (a == 0) System.out.println("zero");
        else {
            if (a < 0) System.out.print("negative");
            else System.out.print("positive");
            if (Math.abs(a) < 1) System.out.println(" and small");
            if (Math.abs(a) > 1000000) System.out.println(" and large");
        }
    }
}
