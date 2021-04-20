package task3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

//2. Write a Java program to solve quadratic equations (use if, else if and else)

public class Training2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите a");
        double a = sc.nextDouble();
        System.out.println("Введите b");
        double b = sc.nextDouble();
        System.out.println("Введите c");
        double c = sc.nextDouble();

        if (a == 0) System.out.println("а=0, у уравнения один корень: х = " + -c / b);
        else {
            double d = b * b - 4 * a * c;
            if (d == 0) System.out.println("x1 = x2 = " + -b / (2 * a));
            else if (d < 0) System.out.println("Нет действительных корней");
            else
                System.out.println("Корни уравнения: x1 = " + (-b + sqrt(d)) / (2 * a) + "; x2 = " + (-b - sqrt(d)) / (2 * a));
        }


    }
}
