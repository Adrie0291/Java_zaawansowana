package Day2PostOffice;

import java.util.Scanner;

public class PostOfficeDemo {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy na poczcie");
        boolean menu = true;
        do {
            System.out.println("Wybierz opcje:");
            System.out.println("1. Wyslij paczke.");
            System.out.println("2. Pokaz zyski poczty.");
            System.out.println("3. Wyświetl ostatnią wysłaną paczkę");


            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Podaj kwotę pieniedzy: ");
                    int money = scanner.nextInt();
                    postOffice.sendPackage(money, postOffice.creatPackage());
                    break;
                case 2:
                    System.out.println("Zysk wynosi");
                    System.out.println(postOffice.getEarning());
                    break;
                case 3:
                    System.out.println("Ostatnio wysłana paczka to");
                    System.out.println(postOffice.lastPackage());
                    break;

                default:
                    System.out.println("Zle. Koniec programu");
                    menu = false;
                    break;
            }
        } while (menu);


    }
}



















        /* PART 1
        Paczka paczka1 = new Paczka("Monika", "Mikolaj", 10001);
        Paczka paczka2 = new Paczka("Roksana", "Joachim", 4500);
        Paczka paczka3 = null;
        System.out.println(paczka1);
        System.out.println(paczka2);
        System.out.println(paczka3);
        System.out.println(paczka1.costPackage(true));
        System.out.println(paczka2.costPackage(true));
        //System.out.println(paczka3.costPackage(true));// nie działa na nullach
        paczka3 = paczka1;
        System.out.println(paczka3);
        System.out.println(paczka3.costPackage(false));

         */
        /* PART 2 losowe 10 paczek wraz z cenami + sumą łączna
        Paczka[] paczki = new Paczka[10];                // stworzenie listy 10 paczek
        double allPrice = 0;                             // stworzenie zmiennej double na potrzeby liczenie sumy kosztów paczek
        for (int i = 0; i < 10; i++) {                   // pętla iterująca, tworzy paczki za pomocą konstruktora bezparametrowego z klasy Paczka
            paczki[i] = new Paczka();
            System.out.println("Paczka nr " + (i + 1) + "." + paczki[i]);
        }
        for (Paczka paczka : paczki) {                   // pętla która iteruje po poprzedniej pętli paczki i liczy koszt wysyłki każdej paczki
            System.out.println("Koszt wysylki wynosi: " + paczka.costPackage());
            allPrice += paczka.costPackage();            // suma wysyłki 10 paczek

        }
        System.out.println(allPrice);

         */
