package task6;

import java.util.Scanner;

//1. Write program which print out how much times each character is in initial string

public class HW1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Текст: \"" + sb + "\"");
        while (sb.length() != 0) {
            int k = 0;
            String letter = sb.charAt(0) + "";
            while (sb.indexOf(letter) != -1) {
                sb.deleteCharAt(sb.indexOf(letter));
                k++;
            }
            System.out.printf("character \"%s\" occurs %d times\n", letter, k);
        }

    }
}
