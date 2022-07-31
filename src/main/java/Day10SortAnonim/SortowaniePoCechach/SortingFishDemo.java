package Day10SortAnonim.SortowaniePoCechach;

import java.util.LinkedList;
import java.util.List;

public class SortingFishDemo {

    public static void main(String[] args) {
        SortingFishAlgoritm sortingFishAlgoritm = new SortingFishAlgoritm();
        List<Fish> fishes = new LinkedList<>(List.of(
                new Fish("pstrag", 2),
                new Fish("karp", 4),
                new Fish("lososiowe", 5),
                new Fish("rekin1", 1)
        ));
        System.out.println(fishes);
        sortingFishAlgoritm.sortBubble(fishes, new FishComperator() {
            @Override
            public int compareFish(Fish fish1, Fish fish2) {
                return fish1.getName().compareTo(fish2.getName());
            }
        });
        System.out.println(fishes );
    }
}