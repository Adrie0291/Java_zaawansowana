package Day3.EnumStare;

public class Shop {

    public void pack(Shirt shirt) { // metoda przyjmuje obiekt shirt
        switch (shirt.getSize()) { // odwolujemy sie do rozmiaru w klasie Size (getter !)
            case Sizes.XXL:
            case Sizes.XL:
            case Sizes.L:
            case Sizes.M:
                System.out.println("Pakujê do du¿ej torby");
                break;
            case Sizes.S:
            case Sizes.XS:
            case Sizes.XXS:
                System.out.println("Pakujê do ma³ej torby");
                break;
            default:
                System.out.println("Nie rozpoznano rozmiaru");

        }

    }
}
