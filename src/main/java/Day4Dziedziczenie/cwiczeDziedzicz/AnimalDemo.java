package Day4Dziedziczenie.cwiczeDziedzicz;

import java.util.ArrayList;

public class AnimalDemo {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("Walery", 49, 1500);
        Dog dog = new Dog("Reksio", 4, 40);
        Bird bird = new Bird("Wrobel", 39);
        Snake snake = new Snake();

        System.out.println("Metody psa: ");
        dog.kopanie();
        dog.sound();
        dog.sleep();
        dog.eat(); // metoda dostêpna dziêki dziedziczeniu z klasy bazowej Animal


        System.out.println("Metody s³onia");
        elephant.zrywanieDrzew();
        elephant.sound();
        elephant.sleep();
        elephant.eat(); // metoda dostêpna dzieki dziedziczeniu z klasy bazowej Animal.


        System.out.println("---- Lista Animal oraz pêtla wspólnej metody----");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(elephant);
        animals.add(dog);

        for (Animal animal : animals) {
            animal.eat();            // animal to np. dog, elephant w tym przyk³adzie.
            animal.robHalas();          // jeœli w klasie Animal jest instrukcja, i tak zrobi siê tylko najpierw ta w klasie pochodnej
        }

        System.out.println("----- POLIMORFIZM-----");
        Animal animal = new Dog();
        animal.robHalas();
        animal = new Elephant("Munia", 12, 500);
        animal.robHalas();
        animal = bird;
        animal.robHalas();

        // TAK NIE ROBIMY
        // animal = new Animal();
        // animal.robHalas();

        animal = new Snake();
        animal.robHalas();
        System.out.println("Ddany ptak oraz snake. Pêtla ");
        animals.add(bird);
        animals.add(snake);

        for (Animal animal1 : animals) {
            animal1.robHalas();
        }
    }
}
