package task10;

public class Main {
    public static void main(String[] args) {

        Marketable car1 = new Car(23453.43, 2015);
        car1.print();
        System.out.println(Marketable.getCurrentYear());
        System.out.println(car1.getPrice());
        System.out.println(car1.getYear());
        //car1.move();
    }
}
