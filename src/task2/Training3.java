package task2;

import java.util.Scanner;

//3. Write a program which divide 2 numbers and print the result in console

public class Training3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = sc.nextDouble();
        System.out.println("Введите второе число");
        double b = sc.nextDouble();
        System.out.printf("%f разделить на %f равно %.3f", a, b, a / b);
    }
}
