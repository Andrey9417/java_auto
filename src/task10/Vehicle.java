package task10;

public abstract class Vehicle {
    int speed;
    private String model;

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    void speedUp(int value) {
        speed += value;
        System.out.println("Speed of vehicle increased by " + value);
    }

    void applyBrake(int value) {
        speed -= value;
        System.out.println("Speed of vehicle decreased by " + value);
    }

    public abstract void move();

    final void stop() {
        speed = 0;
        System.out.println("Vehicle has stopped");

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }
}
