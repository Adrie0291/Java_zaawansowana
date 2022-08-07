package Day10SortAnonim.SortowaniePoCechach;

import java.util.*;

public class OriginalJavaSort {
    public static void main(String[] args) {
        List<Fish> fishes = new LinkedList<>(List.of(
                new Fish("pstrag", 2),
                new Fish("karp", 4),
                new Fish("lososiowe", 5),
                new Fish("rekin1", 1)));


        Comparator<Fish> fishComparator = new Comparator<Fish>() {
            @Override
            public int compare(Fish o1, Fish o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        System.out.println(fishes);
        fishes.sort(fishComparator); // nie korzysta z Bubble sort tylko z Quick Sort, szybszy !
        System.out.println(fishes);


        LinkedHashSet<String> planety = new LinkedHashSet<>();
        planety.add("pluton");
        planety.add("jowisz");
        planety.add("wenus");
        planety.add("s³oñce");

        Comparator<String> stringComp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        System.out.println(planety);
        TreeSet<String> planety2 = new TreeSet<>(stringComp);
        planety2.add("pluton");
        planety2.add("jowisz");
        planety2.add("wenus");
        planety2.add("s³oñce");
        System.out.println(planety2);

        //TreeSet domyœlnie wykorzystuje natural order, czyli domyslny sposób sortowania
        // zdefiniowany przez obiekt sortowany w jego klasie, poprzez zaimplementowanie interfejsu
        // Comparable (nie mylic z Comparator)
        Set<Fish> fishesSet = new TreeSet<>(List.of(
                new Fish("pstrag", 2),
                new Fish("karp", 2),
                new Fish("lososiowe", 5),
                new Fish("rekin1", 2)));

        System.out.println(fishesSet);

        List<Fish> fishList = new ArrayList<>(List.of(
                new Fish("pstrag", 2),
                new Fish("karp", 2),
                new Fish("lososiowe", 5),
                new Fish("rekin1", 2)));

        Collections.sort(fishList);
        System.out.println(fishList);
        System.out.println("@@ FISH LIST @@");
        System.out.println(fishList);
    }
}
