package task8;

public class MainForTask5 {

    public static void main(String[] args) {

        Furniture first = new Furniture("Table", 4);
        Furniture second = new Furniture("Table", 4);
        Furniture third = first;

        System.out.println("Comparing furniture via '=':");
        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(second == third);

        System.out.println("Comparing furniture via '.equals':");
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(second.equals(third));

        Cloud bigCloud = new Cloud("Pizza", true);
        Cloud smallCloud = new Cloud("Pizza", true);
        Cloud anotherCload = smallCloud;

        System.out.println("Comparing clouds via '=':");
        System.out.println(bigCloud == smallCloud);
        System.out.println(bigCloud == anotherCload);
        System.out.println(smallCloud == anotherCload);

        System.out.println("Comparing clouds via '.equals':");
        System.out.println(bigCloud.equals(smallCloud));
        System.out.println(bigCloud.equals(anotherCload));
        System.out.println(smallCloud.equals(anotherCload));
    }
}
