package task3;

import java.util.Scanner;

//4. Write a program which take number of month from user and print out name of season (summer, winter ...)

public class HomeWork4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int n = sc.nextInt();
        if (n < 1 || n > 12) System.out.println("Введите корректный номер месяца");
        else {
            if (n == 1 || n == 2 || n == 12) System.out.println("winter");
            if (n == 3 || n == 4 || n == 5) System.out.println("spring");
            if (n == 6 || n == 7 || n == 8) System.out.println("summer");
            if (n == 9 || n == 10 || n == 11) System.out.println("autumn");
        }
    }
}
