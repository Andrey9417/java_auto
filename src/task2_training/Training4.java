package task2_training;

import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

//4. Write program which count area of triangle. All values user has to input in console. S=(a*b*sinA)/2

public class Training4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        double a = sc.nextDouble();
        System.out.println("Введите b");
        double b = sc.nextDouble();
        System.out.println("Введите значение угла в градусах");
        double angle = sc.nextDouble();
        System.out.printf("Площадь треугольника равна: %f", a * b * sin(toRadians(angle)) / 2);
    }
}
