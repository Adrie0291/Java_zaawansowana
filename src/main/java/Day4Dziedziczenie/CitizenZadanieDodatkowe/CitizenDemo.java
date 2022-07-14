package Day4Dziedziczenie.CitizenZadanieDodatkowe;

public class CitizenDemo {
    public static void main(String[] args) {
        King king = new King("Król Artur");
        Peasant peasant = new Peasant("Ch³op Bonifacy");
        Soldier soldier = new Soldier("¯o³nierz Jack");
        Townsman townsman = new Townsman("Mieszczuch Mateusz");  // stworzenie obiektów typu citizen

        Town town = new Town(); // stworzony obiekt town, po to ,aby móc dodaæ ich do miasta
        town.dodaj(king);
        town.dodaj(peasant);
        town.dodaj(soldier);
        town.dodaj(townsman);       // stworzona metoda, która przechowuje ró¿nego rodzaju obiekty !

        System.out.println(town); // toString w klasie Town poka¿e nam mieszkañców, a wiêc w Klasie Citizen te¿ powinniœmy mieæ ToString, wspólny dla wszystkich obiektów
        /* Pojawi³ siê null pointer exception

         */
        System.out.println(town.howManyCanVote());
        town.whoCanVote();
    }
}
