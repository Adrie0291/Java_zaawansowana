package doUsuniecia;

public class Peasant extends Citizen {
    public Peasant(String name) {
        super(name);
    }

    public boolean CanVote() {
        return false;
    }
}
