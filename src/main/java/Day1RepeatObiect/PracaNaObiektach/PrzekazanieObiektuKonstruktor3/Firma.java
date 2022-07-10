package Day1RepeatObiect.PracaNaObiektach.PrzekazanieObiektuKonstruktor3;

public class Firma {
    Osoba prezes;

    public Firma(Osoba prezes) {
        this.prezes = prezes;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "prezes=" + prezes +
                '}';
    }
}
