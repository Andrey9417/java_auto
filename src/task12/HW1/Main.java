package task12.HW1;

//1. Write program which have variable which is null. Call toString() for this variable. Use try/catch to
//        handle NullPointerException.

public class Main {

    public static void main(String[] args) {

        Main example = null;

        try {
            String str = example.toString();
        } catch (NullPointerException e) {
            System.out.println("Exception is caught");
        }

    }
}
