package EscapeRoomVer2;

public class Key extends Item {
    public Key() {
        super("Klucz");
    }

    @Override
    public void use() {
        System.out.println("Uzywam klucza");
    }
}
