package Day10SortAnonim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sorty {
    public void sortBubble(List<Integer> numbers) {

        for (int j = 0; j < numbers.size(); j++) {
            for (int i = 0; i < numbers.size() - 1 - j ; i++) {   // musi byc numbers.size -1 ! IndexOutOfBoundsException
                int first = numbers.get(i);
                int second = numbers.get(i + 1);
                if (first > second) {                        // dostêp do elementów w liscie .get[nr index]
                    numbers.set(i, second);
                    numbers.set(i + 1, first);
                }
            }
        }
    }
}

class SortinggDemo {
    public static void main(String[] args) {
        Sorty sorty = new Sorty();
        List<Integer> numbers = new LinkedList<>(List.of(12, 34, 9, 413, 44, 90, 1, 7, 99, 52)); // 10 liczb
        System.out.println(numbers);
        sorty.sortBubble(numbers);
        System.out.println(numbers);
    }
}
