package task8;

public class MainForTasks1_2_3_4 {
    public static void main(String[] args) {

        //    HW1-2
        Worker human = new Worker();
        Worker slave = new Worker("Amfibrahiy", 30, "builder of pyramids", 0);

        System.out.printf("worker 'human': \n name: %s; \n age: %d; \n position: %s; \n salary: %d.\n",
                            human.getName(), human.getAge(), human.getPosition(), human.getSalary());
        System.out.printf("worker 'slave': \n name: %s; \n age: %d; \n position: %s; \n salary: %d.\n",
                slave.getName(), slave.getAge(), slave.getPosition(), slave.getSalary());
        human.setName("Peter");
        human.setAge(255);
        human.setPosition("imposing a tree");
        human.setSalary(0);

        System.out.printf("worker 'human_2': \n name: %s; \n age: %d; \n position: %s; \n salary: %d.\n",
                human.getName(), human.getAge(), human.getPosition(), human.getSalary());

        System.out.println("print out via toString(): "+slave);


        //HW 3
        System.out.println("How many legs does a dog have? - "+Dog.numberOfLegs);
        Dog.printADog();

    }
}
