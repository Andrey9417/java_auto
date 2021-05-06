package task10;

public class Car extends Vehicle implements Marketable {
    static String carType;
    static String transmission;
    private double price;
    private int yearOfProduction;

    public Car(double price, int yearOfProduction) {
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getYear() {
        return yearOfProduction;
    }
}
