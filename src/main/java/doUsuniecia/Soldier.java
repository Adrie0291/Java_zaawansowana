package doUsuniecia;

public class Soldier extends Citizen {

    public Soldier(String name) {
        super(name);
    }

    public boolean CanVote() {
        return true;
    }
}