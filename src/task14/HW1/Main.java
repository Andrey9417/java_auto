package task14.HW1;

//1. Write program which contains class with 3 generics, each is used as type of variable inside of class.
//        Add usage of class with generics, use different types of variables for generic

import task14.HW2.ClassInfo;

public class Main {

    @ClassInfo  //annotation from task2
    public static void main(String[] args) {

        Dog<String, Integer, Double> a = new Dog<>("Murka", 7, 10.55);

        a.printDog();


    }
}
