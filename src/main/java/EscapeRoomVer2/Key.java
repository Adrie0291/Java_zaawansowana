package EscapeRoomVer2;

public class Key extends Item {
    public Key() {
        super("Klucz");
    }

    @Override
    public String use(Game game) {
        // Key key = this;
       game.getRoom().removeItem(this);
        game.getPlayer().add(this);
        return "Zabierz klucz";
    }
}
