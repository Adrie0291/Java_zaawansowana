package Day16Functional.ManipulatorText;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        Manipulator shouter = (String text) -> text.toUpperCase() + "!";

        System.out.println(shouter.change("Hello"));
        System.out.println(shouter.change("Ziemniaki"));

        Manipulator encoder = text -> {
            String newText = "";
            for (int i = 0; i < text.length(); i++) {
                char letter = (char) (text.charAt(i) + 1);
                newText += letter;
            }
            return newText;
        };
        System.out.println(encoder.change("earth"));

        // Supplier - nie trzeba dostarcza� | co� zwraca
        // Consumer - trzeba dostarczy� | nic nie zwraca
        // Function - przyjmie | zwraca (mo�e by� inny typ)
        // Operator - przyjmie to samo co zwraca
        // Predicate - co� przyjmie zwraca booleanm
        // Comparator - przyjmie 2 rzeczy zwraca int
        //ActionListener = przyjmie event, nic nie zwraca
        // Runnable - nic nie przyjmie, nic nie zwraca

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.print("Kod na osobnym w�tku");
            }
        });
        // thread.start();


        System.out.println("Przyk�ad");

        List<String> names = new ArrayList<>();
        names.add("Artur");
        names.add("Monika");
        names.add("Waldemar");
        names.add("Kasia");

        names.forEach(name -> System.out.println("cze�� " + name));

        System.out.println("Przyk�ad");

        Predicate<Integer> isPositive = number -> number > 0;
        if (isPositive.test(10)) {
            System.out.println("Dodatni");
        }
    }
}
