package Day4Dziedziczenie.Ksiazka;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("wype�niony",12, 3);
        //Tr�jk�t:
        System.out.println("Informacje: ");
        System.out.println(t1);
        System.out.println("Powierzchnia wynosi: " + t1.area());

        // Prostok�t:
        Rectangle rectangle = new Rectangle("Czarny",39, 39);
        System.out.println("Czy ten prostok�t jest kwdaratem ? ");
        System.out.println(rectangle.isSquare());
        System.out.println(rectangle);
        System.out.println("Powierzchnia prostok�ta");
        System.out.println(rectangle.area());
    }
}
