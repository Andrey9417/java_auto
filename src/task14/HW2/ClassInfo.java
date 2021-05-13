package task14.HW2;

//2. Create your own annotation with 5 variables as metadata fields. Add usage of new annotation for method,
//class, variable.

public @interface ClassInfo {

    enum Color {
        Red, Green, Black
    }

    int objectsToCreate() default 2;

    Color color() default Color.Red;

    String message() default "";

    String name() default "My name";

    int[] contacts() default 0;
}

