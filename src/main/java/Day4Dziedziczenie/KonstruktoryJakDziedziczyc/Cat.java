package Day4Dziedziczenie.KonstruktoryJakDziedziczyc;

public class Cat extends Animal {
    private String name;
    private int age;
    private int dlugoscOgona;

    public Cat(String name, int age, int dlugoscOgona) {
        this.name = name;
        this.age = age;
        this.dlugoscOgona = dlugoscOgona;
    }

    public Cat() {
        name = "Filemon";
        age = 8;
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
