package task11.HW5;

//5. Write class which contains just 1 method which returns the result of multiplication of all doubles which
//        it receives. It can receive any amount of double numbers. Add usage of it in main in other class

public class Main {
    public static void main(String[] args) {

        double a = 4.5;
        double b = 3.5;
        double c = 2.5;
        double d = 1.5;
        System.out.println(doubleMult(a, b, c, d));
    }

    static double doubleMult(double... d) {
        double result = 1.0;
        for (double number : d) {
            result *= number;
        }
        return result;
    }
}
