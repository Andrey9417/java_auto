package task6;

import java.util.Scanner;

//2. Write a Java program to print out the maximum occurring character in initial string. If there are
// few of them -> print them all

public class HW2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Текст: \"" + sb + "\"");
        int max = 0;
        String[][] arr = new String[2][sb.length()];
        int i = -1;
        while (sb.length() != 0) {
            int k = 0;
            String letter = sb.charAt(0) + "";
            while (sb.indexOf(letter) != -1) {
                sb.deleteCharAt(sb.indexOf(letter));
                k++;
            }
            i++;
            arr[0][i] = letter;
            arr[1][i] = Integer.toString(k);
            if (max < k) max = k;
        }
        String maxAsString = Integer.toString(max);
        while (i >= 0) {
            if (arr[1][i].equals(maxAsString))
                System.out.printf("Maximum occurring character is \"%s\" (%s times).\n", arr[0][i], arr[1][i]);
            i--;
        }
    }
}
