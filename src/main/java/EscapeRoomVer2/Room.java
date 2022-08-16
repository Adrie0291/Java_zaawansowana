package EscapeRoomVer2;

import java.util.ArrayList;
import java.util.List;

// zarządza przedmiotami
public class Room {
   private  List<Item> items = new ArrayList<>();

   public Room(){
       Door door = new Door();
       Key key = new Key();
       Window window = new Window();
       items.add(new Door());
       items.add(new Key());
       items.add(new Window());

   }

    public List<Item> getItems() {
        return items;
    }
}
