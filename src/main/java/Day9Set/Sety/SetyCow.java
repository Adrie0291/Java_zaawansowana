package Day9Set.Sety;

import java.util.HashSet;
import java.util.Set;

public class SetyCow {
    public static void main(String[] args) {
        Set<Cow> cows = new HashSet<>();
        Cow cow1 = new Cow("Basia", 1);
        Cow cow2 = new Cow("Stokrotka", 12);
        Cow cow3 = new Cow("Vanesa", 8);
        Cow cow4 = new Cow("Melisandra", 31);
        Cow cow5 = new Cow("Basia", 1);
        Cow cow6 = new Cow("Kucka", 43);

        Cow cow7 = cow1;
        cows.add(cow1);
        cows.add(cow2);
        cows.add(cow3);
        cows.add(cow4);
        cows.add(cow5);
        cows.add(cow6);

        System.out.println(cows);

        System.out.println(cow1.hashCode());
        System.out.println(cow5.hashCode());

            // domyślnie equals wykorzysutje ==
        System.out.println(cow1.equals(cow5)); // false // po nadpisaniu hash i equals wartosc true
        System.out.println(cow1.equals(cow7)); // true
            // porównanie przez referencje
        System.out.println(cow1 == cow5);  // false / inne obiekty // caly czas wartosc false ,to sa rozne obiekty, ale DANE (equals) te same
        System.out.println(cow1 == cow7);  // true - te same obiekty fizycznie w pamieci


    }
}
