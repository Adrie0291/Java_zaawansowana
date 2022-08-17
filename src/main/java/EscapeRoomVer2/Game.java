package EscapeRoomVer2;

import java.util.List;

// klasa zarządzająca zasadami gry i działaniem rozgrywki
public class Game {
    private Room room = new Room(); // tylko zmienna, możemy zmienić w każdej chwili pokój na inny
    private final Player player = new Player();
    public List<Item> getItems(){
        return room.getItems();
    }

    public String useItem(int itemIndex) {
        System.out.println(player);
       Item item = room.findItemByIndex(itemIndex);
        return item.use(room, player);

    }

    public int howManyItems() {
        return getItems().size();
    }
}
