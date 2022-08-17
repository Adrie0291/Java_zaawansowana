package EscapeRoomVer2;

import java.util.List;

// klasa zarządzająca zasadami gry i działaniem rozgrywki
public class Game {
    private Room room = new Room(); // tylko zmienna, możemy zmienić w każdej chwili pokój na inny
    public List<Item> getItems(){
        return room.getItems();
    }

    public void useItem(int itemIndex) {
       Item item = room.findItemByIndex(itemIndex);
        item.use();

    }

    public int howManyItems() {
        return getItems().size();
    }
}
