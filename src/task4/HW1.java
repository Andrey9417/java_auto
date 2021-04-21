package task4;

//1. Write a program to compute the value of Euler number. Try maxDenominator of 1000, 10000, 100000.
public class HW1 {

    public static void main(String[] args) {

        double e = 0;
        int i = 0;
        while (factor(i) < 1000) {
            e += 1.0 / factor(i);
            i++;
        }
        System.out.println("Euler number with max denominator < 1000 is " + e);
/////////////////////////////////////////////////
        i = 0;
        e = 0;
        while (factor(i) < 10000) {
            e += 1.0 / factor(i);
            i++;
        }
        System.out.println("Euler number with max denominator < 10000 is " + e);
/////////////////////////////////////////////////
        i = 0;
        e = 0;
        while (factor(i) < 100000) {
            e += 1.0 / factor(i);
            i++;
        }
        System.out.println("Euler number with max denominator < 100000 is " + e);
    }

    private static long factor(int n) {

        if (n == 0) return 1;
        else return n * factor(n - 1);
    }
}
