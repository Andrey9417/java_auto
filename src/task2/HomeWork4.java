package task2;

//4. Create your own example with increment/decrement, count it manually and then run program and verify your value.

public class HomeWork4 {

    public static void main(String[] args) {

        int x = 1;
        int y = 7;
        x++;
        y--;
        y *= x++;
        x = --x - 1 + y++ * --x + x++;
        x += 2;
        y -= 5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
