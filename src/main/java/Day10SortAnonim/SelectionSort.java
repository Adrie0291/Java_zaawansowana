package Day10SortAnonim;

import java.util.LinkedList;
import java.util.List;

public class SelectionSort {
    public void selectionSort(List<Integer> numbers) {

        for (int i = 0; i < numbers.size() - 1; i++) {
            int min = numbers.get(i);
            int index = i;
            for (int j = i + 1; j < numbers.size(); j++) {
                if (min > numbers.get(j)) {
                    min = numbers.get(j);
                    index = j;
                }
            }
            numbers.set(index, numbers.get(i));
            System.out.println(numbers);
            numbers.set(i, min);
            System.out.println(numbers);
        }
    }
}


class SelectionDemo {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        List<Integer> numbers = new LinkedList<>(List.of(49, 24, -12, 11));
        System.out.println("Przed: " + numbers);
        selectionSort.selectionSort(numbers);

        System.out.println("Po: " + numbers);

    }
}
/*
    int index = 0;
        for(
    int i = 0; i<numbers.size();i++)

    {
        int min = numbers.get(i);
        for (int j = i + 1; j < numbers.size(); j++) {
            int num = numbers.get(j);
            if (min >= num) {
                min = num;
                index = j;

            }
        }
        int temp = numbers.get(i);
        numbers.set(i, min);
        numbers.set(index, temp);

    }

}


 */

/* Wytumaczone
        int index;
        for (int i = 0; i < numbers.size(); i++) {
            int min = numbers.get(i);
            index = i;
            for (int j = i + 1; j < numbers.size(); j++) {
                if (min > numbers.get(j)) {
                    min = numbers.get(j);
                    index = j;
                    System.out.println("index(nr indeksu najm. liczby): " + j);
                }
            }
            System.out.println("Wstawiamy w to miejsce wartoœæ z indeksu i:" +
                    " Indeks " + i + ", wartoœæ: " + numbers.get(i));
            numbers.set(index, numbers.get(i));
            System.out.println(numbers);
            System.out.println("Nastepnie wstawiamy w indeks i najmniejsz¹" +
                    " znalezion¹ wartoœæ: Indeks " + i + ", wartoœæ " + min);
            numbers.set(i, min);
            System.out.println(numbers);
            System.out.println("-------------------------------");
        }
    }
 */