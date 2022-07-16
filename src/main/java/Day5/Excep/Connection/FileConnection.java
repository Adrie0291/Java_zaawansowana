package Day5.Excep.Connection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileConnection {

    private boolean connected = false;

    public void connect() throws FileConnectionException { // wyrzucamy go do góry, obowi¹zek spada na klasê connection
        Random random = new Random();
        double randomPercent = random.nextDouble(); // 0.0 -> 1.0         ---- np. wartoœc 0.2444455 = 24 %
        if (randomPercent < 0.25) {
            throw new FileConnectionException(); // wyj¹tek trzeba obs³u¿yæ bo dziedziczy po Excpetion
        }
        connected = true;
    }

    public List<String> getBooksFromFile() throws FileDbConnectionException {
        File file = new File("src\\Main\\java\\Day5\\Excep\\Wywolanie\\ksiazki2.txt");
        List<String> lines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file); // obiekt pomocnizy, / wymaga obs³ugi wyj¹tku
            BufferedReader bufferedReader = new BufferedReader(fileReader); // wczytywanie pliku tekstowego  z bufferreader ale mozna Scannerem (³atwiej); // obiekt do czytania
/*

            String line = bufferedReader.readLine();         //buffer reader ma sk³adnie która ma ukryt¹ while, ale eliminuje pewne b³edy
            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }

 */
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            if (lines.isEmpty()) {
                throw new FileDbConnectionException("Plik jest pusty!");
            }

        } catch (IOException e) {
            throw new FileDbConnectionException("Nie znaleziono pliku!"); // dlatego ze to wyjatek excpetion (a nie runtime exception) MUSIMY go obsluzyc
            // 1. try catch, 2.oddelegowac koniecznosc obslugi do metody ktora wykonuje ta metode.
        }
        return lines;
    }

    @Override   // to  String po to aby wyswietlac stan fileconnection
    public String toString() {
        return "FileConnection{" +
                "connected=" + connected +
                '}';
    }
}