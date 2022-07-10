package Day3;

import com.sun.jdi.IntegerValue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class ArrayListDemo {
    public static void main(String[] args) {
/*
Listy s�u�� do przechowywania danych, kolekcji, wygodniejsze od tablic
Poniewa� nie musimy okre�la� rozmiaru na starcie
Ten rozmiar si� dostosowuje.
Array Lista nie jest immutable (zwykla tablica jest);
metody listy modyfikuj�
 */
        String[] names = new String[3];
        names[0] = "Marcin";
        names[1] = "Julia";
        names[2] = "Ada";

        ArrayList<String> namesList = new ArrayList<>();
        System.out.println(namesList);
        System.out.println(namesList.size());

        namesList.add("Blazej");
        namesList.add("Anna");
        namesList.add("Robert");
        System.out.println(namesList);
        System.out.println(namesList.size());
        namesList.add(0, "Grzegorz");
        System.out.println(namesList);

        String element = namesList.get(0);
        System.out.println(element);

        namesList.set(1, "Zuzanna");
        System.out.println(namesList);

        namesList.remove(3);
        System.out.println(namesList);
        // remove (obiekt) usuwa tylko jeden obiekt, pierwszy kt�ry znajdzie
        namesList.add("Zuzanna");
        System.out.println(namesList);
        namesList.remove("Zuzanna");

        System.out.println(namesList);
        // zmiana tematu, �eby zmienna String zapisa�a swoje w�a�ciwo�ci
        // musi by� zapisana nowym Stringiem albo wy�wietlona sout
        // Stringi s� immutable - niezmienne
        String text = "abc";
        text = text.toUpperCase();
        System.out.println(text);

        // int = Integer   char = Character   double = Double

        ArrayList<Integer> numbers = new ArrayList<>();// brak parametryzacji
        // dodawanie element�w do listy
        numbers.add(10);
        numbers.add(39);
        numbers.add(53);
        numbers.add(192);
        numbers.add(231);
        numbers.add(39);
        System.out.println(numbers);
        // usuwanie na podstawie warto�ci
        numbers.remove(Integer.valueOf(53));

        // iterowanie
        System.out.println(numbers);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
        // numbers.remove(231); poza zakresem
        // Poni�sze instrukcje by�y wykonywane gdy nasza ArrayLista nie by�a
        // zdefiniowana przez �adny typ.
        // ArrayLista musi posiadac zawsze sw�j typ
        //Integer element2 = (Integer) numbers.get(0);
        //System.out.println(element2);

        // sprawdzenie czy dana warto�c jest w li�cie
        System.out.println(numbers.contains(231));
        // klonowanie
        ArrayList<Integer> clone = (ArrayList<Integer>) numbers.clone(); // metod 1
        ArrayList<Integer> clone3 = new ArrayList<>(numbers);  // metoda 2
        System.out.println(clone);
        numbers.add(4921);
        clone.add(8312);
        System.out.println(numbers);
        System.out.println(clone);

        // List.of robi list� z przekazanych element�w
        // to jest lista a nie ArrayLista. rzutowanie nie pomo�e
        // enum - > zamkni�ty zbi�r obiekt�w
        // List<String> names2 = List.of("Ada", "Ania", "Marta", "Marek");
        List<String> names2 = new ArrayList(List.of("Ada", "Ania", "Marta", "Marek"));
        names2.add("Daniel");
        System.out.println(names2);

    }
}
