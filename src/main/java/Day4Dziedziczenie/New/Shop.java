package Day4Dziedziczenie.New;

public class Shop {
    public void pack(Shirt shirt) {

        switch (shirt.getSize()) {
            // enumy wspolpracuja ze switche, nie trzeba wspominac klasy,
            // switch wie z jakiej klasy ma szukac, bo wyciagacy z klay shirt Size wiec wie  o tym
            case XXL:
            case XL:
            case L:
            case M:
                System.out.println("Pakujê do du¿ej torby");
                break;
            case S:
            case XXS:
            case XS:
                System.out.println("Pakujê do ma³ej torby");
                break;
            default:
                System.out.println("Nie rozpoznano rozmiaru");
        }
        System.out.println("Rozmiar liczbowo: " + shirt.getNumericSize());
        /* Wyswietlenie dodatkwoej informacji z
        // metody getNumericSize w klasie Shirt. Ta sama metoda jest returnem
         wartosci docelowej w enumie ! */
    }
}
