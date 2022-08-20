package Day19.serializationJson;


import java.util.List;

public class Game {

    private String title;
    private List<GameDeveloper> gameDevelopers;

    public Game(String title, List<GameDeveloper> gameDevelopers) {
        this.title = title;
        this.gameDevelopers = gameDevelopers;
    }

    public Game() {
    }

    //w biblitece jckson gettery do wszystkich pól są potrzebne
    public String getTitle() {
        return title;
    }

    public List<GameDeveloper> getGameDevelopers() {
        return gameDevelopers;
    }
    //biblioteka Jackson wykorzystuje a więc wymaga bezparametrowego konstruktora

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", gameDevelopers=" + gameDevelopers +
                '}' + "\n";


    }
}
