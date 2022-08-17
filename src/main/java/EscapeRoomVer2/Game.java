package EscapeRoomVer2;

import java.util.List;

// klasa zarządzająca zasadami gry i działaniem rozgrywki
public class Game implements GameEngine, GameInteractions {
    private Room room = new Room(); // tylko zmienna, możemy zmienić w każdej chwili pokój na inny
    private final Player player = new Player();
    private boolean running = true;
    public List<Item> getItems(){
        return room.getItems();
    }

    public String useItem(int itemIndex) {
        System.out.println(player);
       Item item = room.findItemByIndex(itemIndex);
        return item.use(this);

    }

    public int howManyItems() {
        return getItems().size();
    }

    public boolean isRunning() {
        return running;
    }
    public void endGame(){
        running = false;
    }

    public Room getRoom() {
        return room;
    }


    public Player getPlayer() {
        return player;
    }
}
