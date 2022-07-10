package Day5.Excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput {
    public List<String> readBooks() {
        List<String> bookList = new ArrayList<>();
        File file = new File("C:\\Users\\Adriann\\IdeaProjects\\javaZaawansowan\\src\\main\\java\\Day5\\Excep\\ksiazki.txt");
        try {
            Scanner scanner = new Scanner(file);
            String book = scanner.nextLine();
            bookList.add(book);

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        return bookList;
    }

    public static void main(String[] args) {
        FileInput input = new FileInput();
        System.out.println(input.readBooks());
    }
}
