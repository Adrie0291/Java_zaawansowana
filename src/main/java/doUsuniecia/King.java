package doUsuniecia;

public class King extends Citizen {
    public King(String name) {
        super(name);
    }

    @Override
    public boolean CanVote() {
        return false;
    }
}
