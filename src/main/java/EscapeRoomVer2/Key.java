package EscapeRoomVer2;

public class Key extends Item {
    public Key() {
        super("Klucz");
    }

    @Override
    public String use(GameInteractions gameInteractionse) {
        // Key key = this;
       gameInteractionse.getRoom().removeItem(this);
        gameInteractionse.getPlayer().add(this);
        return "Zabierz klucz";
    }
}
