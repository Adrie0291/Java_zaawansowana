package Day1RepeatObiect.osoby;

import java.util.Random;

public class OsobaDemo {
    public static void main(String[] args) {
        int liczba = 10;
        String tekst = "abc";
        Random random = new Random();
        int[] liczby = new int[10]; //


        Osoba osoba1 = new Osoba("Radek", 30);

        // osoba1.imie = "radek";
        // osoba1.wiek = 30;
        Osoba osoba2 = new Osoba("Zofia", 25);
        // osoba2.imie = "zofia";
        //  osoba2.wiek = 25;

        System.out.println(osoba1);
        System.out.println(osoba2);
        osoba1.przywitajSie();
        osoba2.przywitajSie();

        //osoba1.wyprawUrodziny();

        osoba1.przywitajSie();
        osoba2.przywitajSie();
        // ------------------to String ------------

        osoba1.setWiek(osoba1.getWiek() + 1);
        osoba1.setWiek(-1000000);
        osoba1.przywitajSie();
        osoba2.przywitajSie();
    }
}
