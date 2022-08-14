package Day17.Task30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMethodTask {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(101));


        }
        System.out.println("A - randomowe liczby : ");
        numbers.stream()
                .forEach(number -> System.out.print(number + ", "));


        System.out.println("\nB - posorotwane liczby : ");
        numbers.stream()
                .sorted()
                .forEach(number -> System.out.print(number + ", "));

        System.out.println("\nC - iloœæ liczb parzystych");
        System.out.println(numbers.stream()
                .filter(number -> number % 2 == 0)
                .count());

        System.out.println("\nD - Lista posortowanych liczb mniejszych od 50");
        List<Integer> newNumbers = numbers.stream()
                .filter(number -> number <= 50)
                //.collect(Collectors.toList()) to samo co ni¿ej, ale dzaia³a w innej Javie
                .sorted()
                .toList();

        System.out.println(newNumbers);

        System.out.println("\nE:");

        Integer someNumb = numbers.stream()
                .sorted((num1, num2) -> num2 - num1)
                .findFirst()
                .get();
        System.out.println(someNumb);
    }
}
