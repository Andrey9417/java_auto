package task10;

public interface Marketable {
    double getPrice();

    int getYear();

    default void print() {
        System.out.printf("Price of a car is %.2f,\nyear of production - %d\n", getPrice(), getYear());
    }

    static int getCurrentYear() {
        return 2021;
    }


}
