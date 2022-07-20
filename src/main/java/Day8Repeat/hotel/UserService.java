package Day8Repeat.hotel;

import java.util.List;

// logika biznesowa - do niej zwraca siê Controller aby zlecic pewn¹ pracê aplikacji np. rezerwacja pokoju
public class UserService {

    private Hotel hotel = new Hotel(); // klasa dostepowa do danych dla klasy userService
    // tworzymy hotel, w ktorym stworza sie pokoje


    public List<Room> getAllRooms() { // metoda, która zwraca listê pokoi, wiec jej typ to List<RooM>
        return hotel.getRooms(); // zwracamy pokoje, musimy dac gettera poniewaz pole jest prywatne

    }

    public List<Room> getNotOccupiedRooms() {
        return hotel.getNotOccupiedRooms();
    }

    public void bookRoom(int selectedRoomNumber) throws UserServiceException { // potrzebujê pokoju o tym numerze
        Room room = hotel.findRoomByNumber(selectedRoomNumber);
        if (room.isOccupied()) {
            throw new UserServiceException("Ten pokój jest zajêty!");
        }
        // gdy trafiamy tutaj 2 problemy zostaly pominiete 1) niewlasciwy nr pokoju 2) wybor pokoju zajetego
        room.book();
    }
}

