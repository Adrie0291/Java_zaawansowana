package Day3.Karcianka;

public class Card {
    Rank rank;
    Suit suit;

    public static void compare(Card card, Card card2) {
        if (card2.rank.getPower() > card.rank.getPower()) {
            System.out.println("Card  is Winner" + card2 + "Power" + card2.rank.getPower());
        } else if (card2.rank.getPower() < card.rank.getPower()) {
            System.out.println("Winner card: " + card + " Power: " + card.rank.getPower());
        } else {
            System.out.println("REMIS");
        }
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}

