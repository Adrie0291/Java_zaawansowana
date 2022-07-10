package Day4Dziedziczenie.Dziedzic;

public class AnimalDemo {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Monkey monkey2 = new Monkey("Filutek", 9, 20);

        Whale whale = new Whale();
        Whale whale2 = new Whale("Radek", 45, 7);

        monkey.jump();
        monkey.haha();

        whale.booing();
        whale.swim();
    }
}
