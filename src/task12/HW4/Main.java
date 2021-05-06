package task12.HW4;

//4. Write program which has try-catch block inside of catch in try-catch block (with different exception other
//        then we had in class)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill in index of element");
        String[] arr = new String[5];
        try {
                // gergrehrehre
                arr[sc.nextInt()] = 1 + "";
                Main main = null;
                arr[1] = main.toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds exception");
        }
        catch (NullPointerException e) {
            System.err.println("null pointer exception");
        }
    }
}
