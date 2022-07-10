package Day2Warsztat;

public class Garage {
    private final static double PRICE = 50;
    private final static String DEFAULT_REPAIR = "Wymiana opony";
    private final static double DEFAULT_PRESSURE = 2.2;

    /*   W tej metodzie ca�y warsztat przyjmuje samoch�d do naprawy.
    To metoda napraw samoch�d b�dzie naprawia�a raz wstawiony samoch�d.
    Czyli efektywnie zostanie naprawiony tylko 1 samoch�d.
    P�niej za du�o kombinowania.

        private Car car;

        public Garage(Car car) {
            this.car = car;
        }

    // Warsztat przyjmuje do naprawy samoch�d, jedn� konkretn�.
    // To lepiej da� argument dla metoty samoch�d typu Car
     */
    public Receipt repairCar(Car car) { // 3. jak j� wywo�a�
        Wheel[] wheels = car.getWheels();  // szukamy zepsutej opony w klasie car
        int count = 0;
        for (Wheel wheel : wheels) {  // p�tla iter iteruje po ka�dej oponia i sprawdza czy warunek if jest prawid�owy
            if (wheel.isFlat()) {
                wheel.repair(DEFAULT_PRESSURE); // metoda repaie jest docelowa u g�ry na 2.2
                count++;
            }

        }
        return new Receipt(DEFAULT_REPAIR, PRICE, count);
    }
}
