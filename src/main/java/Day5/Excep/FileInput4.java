package Day5.Excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Musielismy obsluzyc wyjatek, inaczej program by sie nie kompilowa�
public class FileInput4 {
    public List<String> ReadBooks() {
        List<String> booksList = new ArrayList<>();
        File file = new File("src\\main\\java\\Day5\\Excep\\ksiazki.txt"); // u�ywamy �ciezki relatywnej src. Generalnie podawanie �cie�ki zajmuje si� obiekt File.
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {           // hasNext, sprawdza czy jest wi�cej element�w danym zestawieniu
                String book = scanner.nextLine();
                booksList.add(book);
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

    public static void main(String[] args) {
        FileInput4 input = new FileInput4();
        System.out.println(input.ReadBooks());
    }
}