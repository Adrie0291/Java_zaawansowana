package doUsuniecia;

public abstract class Citizen {
    private String name;

    public Citizen(String name) {
        this.name = name;
    }
    public abstract boolean CanVote();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                '}';
    }
}
