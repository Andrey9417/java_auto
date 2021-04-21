package task3_training;

//3. Take three numbers from the user and print the greatest number

import java.util.Scanner;

public class Training3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();

        if (a >= b && a >= c) System.out.printf("Первое число %d - самое большое", a);
        else if (b >= c) System.out.printf("Второе число %d - самое большое", b);
        else System.out.printf("Третье число %d - самое большое", c);
    }
}
