package Day4Dziedziczenie.New;

public class EnumDemo {

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt(Size.M); // nie korzystamy juz z Sizes.[rozmiar],
        // bo wyciagalismy z niej tylko Stringi
        Shirt shirt2 = new Shirt(Size.XS);

        System.out.println(shirt1);
        System.out.println(shirt2);

        Shop shop = new Shop();
        shop.pack(shirt1);
        shop.pack(shirt2);

        //   Size size = new Size(); // Enumy nie mog¹ byæ instancjowane,
        //   nie mozemy tworzyc obiektu z nich

        Size size = Size.S;
        System.out.println(size.getNumericSize()); // 38

        // ca³a pula wartoœci

        for (Size aSize : Size.values()){
            System.out.println(aSize);
            System.out.println(aSize.getNumericSize());
            System.out.println("name"  + aSize.name());
            System.out.println(aSize.ordinal());
        }
        System.out.println(size.equals(size == Size.S)); //
    }
}
