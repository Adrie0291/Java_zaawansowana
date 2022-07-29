package WzorceProjektowe.Dzien1.Task1;

import java.util.Scanner;

public class Task1Zle {
    public static void main(String[] args) {
        Scanner Skaner = new Scanner(System.in);  // Skaner z małej litery
        int A = Skaner.nextInt(); // nazwa zmiennej z małej litery
        int x = Skaner.nextShort();  // zły typ w skanerze (Short -> Int)
        int sumlicz = 0;          // niepotrzebna zmienna
        if (A> x) System.out.println("A jest większa");   // niepotrzebny if oraz komuniikat
        if (x> A) System.out.println("x jest większa");   // niepotrzebny if oraz komunikat++++
    }
}
