package task8;

import java.util.Objects;

public class Furniture {
    private String name;
    private int numberOfLegs;

    public Furniture(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return numberOfLegs == furniture.numberOfLegs && Objects.equals(name, furniture.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfLegs);
    }
}
