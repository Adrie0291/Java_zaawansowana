package Day10Klasy.CalculatorZajecia;

public class CalcDemo {
    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            @Override
            public int execute(int numb1, int numb2) {
                return numb1 + numb2;
            }
        };

        Calculator calculator = new Calculator(addition);
        calculator.calculate();

        MathOperation substraction = new MathOperation() {
            @Override
            public int execute(int numb1, int numb2) {
                return numb1 - numb2;
            }
        };

        Calculator calculator2 = new Calculator(substraction);
        calculator2.calculate();
    }
}
