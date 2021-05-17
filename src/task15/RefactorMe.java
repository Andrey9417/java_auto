package task15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RefactorMe{

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        try (Scanner sc = new Scanner(new File("C:\\Document.txt"))) {
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                try {
                    list.add(Integer.valueOf(str));
                }catch(NumberFormatException e) {
                    System.out.println("\""+str+ "\" is not integer");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        for(int i =0; i<10; i++){
            list.add((int) (Math.random() * 100));
        }

        System.out.println(list+"\n");

        list.sort((a,b)->b-a);

        System.out.println(list);

    }
}