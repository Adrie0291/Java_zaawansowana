package EscapeRoomVer2;

import java.util.List;
import java.util.Scanner;

public class Controller  {
    private Scanner scanner = new Scanner(System.in);
    private GameEngine gameEngine = new Game(); // Controller zwraca się do gry aby zlecić różne zadania

    public void start() {
        do {
            printMenu();
            int selection = selectOption();
            useSelectedItem(selection);
        } while (gameEngine.isRunning()); //
        System.out.println("koniec gry");
    }

    private void printMenu() {
        System.out.println("Witaj w grze Escape Room");
        //przedmioty
        List<Item> items = gameEngine.getItems();
        for (int i = 0; i < items.size(); i++) { // jako że jest dużo przedmiotów będziemy je iterować
            // System.out.println(i+1 + ". " + items.get(i).getName());
            System.out.printf("%d. %s\n", i + 1, items.get(i).getName());

        }
    }

    public int selectOption() { // todo zabezpieczyć przed błędem - podawania liter
        System.out.println("Co wybierasz? ");
        int selection = scanner.nextInt();
        if (selection < 1 || selection > gameEngine.howManyItems()) {
            System.out.println("Wyszedles po za zakres przedmitow");
            return selectOption();
        }
        return selection;
    }

    private void useSelectedItem(int itemNumber) {
       String actionResult =  gameEngine.useItem(itemNumber - 1);
        System.out.println(actionResult);
    }
}

/*
rozbudowa:
więcej pokoi - przejśćie przez drzwi przenosi do innego pomieszczenia z którego potem można wrócić
inne przedmioty inne zagadki

// więcej przedmiotów które działają na zasadzie wybieram i używam, kraty, wajchy, szuflady

// interkacja z aplikacją
// zapis stanu gry

// scenariusz

 */

