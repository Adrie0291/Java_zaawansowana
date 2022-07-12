package Day4Dziedziczenie.DziedziczenieKartka;

public class Bird extends Animal {
    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println("Æwirr æwirrr");
    }

    public void robHalas() {
        sound();
    }
}
