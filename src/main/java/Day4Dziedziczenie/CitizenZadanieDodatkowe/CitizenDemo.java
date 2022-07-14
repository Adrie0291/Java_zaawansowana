package Day4Dziedziczenie.CitizenZadanieDodatkowe;

public class CitizenDemo {
    public static void main(String[] args) {
        King king = new King("Kr�l Artur");
        Peasant peasant = new Peasant("Ch�op Bonifacy");
        Soldier soldier = new Soldier("�o�nierz Jack");
        Townsman townsman = new Townsman("Mieszczuch Mateusz");  // stworzenie obiekt�w typu citizen

        Town town = new Town(); // stworzony obiekt town, po to ,aby m�c doda� ich do miasta
        town.dodaj(king);
        town.dodaj(peasant);
        town.dodaj(soldier);
        town.dodaj(townsman);       // stworzona metoda, kt�ra przechowuje r�nego rodzaju obiekty !

        System.out.println(town); // toString w klasie Town poka�e nam mieszka�c�w, a wi�c w Klasie Citizen te� powinni�my mie� ToString, wsp�lny dla wszystkich obiekt�w
        /* Pojawi� si� null pointer exception

         */
        System.out.println(town.howManyCanVote());
        town.whoCanVote();
    }
}
