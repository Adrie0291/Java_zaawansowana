package EscapeRoomVer2;

public class Door extends Item {
    private Key key;

    public Door(Key key) {

        super("Drzwi");
        this.key = key;
    }

    @Override
    public String use(Game game) {
        if (game.getPlayer().hasItem(key)) {
            game.endGame();
            return "Otwierasz drzwi!";
        }
        return ("Drzwi są zamknięte ");
    }
}
