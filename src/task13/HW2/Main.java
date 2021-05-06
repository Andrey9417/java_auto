package task13.HW2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//2. Write a Java program to compare two array lists. Each needs to contains at least 5 elemets

public class Main {
    public static void main(String[] args) {

        List<String> arrList1 = new ArrayList<>();
        List<String> arrList2 = new ArrayList<>();
        arrList1.add("Poland");
        arrList1.add("France");
        arrList1.add("Germany");
        arrList1.add("Monaco");
        arrList1.add("Norway");

        arrList2.add("Germany");
        arrList2.add("Monaco");
        arrList2.add("Poland");
        arrList2.add("France");
        arrList2.add("Norway");

        if (arrList1.size() != arrList2.size()) System.out.println("lists are not equal");
        else {
            boolean check = true;
            Collections.sort(arrList1);
            Collections.sort(arrList2);

            for (int i = 0; i < arrList1.size(); i++)
                if (arrList1.get(i) != arrList2.get(i)) {
                    check = false;
                    break;
                }
            if (check) System.out.println("lists are equal");
            else System.out.println("lists are not equal");
        }

    }

}
