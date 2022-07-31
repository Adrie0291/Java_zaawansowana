package Day10SortAnonim.SortowaniePoCechach;

import java.util.List;

public class SortingFishAlgoritm {

    public void sortBubble(List<Fish> fishes, FishComperator fishComperator) {

        for (int j = 0; j < fishes.size(); j++) {
            for (int i = 0; i < fishes.size() - 1 - j; i++) {   // musi byc numbers.size -1 ! IndexOutOfBoundsException
                Fish first = fishes.get(i);
                Fish second = fishes.get(i + 1);
                if (compare2(first, second) > 0) {                        // dostêp do elementów w liscie .get[nr index]
                    fishes.set(i, second);
                    fishes.set(i + 1, first);
                }
            }
        }

    }

    public int compare(Fish fish1, Fish fish2) {
        return fish1.getName().compareTo(fish2.getName());
    }

    public int compare2(Fish fish1, Fish fish2) {
        if (fish1.getAge() > fish2.getAge()) {
            return 1;
        } else if (fish1.getAge() < fish2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}