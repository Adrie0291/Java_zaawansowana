package Day4Dziedziczenie.KonstruktoryJakDziedziczyc.Grozne;

public class Dragon extends Animal {
    public Dragon(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}