package Sety;

import java.util.Scanner;

public class refaktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int x = scanner.nextInt();

        if (a > x) {
            System.out.println("a jest większa");
        } else
            System.out.println("x jest większa");
    }
}
