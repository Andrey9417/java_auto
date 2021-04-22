package task5;

//1) Write program with example of overloading with methods with variations of parameters:
// (int), (int, int), (double, int), (int, double), (int, float, String) and without parameters.
// Add case of usage types substitution from Type Promotion table (int → long → float → double)

public class HW1 {

    public static void main(String[] args) {

        int a = 123452;
        double b = 4252.2341d;
        float c = -1233.33f;
        String str = "qweEWQ";

        print(a, c, str + a + b + c);
        print(a, b);
        print(b, a);
        print((int) b, (int) c);
        print(a);
        print();
    }

    private static void print(int a, float c, String str) {
        System.out.printf("int = %d; float = %f; String = %s%n", a, c, str);
    }

    private static void print(int a, double a1) {
        System.out.printf("int = %d; double = %f%n", a, a1);
    }

    private static void print(double a, int a1) {
        System.out.printf("double = %f; int = %d%n", a, a1);
    }

    private static void print(int a, int a1) {
        System.out.printf("int = %d; another int = %d%n", a, a1);
    }

    private static void print(int a) {
        System.out.printf("just one int = %d%n", a);
    }

    private static void print() {
        System.out.println("Sorry :( nothing to print");
    }
}
