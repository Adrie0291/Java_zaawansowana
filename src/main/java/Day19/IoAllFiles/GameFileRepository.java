package Day19.IoAllFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameFileRepository {
    private static final String PATH = "src/main/java/Day19/IoAllFiles/games.bin";

    public void saveGames(List<Game> games) {

        System.out.println("Zapisuję grę w pliku !");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH));
            oos.writeObject(games);
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
    public List<Game> readGame() {
        System.out.println("Odczytuję grę z pliku!");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH));
            List<Game>  games= (List<Game>) ois.readObject();
            ois.close();
            return games;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
        return new ArrayList();
    }
}
