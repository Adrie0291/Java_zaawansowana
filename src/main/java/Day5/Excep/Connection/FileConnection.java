package Day5.Excep.Connection;

import java.util.Random;

public class FileConnection {

    private boolean connected = false;

    public void connect() throws FileConnectionException{ // wyrzucamy go do g�ry, obowi�zek spada na klas� connection
        Random random = new Random();
        double randomPercent = random.nextDouble(); // 0.0 -> 1.0         ---- np. warto�c 0.2444455 = 24 %
        if (randomPercent < 0.25) {
            throw new FileConnectionException(); // wyj�tek trzeba obs�u�y� bo dziedziczy po Excpetion
        }
        connected = true;
    }

    @Override   // to  String po to aby wyswietlac stan fileconnection
    public String toString() {
        return "FileConnection{" +
                "connected=" + connected +
                '}';
    }
}
