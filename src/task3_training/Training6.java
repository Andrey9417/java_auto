package task3_training;

import java.util.Scanner;

//6. Write a Java program that reads in two floating-point numbers and tests whether they are the same
// up to three decimal places
public class Training6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        double a = sc.nextDouble();
        System.out.println("Введите второе число");
        double b = sc.nextDouble();
        if ((int) (a * 1000) == (int) (b * 1000)) System.out.println("a = b до третьего знака после запятой");
        else System.out.println("a не равно b");

    }
}
