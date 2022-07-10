package Day1RepeatObiect.Linie;

public class Linia {
    int length;
    String inside;
    char znak;

    public Linia(int length, String inside) {
        this.length = length;
        this.inside = inside;
    }

    public Linia(int dlugosc, char element) {
        length = dlugosc;
        znak = element;
    }

    public Linia() {
        length = 30;
        inside = "!";
    }

    @Override
    public String toString() {
        return "Linia{" +
                "length=" + length +
                ", inside='" + inside + '\'' +
                ", znak=" + znak +
                '}';
    }

    void printLine() {
        for (int i = 0; i < length; i++) {
            System.out.print(inside);
        }
        System.out.println();
    }

    void printLineChar() {
        for (int i = 0; i < length; i++) {
            System.out.print(znak);
        }
        System.out.println();
    }

}
