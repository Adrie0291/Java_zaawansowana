package WzorceProjektowe.Dzien1.Task3;

import java.util.Scanner;
// Program liczy sumę liczb o 10 większa.
// Generalnie: 1) Skaner zbędny 2) Zbędne nazywanie każdej kolejnej liczby nową zmieną 3) sumaliczb nie potrzebna
public class Task3Zle {
    public static void main(String[] args) {
        Scanner Skaner = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        int sumalicz = 0;
        sumalicz = a + b + c + d + e + f;
        System.out.println(sumalicz);
    }
}
