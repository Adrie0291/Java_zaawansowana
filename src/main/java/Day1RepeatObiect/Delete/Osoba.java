package Day1RepeatObiect.Delete;

import java.util.Random;

public class Osoba {
    private String imie;
    private int wiek;

    public String getImie() {
        return imie;
    }

    /*public Osoba(String startowieImie, int startowyWiek) {
            imie = startowieImie;
            wiek = startowyWiek;
        }
         */
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Osoba() {  // nazwa konstruktora to nazwa klasy, pomijamy typ zwracany bo zwracamy obiekt (osobe)
        imie = "Jan";
        Random random = new Random();
        wiek = random.nextInt(100);
    }


    void przywitajSie() {
        System.out.println("Jestem " + imie + " mam " + wiek + "lat");
    }

    void wyprawUrodziny() {
        wiek++;
    }

    /*
        @Override
        public String toString() {
            return "Jestem " + imie + " mam " + wiek + "lat";
        }
     */
    public void setWiek(int wiek) {
        if (wiek < 0) {
            return;
        }
        this.wiek = wiek;

    }

    public int getWiek() {
        return wiek;

    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
