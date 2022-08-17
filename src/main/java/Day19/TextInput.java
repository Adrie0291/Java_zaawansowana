package Day19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextInput {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("output.txt", true);
            // często wykorzystuje się BufferedWriter - dla większej wydajności
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append("cosDodalem");
            bufferedWriter.append("Doklejam");
            bufferedWriter.flush(); // zrzuca cały bufor
            bufferedWriter.close(); // kończy całą operację, zamkniętie połaćzenie
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// zapis do pliku można robić na wiele różnych sposobów
// inny popularny  to PrintWritter