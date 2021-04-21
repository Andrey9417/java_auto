package task2_training;

import java.util.Scanner;

//5. Write a program which converts number from decimal to hex view (input in command line)
// Enter a decimal number: 1234
// Decimal to complex: 4d2

public class Training5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();
        System.out.println(Integer.toHexString(n));
    }
}
