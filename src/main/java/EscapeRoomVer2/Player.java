package EscapeRoomVer2;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Item> items = new ArrayList<>();

    @Override
    public String toString() {
        return "Player{" +
                "items=" + items +
                '}';
    }

    public boolean hasItem(Item item){
       return items.contains(item);

    }

    public void add (Item item) {
        items.add(item) ;


    }
}
