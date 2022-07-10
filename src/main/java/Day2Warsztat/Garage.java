package Day2Warsztat;

public class Garage {
    private final static double PRICE = 50;
    private final static String DEFAULT_REPAIR = "Wymiana opony";
    private final static double DEFAULT_PRESSURE = 2.2;

    /*   W tej metodzie ca³y warsztat przyjmuje samochód do naprawy.
    To metoda napraw samochód bêdzie naprawia³a raz wstawiony samochód.
    Czyli efektywnie zostanie naprawiony tylko 1 samochód.
    PóŸniej za du¿o kombinowania.

        private Car car;

        public Garage(Car car) {
            this.car = car;
        }

    // Warsztat przyjmuje do naprawy samochód, jedn¹ konkretn¹.
    // To lepiej daæ argument dla metoty samochód typu Car
     */
    public Receipt repairCar(Car car) { // 3. jak j¹ wywo³aæ
        Wheel[] wheels = car.getWheels();  // szukamy zepsutej opony w klasie car
        int count = 0;
        for (Wheel wheel : wheels) {  // pêtla iter iteruje po ka¿dej oponia i sprawdza czy warunek if jest prawid³owy
            if (wheel.isFlat()) {
                wheel.repair(DEFAULT_PRESSURE); // metoda repaie jest docelowa u góry na 2.2
                count++;
            }

        }
        return new Receipt(DEFAULT_REPAIR, PRICE, count);
    }
}
