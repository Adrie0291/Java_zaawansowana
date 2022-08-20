package Day19.serializationJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static java.util.List.of;

public class GameJsonRepository {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Game game = objectMapper.readValue(new File("src/main/java/Day19/serializationJson/gry.json"), Game.class);
        System.out.println(game);
        //  stworzenie gry
        Game game2 = new Game("Far Cry 3", List.of(new GameDeveloper("Vanessa", "MID"), new GameDeveloper("Viktor", "CEO")));
        String jsonExample = objectMapper.writeValueAsString(game2);
        System.out.println(jsonExample);
        // zapis do pliku
        objectMapper.writeValue(new File("src/main/java/Day19/serializationJson/gryNowe.json"), game2);
    }
}