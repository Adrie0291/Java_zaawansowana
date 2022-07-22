package Day8Repeat.hotel;

import java.util.ArrayList;
import java.util.List;

// KLASA DOSTÊPU DO DANYCH (repozytorium/DataAccesObiect)
public class Hotel {
    // Co bêdzie lepszym pomys³em ArrayList czy LinkedList?
    // Array  nie bêdziemy dodawaæ ani usuwaæ w innych pozycjach ni¿ tylko na koniec
    private List<Room> rooms = new ArrayList<>();

    // przygotowanie pokoi w konstruktorze hotelu
    public Hotel() {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room());

        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Room> getNotOccupiedRooms() {
        List<Room> result = new ArrayList<>(); // TWORZYMY NOW¥ LISTÊ tego samego typu, ale jest N OWA
        for (Room room : rooms) { // przegl¹damy oryginalne pokoje
            if (!room.isOccupied()) { // jesli pokoj NIE jest zajêty wchodzi do listy result (wolnych pokoi)
                result.add(room);

            }

        }
        return result;
    }

    public Room findRoomByNumber(int selectedRoomNumber) throws UserServiceException{ // typ Room, bo chcemy zwróciæ pokój
        for (Room room : rooms) {
            if (room.getNr() == selectedRoomNumber) {// jeœli nr pokoju jest równy temu który poda³em
                return room; // zwróæ pokój WA¯NE !

            }
        }
       throw new UserServiceException("Nie znaleziono pokoju o numerze "+  selectedRoomNumber); // 3 opcje do zwrócenia null, wyj¹tek, optional
    }
}
