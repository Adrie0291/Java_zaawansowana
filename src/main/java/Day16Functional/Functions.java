package Day16Functional;

public class Functions {
    public static void main(String[] args) {
        Equation addition = new Equation() {  // robimy instancje obiektu, ale musi byæ zadeklarowana jako klasa anonimowa

            @Override
            public double evaluate(double number1, double number2) {
                return number1 + number2;
            }
        };
        Equation substraction = (double number1, double number2) -> {
            return number1 - number2;

        };
        Equation multiplication = (num1, num2) -> num1 * num2;

        System.out.println(addition.evaluate(10, 20)); //
        System.out.println(substraction.evaluate(40, 20));
        System.out.println((multiplication.evaluate(5, 3)));
    }

}

interface Equation {
    double evaluate(double number1, double number2);
}
