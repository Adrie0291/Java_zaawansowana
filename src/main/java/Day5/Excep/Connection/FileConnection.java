package Day5.Excep.Connection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileConnection {

    private boolean connected = false;

    public void connect() throws FileConnectionException { // wyrzucamy go do g�ry, obowi�zek spada na klas� connection
        Random random = new Random();
        double randomPercent = random.nextDouble(); // 0.0 -> 1.0         ---- np. warto�c 0.2444455 = 24 %
        if (randomPercent < 0.25) {
            throw new FileConnectionException(); // wyj�tek trzeba obs�u�y� bo dziedziczy po Excpetion
        }
        connected = true;
    }

    public List<String> getBooksFromFile() {
        File file = new File("src\\Main\\java\\Day5\\Excep\\Wywolanie\\ksiazki2.txt");
        try {
            FileReader fileReader = new FileReader(file); // obiekt pomocnizy, / wymaga obs�ugi wyj�tku
            BufferedReader bufferedReader = new BufferedReader(fileReader); // wczytywanie pliku tekstowego  z bufferreader ale mozna Scannerem (�atwiej);
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku!");
            return new ArrayList<>();

        }
        return null;
    }

    @Override   // to  String po to aby wyswietlac stan fileconnection
    public String toString() {
        return "FileConnection{" +
                "connected=" + connected +
                '}';
    }
}
