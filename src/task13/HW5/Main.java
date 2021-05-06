package task13.HW5;

import java.util.HashMap;
import java.util.Map;

//5. Create HashMap with 3 user defined objects Employee (id, name, city). Employee is separate class with
//described fields and overriden toString(), equals() and hashcode() methods. Compare these 3 objects of Employee
//        as values of maps (they need to have different keys)

public class Main {
    public static void main(String[] args) {

        Map<String, Employee> map = new HashMap<>();
        map.put("first", new Employee(23, "Denis", "Kiev"));
        map.put("second", new Employee(24, "Bogdan", "Odessa"));
        map.put("third", new Employee(25, "Alex", "Oslo"));
        map.put("4th", new Employee(25, "Alex", "Oslo"));

        System.out.println("map: \n" + map);

        System.out.println("map(\"first\") .equals map(\"second\") = "
                + map.get("first").equals(map.get("second")));

        System.out.println("map(\"first\") .equals map(\"third\") = "
                + map.get("first").equals(map.get("third")));

        System.out.println("map(\"second\") .equals map(\"third\") = "
                + map.get("second").equals(map.get("third")));

        System.out.println("map(\"third\") .equals map(\"4th\") = "
                + map.get("third").equals(map.get("4th")));

    }
}
