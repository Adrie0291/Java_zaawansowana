package EscapeRoom;

import java.util.Scanner;

public class EscapeDemo {
    public static void main(String[] args) {
        Window window = new Window();
        Key key = new Key();
        Door door = new Door();
        Scanner scanner = new Scanner(System.in);

        while (door.isClosed) {
            if (key.isTaken() == false) {
                System.out.println("Co wybierasz? \n1. Okno \n2. Klucz \n3. Drzwi");
                System.out.println();
            } else {
                System.out.println("Co wybierasz? \n1. Okno \n3. Drzwi");
            }
            int choice = scanner.nextInt();

            if (choice == Chose.WINDOW.getSelection()) {
                window.isOpen = !window.isOpen;
                System.out.println("Wybrałeś OKNO. Okno jest teraz otwarte? " + window.isOpen());
            }
            if (choice == Chose.KEY.getSelection()) {
                key.takeTheKey();
                System.out.println("Zabrałeś klucz!");
            }
            if (choice == Chose.DOOR.getSelection()) {
                if (key.isTaken() == false) {
                    System.out.println("Niestety nie możesz otworzyć drzwi, nie masz klucza!");
                } else {
                    System.out.println("UDAŁO SIĘ!");
                    door.open();
                }

            }
        }
    }
}

// możliwości rozwoju: więćej przedmiotów/
// więcej pokoi