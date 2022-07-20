package Day8Repeat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lesz", 22);
        Cat cat = new Cat("Kocik", 1);
        Horse horse = new Horse("Koniarz", 99);
        Mouse mouse = new Mouse("Miki", 22);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(horse);
        animals.add(mouse);

        for (Animal animal : animals) {
            animal.drink();

        }

        ArrayList<WildAnimal> zwierzaczki = new ArrayList<>();
        zwierzaczki.add(dog);
        zwierzaczki.add(horse);
        for (WildAnimal wildAnimal : zwierzaczki) {
            wildAnimal.biegaj();


        }
    }
}
