package Day18.OptionalExample;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameCatalog {
    private List<Game> games;


    public GameCatalog() {
        GameDeveloper gameDeveloper = new GameDeveloper("John", "Project Manager");
        GameDeveloper gameDeveloper2 = new GameDeveloper("Antos", "Junior");
        GameDeveloper gameDeveloper3 = new GameDeveloper("Katie", "Mid");
        GameDeveloper gameDeveloper4 = new GameDeveloper("Michael", "Junior");
        GameDeveloper gameDeveloper5 = new GameDeveloper("Claire", "Senior");
        games = new ArrayList<>();
        Game game = new Game("Doom", List.of(gameDeveloper, gameDeveloper2));
        Game game2 = new Game("Diablo", List.of(gameDeveloper3,gameDeveloper5,gameDeveloper4));
        Game game3 = new Game("Homm", List.of(gameDeveloper, gameDeveloper5));
        Game game4 = new Game("Skyrim", List.of(gameDeveloper, gameDeveloper2, gameDeveloper3,
                gameDeveloper4, gameDeveloper5));
        games.addAll(List.of(game, game2, game3, game4));

    }

    public Optional<Game> findGameByTitle(String titleVideo) {
        for (Game game : games) {
            if (game.getTitle().equals(titleVideo)) {
                return Optional.of(game); // optional bêdzie zawiera³ grê
            }
        }
        return Optional.empty();  // Optional bêdzie pusty
        // return Optional.of Nullable (moja zmienna):// jeœ³i mam zmienn¹ w ktorej byc null albo nie
/*
    public Game findGameByTitle(String titleVideo) {
        for (Game game : games) {
            if (game.getTitle().equals(titleVideo)) {
                return game;
            }
        }
        return null;
    }
 */
    }

    // ile etatów zapewniaj¹ wszystkie gry razem Nieudane podejœcie
    public int howManyJobs() {
        return (int) games.stream()
                .map(game -> game.getGameDevelopers()) // <Game> do <List> Developers
                .count();  // zliczenie ich
    }

    public int howManyJobs2(){
        return (int) games.stream()
                .flatMap(game -> game.getGameDevelopers().stream())
                .count();
    }
    // Kto pracuje w najw. ilosci proejktow
    // Ile najwiecej osob pracuje nad projektem
    // Znajdz wsystkich pracownikow okreslonej rangi
    // Daj wszystkich pracownikow, bez powtorek
    // policz ilosc pracownikow dla danej rangi
    // ile lacznie osob przydzielono nad grami (z powtorkami)
    // zwroc wszystkie, nad ktorymi pracuje zespol zawierajacy minimum jednego seniora
    // Znajdz projekt Managera wybranej gry
    @Override
    public String toString() {
        return "GameCatalog{" +
                "games=" + "\n" + games +
                '}';
    }
}
