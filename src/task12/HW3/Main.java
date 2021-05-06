package task12.HW3;

//3. Write our own type of exception (with message) and add usage of it in main method


public class Main {

    public static void main(String[] args) {

        try {
            throw new CatIsInRoomException();
        } catch (CatIsInRoomException e) {
            System.out.println("Cat is in the room! Hide!");
        }
    }
}
