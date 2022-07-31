package Day10SortAnonim.SortowaniePoCechach;

import java.util.List;

public class Demo {

    public void sortBubble(List<Fish> fishes) {

        for (int j = 0; j < fishes.size(); j++) {
            for (int i = 0; i < fishes.size() - 1 - j; i++) {   // musi byc numbers.size -1 ! IndexOutOfBoundsException
                int first = fishes.get(i);
                int second = fishes.get(i + 1);
                if (first < second) {                        // dostêp do elementów w liscie .get[nr index]
                    fishes.set(i, second);
                    fishes.set(i + 1, first);
                }
            }
        }
    }
}

