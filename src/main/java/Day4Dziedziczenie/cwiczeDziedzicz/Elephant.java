package Day4Dziedziczenie.cwiczeDziedzicz;

/*
Stworzenie 2 klas Elephant oraz Dog.
Nadanie im cech oraz metod. Niekt�re metody oraz cechy wsp�lne.
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
        System.out.println("Jestem s�oniem. Rycz� tr�b�");
    }

    public void robHalas() {
        sound();
    }

    public void zrywanieDrzew() {
        System.out.println("Jestem s�oniem, potrafi� zrywa� drzewa");
    }

    public void sleep() {
        System.out.println("Jestem s�oniem. �pi� 14h ");
    }
}
