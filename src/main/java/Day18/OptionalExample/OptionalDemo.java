package Day18.OptionalExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        GameCatalog gameCatalog = new GameCatalog();


        System.out.println(gameCatalog.findGameByTitle("Doom 3"));
        // 1.
        Game found = gameCatalog.findGameByTitle("Doom").orElse(null);
        System.out.println(found);
        // 2.
        Game found2 = gameCatalog.findGameByTitle("Doom 3").
                orElse(new Game("Doom3", new ArrayList<>()));
        System.out.println(found2);
        // 3.
        String title = "Skyrim";

        Game found3 = gameCatalog.findGameByTitle(title)
                .orElse(null);
        System.out.println(found3);
        //4.
        Optional<Game> foundOptional = gameCatalog.findGameByTitle("COD");
        if (foundOptional.isPresent()) {
            System.out.println("jest");
        } else
            System.out.println("Nie ma");
        //5.
        gameCatalog.findGameByTitle("Homm")
                .ifPresent(game -> System.out.println(game.getTitle() + " found!"));
        //6.
        List<String> gameTitles = gameCatalog.findGameByTitle("Diablo")
                .map(game -> game.getTitle())
                .stream()
                .toList();
        System.out.println(gameTitles);

        // 7.
        Game gameFound2 = gameCatalog.findGameByTitle("Gothic")
                .orElseThrow( () -> new RuntimeException("Przykro mi, cos nie tak"));
        System.out.println(gameFound2);
    }
}