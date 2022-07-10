package Day3.Karty;

public enum Rank {
    SECOND(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), WALET(11), DAMA(12), KROL(13), AS(14);

    private int power;

    public int getPower() {
        return power;
    }

    Rank(int power) {
        this.power = power;
    }
}
