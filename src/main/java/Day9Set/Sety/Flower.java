package Day9Set.Sety;

import java.util.Objects;

public class Flower {
    private String name;

    public Flower(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       // if (this == o) return true;
       // if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(name, flower.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
