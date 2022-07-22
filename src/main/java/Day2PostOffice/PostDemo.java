package Day2PostOffice;

import java.util.ArrayList;

public class PostDemo {
    public static void main(String[] args) {
        double allPrice = 0;
        /* PART 1
        Paczka paczka = new Paczka("Jan", "Monika", 0.601, false);
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
        Paczka[] paczki = new Paczka[100];
        for (int i = 0; i < 100; i++) {
            paczki[i] = new Paczka();
        }
        for (Paczka paczka : paczki) {
            System.out.println(paczka + " " + "Cost send box equals = " + paczka.totalPrice());
            allPrice += paczka.totalPrice();


        }
        System.out.println(allPrice);
    }
}