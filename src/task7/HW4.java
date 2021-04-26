package task7;

import java.util.Scanner;

//4.Write a program which verify whether String is a valid shuffle of other String.

public class HW4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Fill in 1st string");
        String firstString = sc.nextLine();
        System.out.println("Fill in 2nd string");
        String secondString = sc.nextLine();

        if (firstString.length() != secondString.length()) System.out.println("Don't match by size");
        else {
            StringBuilder sb1 = new StringBuilder(firstString);
            StringBuilder sb2 = new StringBuilder(secondString);

            while (sb1.length() > 0) {
                String letter = sb1.charAt(0) + "";
                if (sb2.indexOf(letter) == -1) {
                    System.out.println("Don't match by content");
                    break;
                } else {
                    sb1.deleteCharAt(0);
                    sb2.deleteCharAt(sb2.indexOf(letter));
                }
            }
            if (sb1.length() == 0) System.out.println("Do match");
        }
    }
}
