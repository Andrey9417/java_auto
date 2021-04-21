package task2_training;

//16. Create a Java program and define all eight data types outside of main method with static keyword,
// and don’t initialise them. Print all of them inside your main method and see what default value is
// assigned to them by Java
public class Training16 {

    public static boolean a;
    public static byte b;
    public static int c;
    public static long d;
    public static float e;
    public static double f;
    public static char g;
    public static short h;

    public static void main(String[] args) {

        System.out.println("boolean default value is " + a);
        System.out.println("byte default value is " + b);
        System.out.println("int default value is " + c);
        System.out.println("long default value is " + d);
        System.out.println("float default value is " + e);
        System.out.println("double default value is " + f);
        System.out.println("char default value is " + g);
        System.out.println("short default value is " + h);
    }
}
