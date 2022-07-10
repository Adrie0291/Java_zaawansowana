package Day1RepeatObiect.PracaNaObiektach.ZwracanyObiekt;

public class OsobaDemo {
    public static void main(String[] args) {
        Firma Lays = new Firma();
        Osoba osoba = Lays.zbudujRobota();
        System.out.println("Ja " + osoba.getName());
    }
}