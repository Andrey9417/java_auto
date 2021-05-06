package task11.HW2;

//2. Write a program which contains enum and realization of abstract method in it. Please choose any example,
//enum should contain 4 values, each different realization of abstract method.

enum Animal {
    Dog {
        @Override
        public void eat() {
            System.out.println("Dogs eat cats");
        }
    },
    Cat {
        @Override
        void eat() {
            System.out.println("Cats eat mice");
        }
    },
    Mouse {
        @Override
        void eat() {
            System.out.println("Mice eat cheese");
        }
    },
    Cheese {
        @Override
        void eat() {
            System.out.println("Cheese is just a cheese");
        }
    };

    abstract void eat();

}


public class Main {
    public static void main(String[] args) {

        Animal.Dog.eat();
        Animal.Cat.eat();
        Animal.Mouse.eat();
        Animal.Cheese.eat();
    }
}
