package task7;

import java.util.Scanner;

//2.Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown:

public class HW2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите size");
        int size = sc.nextInt();
        if (size < 1) throw new RuntimeException("Wrong size");
        for (int i = 0; i < size; i++) {
            int number = i + 1;
            for (int j = 0; j < size; j++) {
                if (j == size - number) {
                    System.out.print(number);
                    number--;
                } else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
