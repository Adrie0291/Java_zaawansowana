package Day18.Chel1;

import Day17.Challenge1.PersonImpl;

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
        return names.stream()
                .map(name -> (Person) new MyPersonImpl(name))
                .toList();

    }

    @Override
    public List<Person> findPeopleOfIdGreaterThan(List<Person> people, int id) {
        return people.stream()
                .filter(person -> person.getId() > id)
                .toList();
    }

    @Override
    public boolean hasSenior(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() < 60) // lub .anymatch(person -> person.getAge() > 60); tylko to
                .count() > 0;
    }

    @Override
    public double sumTotalCash(List<Person> people) {
        return people.stream()
                .mapToDouble(person -> person.getCash())  // person -> person.getCash() mo¿emy zamieniæna Person::getCash
                .sum();

    }

    @Override
    public Person findRichestPerson(List<Person> people) {
        return people.stream()
                .sorted((per1, per2) -> Double.compare(per2.getCash(), per1.getCash()))
                .findFirst()
                //.get();
                .orElse(null);
    }

    @Override
    public double computeAverageAge(List<Person> people) {
        return people.stream()
                .mapToInt(personn -> personn.getAge())
                .average()
                .orElse(-1);
    }
}
