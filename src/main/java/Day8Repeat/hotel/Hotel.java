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
}
