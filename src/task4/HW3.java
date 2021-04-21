package task4;

import java.util.Scanner;

//3. Write 4 programs called TriangularPatternX (X = A, B, C, D) that prompts user for the size
// (a non-negative integer in int); and prints each of the patterns as shown on picture below
//        https://prnt.sc/qu7uim

public class HW3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите size");
        int size = sc.nextInt();
        if (size < 1) System.out.println("Некорректное значение size");
        else {
            System.out.println("Введите тип треугольника в цифрах a-1; b-2; c-3; d-4)");
            int type = sc.nextInt();
            //String type = sc.nextLine();
            //if (!(type.equals("a") || type.equals("b") || type.equals("c") || type.equals("d")))
            if (type < 0 || type > 4)
                System.out.println("Некорректный тип треугольника");
            else {
                if (type == 1) TriangularPatternA(size);
                if (type == 2) TriangularPatternB(size);
                if (type == 3) TriangularPatternC(size);
                if (type == 4) TriangularPatternD(size);
            }
        }
    }

    private static void TriangularPatternD(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                if (j > size - 1 - i) System.out.print("#");
                else System.out.print(" ");
            System.out.println();
        }
    }

    private static void TriangularPatternC(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                if (j >= i) System.out.print("#");
                else System.out.print(" ");
            System.out.println();
        }
    }

    private static void TriangularPatternB(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++)
                System.out.print("#");
            System.out.println();
        }
    }

    private static void TriangularPatternA(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("#");
            System.out.println();
        }
    }
}
