package task2_training;

import java.util.Random;

//9.  Write a program which generate random natural number from 1 to 1000.

public class Training9 {

    public static void main(String[] args) {

        Random rand = new Random();
        int r = rand.nextInt(1000);
        System.out.println(r);
    }
}
