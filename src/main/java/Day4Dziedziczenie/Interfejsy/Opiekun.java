package Day4Dziedziczenie.Interfejsy;

public class Opiekun {
    public void feedAnimal(FarmAnimal animal) {
        System.out.println("Opiekun karmi zwierzê");
        animal.eat();
        animal.makeSound();
    }
}
