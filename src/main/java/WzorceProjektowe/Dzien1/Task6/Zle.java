package WzorceProjektowe.Dzien1.Task6;

import java.util.Scanner;
/* Pierwsza pietla liczy silnie, liczy ją za posrednictwem uzytkownika, która podaje liczbę za pomocą saknera
Kolejny fragment programów (zagniezdzone pętle), uruchamia silnie 10 razy
Złamana zasada: powtarzanie kodu
 */
public class Zle {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int i = skaner.nextInt();
        int k = 1;
        for (int j = 2; j <= 1; j++) {
            k = k * j;
        }
        System.out.println(k);
        for (int c = 0; c < 10; c++) {
            k = 1;
            for (int j = 2; j <= c; j++) {
                k = k * j;
            }
            System.out.println(k);
        }
    }
}
