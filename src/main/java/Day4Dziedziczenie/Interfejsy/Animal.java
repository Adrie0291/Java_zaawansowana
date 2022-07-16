package Day4Dziedziczenie.Interfejsy;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void sleep();
    public abstract void makeSound();
}
