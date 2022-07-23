package Day2PostOffice;

import java.util.ArrayList;
import java.util.Scanner;

public class PostDemo {
    public static void main(String[] args) {
        Adres adres1 = new Adres("Kolobrzeska", 39, "12-028");
        Adres adres2 = new Adres("Gdanska", 1, "39-492");

        int choose = 0;
        while (choose != 2) {
            System.out.println("Witamy na poczcie, co chcesz zrobiæ");
            System.out.println("1. Nadaj paczkê: ");
            System.out.println("2. WyjdŸ z programu: ");
            System.out.println("3. Nadawanie listu");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    NadawaniePaczki();
                    break;
                case 2:
                    return;
                case 3:
                    NadawanieListu();
                    break;
            }
        }

    }

    public static void NadawaniePaczki() {
        Poczta poczta = new Poczta();
        System.out.println("Nadawanie paczki:");
        System.out.println("Paczka mo¿e wa¿yæ od 0.001 kg do 100 kg");
        poczta.sendPacakge();

    }

    public static void NadawanieListu() {

        Poczta poczta = new Poczta();
        System.out.println("Nadawanie listu ");
        poczta.sendLetter();
    }

}






   /* PART 1
        Paczka paczka2 = new Paczka("Adam", "Walery", 15.001, false);
        Paczka paczka3 = null;

        System.out.println(paczka);
        System.out.println(paczka2);
        System.out.println(paczka3);
        paczka3 = paczka;
        System.out.println(paczka3);
        System.out.println(paczka3.totalPrice());
        System.out.println(paczka2.totalPrice());

         */
        /* petla paczek
        Paczka[] paczki = new Paczka[100];
        for (int i = 0; i < 100; i++) {
            paczki[i] = new Paczka();
        }
        for (Paczka paczka : paczki) {
            System.out.println(paczka + " " + "Cost send box equals = " + paczka.totalPrice());
            allPrice += paczka.totalPrice();


        }
        System.out.println(allPrice);

         */