package Day19.IoFiles;

import java.io.*;
import java.util.Optional;

public class GameFileRepository {
    private static final String PATH = "src/main/java/Day19/IoFiles/game.bin";

    public void saveGame(Game game) {

        System.out.println("Zapisuję grę w pliku !");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH));
            oos.writeObject(game);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // zapisywanie pliku
    public Optional<Game> readGame() {
        System.out.println("Odczytuję grę z pliku!");
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
