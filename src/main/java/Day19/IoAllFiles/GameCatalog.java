package Day19.IoAllFiles;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class GameCatalog {
    private List<Game> games;
    GameFileRepository gameFileRepository = new GameFileRepository();

    public GameCatalog() {

        GameDeveloper gameDeveloper = new GameDeveloper("John", "Project Manager");
        GameDeveloper gameDeveloper2 = new GameDeveloper("Antos", "Junior");
        GameDeveloper gameDeveloper3 = new GameDeveloper("Katie", "Mid");
        GameDeveloper gameDeveloper4 = new GameDeveloper("Michael", "Junior");
        GameDeveloper gameDeveloper5 = new GameDeveloper("Claire", "Senior");
        games = new ArrayList<>();
        Game game = new Game("Doom", List.of(gameDeveloper, gameDeveloper2));
        Game game2 = new Game("Diablo", List.of(gameDeveloper3, gameDeveloper5, gameDeveloper4));
        Game game3 = new Game("Homm", List.of(gameDeveloper, gameDeveloper5));
        Game game4 = new Game("Skyrim", List.of(gameDeveloper, gameDeveloper2, gameDeveloper3,
                gameDeveloper4, gameDeveloper5));
        games.addAll(List.of(game, game2, game3, game4));


        saveAllGames();
        readAllGames();

    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void saveAllGames() {
        gameFileRepository.saveGames(games);
    }

    private void readAllGames() {
        games = gameFileRepository.readGame();
        //System.out.println(games);
    }

    @Override
    public String toString() {
        return "GameCatalog{" +
                "games=" + games +
                '}';
    }
}