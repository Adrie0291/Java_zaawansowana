package Day3.EnumStare;

public class EnumDemo {
    public static void main(String[] args) {

        Shirt shirt1 = new Shirt("XL");
        Shirt shirt2 = new Shirt("XXL");

        System.out.println(shirt1);
        System.out.println(shirt2);

        Shop shop = new Shop();
        shop.pack(shirt1);
        shop.pack(shirt2);
    }
}
