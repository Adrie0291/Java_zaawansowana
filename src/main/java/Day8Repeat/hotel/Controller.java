package Day8Repeat.hotel;

import java.util.List;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

// interfejs aplikacji
//TYLKO TUTAJ SOUT + SCANNER
public class Controller {

    private UserService userService = new UserService();
    private boolean running = true; // ustawiamy czy program zamykamy czy nie

    public void startMenu() {
        // przywitanie
        System.out.println("Witaj w programie do obs�ugi hotelu");
        System.out.println("Co chcesz zrobic? ");

        do {
            try {

                showMenu();   // menu
                int input = readInput(); // opcje
                executeSelection(input); //  wykonaj
            } catch (UserServiceException e) {
                System.out.println(e.getMessage());
            }
        } while (running);
    }

    private void executeSelection(int input) throws UserServiceException {
        switch (input) {
            case 1:
                showRooms((userService.getAllRooms()));
                break;
            case 2:
                showRooms((userService.getNotOccupiedRooms()));
                break;
            case 3:
                bookRoom();
                break;
            case 5:
                System.out.println("Do widzenia!");
                running = false;
                break;
            default:
                System.out.println("Nie rozpoznano decyzji");
        }
    }

    public void showRooms(List<Room> rooms) {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    private void bookRoom() throws UserServiceException {
        System.out.println("Kt�ry pok�j chcia�by� zarezerwowa� ?");
        showRooms((userService.getNotOccupiedRooms()));
        Scanner scanner = new Scanner(System.in);
        int selectedRoomNumber = scanner.nextInt(); // nr pokoju ktory chcemy rezerwaoc
        System.out.println("Wybra�e� pok�j nr: " + selectedRoomNumber);
        userService.bookRoom(selectedRoomNumber);  // czy dany pokoj jest dostepny, ta metoda nie zadziala tylko z powodu wyjatku
        System.out.println("Pok�j poprawnie zarezerwowany"); // czy ta instrukcja nie potrzebuje walidacji ? Ta instrukcja sie nie wykona, jesli wystapi wyjatek (metoda 48)
    }


    /* SCALANIE DO 1. METODY
    private void showAllRooms() {
        List<Room> rooms = userService.getAllRooms();
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    private void showNotOccupiedRooms() {
        List<Room> rooms; //mo�na da� if, ale chcemy aby logika by�a w innej klasie
        rooms = userService.getNotOccupiedRooms();
        for (Room room : rooms) {
            System.out.println(room);
        }
    }


     */
    private int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void showMenu() {
        System.out.println("1. Pobierz list� wszystkich pokoi");
        System.out.println("2. Pobierz list� wszystkich dost�pnych pokoi");
        System.out.println("3. Rezerwuj pok�j (podaj nr pokoju i je�li jest dost�pny go zarezerwuj ");
        System.out.println("4. Zwolnij pok�j (podaj nr pokoju i je�li jest zaj�ty to go zwolnij!");
        System.out.println("5. Zamknij program.");
    }
}
