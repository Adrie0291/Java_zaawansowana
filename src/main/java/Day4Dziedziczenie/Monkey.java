package Day4Dziedziczenie;

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
        tailLength = 20;
    }

    public void uhahaha() {
        System.out.println("Ma³pa: hahaha!");
    }

    public void jump() {
        System.out.println(name + "skacze w poszukiwaniu banana!");
    }


    public void eat() {
        System.out.println("Ma³pa je banana");
    }

    @Override
    public void makeSound() {
        uhahaha();
    }
}