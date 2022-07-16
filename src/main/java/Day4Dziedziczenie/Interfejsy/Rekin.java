package Day4Dziedziczenie.Interfejsy;

public class Rekin extends Animal implements WildAnimal, WaterCreature {
    private int naciskZebow;

    public Rekin(String name, int age, int naciskZebow) {
        super(name, age);
        this.naciskZebow = naciskZebow;
    }

    public void plywanie(){
        System.out.println("Plywam");
    }
    @Override
    public void eat() {
        System.out.println("Jestem rekinem. Jem inne ryby");
    }

    @Override
    public void sleep() {
        System.out.println("Jestem rekinem. Spie w wodzie");

    }

    @Override
    public void makeSound() {
        System.out.println("Nie wydajê ¿adnych dŸwiêków jestem rekinem");
    }
}
