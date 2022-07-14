package Day4Dziedziczenie.KonstruktoryJakDziedziczyc.Grozne;

public class Cat extends Animal {
    private int dlugoscOgona;

    public Cat(String name, int age, int dlugoscOgona) {
        super(name, age);

        this.dlugoscOgona = dlugoscOgona;
    }

    public Cat() {
        super("KotSuper",2);
        dlugoscOgona = 4;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dlugoscOgona=" + dlugoscOgona +
                '}';

    }
}
