package task14.HW1;


import task14.HW2.ClassInfo;

@ClassInfo(
        name = "Andrey",
        message = "some message",
        contacts = {0,9,5,2,2,2,2,2,2,2},
        objectsToCreate = 1
        //color = ClassInfo.Color.Black
)

public class Dog <T, Y, U> {
    private T name;
    private Y age;
    @ClassInfo
    private U weight;

    public Dog(T name, Y age, U weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void printName() {
        System.out.println("name .getClass: "+name.getClass()+"\nname of dog is "+name);
    }

    public void printAge() {
        System.out.println("age .getClass: "+age.getClass()+"\nage of dog is "+age);
    }

    public void printWeight() {
        System.out.println("weight .getClass: "+weight.getClass()+"\nweight of dog is "+weight);
    }

    @ClassInfo(
            message = "another message"
    )
    public void printDog() {
        printName();
        printAge();
        printWeight();
    }
}
