package Day3.Karty;

public class Card {
    private Rank rank;
    private Suit suit;


    public static void compare(Card card1, Card card2) {
        if (card1.rank.getPower() == card2.rank.getPower()) {
            System.out.println("They are equal");
        } else if (card1.rank.getPower() > card2.rank.getPower()) {
            System.out.println("First card is stronger ");
        } else {
            System.out.println("Second card id stronger");
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
}
