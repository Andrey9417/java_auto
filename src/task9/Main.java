package task9;

public class Main {
    public static void main(String[] args) {

        //creating bicycles task 2#

        Bicycle bicycle1 = new MountainBicycle();
        RoadBicycle bicycle2 = new RoadBicycle();
        System.out.println("Bicycle bicycle1 and RoadBicycle bicycle2");

        bicycle1.gear = 25;
        System.out.println("bicycle1.gear = " + bicycle1.gear);
        bicycle2.changeGear(17);
        System.out.println("bicycle2.gear = " + bicycle2.gear);
        bicycle1.speed = 30;
        System.out.println("bicycle1.speed = " + bicycle1.speed);
        bicycle1.speedUp(3);
        System.out.println("bicycle1.speed after speedUp = " + bicycle1.speed);
        bicycle1.applyBrake(10);
        System.out.println("bicycle1.speed after applyBrake = " + bicycle1.speed);
        bicycle2.setModel("123124");
        System.out.println("bicycle2.getModel = " + bicycle2.getModel());
        bicycle1.stop();
        bicycle2.setRudderDepth(222);
        System.out.println("bicycle2.getRudderDepth = " + bicycle2.getRudderDepth());
        bicycle1.move();
        System.out.println("\n\n");

        // why?
//        bicycle1.setSeatHeight(34);


        //creating more objects task 3#

        System.out.println("Using different constructors for task 3#");
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);
        vehicle.move();
        Bicycle bicycle3 = new Bicycle();
        System.out.println(bicycle3);
        Bicycle bicycle4 = new Bicycle(99, 232);
        System.out.println(bicycle4);
        bicycle3.move();
        System.out.println("\n\n");


        // comparing helicopters task 4#

        System.out.println("Comparing helicopters");
        Helicopter heli1 = new Helicopter();
        Helicopter heli2 = new Helicopter();
        System.out.println("comparing heli1 and heli2 via '==': " + (heli1 == heli2));
        System.out.println("comparing heli1 and heli2 via '.equals': " + (heli1.equals(heli2)));
        System.out.println("\n\n");


        // changing fields of Car task 5#
        System.out.println("Changing static fields of Car");
        Car.carType = "camel";
        Car.transmission = "sdfsdgs";
        System.out.println("carType = " + Car.carType + "\ntransmission = " + Car.transmission);

    }
}
