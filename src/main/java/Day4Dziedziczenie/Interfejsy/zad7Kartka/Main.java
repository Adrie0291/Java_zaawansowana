package Day4Dziedziczenie.Interfejsy.zad7Kartka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother("Grazyna");
        Father father = new Father("Mateusz");
        Daughter daughter = new Daughter("Kasia");
        Son son = new Son("Sabinian");

        List<FamilyMember> families = new ArrayList<>();
        families.add(mother);
        families.add(father);
        families.add(daughter);
        families.add(son);

        for (FamilyMember person : families) {
            person.welcome();
            System.out.println("Are you adult ?");
            System.out.println(person.isAdult());
            person.introduce();
            System.out.println("-------");
        }
    }
}
