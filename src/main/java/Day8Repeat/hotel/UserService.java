package Day8Repeat.hotel;

import java.util.List;

// logika biznesowa - do niej zwraca si� Controller aby zlecic pewn� prac� aplikacji np. rezerwacja pokoju
public class UserService {

    private Hotel hotel = new Hotel(); // klasa dostepowa do danych dla klasy userService
    // tworzymy hotel, w ktorym stworza sie pokoje


    public List<Room> getAllRooms() { // metoda, kt�ra zwraca list� pokoi, wiec jej typ to List<RooM>
        return hotel.getRooms(); // zwracamy pokoje, musimy dac gettera poniewaz pole jest prywatne

    }
}
