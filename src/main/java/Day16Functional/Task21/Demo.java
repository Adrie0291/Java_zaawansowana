package Day16Functional.Task21;

import Day10Klasy.Calcu.Eqation;

public class Demo {
    public static void main(String[] args) {
        Operation addNumbers = new Operation() {
            @Override
            public int equals(int firstNumber, int secondNumber) {
                return (firstNumber + secondNumber);
            }
        };
        Operation minusNumbers = (num1, num2) -> num1 - num2;

        System.out.println(addNumbers.equals(30, 90));
        System.out.println(minusNumbers.equals(100,30));
    }
}
