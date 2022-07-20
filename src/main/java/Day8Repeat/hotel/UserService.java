package Day8Repeat.hotel;

import java.util.List;

// logika biznesowa - do niej zwraca si� Controller aby zlecic pewn� prac� aplikacji np. rezerwacja pokoju
public class UserService {

    private Hotel hotel = new Hotel(); // klasa dostepowa do danych dla klasy userService
    // tworzymy hotel, w ktorym stworza sie pokoje


    public List<Room> getAllRooms() { // metoda, kt�ra zwraca list� pokoi, wiec jej typ to List<RooM>
        return hotel.getRooms(); // zwracamy pokoje, musimy dac gettera poniewaz pole jest prywatne

    }

    public List<Room> getNotOccupiedRooms() {
        return hotel.getNotOccupiedRooms();
    }

    public void bookRoom(int selectedRoomNumber) throws UserServiceException { // potrzebuj� pokoju o tym numerze
        Room room = hotel.findRoomByNumber(selectedRoomNumber);
        if (room.isOccupied()) {
            throw new UserServiceException("Ten pok�j jest zaj�ty!");
        }
        // gdy trafiamy tutaj 2 problemy zostaly pominiete 1) niewlasciwy nr pokoju 2) wybor pokoju zajetego
        room.book();
    }
}

