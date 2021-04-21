package task2_training;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.PI;

//2. Write a program which count the area of circle and print result in console.
// You know radius, value can be fractional.

public class Training2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение радиуса круга");
        try {
            double radius = sc.nextDouble();
            System.out.printf("Площадь круга равна: %f", radius * radius * PI);
        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод числа");
        }

    }
}
