package WzorceProjektowe.Dzien1.Task6;

import java.util.Scanner;

public class Dobrze {
    // silnia z wprowadzonej liczby przez użytkownika
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(silnia(input));

        for (int c = 0; c < 10; c++) {
            System.out.println(silnia(c));
        }
    }
// silnia z 9 poniżej po kolei
    public static int silnia(int i) {
        int result = 1;
        for (int j = 2; j <= i; j++) {
            result *= j;
        }
        return result;
    }
}