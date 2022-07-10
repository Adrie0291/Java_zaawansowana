package Day1RepeatObiect.PracaNaObiektach.PrzekazanieObiektuKonstruktor3;

public class OsobaDemo {
    public static void main(String[] args) {
        Osoba ceo = new Osoba("Bezos");
        Firma amazon = new Firma(ceo);

        System.out.println(amazon);

    }
}
