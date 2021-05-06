package task12.HW4;

//4. Write program which has try-catch block inside of catch in try-catch block (with different exception other
//        then we had in class)

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[5];
        try {
            try {
                // gergrehrehre
                arr[6] = 1 + "";
                Main main = null;
                arr[1] = main.toString();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("out of bounds exception");
            }

        } catch (NullPointerException e) {
            System.out.println("null exception");
        }
    }
}
