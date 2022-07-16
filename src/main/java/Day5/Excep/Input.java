package Day5.Excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int readNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbê: ");

        try {
            //  int number = scanner.nextInt();
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Nale¿y podaæ liczbê! ");
            return readNumber();                           // rekurencja, metoda sama sie bedzie wywolowac a¿ do wy³apania wyjatku
        } finally {
            System.out.println("Ten blok zawsze siê wykona");
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        int number = input.readNumber();
        System.out.println("Podano: " + number);
    }
}