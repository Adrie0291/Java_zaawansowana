package Day3.Karty;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // obiekty kart z parametrami ,które s¹ tablicami enum
        Card card1 = new Card(Rank.AS, Suit.trefl);
        Card card2 = new Card(Rank.KROL, Suit.serce);
        Card card3 = new Card(Rank.NINE, Suit.karo);
        Card card4 = new Card(Rank.NINE, Suit.pik);
        Card card5 = new Card(Rank.AS, Suit.serce);
        // wyœwietlenie informacji o kartach
        System.out.println(card1);
        System.out.println(card2);

        // wyœwietlenie rang kart
        for (Rank rank : Rank.values()) {
            System.out.print(rank + " ");
        }
        System.out.println();
        // wyœwietla wartoœæ liczbow¹ kart
        for (Rank rank : Rank.values())
            System.out.print(rank.getPower() + " ");

        System.out.println("\n");

        for (Suit aSuit : Suit.values()) {
            System.out.print(aSuit + " ");
        }

        System.out.println();
        Card.compare(card3, card4);

        ArrayList<Card> piki = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            piki.add(new Card(rank, Suit.pik));


        }
        System.out.println(piki);
        System.out.println("\n\n");
        ArrayList<Card> AllCard = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                AllCard.add(new Card(rank, suit));
            }
        }
        System.out.println(AllCard);
    }
}
