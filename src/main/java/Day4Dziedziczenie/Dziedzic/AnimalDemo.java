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

        // wsp�lna metoda:
        monkey.eat();  // je�li jest nadpisana w jego klasie, wykonaj� si� instrukcj� z jego klasy
        whale.eat();  // je�li nie ma �adnego nadpisania w jego klasie, wykona si� instrukcja z klasy og�lnej
    }
}
