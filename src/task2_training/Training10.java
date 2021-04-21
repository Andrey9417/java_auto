package task2_training;

import java.text.SimpleDateFormat;
import java.util.Date;

//10. Write a program which print to console current date and time in format yyyy/MM/dd HH:mm:ss

public class Training10 {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Current date and time: " + formatter.format(date));
    }
}
