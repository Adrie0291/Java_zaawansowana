package BlackJack;

import java.util.Collections;
import java.util.Scanner;

public class BlackJackDemo {
    public static void main(String[] args) {
        System.out.println("### BLACK JACK CASINO ###");

        Deck deck = new Deck();
        deck.CreateDeck();

        System.out.println(deck);

        Deck playerDeck = new Deck();
        Deck dealerDeck = new Deck();

        int playerMoney = 200;
        Scanner scanner = new Scanner(System.in);

        while (playerMoney > 0) {
            System.out.println("You have PLN" + playerMoney + " how much would you like to bet?");
            int bet = scanner.nextInt();
            if (bet > playerMoney) {
                System.out.println("You don't have enough money");
                break;

            }
            playerDeck.draw(deck);
            playerDeck.draw(deck);

            dealerDeck.draw(deck);
            dealerDeck.draw(deck);

        }
        System.out.println("Game over. You don't have money.");

    }
}
