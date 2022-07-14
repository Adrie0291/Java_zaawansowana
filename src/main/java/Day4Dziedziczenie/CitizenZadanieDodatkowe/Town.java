package Day4Dziedziczenie.CitizenZadanieDodatkowe;

import java.util.ArrayList;
import java.util.List;

// Klasa Town nie mo�e by� abstrakcyjna. Konkretny typ.
public class Town {  // Town extends Citizen -> nie mo�e tak by� bo miasto nie dziedziczy, nie jest mieszka�cem
    private List<Citizen> citizens = new ArrayList<>();  // aby lista mia�a miejsce, musi by� new ArrayList<>();
    //   private List<Citizen> citizens -> stworzenie zmiennej na list�

    public void dodaj(Citizen citizen) {  // metoda o nazwie dodaj, kt�rego parametrem jest citizen obiekt Typu Citizen
        citizens.add(citizen);
    }

    public int howManyCanVote() {
        int counter = 0; // counter traktuje jako odczyt, trzeba wcze�niej zadeklarowa� warto��,TIP ! zmienne lokalne nie dostaj� domy�lnej warto�ci
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
