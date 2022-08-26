package Wargame;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import Wargame.Rank;

public class War {


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

    public void strongCard() {
        playerWar(deckFirst(), deckSecond());
    }

    private void playerWar(List<Card> deckFirst, List<Card> deckSecond) {
        List<Card> wonCards = new ArrayList();
        int winNumbe = 0;

        while (!deckFirst.isEmpty() || !deckSecond.isEmpty()) {
            if (winNumbe != 0) {
            }

            Card card1 = deckFirst.get(0);
            Card card2 = deckSecond.get(0);
            System.out.println("Karta nr 1 " + card1 + "Karta nr 2: " + card2);
            wonCards.add(card1);
            wonCards.add(card2);
            System.out.println("Karty do zgarniêcia" + wonCards);
            winNumbe = compareCard(card1, card2);
            deckFirst.remove(card1);
            deckSecond.remove(card2);
            System.out.println("Pierwsza talia: "+ deckFirst);
            System.out.println("Druga talia" + deckSecond);

                if (winNumbe == 1) {
                   addWonCard(deckFirst, wonCards);
                    System.out.println("Partiê gracz nr 1 ");

                } else if (winNumbe == 0) {
                    addWonCard(deckSecond, wonCards);
                    System.out.println("Partiê wygra³ gracz nr2");
                } else if (winNumbe == 2) {
                    if (deckFirst.size() < 2) {
                        System.out.println("Remis zosta³¹ tylko 1 karta");
                        return;
                    } else if (deckSecond.size() < 2) {
                        System.out.println("Remis, zosta³a tylko 1 karta");
                        return;
                    }
                    System.out.println("Kart s¹ równe");
                    System.out.println(card1 + "" + card2);
                    Card card01 = deckFirst.get(0);
                    Card card02 = deckSecond.get(0);
                    wonCards.add(card01);
                    wonCards.add(card02);
                    deckFirst.remove(card01);
                    deckSecond.remove(card02);
                    continue;
                }


            System.out.println("Sprwadzanie kto wygra³");
            if (checkWinner(deckFirst, deckSecond))
                return;

        }
    }

    private boolean checkWinner(List<Card> deckFirst, List<Card> deckSecond) {
        String playerName = " ";
        if (deckFirst.size() == 0 || deckSecond.size() == 0) {
            int winNumb = 0;
            if (deckFirst.size() == 0) {
                winNumb = 2;
                playerName =  "Stefan";
            } else {
                winNumb = 1;
                playerName = "Anna";
            }
            System.out.println("Grê wygra³ " + playerName);
            return true;
        }
        return false;
    }

    private void addWonCard(List<Card> deckFirst, List<Card> wonCards) {
        Collections.shuffle(wonCards);
        deckFirst.addAll(wonCards);
        wonCards.clear();
    }

    private int compareCard(Card karta1, Card karta2) {
        int number;
        System.out.println("Karta nr 1 si³a: " + karta1.getRank().getPower() + "Karta nr 2 si³a: " + karta2.getRank().getPower());
        if (karta1.getRank().getPower() > karta2.getRank().getPower()) {
            number = 1;;
        } else if (karta1.getRank().getPower() < karta2.getRank().getPower()) {
            number = 0;
        } else {
            number = 2;
        }
        return number;
    }
}