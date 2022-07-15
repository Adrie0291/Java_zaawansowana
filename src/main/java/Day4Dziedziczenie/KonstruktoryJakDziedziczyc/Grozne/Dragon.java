package Day4Dziedziczenie.KonstruktoryJakDziedziczyc.Grozne;

public class Dragon extends Animal {
    private String kolorSkory;
    public Dragon(String name, int age, String kolorSkory) {
        super(name, age);
        this.kolorSkory = kolorSkory;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}