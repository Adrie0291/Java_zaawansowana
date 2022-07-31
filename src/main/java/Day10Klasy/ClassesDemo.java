package Day10Klasy;

public class ClassesDemo {
    public static void main(String[] args) {
        Car car = new Car(30);
        Car car2 = new Car(50);
        System.out.println(car);
        car.runCar();
        System.out.println(car);
        System.out.println(car2);
      /* Car.Engine engine = car2.new Engine(); // po . klasa wewnêtrzna // ta sk³adna nie dzia³a, jak klasa jest statyczna
        engine.run();
        engine.run();
        engine.run();
        System.out.println(car2);

       */
        Car.Engine engine = new Car.Engine();


        class LocalClass {
        }
        LocalClass localClass = new LocalClass();

        Car fromAnonymousClass = new Car(45) { // kl anonimowa wykorzystuje nazwe innej klasy i automatycznie ja dziedziczy
            private int size;
            private String name;

            @Override
            public void runCar() {
                super.runCar();
                System.out.println("Brum brum");
            }
        };  // czemu tu musi byc srednik ? to jest ten sam srednik podczas instrukcji tworzenia obiektu+
        fromAnonymousClass.runCar();
        System.out.println(fromAnonymousClass);
        // nie robi sie obiekt Car, robi sie obiet klasy ktora w tle dziedziczy Car
        //
        System.out.println(car.getClass());
        System.out.println(fromAnonymousClass.getClass());

        Driver driver = new Driver() { // anonimowa klasa moze byæ równiez oparta o interfejs
            @Override
            public void drive() {
                System.out.println("Jadê");
            }
        };
        driver.drive();
    }
}

class Car {
    private int fuel;
    private Engine engine = new Engine();

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public void runCar() {
        engine.run();
    }

    static class Engine {  // klasa wewnetrzna, moze wykorzystywaæ pr // ywatne skladowe zewnêtrznej
        // Zwykle jest wykorzystywana tylko przez ni¹.
        // Klasa wewn. mo¿e byæ statyczna i wtedy jest niezale¿na od obiektu zewnêtrznej klasy.
        // Mo¿e dzia³aæ samodzielnie
        // do klas wewn. dzia³aj¹ wszystkie modyfikatory dostêpu
        public void run() {
            //   fuel--; // statyczna nie mog³aby u¿yæ fuel
            // new Car(); mo¿e u¿yæ prywatnego konstruktora

        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                '}';
    }
}

interface Driver {
    void drive();
}