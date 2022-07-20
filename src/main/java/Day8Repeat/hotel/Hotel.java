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
}
