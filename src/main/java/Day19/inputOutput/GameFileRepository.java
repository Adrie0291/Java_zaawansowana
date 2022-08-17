package Day19.inputOutput;

import java.io.*;
import java.util.Optional;

public class GameFileRepository {
    private static final String PATH = "src/main/java/Day19/inputOutput/games.bin";

    public void saveGame(Game game) {


        System.out.println("Zapisuję w pliku");
        System.out.println(game);
        try {
            ObjectOutputStream cos = new ObjectOutputStream(new FileOutputStream(PATH));
            cos.writeObject(game);
            cos.flush();
            cos.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("Brak pliku");
            e.printStackTrace();
        } catch (
                IOException e) {
            System.out.println("Brak pliku");
            e.printStackTrace();
        }
    }

    public Optional<Game> readGame() {
        System.out.println("Odczytuję grę z pliku! ");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH));
            Game game = (Game) ois.readObject();
            ois.close();
            return Optional.of(game);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Optional.empty();

    }
}