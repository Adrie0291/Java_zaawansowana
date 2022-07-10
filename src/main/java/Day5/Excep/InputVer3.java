package Day5.Excep;

import java.util.Scanner;

public class InputVer3 {

    public int readNumber() {
        int number = 0;
        boolean isError;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                isError = false;
                System.out.println("Wpisz liczbê:");
                number = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wpisz tylko liczby!");
                isError = true;
                e.printStackTrace();
            }
        } while (isError);
        return number;
    }


    public static void main(String[] args) {
        InputVer3 input = new InputVer3();
        int number = input.readNumber();
        System.out.println("Podano " + number);
    }
}
