package EscapeRoom;

public class Key {
    private boolean isTaken = false;

    public boolean isTaken() {
        return isTaken;
    }

    public void takeTheKey() {
        this.isTaken = true;
    }
}