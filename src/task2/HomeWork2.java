package task2;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

//2. Write a program which count the volume of cylinder and print result in console.
// Radius and height user input from console

public class HomeWork2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус основания цилиндра");
        double r = sc.nextDouble();
        System.out.println("Введите высоту цилиндра");
        double h = sc.nextDouble();
        System.out.println("Объем цилиндра равен: " + abs(h * r * r * PI));
    }
}
