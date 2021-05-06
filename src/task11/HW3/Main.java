package task11.HW3;

//3. Write program which contains enum with 3 values (name of value and int number). Print out in main in other
//class all pairs which you store in enum.

enum Weather {
    Snow(1), Rain(2), Sun(3);
    private int i;

    Weather(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

}

public class Main {
    public static void main(String[] args) {

        Weather weather;
        for (Weather current : Weather.values()) {
            weather = current;
            System.out.println(current + " " + current.getI());
        }
    }
}
