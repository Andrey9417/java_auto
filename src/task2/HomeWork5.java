package task2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

//5. Write a program which count x1, x2 for quadratic equation. Input a, b, c from console.

public class HomeWork5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        double a = sc.nextDouble();
        System.out.println("Введите b");
        double b = sc.nextDouble();
        System.out.println("Введите c");
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        if (d < 0) System.out.println("Нет действительных корней");
        else if (d == 0)
            System.out.printf("Оба корня равны: %f", -b / (2 * a));
        else
            System.out.printf("Корни уравнения: x1 = %.1f , x2 = %.1f", (-b + sqrt(d)) / (2 * a), (-b - sqrt(d)) / (2 * a));

    }
}
