package Day10Klasy.CalculatorZajecia;

import java.util.Scanner;

public class Calculator {

    private MathOperation mathOperation;

    public Calculator(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsz¹ liczbê");
        int number1 = scanner.nextInt();

        System.out.println("Podaj 2. liczbê: ");
        int number2 = scanner.nextInt();
        // obliczenia
        int result = mathOperation.execute(number1, number2);

        System.out.println("Wynik obliczenia " + result);
    }
}
