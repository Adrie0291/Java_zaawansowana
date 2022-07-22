package Day8Repeat.GUI.hotel2;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class ControllerGui {

    // interfejs aplikacji
//TYLKO TUTAJ SOUT + SCANNER


    private UserService userService = new UserService();
    private boolean running = true; // ustawiamy czy program zamykamy czy nie

    public void startMenu() {
        // przywitanie
        JOptionPane.showMessageDialog(null, "Witaj w programie do obs�ugi hotelu");

        do {
            try {
                String stringInput = JOptionPane.showInputDialog(getMenuText());
                int input = Integer.parseInt(stringInput);  // musimy rzutowac na int
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
        String roomsDisplay = "";
        for (Room room : rooms) {
            roomsDisplay += room.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, roomsDisplay);
    }

    private void bookRoom() throws UserServiceException {
        showRooms((userService.getNotOccupiedRooms()));
        Scanner scanner = new Scanner(System.in);
        int selectedRoomNumber = Integer.parseInt(JOptionPane.showInputDialog("Kt�ry pok�j chcia�by� zarezerwowa� ?" ));
        JOptionPane.showMessageDialog(null, "Pok�j poprawnie zarezerwowany");
        userService.bookRoom(selectedRoomNumber);  // czy dany pokoj jest dostepny, ta metoda nie zadziala tylko z powodu wyjatku
        // czy ta instrukcja nie potrzebuje walidacji ? Ta instrukcja sie nie wykona, jesli wystapi wyjatek (metoda 48)
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

    private String getMenuText() {

        return """
                Co chcesz zrobic?
                1. Pobierz list� wszystkich pokoi 
                "2. Pobierz list� wszystkich dost�pnych pokoi 
                "3. Rezerwuj pok�j (podaj nr pokoju i je�li jest dost�pny go zarezerwuj ");
                "4. Zwolnij pok�j (podaj nr pokoju i je�li jest zaj�ty to go zwolnij!");
                "5. Zamknij program.")""";

    }
}
