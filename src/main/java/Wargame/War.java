package Wargame;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class War {

    // PROSTA WERSJA GRY W "WOJNĘ" . GRACZE GRAJĄ 1 TURĘ. GRACZ KTÓRY MA WIĘCEJ WYGRANYCH POJEDNYKÓW WYGRYWA

    Player playerFirst;
    Player platerSecond;

    List<Card> deck = createDeck();

    public War(Player playerFirst, Player platerSecond) {
        this.playerFirst = playerFirst;
        this.platerSecond = platerSecond;
    }

    public List<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }

        }
        Collections.shuffle(deck);
        return deck;
    }

    public List<Card> deckFirst() {
        List<Card> deckFirst = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            deckFirst.add(deck.get(i));
        }
        return deckFirst;
    }

    public List<Card> deckSecond() {
        List<Card> deckSecond = new ArrayList<>();
        for (int i = 26; i < 52; i++) {
            deckSecond.add(deck.get(i));
        }
        return deckSecond;
    }

    public void strongerCard() {

        int count = 0;
        int count2 = 0;
        int remis = 0;
        int remisyPrzed = 0;
        for (int i = 0; i < 26; i++) {

            if (deckFirst().get(i).rank.getPower() > deckSecond().get(i).getRank().getPower()) {
                count++;
                System.out.println("Karta 1. gracza: " + deckFirst().get(i));
                System.out.println("Karta 2. gracza: " + deckSecond().get(i));
                System.out.println("Bitwę wygrywa gracz nr 1");


            } else if (deckFirst().get(i).rank.getPower() < deckSecond().get(i).getRank().getPower()) {
                count2++;
                System.out.println("Karta 1. gracza: " + deckFirst().get(i));
                System.out.println("Karta 2. gracza: " + deckSecond().get(i));
                System.out.println("Bitwę wygrywa gracz nr 2");
            } else if (deckFirst().get(i).rank.getPower() == deckSecond().get(i).getRank().getPower()) {
                if (deckFirst().get(i + 1).rank.getPower() > deckSecond().get(i + 1).getRank().getPower()) {
                    count++;
                    count++;
                    i++;
                } else if (deckFirst().get(i + 1).rank.getPower() < deckSecond().get(i + 1).getRank().getPower()) {
                    count2++;
                    count2++;
                    i++;
                } else if (deckFirst().get(i + 1).rank.getPower() == deckSecond().get(i + 1).getRank().getPower()) {
                    remis++;
                    i++;
                }
            }
        }
        System.out.println("Gracz nr 1. Zdobył punktów: " + count);
        System.out.println("Gracz nr 2. Zdobył punktów: " + count2);
        System.out.println("Remisów było: " + remis);
    }
}
