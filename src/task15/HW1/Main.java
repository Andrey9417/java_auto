package task15.HW1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Person[] arr = new Person[]{new Person("efwef", 34), new Person("34t344t3", 12),
                new Person("wqwe", 66), new Person("asd", 1), new Person("lio", 555)};

        Comparator<Person> comparatorByAge = (Person a1, Person a2) -> a1.getAge() - a2.getAge();
        Comparator<Person> comparatorByName = (Person o1, Person o2)->o1.getName().compareTo(o2.getName());
        Arrays.stream(arr)
                .sorted(comparatorByAge)
                .forEach(System.out::println);

        System.out.println();
        Arrays.stream(arr)
                .sorted(comparatorByName)
                .forEach(System.out::println);
    }
}
