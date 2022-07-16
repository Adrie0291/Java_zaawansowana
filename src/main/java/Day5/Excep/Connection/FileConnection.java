package Day5.Excep.Connection;

import java.util.Random;

public class FileConnection {

    private boolean connected = false;

    public void connect() throws FileConnectionException{ // wyrzucamy go do góry, obowi¹zek spada na klasê connection
        Random random = new Random();
        double randomPercent = random.nextDouble(); // 0.0 -> 1.0         ---- np. wartoœc 0.2444455 = 24 %
        if (randomPercent < 0.25) {
            throw new FileConnectionException(); // wyj¹tek trzeba obs³u¿yæ bo dziedziczy po Excpetion
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
