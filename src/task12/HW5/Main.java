package task12.HW5;

//5. Create program which will result StackOverflowException

public class Main {

    public static void main(String[] args) {

        forException(5);
    }

    public static void forException(int n) {
        if (n < 5) forException(n + 1);
        else forException(n - 1);
    }
}
