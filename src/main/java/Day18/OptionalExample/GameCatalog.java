package Day18.OptionalExample;

import java.util.ArrayList;
import java.util.List;

public class GameCatalog {
    private List<Game> games;

    public GameCatalog() {
        games = new ArrayList<>();
        GameDeveloper gameDeveloper = new GameDeveloper("John", "Project Manager");
        GameDeveloper gameDeveloper2 = new GameDeveloper("Antos", "Junior");
        GameDeveloper gameDeveloper3 = new GameDeveloper("Katie", "Mid");
        GameDeveloper gameDeveloper4 = new GameDeveloper("Michael", "Junior");
        GameDeveloper gameDeveloper5 = new GameDeveloper("Claire", "Senior");
        Game game = new Game("Doom", List.of(gameDeveloper, gameDeveloper2));
        Game game2 = new Game("Diablo", List.of(gameDeveloper3));
        Game game3 = new Game("Homm", List.of(gameDeveloper, gameDeveloper5));
        Game game4 = new Game("Skyrim", List.of(gameDeveloper, gameDeveloper2, gameDeveloper3, gameDeveloper4, gameDeveloper5));
        games.addAll(List.of(game, game2, game3, game4));

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
