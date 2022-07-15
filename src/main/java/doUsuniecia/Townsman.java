package doUsuniecia;

public class Townsman extends Citizen {

    public Townsman(String name) {
        super(name);

    }
    public boolean CanVote() {
        return true;
    }
}