package task6;

//3. Write a Java program to reverse a string using recursion
//The given string is: The quick brown fox jumps

public class HW3 {

    public static void main(String[] args) {

        String str = "The quick brown fox jumps";
        System.out.println(str);
        String strReversed = "";
        strReverse(str, strReversed);
    }

    private static void strReverse(String str, String str1) {
        if (str1.length() < str.length()) {
            str1 = str1 + str.charAt(str.length() - str1.length() - 1);
            strReverse(str, str1);
        } else System.out.println(str1);

    }
}
