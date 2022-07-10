package Day5.Excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputVer2 {


    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        boolean isNumber;
        int number = 0;
        do {
            try {
                number = scanner.nextInt();
                isNumber = true;
                if (isNumber) break;
            } catch (InputMismatchException e) {
                scanner.next();
                isNumber = false;
            }
        } while (!isNumber);
        return number;
    }

    public static void main(String[] args) {
        InputVer2 input = new InputVer2();
        int number = input.readNumber();
        System.out.println(number);
    }
}
