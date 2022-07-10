package Day3.Karcianka;

public enum Rank {
    two(2), three(3), four(4), five(5), six(6), seven(7),
    eight(8), nine(9), ten(10), Jack(11), Queen(12), King(13), Ace(14);
    private int power;

    Rank(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}


