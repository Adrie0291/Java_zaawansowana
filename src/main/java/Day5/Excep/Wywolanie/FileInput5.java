package Day5.Excep.Wywolanie;

import javax.management.RuntimeMBeanException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Tworzenie wlasnych wyjatkow. Chcemy robic obiekty z ksiazek, kazda ma tytul i date wydania
public class FileInput5 {
    public List<Book> ReadBooks() throws Exception {
        List<Book> booksList = new ArrayList<>();
        File file = new File("src\\main\\java\\Day5\\Excep\\Wywolanie\\ksiazki2.txt"); // u�ywamy �ciezki relatywnej src. Generalnie podawanie �cie�ki zajmuje si� obiekt File.
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {           // hasNext, sprawdza czy jest wi�cej element�w danym zestawieniu
                String line = scanner.nextLine();
                // przerobienie metody na String

                Book book = mapLineToBook(line);
                booksList.add(book);              // book to teraz obiekt, kt�ry dodawany jest do listy booksList
            }
        } catch (
                FileNotFoundException e) {                 // generalnie tutaj mamy do czynienia z b��dem kompilacji, dlatego MUSIMY wychwycic ten b��d
            System.out.println("Nie znaleziono pliku!");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();                            // najwi�cej informacji an temat b��du
        }
        return booksList;
    }

    private Book mapLineToBook(String line) throws Exception { // konwertowanie -> mapowanie ksi��ek na Linie. Przyjmuje linie zwraca ksi��ke
        try {
            String[] elements = line.split(";"); // 2 stringi , jeden przed drugi po �redniku
            String title = elements[0]; // element zerowy tytul ksi��ki, element pierwszy to co za �rednikiem
            int year = Integer.parseInt(elements[1]); // to co za �rednikiem, nie mo�emy rzutowa� ze Stringa na typ prymitywny/ parsujemy
            Book book = new Book(title, year);
            return book;
        } catch (Exception exception) {
            System.out.println("Dla linii: " + line);
            throw new RuntimeException("Niepoprawny format input dla linii " + line); // wyjatki typu Exception wymagaj� obs�ugi try catch ? zmienimy typ wyj�tku na RunTimeException

        }
    }

    public static void main(String[] args) {
        FileInput5 input = new FileInput5();
        try {
            System.out.println(input.ReadBooks());
        } catch (Exception e) {
            System.out.println("Wystapil wyjatek: ");
            System.out.println(e.getMessage());

        }
    }
}