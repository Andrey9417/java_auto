package task3;

import java.util.Scanner;

//2. Write a program which take string from console and print out whether it contains numbers, uppercase
// symbols, lowercase symbols, special characters (!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)

public class HomeWork2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку");
        String sentence = sc.nextLine();

        int a;
        for (int i = 0; i < sentence.length(); i++) {
            a = sentence.charAt(i);
            if ((a >= 33 && a <= 47) || (a >= 58 && a <= 64) || (a >= 91 && a <= 96) || (a >= 123 && a <= 126))
                System.out.println("В строке есть специальный символ: " + sentence.charAt(i));
        }
    }
}

