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
        sortingFishAlgoritm.sortBubble(fishes);
        System.out.println(fishes);
    }
}