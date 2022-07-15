package doUsuniecia;

public class CitizenDemo {
    public static void main(String[] args) {
        King king = new King("Kr�l Jan");
        Peasant peasant = new Peasant("Ch�op Johny");
        Soldier soldier = new Soldier("�o�nierz Jacek");
        Townsman townsman = new Townsman("Mieszczuch Mateusz");
        System.out.println(king);

        Town town = new Town();

        town.dodawaj(king);
        town.dodawaj(peasant);
        town.dodawaj(townsman);
        town.dodawaj(soldier);

        System.out.println(town);
        System.out.println("Liczba os�b uprawnionych do g�osowania: ");
        System.out.println(town.howManyCanVote());
        System.out.println("Lista os�b uprawniona do g�osowania");
        town.whoCanVote();


    }
}
