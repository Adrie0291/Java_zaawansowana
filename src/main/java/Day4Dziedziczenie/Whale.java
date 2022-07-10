package Day4Dziedziczenie;

public class Whale extends Animal {
    private String name;
    private int age;
    private double weight;

    public Whale(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Whale() {
        name = "Kraken";
        age = 60;
        weight = 4.5;
    }

    public void booing() {
        System.out.println("... buczenie wieloryba....");
    }

    public void swim() {
        System.out.println(name + " p³ynie majestatycznie.");
    }

    public void eat() {
        super.eat();
        System.out.println("Wieloryb je plankton");
    }

    public void makeSound() {
        booing();
    }
}
