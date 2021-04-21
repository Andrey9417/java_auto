package task4;

import java.util.Scanner;

//4. Write a program to extract each digit from a double, in the reverse order.

public class HW4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");
        double num = sc.nextDouble();
        String str = Double.toString(num);
        for (int i = str.length() - 1; i >= 0; i--)
            System.out.print(str.charAt(i) + " ");

    }

}
