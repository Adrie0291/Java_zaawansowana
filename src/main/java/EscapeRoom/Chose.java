package EscapeRoom;

public enum Chose {
    WINDOW(1),
    KEY(2),
    DOOR(3);

    private int selection;

    Chose(int selection) {
        this.selection = selection;
    }

    public int getSelection() {
        return selection;
    }
}
