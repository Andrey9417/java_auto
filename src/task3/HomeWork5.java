package task3;

import java.util.Scanner;

//5. Write the program which take name of color from user (red, blue, green, yellow, orange, black, white, pink)
// and print out length of this word. You can’t use .length() of String. Use switch operator

public class HomeWork5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        switch (color) {
            case "red":
                System.out.println(3);
                break;
            case "blue":
            case "pink":
                System.out.println(4);
                break;
            case "green":
            case "black":
            case "white":
                System.out.println(5);
                break;
            case "yellow":
            case "orange":
                System.out.println(6);
                break;
            default:
                System.out.println("Выберите один из заявленных цветов");
                break;
        }
    }
}
