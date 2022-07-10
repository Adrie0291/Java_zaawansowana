package Day3.Karcianka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(Rank.Ace, Suit.Diamonds);
        Card card2 = new Card(Rank.three, Suit.Hearts);
        Card card3 = new Card(Rank.Jack, Suit.Spades);
        Card card4 = new Card(Rank.nine, Suit.Diamonds);
        // wy�wietla informacje o karcie bez warto�ci w konstruktorze
        System.out.println(card);
        System.out.println(card2);

        // wy�wietla warto�� w konstruktorze
        int powerCard2 = card2.rank.getPower();
        System.out.println(powerCard2);

        // por�wnanie si�y kart
        System.out.println("Comparison card:");
        Card.compare(card3, card4);


        // wypisanie tylko kier�w
        ArrayList<Card> kier = new ArrayList<>();
        for (
                Rank rank : Rank.values()) {
            Card karta = new Card(rank, Suit.Hearts);
            kier.add(karta);
        }
        System.out.println(kier);
        System.out.println("-----------ALL CARD -----------");
        ArrayList<Card> AllCard = new ArrayList<>();
        for (
                Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card karta = new Card(rank, suit);
                AllCard.add(karta);
            }
        }
        System.out.println(AllCard);
        System.out.println(" ---- ALL CARD VERSION 2 -----");
        ArrayList<Card> KartWszystkie = new ArrayList<>();
        for (
                Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card karta = new Card(rank, suit);
                KartWszystkie.add(karta);
            }
        }
        System.out.println(KartWszystkie
        );
    }

}