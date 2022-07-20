package Day8Repeat.hotel;

import java.util.List;
import java.util.Scanner;

// interfejs aplikacji
//TYLKO TUTAJ SOUT + SCANNER
public class Controller {

    private UserService userService = new UserService();
    public void startMenu() {
        // przywitanie
        System.out.println("Witaj w programie do obs�ugi hotelu");
        System.out.println("Co chcesz zrobic? ");

        // opcje
        System.out.println("1. Pobierz list� wszystkich dost�pnych pokoi");

        // odpowiedz
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        //wykonanie opcji
        switch (input) {
            case 1:
                System.out.println("Wy�wietlam dost�pne pokoje: ");
                List<Room> rooms = userService.getAllRooms();
                for (Room room : rooms) {
                    System.out.println(room);
                }
                break;
            default:
                System.out.println("Nie rozpoznano decyzji");
        }
    }
}
