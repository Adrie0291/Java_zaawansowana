package Day4Dziedziczenie.KonstruktoryJakDziedziczyc.Grozne;

public abstract class Animal {
    String name;
    int age;

    /*
    public Animal() {
        System.out.println("Animal 1");
    }

     */
    public Animal(String name, int age) {
        System.out.println("Animal 2");
        this.name = name;
        this.age = age;
    }
}


