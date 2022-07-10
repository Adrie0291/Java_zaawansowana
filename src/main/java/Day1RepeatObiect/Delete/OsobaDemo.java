package Day1RepeatObiect.Delete;

import java.util.Random;

public class OsobaDemo {
    public static void main(String[] args) {

        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba("Zofia", 22);

        osoba1.przywitajSie();
        osoba2.przywitajSie();

        //--- To String ---///

        System.out.println(osoba1);
        System.out.println(osoba2.toString());
        // --- enkapsulacja ----//


        System.out.println(osoba1.getWiek());
        System.out.println(osoba2.getWiek());

        osoba1.setWiek(osoba1.getWiek() + 1);
        osoba2.wyprawUrodziny();

        System.out.println(osoba1.getWiek());
        System.out.println(osoba2.getWiek());
        System.out.println(osoba1.getImie());
        System.out.println(osoba2.getImie());

    }
}
