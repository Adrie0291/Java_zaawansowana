package doUsuniecia;

public class CitizenDemo {
    public static void main(String[] args) {
        King king = new King("Król Jan");
        Peasant peasant = new Peasant("Ch³op Johny");
        Soldier soldier = new Soldier("¯o³nierz Jacek");
        Townsman townsman = new Townsman("Mieszczuch Mateusz");
        System.out.println(king);

        Town town = new Town();

        town.dodawaj(king);
        town.dodawaj(peasant);
        town.dodawaj(townsman);
        town.dodawaj(soldier);

        System.out.println(town);
        System.out.println("Liczba osób uprawnionych do g³osowania: ");
        System.out.println(town.howManyCanVote());
        System.out.println("Lista osób uprawniona do g³osowania");
        town.whoCanVote();


    }
}
