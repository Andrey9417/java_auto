package task3;

//5. Write a Java program that keeps a number from the user between 1 and 7 and displays the name of the weekday

import java.util.Scanner;

public class Training5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        if (!sc.hasNextInt() || sc.nextInt() > 7 || sc.nextInt() < 1)
            System.out.println("Некорректный ввод номера дня недели");
        else {
            int n = sc.nextInt();
            if (n == 1) System.out.println("Понедельник");
            if (n == 2) System.out.println("Вторник");
            if (n == 3) System.out.println("Среда");
            if (n == 4) System.out.println("Четверг");
            if (n == 5) System.out.println("Пятница");
            if (n == 6) System.out.println("Суббота");
            if (n == 7) System.out.println("Воскресенье");
        }


    }
}
