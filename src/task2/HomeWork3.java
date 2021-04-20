package task2;

import java.util.Scanner;

//3. Write a program which converts number from hex to decimal view (input in command line)

public class HomeWork3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        String n = sc.nextLine();
        System.out.println(Integer.parseInt(n, 16));
    }
}
