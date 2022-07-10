package Day3.Enum;


public class EnumDemo {
    public static void main(String[] args) {

        Shirt shirt1 = new Shirt(Size.XXL);
        Shirt shirt2 = new Shirt(Size.XXS);
        
        System.out.println(shirt1);
        System.out.println(shirt2);

        Shop shop = new Shop();
        shop.pack(shirt1);
        shop.pack(shirt2);


        for (Size aSize : Size.values()) {              // iterowanie po obiektach w liœcie
            System.out.println(aSize);                  // wyœwietla informacje z toStringa obiektu Size
            System.out.println(aSize.getNumericSize()); // wyswietla tylko i wylacznie wartoœæ obiektu
            System.out.println(aSize.name());          // wysiwetla oryginaln¹ nazwê obiektu
            System.out.println(aSize.ordinal());        // numer kolejnoœciowy obiektu


        }
        Size jakisRozmiar = Size.S;
        System.out.println(jakisRozmiar.equals(Size.S));
        System.out.println(jakisRozmiar == Size.S);
    }
}
