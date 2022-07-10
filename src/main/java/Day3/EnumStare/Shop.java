package Day3.EnumStare;

public class Shop {

    public void pack(Shirt shirt) { // metoda przyjmuje obiekt shirt
        switch (shirt.getSize()) {
            case "XL":
            case "L":
            case "M":
                System.out.println("Pakuj� do du�ej torby");
                break;
            case "S":
            case "XS":
                System.out.println("Pakuj� do ma�ej torby");
                break;
            default:
                System.out.println("Nie rozpoznano rozmiaru");

        }
    }
}
