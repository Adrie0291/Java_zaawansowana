package Day9Set.Sety;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashThreeLinked {
    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();
        number.add(103);
        number.add(24);
        number.add(6);
        number.add(93);
        number.add(37);
        number.add(103);

        System.out.println(number);

        Set<Integer> number2 = new TreeSet<>();
        number2.add(103);
        number2.add(24);
        number2.add(6);
        number2.add(93);
        number2.add(37);
        number2.add(103);

        System.out.println(number2);

        Set<Integer> number3 = new LinkedHashSet<>();
        number3.add(103);
        number3.add(24);
        number3.add(6);
        number3.add(93);
        number3.add(37);
        number3.add(103);

        System.out.println(number3);

    }
}

