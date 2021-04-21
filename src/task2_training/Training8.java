package task2_training;

import java.util.Scanner;

public class Training8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        double a = sc.nextDouble();
        System.out.println("Введите b");
        double b = sc.nextDouble();
        boolean check = (a <= 16) || ((b * a + 1) / b > 4) && (a != b + 1) || (b > 100);
        System.out.println(check);
    }
}
