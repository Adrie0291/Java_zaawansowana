package Day4Dziedziczenie.Interfejsy;

public class Kon extends Animal implements FarmAnimal, LandAnimal {
    private String kolor;

    public Kon(String name, int age, String kolor) {
        super(name, age);
        this.kolor = kolor;
    }

    public Kon() {
        super("Waldemar", 23);
        kolor = "bezowy";


    }


    public void rzenie() {
        System.out.println("R¿ê jak koñ");
    }

    @Override
    public void eat() {
        System.out.println("Jem du¿o siana. Jestem koniem");
    }

    @Override
    public void makeSound() {
        rzenie();
    }

    @Override
    public void sleep() {
        System.out.println("Jestem koniem. Spie 12h dziennie");

    }
}
