package WzorceProjektowe.Dzien1.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println(Math.max(Math.max(firstNumber, secondNumber), thirdNumber));
    }
}