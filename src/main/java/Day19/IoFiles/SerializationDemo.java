package Day19.IoFiles;

public class SerializationDemo {
    public static void main(String[] args) {
        GameCatalog gameCatalog = new GameCatalog();
        gameCatalog.saveAllGames();
        gameCatalog.readAllGames();
    }
}
