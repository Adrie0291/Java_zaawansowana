package Day1RepeatObiect.PracaNaObiektach.ObiektJakoArgument;

public class OsobaDemo {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Marek");
        Firma firma = new Firma();
        firma.pracuj(osoba1);
    }
}
