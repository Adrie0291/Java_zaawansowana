package Day18.OptionalExample;

public class GameDeveloper {
    private String name;
    private String rank;

    public GameDeveloper(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "GameDeveloper{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
