package Day4Dziedziczenie.Interfejsy.ksiazka241;

public class ByTwosMain {
    public static void main(String[] args) {
        ByTwos two = new ByTwos();
        ByThrees three = new ByThrees();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value (2): " + two.getNext());
            System.out.println("Next value (3): " + three.getNext());
        }
        System.out.println("\nRestart");
        two.reset();
        for (int i = 0; i < 5; i++) {

            System.out.println("Next value (2):" + two.getNext());
            System.out.println("Next value (3) :" + three.getNext());
        }
        System.out.println("I'm starting from 100: ");
        two.setStart(100);
        three.setStart(50);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value (2): " + two.getNext());
            System.out.println("Next value (3): " + three.getNext());
        }
    }
}
