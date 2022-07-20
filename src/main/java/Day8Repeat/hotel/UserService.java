package Day8Repeat.hotel;

import java.util.List;

// logika biznesowa - do niej zwraca siê Controller aby zlecic pewn¹ pracê aplikacji np. rezerwacja pokoju
public class UserService {

    private Hotel hotel = new Hotel(); // klasa dostepowa do danych dla klasy userService
    // tworzymy hotel, w ktorym stworza sie pokoje


    public List<Room> getAllRooms() { // metoda, która zwraca listê pokoi, wiec jej typ to List<RooM>
        return hotel.getRooms(); // zwracamy pokoje, musimy dac gettera poniewaz pole jest prywatne

    }
}
