package Day2.House;
public class BlokDemo {
    public static void main(String[] args) {
        /* Program ma na celu stworzenie mieszkan oraz stworzenia bloku ktory sklada sie z mieszkan
         i jednoczesnie serwisu spoldzielczego ktory jest odpowiedzialny za znalezienie mieszkania i oplacenia jego czynszu
         Tworzymy tutaj klase Mieszkanie ktora posiada 2 pola oplacony oraz nr mieszkania oraz metody oplac
         Nastepnie tworzymy klase blok ktora sklada sie z kilku mieszkan.
         Kolejnym krokiem stworzenie serwisu  spoldzielni ktorej celem jest oplacenie mieszkania, ale to mieszkanie
         wyszukiwane jest w klasie blok ktorego typem zwracanym jest Mieszkanie
       Gdy zostanie wyszukany nr mieszkania nastepuje metoda oplac. Koniec programu.


         */


        Mieszkanie mieszkanie1 = new Mieszkanie(4);
        Mieszkanie mieszkanie2 = new Mieszkanie(5);
        Mieszkanie mieszkanie3 = new Mieszkanie(6);

        Mieszkanie[] mieszkania = new Mieszkanie[3];
        mieszkania[0] = mieszkanie1;
        mieszkania[1] = mieszkanie2;
        mieszkania[2] = mieszkanie3;

        Blok blok = new Blok(mieszkania);

        System.out.println(blok);

        SerwisSpoldzielni serwisSpoldzielni = new SerwisSpoldzielni(blok);
        serwisSpoldzielni.oplacCzynsz(40);

        System.out.println(blok);

    }
}
