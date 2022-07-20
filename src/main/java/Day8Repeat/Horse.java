package Day8Repeat;

public class Horse extends Animal implements WildAnimal {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("jem siano");

    }

    @Override
    public void biegaj() {
        System.out.println("Jestem koniem rzadko biegam");

    }
}
