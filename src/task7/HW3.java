package task7;

import java.util.Scanner;

//3.Write a program which compares 2 strings by symbols and print whether they contain the same symbols
// or not. If not print difference. (Big and small symbol consider like the same)

public class HW3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую строку");
        String firstString = sc.nextLine();
        System.out.println("Введите вторую строку");
        String secondString = sc.nextLine();

        StringBuilder sbFirst = new StringBuilder(firstString);
        StringBuilder sbSecond = new StringBuilder(secondString);
        String[][] arrayOfStrings = new String[2][];
        arrayOfStrings[0] = new String[firstString.length()];
        arrayOfStrings[1] = new String[secondString.length()];
        int quantityOfLettersInFirst = 0;
        int quantityOfLettersInSecond = 0;
        System.out.println("First string: " + firstString);
        System.out.println("Second string: " + secondString);

        while (sbFirst.length() != 0) {
            String letter = sbFirst.charAt(0) + "";
            arrayOfStrings[0][quantityOfLettersInFirst] = letter;
            quantityOfLettersInFirst++;
            while (sbFirst.indexOf(letter) != -1)
                sbFirst.deleteCharAt(sbFirst.indexOf(letter));
        }
        while (sbSecond.length() != 0) {
            String letter = sbSecond.charAt(0) + "";
            arrayOfStrings[1][quantityOfLettersInSecond] = letter;
            quantityOfLettersInSecond++;
            while (sbSecond.indexOf(letter) != -1)
                sbSecond.deleteCharAt(sbSecond.indexOf(letter));
        }

        int k = 0;
        System.out.print("1st doesn’t contain: ");
        for (int i = 0; i < quantityOfLettersInSecond; i++)
            for (int j = 0; j < quantityOfLettersInFirst + 1; j++)
                if (arrayOfStrings[0][j] == null) System.out.printf("'%s', ", arrayOfStrings[1][i]);
                else if (arrayOfStrings[0][j].equalsIgnoreCase(arrayOfStrings[1][i])) {
                    k++;
                    break;
                }
        System.out.println();

        System.out.print("2nd doesn’t contain: ");
        for (int i = 0; i < quantityOfLettersInFirst; i++)
            for (int j = 0; j < quantityOfLettersInSecond + 1; j++)
                if (arrayOfStrings[1][j] == null) System.out.printf("'%s', ", arrayOfStrings[0][i]);
                else if (arrayOfStrings[1][j].equalsIgnoreCase(arrayOfStrings[0][i])) {
                    k++;
                    break;
                }
        System.out.println();
        if (quantityOfLettersInFirst != quantityOfLettersInSecond || k > 0)
            System.out.println("Result: Strings contain different symbols.");
        else System.out.println("Result: Strings contain same symbols.");
    }
}
