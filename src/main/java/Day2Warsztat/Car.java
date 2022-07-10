package Day2Warsztat;

import java.util.Arrays;
import java.util.Random;

public class Car {
    private Wheel[] wheels;

    public Car(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void flatRandomTire() {
        Random random = new Random();
        int wheelIndex = random.nextInt(wheels.length);
        Wheel randomWheel = wheels[wheelIndex];
        // Przebijamy ko³o
        // randomWheel.setFlat(true);
        // randomWheel.setPressure(0); tak nie robiæ, lepiej zrobiæ osobn¹ metodê
        randomWheel.doflatTire();
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                '}';


    }
}
