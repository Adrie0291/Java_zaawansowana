package Day8Repeat.hotel;

import java.util.ArrayList;
import java.util.List;

// KLASA DOST�PU DO DANYCH (repozytorium/DataAccesObiect)
public class Hotel {
    // Co b�dzie lepszym pomys�em ArrayList czy LinkedList?
    // Array  nie b�dziemy dodawa� ani usuwa� w innych pozycjach ni� tylko na koniec
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
        List<Room> result = new ArrayList<>(); // TWORZYMY NOW� LIST� tego samego typu, ale jest N OWA
        for (Room room : rooms) { // przegl�damy oryginalne pokoje
            if (!room.isOccupied()) { // jesli pokoj NIE jest zaj�ty wchodzi do listy result (wolnych pokoi)
                result.add(room);

            }

        }
        return result;
    }

    public Room findRoomByNumber(int selectedRoomNumber) throws UserServiceException{ // typ Room, bo chcemy zwr�ci� pok�j
        for (Room room : rooms) {
            if (room.getNr() == selectedRoomNumber) {// je�li nr pokoju jest r�wny temu kt�ry poda�em
                return room; // zwr�� pok�j WA�NE !

            }
        }
       throw new UserServiceException("Nie znaleziono pokoju o numerze "+  selectedRoomNumber); // 3 opcje do zwr�cenia null, wyj�tek, optional
    }
}
