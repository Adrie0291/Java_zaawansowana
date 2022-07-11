package Day4Dziedziczenie.cwiczeDziedzicz;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AnimalDemo {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("Walery", 49, 1500);
        Dog dog = new Dog("Reksio", 4, 40);

        System.out.println("Metody psa: ");
        dog.kopanie();
        dog.sound();
        dog.sleep();
        dog.eat();

        System.out.println("Metody s³onia");
        elephant.zrywanieDrzew();
        elephant.sound();
        elephant.sleep();
        elephant.eat();

        System.out.println("---- Lista Animal oraz pêtla wspólnej metody----");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(elephant);
        animals.add(dog);

        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
