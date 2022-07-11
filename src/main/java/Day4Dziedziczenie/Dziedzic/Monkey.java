package Day4Dziedziczenie.Dziedzic;

public class Monkey extends Animal {
    private String name;
    private int age;
    private int tailLength;

    public Monkey(String name, int age, int tailLength) {
        this.name = name;
        this.age = age;
        this.tailLength = tailLength;
    }

    public Monkey() {
        name = "Jacek";
        age = 8;
        tailLength = 21;
    }

    public void haha() {
        System.out.println("Ma³pa: hahaha");

    }

    public void jump() {
        System.out.println(name + " skacze w poszukiwaniu banna!");
    }

    public void eat() {
        super.eat();
        System.out.println("Jem banana. Bo jestem ma³p¹.");
    }
}
