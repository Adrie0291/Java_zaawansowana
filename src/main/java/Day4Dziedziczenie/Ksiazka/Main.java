package Day4Dziedziczenie.Ksiazka;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("wype³niony",12, 3);
        //Trójk¹t:
        System.out.println("Informacje: ");
        System.out.println(t1);
        System.out.println("Powierzchnia wynosi: " + t1.area());

        // Prostok¹t:
        Rectangle rectangle = new Rectangle("Czarny",39, 39);
        System.out.println("Czy ten prostok¹t jest kwdaratem ? ");
        System.out.println(rectangle.isSquare());
        System.out.println(rectangle);
        System.out.println("Powierzchnia prostok¹ta");
        System.out.println(rectangle.area());
    }
}
