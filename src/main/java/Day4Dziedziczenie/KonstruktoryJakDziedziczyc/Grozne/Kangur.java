package Day4Dziedziczenie.KonstruktoryJakDziedziczyc.Grozne;

public class Kangur extends Animal {
    public Kangur(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public Kangur() {
        super("Kao2Kangur", 9391);
    }

    @Override
    public String toString() {
        return "Kangur{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
