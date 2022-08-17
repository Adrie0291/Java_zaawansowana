package EscapeRoomVer2;

public class Window extends Item{
    public Window() {
        super("Okno");
    }

    @Override
    public void use() {
        System.out.println("Używam okna");
    }
}
