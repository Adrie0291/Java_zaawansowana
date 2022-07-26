package Sety;

import java.util.Objects;

public class Cow {
    private String name;
    private int age;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return age == cow.age && Objects.equals(name, cow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
