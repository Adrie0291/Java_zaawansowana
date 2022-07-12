package Day4Dziedziczenie.KonstruktoryJakDziedziczyc;

public class Dragon extends Animal {
    private String name;
    private int age;
    private int dlugoscSkrzydel;


    public Dragon(String name, int age, int dlugoscSkrzydel) {
        this.name = name;
        this.age = age;
        this.dlugoscSkrzydel = dlugoscSkrzydel;
    }

    public Dragon() {
        name = "Czarizard";
        age = 200;
        dlugoscSkrzydel = 200;

    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dlugoscSkrzydel=" + dlugoscSkrzydel +
                '}';
    }
}
