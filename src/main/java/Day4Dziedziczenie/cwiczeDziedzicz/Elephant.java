package Day4Dziedziczenie.cwiczeDziedzicz;

/*
Stworzenie 2 klas Elephant oraz Dog.
Nadanie im cech oraz metod. Niektóre metody oraz cechy wspólne.
Stworzenie klasy Animal.
Stworzenie dziedziczenia klasy Dog oraz Elephant z klasy Animal (klasa bazowa)
Stworzenie metody w klasie Animal
 */
public class Elephant extends Animal {

    private String name;
    private int age;
    private int weight;

    public Elephant(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void sound() {
        System.out.println("Jestem s³oniem. Ryczê tr¹b¹");
    }

    public void robHalas() {
        sound();
    }

    public void zrywanieDrzew() {
        System.out.println("Jestem s³oniem, potrafiê zrywaæ drzewa");
    }

    public void sleep() {
        System.out.println("Jestem s³oniem. Œpiê 14h ");
    }
}
