package Day4Dziedziczenie.CitizenZadanieDodatkowe;

import java.util.ArrayList;
import java.util.List;

// Klasa Town nie mo¿e byæ abstrakcyjna. Konkretny typ.
public class Town {  // Town extends Citizen -> nie mo¿e tak byæ bo miasto nie dziedziczy, nie jest mieszkañcem
    private List<Citizen> citizens = new ArrayList<>();  // aby lista mia³a miejsce, musi byæ new ArrayList<>();
    //   private List<Citizen> citizens -> stworzenie zmiennej na listê

    public void dodaj(Citizen citizen) {  // metoda o nazwie dodaj, którego parametrem jest citizen obiekt Typu Citizen
        citizens.add(citizen);
    }

    public int howManyCanVote() {
        int counter = 0; // counter traktuje jako odczyt, trzeba wczeœniej zadeklarowaæ wartoœæ,TIP ! zmienne lokalne nie dostaj¹ domyœlnej wartoœci
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                counter++;
            }
        }

        return counter;
    }

    public void whoCanVote() {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Town{" +
                "citizens=" + citizens +
                '}';
    }
}
