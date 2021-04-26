package task6;

import java.util.Scanner;

//5. Write a Java program to read a string and an int from console, return a string without the character
// with described index

public class HW5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        System.out.println("Введите число");
        int num = sc.nextInt();
        if (num < 1 || num > str.length()) throw new RuntimeException("Wrong number");
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(num - 1);
        System.out.println(sb);
    }
}
