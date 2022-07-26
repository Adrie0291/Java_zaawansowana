package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
    }


    public void CreateDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
            Collections.shuffle(cards);
        }
    }


    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }

    public void remoceCard(int i) {
        cards.remove(i);
    }

    public Card getCard(int i) {
       return cards.get(i);
    }

    public void addCard(Card addCard) {
        cards.add(addCard);

    }
    public void draw(Deck comingForm){
        cards.add(comingForm.getCard(0));
        comingForm.remoceCard(0);
    }
}
