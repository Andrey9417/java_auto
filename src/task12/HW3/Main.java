package task12.HW3;

public class Main {

    public static void main(String[] args) {

        try {
            throw new CatIsInRoomException();
        } catch (CatIsInRoomException e) {
            System.out.println("Cat is in the room! Hide!");
            ;
        }
    }
}
