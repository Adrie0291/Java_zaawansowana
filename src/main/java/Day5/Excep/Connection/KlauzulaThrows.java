package Day5.Excep.Connection;

import java.io.*;

public class KlauzulaThrows {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("src\\main\\java\\Day5\\Excep\\Connection\\plik.txt")));
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku ");
            //e.printStackTrace();
        }
        try {
            br.readLine();
        } catch (IOException e) {
            System.out.println("B³¹d odczytu pliku");
        }
    }
}

