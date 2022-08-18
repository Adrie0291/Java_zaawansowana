package Day19.IoAllFiles;

import java.io.Serializable;
import java.util.List;

public class Game implements Serializable {

    private String title;
    private List<GameDeveloper> gameDevelopers;

    public Game(String title, List<GameDeveloper> gameDevelopers) {
        this.title = title;
        this.gameDevelopers = gameDevelopers;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", gameDevelopers=" + gameDevelopers +
                '}' + "\n";


    }
}
