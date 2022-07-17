package Day5.Excep;

public class Osoba {
    // metoda throw s³u¿y do generowanie w³asnych wyj¹tków
    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        if (wiek <= 0) {
            throw new WlasnaNazwaMetody("Wiek nie moze byc ujemny."); // 1
        }
        this.wiek = wiek;
    }

    public static void main(String[] args) {
        try {
            Osoba o = new Osoba("Jan", "Nowak", -1); // 2
        } catch (WlasnaNazwaMetody e) { // 3
            System.out.println("Wystapil blad! " + e.getMessage());
        }
    }
}
