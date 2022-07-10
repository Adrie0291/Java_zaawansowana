package Day3.Enum;

public class Shop {
    public void pack(Shirt shirt) { // metoda przyjmuje obiekt shirt
        switch (shirt.getSize()) { // odwolujemy sie do rozmiaru w klasie Size (getter !)
            case XXL:
            case XL:
            case L:
            case M:
                System.out.println("Pakuj� do du�ej torby");
                break;
            case S:
            case XS:
            case XXS:
                System.out.println("Pakuj� do ma�ej torby");
                break;
            default:
                System.out.println("Nie rozpoznano rozmiaru");

        }
        System.out.println("Rozmiar liczbowo: " + shirt.getNumericSize());
    }
}
