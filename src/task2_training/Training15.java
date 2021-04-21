package task2_training;

import java.util.Scanner;

//15. Write a program which read double from console and returns always positive natural part of it

public class Training15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = Math.abs((int) sc.nextDouble());
        System.out.println(number);
    }

}
