package Day1RepeatObiect.samochod;

public class SamochodDemo {
    public static void main(String[] args) {
        Samochod car1 = new Samochod("Renault", 143291);
        Samochod car2 = new Samochod("Mazda", 38200);
        System.out.println("Car inspection at: " + car1.toReview);
        car1.info();
        car2.info();

        car1.zwiekszPrzebieg(300);
        car2.zwiekszPrzebieg(300);

        System.out.println("After distance: 300 ");
        car1.info();
        car2.info();

        System.out.println("Car 1: ");
        car1.ToCarInspection();
        System.out.println("Car 2: ");
        car2.ToCarInspection();

        System.out.println(car1);
        System.out.println(car2);
    }
}
