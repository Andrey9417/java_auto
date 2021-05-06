package task13.HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//3. Write a method switchPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion.

public class Main {
    public static void main(String[] args) {

        String str = "It is a truth universally acknowledged, that a single man in possession " +
                "of a good fortune, must be in want of a wife";
        String[] arrStr = str.split(", | ");
        System.out.println(Arrays.toString(arrStr));
        List<String> arrList = new ArrayList<>(Arrays.asList(arrStr));
        int length;
        if (arrList.size() % 2 == 0) length = arrList.size();
        else length = arrList.size() - 1;

        for (int i = 0; i < length; i += 2)
            Collections.swap(arrList, i, i + 1);

        System.out.println(arrList);
    }
}
