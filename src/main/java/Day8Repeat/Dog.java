package Day8Repeat;

public class Dog extends Animal implements WildAnimal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("Jem kosci");

    }

    @Override
    public void biegaj() {
        System.out.println("JEstem psem biegam szybko jak szalony");
    }
}
