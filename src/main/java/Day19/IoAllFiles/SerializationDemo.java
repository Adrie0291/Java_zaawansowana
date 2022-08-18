package Day19.IoAllFiles;

import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {
    public static void main(String[] args) {
        GameCatalog gameCatalog = new GameCatalog();
    //    gameCatalog.saveAllGames();
      //  gameCatalog.readAllGames();
        gameCatalog.addGame(new Game("MEedal of Honor", new ArrayList<>()));
        gameCatalog.saveAllGames();
        gameCatalog.readAllGames();
    }
}
