package Day10Klasy.Calcu;


import java.util.Scanner;

public class CalculatorDem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 2 cyfry: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        Eqation eqationAdd = new Eqation() {
            @Override
            public int obliczenia(int a, int b) {
                return a + b;
            }
        };

        Eqation eqationOdejm = new Eqation() {
            @Override
            public int obliczenia(int a, int b) {
                return a - b;
            }
        };
        System.out.println("Suma: ");
        System.out.println(eqationAdd.obliczenia(number1, number2));

        System.out.println("Ró¿nica: ");
        System.out.println(eqationOdejm.obliczenia(number1, number2));

    }
}
