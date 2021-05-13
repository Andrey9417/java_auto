package task14.HW4;

import java.io.File;
import java.util.Random;

//4. Create program which shuffle 10 files in folder (files receive new order in folder). After every run of
//        program files are shuffled in new order. Length of file names is constant

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        File file = new File("C:\\Users\\USER\\IdeaProjects\\java_auto\\src\\task14\\HW4\\my");

        String[] stringFileList = file.list();
        for (String str : stringFileList) {
            System.out.println(str);
        }

        File[] arrOfFiles = file.listFiles();
        System.out.println();
        for (File arrOfFile : arrOfFiles) {
            String currentName = arrOfFile.getName();
            currentName = rand.nextInt(9) + currentName.substring(1);
            System.out.println(arrOfFile.renameTo(new File("C:\\Users\\USER\\IdeaProjects\\java_auto" +
                    "\\src\\task14\\HW4\\my\\" + currentName)));

        }

        System.out.println("qwe");

        stringFileList = file.list();
        for (String str : stringFileList) {
            System.out.println(str);
        }

    }

}

