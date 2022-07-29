package WzorceProjektowe.Dzien1.Task5Game;

public class GameZle {
/*
1.
2. Występująca wartośc 100 3 razy pod koniec każej linijki w metodach (maxArmValue) -> private final int powinno być, pisane wielką literą-
3. Nieużywane zmienne int i
4. Brak metod statycznych
5. Zbędny komentarz
6. Nieużywane zmienne maxunitIngame
 */

    public int maxunitsIngame = 50;

    // public boolean awayFromkeyboard = false;
    public static void main(String[] args) {
        game();
        PlayerData(20);
        LoadPlayerData(30);
    }

    static void PlayerData(int i) {
        System.out.println("Player data ....");
        System.out.printf("Remember that you have only %s maximum armour", 100);
    }

    static void LoadPlayerData(int i) {
        System.out.println("Loading player data ....");
        System.out.printf("You cannot load more than %s for armour", 100);
    }

    static void game() {
        System.out.println("Inicjalizacja gry .....");
        System.out.println("Maximum unit in game is 50");
        System.out.println("100 is the maximum armour");
        System.out.printf("Remember that you have only %s maxium armour", 100);
    }

}
