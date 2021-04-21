package task2_training;

//11. Write a program which print to console name of folder from where you run this program

public class Training11 {

    public static void main(String[] args) {

        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        String path = System.getProperty("user.dir");
        int index = path.length() - 1;

        while (true) {
            if (path.charAt(index) == '\\') break;
            index--;
        }

        index++; // выбрал индекс первого знака после '\'

        while (index < path.length()) {
            System.out.print(path.charAt(index));
            index++;
        }


    }
}
