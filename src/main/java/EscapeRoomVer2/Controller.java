package EscapeRoomVer2;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private Scanner scanner = new Scanner(System.in);
    private Game game = new Game(); // Controller zwraca się do gry aby zlecić różne zadania

    public void start() {
        printMenu();
        int selection = selectOption();
        useSelectedItem(selection);
    }

    private void printMenu() {
        System.out.println("Witaj w grze Escape Room");
        //przedmioty
        List<Item> items = game.getItems();
        for (int i = 0; i < items.size(); i++) { // jako że jest dużo przedmiotów będziemy je iterować
            // System.out.println(i+1 + ". " + items.get(i).getName());
            System.out.printf("%d. %s\n", i + 1, items.get(i).getName());

        }
    }

    public int selectOption() { // todo zabezpieczyć przed błędem - podawania liter
        System.out.println("Co wybierasz? ");
        int selection = scanner.nextInt();
        if (selection < 1 || selection > game.howManyItems()) {
            System.out.println("Wyszedles po za zakres przedmitow");
            return selectOption();
        }
        return selection;
    }

    private void useSelectedItem(int itemNumber) {
        System.out.println("Używasz prezdmiotu nr" + itemNumber);
        game.useItem(itemNumber - 1);
    }
}

