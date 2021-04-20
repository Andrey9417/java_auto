package task2;

/*
6. Please resolve next operations:
        int x = 9;
        int y;
        y = ++x;
        y = x++;
        y = --x;
        y = --x;
        y = x--;
        System.out.println("The value of x " + x);
        System.out.println("The value of y " + y);
        */

public class Training6 {

    public static void main(String[] args) {

        int x = 9;
        int y;
        y = ++x;
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println();
        y = x++;
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println();
        y = --x;
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println();
        y = x--;
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);

    }
}
