package Day18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                List.of(24, 4921, 39, 1, -23, 12, 5, 0, 110, 9));
        //a
        System.out.println("Wyœwietlam wszystkie liczby");
        numbers.forEach(number -> System.out.print(number + ","));
        // b

        System.out.println("\nPosortowane od najm.:");
        numbers.stream()
                .sorted((num1, num2) -> num1 - num2)
                .forEach(numb -> System.out.print(numb + ", "));

        System.out.println("\nPosortowane od najw.:");
        numbers.stream()
                .sorted((num1, num2) -> num2 - num1)
                .forEach(numb -> System.out.print(numb + ", "));

        System.out.println("\nIloœæ liczby parzystych:");
        long result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(result);

        System.out.println("Liczby poni¿ej 50: ");
        List<Integer> numberBelow50 = numbers.stream()
                .filter(num -> num <= 50)
                .collect(Collectors.toList());
        System.out.println(numberBelow50);

        System.out.println("Pierwsza liczba po sorotwaniu malej¹co");
        int numberFound = numbers.stream()
                .sorted((num1, num2) -> num2 - num1 )
                .findFirst()
                .get();
        System.out.println(numberFound);
    }
}
