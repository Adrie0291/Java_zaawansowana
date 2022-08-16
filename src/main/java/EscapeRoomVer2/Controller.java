package EscapeRoomVer2;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private Scanner scanner = new Scanner(System.in);
    private Game game =new Game(); // Controller zwraca się do gry aby zlecić różne zadania

    public void start() {
        System.out.println("Witaj w grze Escape Room");
        //przedmioty
        List<Item> items = game.getItems();
        for (int i = 0; i < items.size(); i++) { // jako że jest dużo przedmiotów będziemy je iterować
            System.out.println(i+1 + ". " + items.get(i).getName());
            //  System.out.printf("%d. %s\n",i, items.get(i));

        }
    }
}
