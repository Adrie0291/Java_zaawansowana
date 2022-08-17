package EscapeRoomVer2;

public class Key extends Item {
    public Key() {
        super("Klucz");
    }

    @Override
    public String use(Room room, Player player) {
        // Key key = this;
        room.removeItem(this);
        player.add(this);
        return "Zabierz klucz";
    }
}
