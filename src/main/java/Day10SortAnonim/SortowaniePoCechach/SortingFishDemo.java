package Day10SortAnonim.SortowaniePoCechach;

import java.util.LinkedList;
import java.util.List;

public class SortingFishDemo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        List<Fish> fishes = new LinkedList<>(List.of(
                new Fish("pstrag", 2),
                new Fish("karp", 4),
                new Fish("losos", 5),
                new Fish("rekin", 1)
        ));
        System.out.println(fishes);
        demo.sortBubble(fishes);
        System.out.println(fishes);
    }
}