package task2_training;

//7. Please resolve next operations

public class Training7 {
    public static void main(String[] args) {

        int x = 2;
        int y = 6;
        y = ++y * x++;
        x *= x + y;
        y = y + ++x;
        x = 1 + x + y;
        y = (x - y - 1) / 3;
        System.out.println("The value of x is" + x);
        System.out.println("The value of y is" + y);

    }
}
