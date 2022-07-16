package Day4Dziedziczenie.Interfejsy;

public class Zebra extends Animal implements LandAnimal, WildAnimal {
    private int wysokosc;

    public Zebra(String name, int age, int wysokosc) {
        super(name, age);
        this.wysokosc = wysokosc;

    }
    public void chodzenie(){
        System.out.println("Chodze po lesie");
    }

    @Override
    public void eat() {
        System.out.println("Jestem zebr¹. Jem rosliny");
    }

    @Override
    public void sleep() {
        System.out.println("Jestem zebr¹. Spie na stoj¹co");

    }

    @Override
    public void makeSound() {
        System.out.println("Kwiczê jak osio³ czasem. Jestem zebr¹");
    }
}
