package WzorceProjektowe.Dzien1.Task5Game;

public class GameDobrze {
    public static void main(String[] args) {
        game();
    }

    private static final int MAX_UNITS_IN_GAME = 50;
    private static final int MAX_ARMOR_VALUE = 100;

    private static void loadPlayerData() {
        System.out.println("Player data ..... ");
        armorTooltip();
    }

    static void game() {
        System.out.println("Inicjalizacja gry........");
        System.out.println("Maximum unit in game is " + MAX_UNITS_IN_GAME);
        loadPlayerData();
    }

    private static void armorTooltip() {
        System.out.printf("Remember that you have only %s maximum armor.", MAX_ARMOR_VALUE);
    }
}