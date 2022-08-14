package Day18.Chel1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyStreamService2 implements StreamService {
    @Override
    public void sortAndPrint(List<String> names) {
        names.stream()
                .sorted() // standardowe sorted dzia³a tak, ¿e alfabetycznie
                .forEach(name -> System.out.println(name));
    }

    @Override
    public int distinctAndCountNumbers(int[] numbers) {
        return (int) Arrays.stream(numbers)
                .distinct()
                .count();

    }

    public void zwykleNumery(int[] numbers) {
        Arrays.stream(numbers)
                .sorted()
                .forEach(number -> System.out.print(number + ", "));
    }

    @Override
    public List<String> computeFemaleNames(List<String> names) {
        return names.stream()
                .filter(name -> name.endsWith("a"))
                .toList();
    }

    @Override
    public void printNumbersOfRange(int[] numbers, int minValue, int maxValue) {
        Arrays.stream(numbers)
                .filter(number -> number >= minValue && number <= maxValue)
                .forEach(number -> System.out.print(number + ","));

    }

    @Override
    public List<Integer> computeNamesLength(List<String> names) {
        return names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> buildPeopleWithNames(List<String> names) {
        return null;
    }

    @Override
    public List<Person> findPeopleOfIdGreaterThan(List<Person> people, int id) {
        return null;
    }

    @Override
    public boolean hasSenior(List<Person> people) {
        return false;
    }

    @Override
    public double sumTotalCash(List<Person> people) {
        return 0;
    }

    @Override
    public Person findRichestPerson(List<Person> people) {
        return null;
    }

    @Override
    public double computeAverageAge(List<Person> people) {
        return 0;
    }
}
