package task6;

//4. Write a Java program to reverse words in a initial string
//The given string is: Reverse text in a string

public class HW4 {

    public static void main(String[] args) {

        String s = "Reverse text in a string";
        System.out.println(s);
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}
