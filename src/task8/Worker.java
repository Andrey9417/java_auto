package task8;

public class Worker {

    private String name = "Vasiliy";
    private int age = 115;
    private String position = "driver";
    private int salary = 8000;

    public Worker(String name, int age, String position, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public Worker() {
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
