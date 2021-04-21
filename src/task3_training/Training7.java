package task3_training;

import java.util.Scanner;

//7. Write a Java program to find the number of days in a month
public class Training7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int n = sc.nextInt();
        if (n < 13 && n > 0) {
            if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)
                System.out.println("В месяце 31 день");
            if (n == 2) System.out.println("В этом месяце 28-29 дней");
            if (n == 4 || n == 6 || n == 9 || n == 11) System.out.println("В месяце 30 дней");
        } else System.out.println("Введен некорректный номер месяца");
    }
}
